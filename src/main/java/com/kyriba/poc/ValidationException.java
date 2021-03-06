/*                                                                                                                                         
  Copyright 2000 - 2018 Kyriba Corp. All Rights Reserved.                                                                                                          
  The content of this file is copyrighted by Kyriba Corporation and can not be                                                               
  reproduced, distributed, altered or used in any form, in whole or in part.                                                                          
  Date        Author  Changes                                                                                                                                                      
  2018/09/20  P-GLC   Initial                                                                                                                                              
 */
package com.kyriba.poc;

public class ValidationException extends Exception {
    public ValidationException() {
    }

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidationException(Throwable cause) {
        super(cause);
    }

    public ValidationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
