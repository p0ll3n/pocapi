/*                                                                                                                                         
  Copyright 2000 - 2018 Kyriba Corp. All Rights Reserved.                                                                                                          
  The content of this file is copyrighted by Kyriba Corporation and can not be                                                               
  reproduced, distributed, altered or used in any form, in whole or in part.                                                                          
  Date        Author  Changes                                                                                                                                                      
  2018/09/20  P-GLC   Initial                                                                                                                                              
 */
package com.kyriba.poc;

import javax.annotation.Nonnull;

public interface PocService {
    @Nonnull
    String capitalize(@Nonnull String bresilien) throws ValidationException;
}
