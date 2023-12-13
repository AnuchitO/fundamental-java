public class DemoController {

	@GetMapping("/loans")
	public void getAllLoan() {
		System.out.println("DemoController:: getAllLoan()");
	}
}
