package com.github.m50d.tutmavenplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import tut.TutMain;

@Mojo(name="tut")
public class TutMojo extends AbstractMojo {
	public void execute() throws MojoExecutionException, MojoFailureException {
		TutMain.main(new String[]{});
	}
}
