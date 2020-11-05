class Mahasiswa
{
	public int nrp;
	public String nama;
	public void setNRP (int nrp)
	{
		this.nrp = nrp;
	}
	public void setNama (String nama){
		this.nama = nama;
	}
	public int getNRP() {
		return nrp;
	}
	public String getNama() {
		return nama;
	}
}

public class percobaan2 {
	public static void main(String args[]) {
		Mahasiswa mhs=new Mahasiswa();
		mhs.setNRP(7201);
		mhs.setNama("Muhammad Ali");
		System.out.println("Nama mahasiswa "+mhs.getNama()+" NRP "+mhs.getNRP());
	}
}