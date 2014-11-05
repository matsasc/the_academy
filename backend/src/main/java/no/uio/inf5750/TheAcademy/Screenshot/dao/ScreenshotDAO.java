package no.uio.inf5750.TheAcademy.Screenshot.dao;

import java.util.Collection;
import java.util.List;

import no.uio.inf5750.TheAcademy.Screenshot.models.Screenshot;

/**
 * DAO interface
 * @author matsasc
 *
 */
public interface ScreenshotDAO {
	/**
	 * Function for saving screenshot
	 * @param userId
	 * @param screen
	 * @return Id of the screenshot
	 */
	String addScreenshot(Screenshot screen);
	/**
	 * Get the screenshot from database
	 * @param screenshotId
	 * @return Screenshot
	 */
	Screenshot getScreenshot(String screenshotId);
	/**
	 * Get all the screenshot from user
	 * @param userId
	 * @return Collection of screenshots
	 */
	Collection<Screenshot> getScreenshots(String userId);
	/**
	 * Delete the screenshot
	 * @param screenshotId
	 */
	void deleteScreenshot(String screenshotId);
	
}