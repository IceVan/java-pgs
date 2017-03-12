package com.ice.exchange.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Bartek on 2017-03-08.
 */
@ResponseStatus(reason="Wrong param in URL")
public class WrongParamException extends RuntimeException {
}
