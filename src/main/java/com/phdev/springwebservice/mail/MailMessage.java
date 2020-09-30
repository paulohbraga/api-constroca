package com.phdev.springwebservice.mail;


public class MailMessage {

	public String passwordString;
	static String emailSubject = "Redefinição de senha - Constroca" ;

	public MailMessage() {
	}
	
	public MailMessage(String passwordString) {
		super();
		this.passwordString = passwordString;

	}

	public String mailContent() {


		String emailstr = " <!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" + 
				"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" + 
				"<head>\n" + 
				"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" + 
				"  <!--[if !mso]><!-->\n" + 
				"  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" + 
				"  <!--<![endif]-->\n" + 
				"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" + 
				"  <meta name=\"format-detection\" content=\"telephone=no\">\n" + 
				"  <meta name=\"x-apple-disable-message-reformatting\">\n" + 
				"  <title></title>\n" + 
				"  <style type=\"text/css\">\n" + 
				"    @media screen {\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 400;\n" + 
				"        src: local('Fira Sans Regular'), local('FiraSans-Regular'), url(https://fonts.gstatic.com/s/firasans/v8/va9E4kDNxMZdWfMOD5Vvl4jLazX3dA.woff2) format('woff2');\n" + 
				"        unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 400;\n" + 
				"        src: local('Fira Sans Regular'), local('FiraSans-Regular'), url(https://fonts.gstatic.com/s/firasans/v8/va9E4kDNxMZdWfMOD5Vvk4jLazX3dGTP.woff2) format('woff2');\n" + 
				"        unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 500;\n" + 
				"        src: local('Fira Sans Medium'), local('FiraSans-Medium'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnZKveRhf6Xl7Glw.woff2) format('woff2');\n" + 
				"        unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 500;\n" + 
				"        src: local('Fira Sans Medium'), local('FiraSans-Medium'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnZKveQhf6Xl7Gl3LX.woff2) format('woff2');\n" + 
				"        unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 700;\n" + 
				"        src: local('Fira Sans Bold'), local('FiraSans-Bold'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnLK3eRhf6Xl7Glw.woff2) format('woff2');\n" + 
				"        unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 700;\n" + 
				"        src: local('Fira Sans Bold'), local('FiraSans-Bold'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnLK3eQhf6Xl7Gl3LX.woff2) format('woff2');\n" + 
				"        unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 800;\n" + 
				"        src: local('Fira Sans ExtraBold'), local('FiraSans-ExtraBold'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnMK7eRhf6Xl7Glw.woff2) format('woff2');\n" + 
				"        unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;\n" + 
				"      }\n" + 
				"      @font-face {\n" + 
				"        font-family: 'Fira Sans';\n" + 
				"        font-style: normal;\n" + 
				"        font-weight: 800;\n" + 
				"        src: local('Fira Sans ExtraBold'), local('FiraSans-ExtraBold'), url(https://fonts.gstatic.com/s/firasans/v8/va9B4kDNxMZdWfMOD5VnMK7eQhf6Xl7Gl3LX.woff2) format('woff2');\n" + 
				"        unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;\n" + 
				"      }\n" + 
				"    }\n" + 
				"\n" + 
				"    #outlook a {\n" + 
				"      padding: 0;\n" + 
				"    }\n" + 
				"\n" + 
				"    .ReadMsgBody,\n" + 
				"    .ExternalClass {\n" + 
				"      width: 100%;\n" + 
				"    }\n" + 
				"\n" + 
				"    .ExternalClass,\n" + 
				"    .ExternalClass p,\n" + 
				"    .ExternalClass td,\n" + 
				"    .ExternalClass div,\n" + 
				"    .ExternalClass span,\n" + 
				"    .ExternalClass font {\n" + 
				"      line-height: 100%;\n" + 
				"    }\n" + 
				"\n" + 
				"    div[style*=\"margin: 14px 0\"],\n" + 
				"    div[style*=\"margin: 16px 0\"] {\n" + 
				"      margin: 0 !important;\n" + 
				"    }\n" + 
				"\n" + 
				"    table,\n" + 
				"    td {\n" + 
				"      mso-table-lspace: 0;\n" + 
				"      mso-table-rspace: 0;\n" + 
				"    }\n" + 
				"\n" + 
				"    table,\n" + 
				"    tr,\n" + 
				"    td {\n" + 
				"      border-collapse: collapse;\n" + 
				"    }\n" + 
				"\n" + 
				"    body,\n" + 
				"    td,\n" + 
				"    th,\n" + 
				"    p,\n" + 
				"    div,\n" + 
				"    li,\n" + 
				"    a,\n" + 
				"    span {\n" + 
				"      -webkit-text-size-adjust: 100%;\n" + 
				"      -ms-text-size-adjust: 100%;\n" + 
				"      mso-line-height-rule: exactly;\n" + 
				"    }\n" + 
				"\n" + 
				"    img {\n" + 
				"      border: 0;\n" + 
				"      outline: none;\n" + 
				"      line-height: 100%;\n" + 
				"      text-decoration: none;\n" + 
				"      -ms-interpolation-mode: bicubic;\n" + 
				"    }\n" + 
				"\n" + 
				"    a[x-apple-data-detectors] {\n" + 
				"      color: inherit !important;\n" + 
				"      text-decoration: none !important;\n" + 
				"    }\n" + 
				"\n" + 
				"    body {\n" + 
				"      margin: 0;\n" + 
				"      padding: 0;\n" + 
				"      width: 100% !important;\n" + 
				"      -webkit-font-smoothing: antialiased;\n" + 
				"    }\n" + 
				"\n" + 
				"    .pc-gmail-fix {\n" + 
				"      display: none;\n" + 
				"      display: none !important;\n" + 
				"    }\n" + 
				"\n" + 
				"    @media screen and (min-width: 621px) {\n" + 
				"      .pc-email-container {\n" + 
				"        width: 620px !important;\n" + 
				"      }\n" + 
				"    }\n" + 
				"\n" + 
				"    @media screen and (max-width:620px) {\n" + 
				"      .pc-sm-p-20 {\n" + 
				"        padding: 20px !important\n" + 
				"      }\n" + 
				"      .pc-sm-p-35-10-15 {\n" + 
				"        padding: 35px 10px 15px !important\n" + 
				"      }\n" + 
				"      .pc-sm-p-21-10-14 {\n" + 
				"        padding: 21px 10px 14px !important\n" + 
				"      }\n" + 
				"      .pc-sm-h-20 {\n" + 
				"        height: 20px !important\n" + 
				"      }\n" + 
				"      .pc-sm-mw-100pc {\n" + 
				"        max-width: 100% !important\n" + 
				"      }\n" + 
				"    }\n" + 
				"\n" + 
				"    @media screen and (max-width:525px) {\n" + 
				"      .pc-xs-p-10 {\n" + 
				"        padding: 10px !important\n" + 
				"      }\n" + 
				"      .pc-xs-p-25-0-5 {\n" + 
				"        padding: 25px 0 5px !important\n" + 
				"      }\n" + 
				"      .pc-xs-br-disabled br {\n" + 
				"        display: none !important\n" + 
				"      }\n" + 
				"      .pc-xs-p-5-0 {\n" + 
				"        padding: 5px 0 !important\n" + 
				"      }\n" + 
				"    }\n" + 
				"  </style>\n" + 
				"  <!--[if mso]>\n" + 
				"    <style type=\"text/css\">\n" + 
				"        .pc-fb-font {\n" + 
				"            font-family: Helvetica, Arial, sans-serif !important;\n" + 
				"        }\n" + 
				"    </style>\n" + 
				"    <![endif]-->\n" + 
				"  <!--[if gte mso 9]><xml><o:OfficeDocumentSettings><o:AllowPNG/><o:PixelsPerInch>96</o:PixelsPerInch></o:OfficeDocumentSettings></xml><![endif]-->\n" + 
				"</head>\n" + 
				"<body style=\"width: 100% !important; margin: 0; padding: 0; mso-line-height-rule: exactly; -webkit-font-smoothing: antialiased; -webkit-text-size-adjust: 100%; -ms-text-size-adjust: 100%; background-color: #f4f4f4\" class=\"\">\n" + 
				"  <div style=\"display: none !important; visibility: hidden; opacity: 0; overflow: hidden; mso-hide: all; height: 0; width: 0; max-height: 0; max-width: 0; font-size: 1px; line-height: 1px; color: #151515;\">Constroca - Você solicitou uma nova senha</div>\n" + 
				"  <div style=\"display: none !important; visibility: hidden; opacity: 0; overflow: hidden; mso-hide: all; height: 0; width: 0; max-height: 0; max-width: 0;\">\n" + 
				"    ‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;‌&nbsp;\n" + 
				"  </div>\n" + 
				"  <table class=\"pc-email-body\" role=\"presentation\" style=\"table-layout: fixed;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" bgcolor=\"#f4f4f4\">\n" + 
				"    <tbody>\n" + 
				"      <tr>\n" + 
				"        <td class=\"pc-email-body-inner\" valign=\"top\" align=\"center\">\n" + 
				"          <!--[if gte mso 9]>\n" + 
				"            <v:background xmlns:v=\"urn:schemas-microsoft-com:vml\" fill=\"t\">\n" + 
				"                <v:fill type=\"tile\" src=\"\" color=\"#f4f4f4\"/>\n" + 
				"            </v:background>\n" + 
				"            <![endif]-->\n" + 
				"          <!--[if (gte mso 9)|(IE)]><table width=\"620\" align=\"center\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" role=\"presentation\"><tr><td width=\"620\" align=\"center\" valign=\"top\"><![endif]-->\n" + 
				"          <table class=\"pc-email-container\" role=\"presentation\" style=\"margin: 0 auto; max-width: 620px;\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\n" + 
				"            <tbody>\n" + 
				"              <tr>\n" + 
				"                <td style=\"padding: 0 10px;\" valign=\"top\" align=\"left\">\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td style=\"font-size: 1px; line-height: 1px;\" height=\"20\">&nbsp;</td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <!-- BEGIN MODULE: Menu 1 -->\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td class=\"pc-sm-p-20 pc-xs-p-10\" style=\"padding: 25px 30px; background-color: #0c1f54; border-radius: 8px\" valign=\"top\" bgcolor=\"#0c1f54\">\n" + 
				"                          <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                            <tbody>\n" + 
				"                              <tr>\n" + 
				"                                <td style=\"padding: 10px;\" valign=\"top\" align=\"center\">\n" + 
				"                                  <a href=\"#\" style=\"text-decoration: none;\"><img src=\"http://www.someletras.com.br/images/logo_email.png \" alt=\"\" style=\"height: auto; max-width: 100%; border: 0; line-height: 100%; outline: 0; -ms-interpolation-mode: bicubic; color: #ffffff; font-size: 14px;\" width=\"130\" height=\"22\"></a>\n" + 
				"                                </td>\n" + 
				"                              </tr>\n" + 
				"                              <tr>\n" + 
				"                                <td valign=\"top\" align=\"center\">\n" +  
				"                                </td>\n" + 
				"                              </tr>\n" + 
				"                            </tbody>\n" + 
				"                          </table>\n" + 
				"                        </td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <!-- END MODULE: Menu 1 -->\n" + 
				"                  <!-- BEGIN MODULE: Content 1 -->\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td style=\"font-size: 1px; line-height: 1px;\" height=\"20\">&nbsp;</td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td class=\"\" style=\"padding: 40px 20px 200px; background-color: #ffffff; border-radius: 8px\" pc-default-class=\"pc-sm-p-35-10-15 pc-xs-p-25-0-5\" pc-default-padding=\"40px 20px 20px\" valign=\"top\" bgcolor=\"#ffffff\">\n" + 
				"                          <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                            <tbody>\n" + 
				"                              <tr>\n" + 
				"                                <td class=\"pc-fb-font\" style=\"padding: 0 20px; text-align: center; font-family: 'Fira Sans', Helvetica, Arial, sans-serif; font-size: 24px; font-weight: 700; line-height: 1.42; letter-spacing: -0.4px; color: #151515;\" valign=\"top\">\n" + 
				"                                  Sua nova senha é: " + passwordString + "\n" + 
				"                                </td>\n" + 
				"                              </tr>\n" + 
				"                              <tr>\n" + 
				"                                <td style=\"font-size: 1px; line-height: 1px;\" height=\"10\">&nbsp;</td>\n" + 
				"                              </tr>\n" + 
				"                            </tbody>\n" + 
				"                            <tbody>\n" + 
				"                            </tbody>\n" + 
				"                          </table>\n" + 
				"                        </td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <!-- END MODULE: Content 1 -->\n" + 
				"                  <!-- BEGIN MODULE: Footer 1 -->\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td style=\"font-size: 1px; line-height: 1px;\" height=\"8\">&nbsp;</td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td class=\"pc-sm-p-21-10-14 pc-xs-p-5-0\" style=\"padding: 21px 20px 14px 20px; background-color: #0c1f54; border-radius: 8px\" role=\"presentation\" valign=\"top\" bgcolor=\"#0c1f54\">\n" + 
				"                          <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                            <tbody>\n" + 
				"                              <tr>\n" + 
				"                                <td style=\"padding: 20px;\" valign=\"top\">\n" + 
				"                                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                                    <tbody>\n" + 
				"                                      <tr>\n" + 
				"                                        <td class=\"pc-fb-font\" style=\"font-family: 'Fira Sans', Helvetica, Arial, sans-serif; font-size: 18px; font-weight: 500; line-height: 24px; letter-spacing: -0.2px; color: #ffffff;\" valign=\"top\">\n" + 
				"                                          Contato\n" + 
				"                                        </td>\n" + 
				"                                      </tr>\n" + 
				"                                      <tr>\n" + 
				"                                        <td style=\"line-height: 1px; font-size: 1px;\" height=\"11\">&nbsp;</td>\n" + 
				"                                      </tr>\n" + 
				"                                    </tbody>\n" + 
				"                                    <tbody>\n" + 
				"                                      <tr>\n" + 
				"                                        <td class=\"pc-fb-font\" style=\"font-family: 'Fira Sans', Helvetica, Arial, sans-serif; font-size: 14px; line-height: 20px; letter-spacing: -0.2px; color: #D8D8D8;\" valign=\"top\">\n" + 
				"                                          Rua <span> 1000 </span>-Asa Norte 516 -  Sala 200<span> Brasília-DF</span>\n" + 
				"                                        </td>\n" + 
				"                                      </tr>\n" + 
				"                                      <tr>\n" + 
				"                                        <td class=\"pc-sm-h-20\" style=\"line-height: 1px; font-size: 1px;\" height=\"45\">&nbsp;</td>\n" + 
				"                                      </tr>\n" + 
				"                                    </tbody>\n" + 
				"                                    <tbody>\n" + 
				"                                      <tr>\n" + 
				"                                        <td class=\"pc-fb-font\" style=\"font-family: 'Fira Sans', Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 500; line-height: 24px; letter-spacing: -0.2px;\" valign=\"top\">\n" + 
				"                                          <a href=\"tel:0000000000\" style=\"text-decoration: none; color: #ffffff;\">Telefone: (61)3322-1000</a>\n" + 
				"                                        </td>\n" + 
				"                                      </tr>\n" + 
				"                                      <tr>\n" + 
				"                                        <td style=\"line-height: 1px; font-size: 1px;\" height=\"9\">&nbsp;</td>\n" + 
				"                                      </tr>\n" + 
				"                                    </tbody>\n" + 
				"                                    <tbody>\n" + 
				"                                      <tr>\n" + 
				"                                        <td class=\"pc-fb-font\" style=\"padding: 9px 0 0; font-family: 'Fira Sans', Helvetica, Arial, sans-serif; font-size: 14px; font-weight: 500; line-height: 24px;\" valign=\"top\">\n" + 
				"                                          <a href=\"mailto:suporte@constroca.com.br\" style=\"text-decoration: none; color: #1595E7;\">suporte@constroca.com.br</a>\n" + 
				"                                        </td>\n" + 
				"                                      </tr>\n" + 
				"                                    </tbody>\n" + 
				"                                  </table>\n" + 
				"                                </td>\n" + 
				"                              </tr>\n" + 
				"                            </tbody>\n" + 
				"                          </table>\n" + 
				"                        </td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                  <!-- END MODULE: Footer 1 -->\n" + 
				"                  <table role=\"presentation\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n" + 
				"                    <tbody>\n" + 
				"                      <tr>\n" + 
				"                        <td style=\"font-size: 1px; line-height: 1px;\" height=\"20\">&nbsp;</td>\n" + 
				"                      </tr>\n" + 
				"                    </tbody>\n" + 
				"                  </table>\n" + 
				"                </td>\n" + 
				"              </tr>\n" + 
				"            </tbody>\n" + 
				"          </table>\n" + 
				"          <!--[if (gte mso 9)|(IE)]></td></tr></table><![endif]-->\n" + 
				"        </td>\n" + 
				"      </tr>\n" + 
				"    </tbody>\n" + 
				"  </table>\n" + 
				"  <!-- Fix for Gmail on iOS -->\n" + 
				"  <div class=\"pc-gmail-fix\" style=\"white-space: nowrap; font: 15px courier; line-height: 0;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; </div>\n" + 
				"</body>\n" + 
				"</html> ";

		return emailstr;
	}


}
