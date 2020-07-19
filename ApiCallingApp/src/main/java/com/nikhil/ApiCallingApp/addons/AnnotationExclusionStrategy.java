package com.nikhil.ApiCallingApp.addons;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.nikhil.ApiCallingApp.hbm.annotations.Exclude;

public class AnnotationExclusionStrategy implements ExclusionStrategy{

	@Override
	public boolean shouldSkipField(FieldAttributes f) {
		return f.getAnnotation(Exclude.class) != null;
	}

	@Override
	public boolean shouldSkipClass(Class<?> clazz) {
		return false;
	}
}
