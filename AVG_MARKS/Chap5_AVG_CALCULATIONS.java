package JavaPop;


class Chap5_AVG_CALCULATIONS {
	//Math-Class Method for finding the maximum average for student marks
	   public int findMax(int StudentAvg1, int StudentAvg2, int StudentAvg3) {
			return Math.max(StudentAvg1,Math.max(StudentAvg2, StudentAvg3));
			
		}
	   
	//Method to calculate average for all three student's tests
	   public int[] calcAvg(int Stu1T1, int Stu1T2, int Stu2T1, int Stu2T2, int Stu3T1, int Stu3T2) {
		    int StudentAvg1 = (Stu1T1+Stu1T2)/2;
			int StudentAvg2 = (Stu2T1+Stu2T2)/2;
			int StudentAvg3 = (Stu3T1+Stu3T2)/2;
			return new int[] {StudentAvg1, StudentAvg2, StudentAvg3};
	   }

}

