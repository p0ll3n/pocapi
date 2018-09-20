/*
  Copyright 2000 - 2018 Kyriba Corp. All Rights Reserved.
  The content of this file is copyrighted by Kyriba Corporation and can not be
  reproduced, distributed, altered or used in any form, in whole or in part.
  Date        Author  Changes
  2018/09/20  P-GLC   Initial
 */
package com.kyriba.poc;

import java.util.Optional;
import javax.annotation.Nonnull;

public interface Result<T> {

    default Optional<String> getErrorMessage(){
        return Optional.empty();
    }

    default Optional<T> getValue(){
        return Optional.empty();
    }

    static <T> Result<T> error(@Nonnull final String errorMessage){
        return new Result<T>() {
            @Override
            public Optional<String> getErrorMessage() {
                return Optional.of(errorMessage);
            }
        };
    }

    static <T> Result<T> ok(@Nonnull final T value){
        return new Result<T>() {
            @Override
            public Optional<T> getValue() {
                return Optional.of(value);
            }
        };
    }
}
