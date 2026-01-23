package com.singular.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class DeviceIDManager {
    private static DeviceIDManager instance;
    private static final SingularLog logger = SingularLog.getLogger(DeviceIDManager.class.getSimpleName());
    private SdidModel currentSdid;
    private SdidModel previousSdid;
    private SdidModel candidateCustomSdid = null;
    private boolean cachedDidSendStartSessionWithSdid = false;

    public static DeviceIDManager getInstance() {
        if (instance == null) {
            instance = new DeviceIDManager();
        }
        return instance;
    }

    public void setup(SingularInstance singularInstance) {
        loadPreviousSdidForComparison(singularInstance.getContext());
        getInstance().setCandidateCustomSdid(singularInstance);
    }

    private void setCandidateCustomSdid(SingularInstance singularInstance) {
        if (getActualSdid(ConfigManager.getInstance(), singularInstance.getContext()) != null) {
            logger.debug("ignoring set candidate custom sdid because one exists.");
            return;
        }
        String str = singularInstance.getSingularConfig().customSdid;
        if (Utils.isEmptyOrNull(str)) {
            this.candidateCustomSdid = null;
            logger.debug("setting candidate custom sdid to null");
            return;
        }
        this.candidateCustomSdid = new SdidModel(str, SdidModel.SdidSource.custom);
        logger.debug("setting candidate custom sdid: " + str);
    }

    void loadPreviousSdidForComparison(Context context) {
        this.previousSdid = getActualSdid(ConfigManager.getInstance(), context);
        logger.debug("loaded previous sdid for comparison");
    }

    public SdidModel getActualSdid(ConfigManager configManager, Context context) {
        if (this.currentSdid == null) {
            logger.debug("current sdid is null, trying to pick actual sdid model");
            this.currentSdid = pickActualSdidModel(configManager, context);
        }
        return this.currentSdid;
    }

    private SdidModel pickActualSdidModel(ConfigManager configManager, Context context) {
        try {
            if (context == null) {
                logger.debug("failed to pick actual sdid model because context is null");
                return null;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.PREF_SESSION, 0);
            String string2 = sharedPreferences.getString(Constants.CUSTOM_SDID_KEY, null);
            if (!Utils.isEmptyOrNull(string2)) {
                logger.debug("returning persisted custom sdid from prefs");
                return new SdidModel(string2, SdidModel.SdidSource.custom);
            }
            String string3 = sharedPreferences.getString(Constants.PREF_SINGULAR_DEVICE_ID_KEY, null);
            if (!Utils.isEmptyOrNull(string3)) {
                logger.debug("returning persisted resolved sdid from prefs");
                return new SdidModel(string3, SdidModel.SdidSource.resolved);
            }
            boolean zWasCustomSdidProvided = wasCustomSdidProvided();
            boolean zIsSetSdidEnabled = configManager.isSetSdidEnabled();
            if (zWasCustomSdidProvided && zIsSetSdidEnabled) {
                SingularLog singularLog = logger;
                singularLog.debug("persisting custom set sdid to prefs");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(Constants.CUSTOM_SDID_KEY, this.candidateCustomSdid.getValue());
                editorEdit.commit();
                singularLog.debug("returning custom set sdid");
                return this.candidateCustomSdid;
            }
            String resolvedSdid = configManager.getResolvedSdid();
            if (!Utils.isEmptyOrNull(resolvedSdid)) {
                SingularLog singularLog2 = logger;
                singularLog2.debug("persisting resolved sdid to prefs");
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                editorEdit2.putString(Constants.PREF_SINGULAR_DEVICE_ID_KEY, resolvedSdid);
                editorEdit2.commit();
                singularLog2.debug("returning resolved sdid from config");
                return new SdidModel(resolvedSdid, SdidModel.SdidSource.resolved);
            }
            logger.debug("returning null - can't pick an actual valid SDID.");
            return null;
        } catch (Throwable th) {
            logger.error("caught throwable during pick actual sdid model. returning null: " + Utils.formatException(th));
            return null;
        }
    }

    public boolean isCurrentSdidNewComparedToPrevious(Context context) {
        SdidModel actualSdid = getActualSdid(ConfigManager.getInstance(), context);
        boolean z = this.previousSdid == null && actualSdid != null;
        this.previousSdid = actualSdid;
        SingularLog singularLog = logger;
        StringBuilder sb = new StringBuilder();
        sb.append("is fresh sdid = ");
        sb.append(z ? "true" : "false");
        singularLog.debug(sb.toString());
        return z;
    }

    public boolean wasCustomSdidProvided() {
        return this.candidateCustomSdid != null;
    }

    boolean didSendStartSessionWithSdid(Context context) {
        try {
            if (this.cachedDidSendStartSessionWithSdid) {
                return true;
            }
            boolean z = context.getSharedPreferences(Constants.PREF_SESSION, 0).getBoolean(Constants.DID_SEND_START_SESSION_WITH_SDID, false);
            this.cachedDidSendStartSessionWithSdid = z;
            return z;
        } catch (Throwable unused) {
            logger.debug("failed getting pref boolean flag did send start session with SDID");
            return false;
        }
    }

    void setDidSendStartSessionWithSdidTrue(Context context) {
        try {
            logger.debug("setting pref did send start session with SDID to true");
            this.cachedDidSendStartSessionWithSdid = true;
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.PREF_SESSION, 0).edit();
            editorEdit.putBoolean(Constants.DID_SEND_START_SESSION_WITH_SDID, this.cachedDidSendStartSessionWithSdid);
            editorEdit.commit();
        } catch (Throwable unused) {
            logger.debug("failed setting pref did send start session with SDID");
        }
    }

    public static class SdidModel {
        private final SdidSource source;
        private final String value;

        public enum SdidSource {
            custom,
            resolved
        }

        SdidModel(String str, SdidSource sdidSource) {
            this.value = str;
            this.source = sdidSource;
        }

        public String getValue() {
            return this.value;
        }

        public SdidSource getSource() {
            return this.source;
        }
    }
}
