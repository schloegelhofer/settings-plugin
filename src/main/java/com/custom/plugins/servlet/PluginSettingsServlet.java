package com.custom.plugins.servlet;

import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import com.atlassian.templaterenderer.TemplateRenderer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PluginSettingsServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(PluginSettingsServlet.class);

    @ComponentImport
    private final TemplateRenderer templateRenderer;

    public PluginSettingsServlet(TemplateRenderer templateRenderer) {
        this.templateRenderer = templateRenderer;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        resp.setContentType("text/html;charset=utf-8");

        // Der Template-Pfad relativ zum Verzeichnis src/main/resources/templates
        String templatePath = "templates/plugin-settings.vm";

        // Template rendern
        templateRenderer.render(templatePath, resp.getWriter());
    }

}