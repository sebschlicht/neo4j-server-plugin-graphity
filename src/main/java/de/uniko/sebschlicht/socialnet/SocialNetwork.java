package de.uniko.sebschlicht.socialnet;

/**
 * operations to access and manipulate a social network
 * 
 * @author sebschlicht
 * 
 */
public interface SocialNetwork {

    /**
     * Adds a user to the social network.
     * 
     * @param userIdentifier
     *            identifier of the new user
     * @return true - if the user was successfully created<br>
     *         false - if the identifier is already in use
     */
    boolean addUser(String userIdentifier);

    /**
     * Adds a followship between two users to the social network.
     * 
     * @param idFollowing
     *            identifier of the user that wants to follow another user
     * @param idFollowed
     *            identifier of the user that will be followed
     * @return true - if the followship was successfully created<br>
     *         false - if this followship is already existing
     */
    boolean addFollowship(String idFollowing, String idFollowed);

    /**
     * Removes a followship between two users from the social network.
     * 
     * @param idFollowing
     *            identifier of the user that wants to unfollow an user
     * @param idFollowed
     *            identifier of the user that will be unfollowed
     * @return true - if the followship was successfully removed<br>
     *         false - if this followship is not existing
     */
    boolean removeFollowship(String idFollowing, String idFollowed);
}
