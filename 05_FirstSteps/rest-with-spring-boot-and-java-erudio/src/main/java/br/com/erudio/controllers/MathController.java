package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {

	// private final AtomicLong counter = new AtomicLong();
	
	private SimpleMath math = new SimpleMath();

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@GetMapping("/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.div(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@GetMapping("/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.mult(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@GetMapping("/med/{numberOne}/{numberTwo}")
	public Double med(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.med(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	@GetMapping("/raiz/{numberOne}")
	public Double raiz(@PathVariable(value = "numberOne") String numberOne)
			 throws Exception {
		
		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return math.raiz(NumberConverter.convertToDouble(numberOne));
	}

	

}
