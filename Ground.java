class Ground{
		private double x, y;
		private int w, h;
		private int rad;
		private String shapeType;
		private boolean collideable;
		private boolean scrolleable;

		public Ground(double x, double y, int w, int h, String shape, boolean collideable, boolean scrolleable){
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.shapeType = shape;
			this.collideable = collideable;
			this.scrolleable = scrolleable;
		}
		public Ground(int rad, double x, double y, String shape, boolean collideable, boolean scrolleable){
			this.rad = rad;
			this.x = x;
			this.y = y;
			this.shapeType = shape;
			this.collideable = collideable;
			this.scrolleable = scrolleable;
		}

		public double getX(){ return x; }
		public double getY(){ return y; }
		public int getW(){ return w; }
		public int getH(){ return h; }

		public void setX(double x) { this.x = x; }
		public void setY(double y) { this.y = y; }

		public double getRad(){ return rad; }
		public String getType(){ return shapeType; }

		public boolean isCollideable(){ return collideable; }
		public boolean isScrolleable(){return scrolleable; }
	}