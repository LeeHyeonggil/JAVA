package session;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("���Ͱ� �ʱ�ȭ �Ǿ���");
	}
	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
        System.out.println("��û ���� ���Ͱ� ó����");
        chain.doFilter(req, res);
        System.out.println("���� ���� ���Ͱ� ó����.");
	}
	
	@Override
	public void destroy() {
		System.out.println("���Ͱ� ���ŵǾ���");
		
	}
}
