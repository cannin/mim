package gov.nih.nci.lmp.mimplugin;

import java.io.File;

import org.pathvisio.gui.swing.PreferencesDlg;
import org.pathvisio.gui.swing.PvDesktop;
import org.pathvisio.preferences.PreferenceManager;
import org.pathvisio.preferences.Preference;

/**
 * Part of MIM plugin supporting the MIM Preferences Dialog
 *
 * @author Margot Sunshine
 * @author Augustin Luna <augustin@mail.nih.gov>
 *
 * @version 1.0
 * @since 1.0
 */
public class MimPreferencesDlg {
    PvDesktop desktop;

    public MimPreferencesDlg(PvDesktop desktop) {
        this.desktop = desktop;
        createMimPreferenceDlg();
    }

    public enum MIMPreference implements Preference {
        SHOW_COMMENT_LABELS(Boolean.toString(true)),
        COMMENT_REFERENCE(Boolean.toString(true)),
        PREFERRED_PANEL("MIM");

        MIMPreference(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        MIMPreference(File defaultValue)
        {
            this.defaultValue = "" + defaultValue;
        }

        private String defaultValue = Boolean.toString(false);

        public String getDefault() {
            return defaultValue;
        }

    }

    /*
     * Code for handeling MIM preferences
     */
    private void createMimPreferenceDlg() {
        PreferencesDlg dlg = desktop.getPreferencesDlg();
        PreferenceManager.getCurrent().get(MIMPreference.SHOW_COMMENT_LABELS);
        PreferenceManager.getCurrent().get(MIMPreference.COMMENT_REFERENCE);
        PreferenceManager.getCurrent().get(MIMPreference.PREFERRED_PANEL);
        dlg.addPanel("MIM Plugin",
                        dlg.builder().booleanField(MIMPreference.SHOW_COMMENT_LABELS, "Show Comment Labels")
                                .booleanField(MIMPreference.COMMENT_REFERENCE, "Attach References to Comments").
                stringField(MIMPreference.PREFERRED_PANEL, "Select pane to appear on top").build());
    }



}
