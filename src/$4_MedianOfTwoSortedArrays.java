public class $4_MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3};
        int[] nums2 = {};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        if (nums1.length == 0) {
            if (size % 2 != 0) {
                return nums2[size/2] * 1d;
            } else {
                return (nums2[size/2] + nums2[size/2 - 1]) / 2d;
            }
        } else if (nums2.length == 0) {
            if (size % 2 != 0) {
                return nums1[size/2] * 1d;
            } else {
                return (nums1[size/2] + nums1[size/2 - 1]) / 2d;
            }
        } else if (size == 1) {
            return nums1.length > 0 ? nums1[0] * 1d : nums2[0] * 1d;
        } else if (size == 2) {
            return (nums1[0] + nums2[0]) / 2d;
//        } else if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0]) {
//            if (size % 2 != 0) {
//                if (nums1.length > nums2.length) {
//                    if (nums1[nums1.length - 1] < nums2[0]) {
//                        return nums1[size / 2];
//                    } else {
//                        return nums1[size / 2 - 1];
//                    }
//                } else {
//                    if (nums1[nums1.length - 1] < nums2[0]) {
//                        return nums2[size / 2 - 1];
//                    } else {
//                        return nums2[size / 2];
//                    }
//                }
//            } else {
//                if (nums1.length == nums2.length) {
//                    if (nums1[nums1.length - 1] < nums2[0]) {
//                        return (nums1[nums1.length - 1] + nums2[0]) / 2d;
//                    } else {
//                        return (nums2[nums1.length - 1] + nums1[0]) / 2d;
//                    }
//                } else if (nums1.length > nums2.length) {
//                    if (nums1[nums1.length - 1] < nums2[0]) {
//                        return (nums1[size/2 - 1] + nums1[size/2]) / 2d;
//                    } else {
//                        return (nums1[size/2 - nums2.length - 1] + nums1[size/2 - nums2.length]) / 2d;
//                    }
//                } else {
//                    if (nums2[nums1.length - 1] < nums1[0]) {
//                        return (nums2[size/2 - 1] + nums2[size/2]) / 2d;
//                    } else {
//                        return (nums2[size/2 - nums1.length - 1] + nums2[size/2 - nums1.length]) / 2d;
//                    }
//                }
//            }
        } else {
            int i = 0;
            int j = 0;
            int mid = (size / 2);
            if (size % 2 != 0) {
                while (i < nums1.length && j < nums2.length) {
                    if (nums1[i] < nums2[j]) {
                        if (mid == 0) {
                            return nums1[i] * 1d;
                        } else {
                            i++;
                        }
                    } else {
                        if (mid == 0) {
                            return nums2[j] * 1d;
                        } else {
                            j++;
                        }
                    }
                    mid--;
                }
                while (i < nums1.length) {
                    if (mid == 0) {
                        return nums1[i] * 1d;
                    } else {
                        i++;
                        mid--;
                    }
                }
                while (j < nums2.length) {
                    if (mid == 0) {
                        return nums2[j] * 1d;
                    } else {
                        j++;
                        mid--;
                    }
                }
            } else {
                int temp = 0;
                while (i < nums1.length && j < nums2.length) {
                    if (nums1[i] < nums2[j]) {
                        if (mid == 1) {
                            temp = nums1[i];
                            i++;
                        } else if (mid == 0) {
                            return (nums1[i] + temp) / 2d;
                        } else {
                            i++;
                        }
                    } else {
                        if (mid == 1) {
                            temp = nums2[j];
                            j++;
                        } else if (mid == 0) {
                            return (nums2[j] + temp) / 2d;
                        } else {
                            j++;
                        }
                    }
                    mid--;
                }
                while (i < nums1.length) {
                    if (mid == 1) {
                        temp = nums1[i];
                        i++;
                    } else if (mid == 0) {
                        return (nums1[i] + temp) / 2d;
                    } else {
                        i++;
                    }
                    mid--;
                }
                while (j < nums2.length) {
                    if (mid == 1) {
                        temp = nums2[j];
                        j++;
                    } else if (mid == 0) {
                        return (nums2[j] + temp) / 2d;
                    } else {
                        j++;
                    }
                    mid--;
                }
            }
        }
        return 0;
    }
}
