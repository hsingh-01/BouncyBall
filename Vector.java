public class Vector {
	public static double dot(double[] A, double[] B){
		return (A[0] * B[0]) + (A[1] * B[1]);
	}

	public static double[] scale(double[] A, double B){
		return new double[]{B * A[0], B * A[1]};
	}

	public static double[] subtract(double[] A, double[] B){
		return new double[]{A[0] - B[0], A[1] - B[1]};
	}

	public static double[] add(double[] A, double[] B){
		return new double[]{A[0] + B[0], A[1] + B[1]};
	}

	public static double mag(double[] A){
		return Math.sqrt(A[0] * A[0] + A[1] * A[1]);
	}
}