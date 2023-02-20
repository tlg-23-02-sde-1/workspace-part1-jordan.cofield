/**
 * A module is a collection of related packages.
 * The packages that live with this config file (called a "module descriptor")
 * are package in the module
 *
 * There is no explicit listing of them in the { } below
 *
 * The packages in this module are:
 * com.entertainment
 * com.entertainment.util
 */
module com.entertainment {
    // which *packages does this module "export?"
    // exported packages are available to other modules
    exports com.entertainment; // this is a *package* name
}