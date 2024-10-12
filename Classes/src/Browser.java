public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress(address);
        String html = getHtml(ip);
        System.out.println(html);
    }

    private String getHtml(String ip) {
        return "html.ffff";
    }

    private String findIpAddress(String address) {
        return "125.4.4";
    }
}
