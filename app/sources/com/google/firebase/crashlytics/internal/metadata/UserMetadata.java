package com.google.firebase.crashlytics.internal.metadata;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class UserMetadata {
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final MetaDataStore metaDataStore;
    private String sessionIdentifier;
    private final SerializeableKeysMap customKeys = new SerializeableKeysMap(false);
    private final SerializeableKeysMap internalKeys = new SerializeableKeysMap(true);
    private final RolloutAssignmentList rolloutsState = new RolloutAssignmentList(128);
    private final AtomicMarkableReference<String> userId = new AtomicMarkableReference<>(null, false);

    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.sessionIdentifier = str;
        this.metaDataStore = new MetaDataStore(fileStore);
        this.backgroundWorker = crashlyticsBackgroundWorker;
    }

    public void setNewSession(String str) {
        synchronized (this.sessionIdentifier) {
            try {
                this.sessionIdentifier = str;
                Map<String, String> keys = this.customKeys.getKeys();
                List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                if (getUserId() != null) {
                    this.metaDataStore.writeUserData(str, getUserId());
                }
                if (!keys.isEmpty()) {
                    this.metaDataStore.writeKeyData(str, keys);
                }
                if (!rolloutAssignmentList.isEmpty()) {
                    this.metaDataStore.writeRolloutState(str, rolloutAssignmentList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getUserId() {
        return this.userId.getReference();
    }

    public void setUserId(String str) {
        String strSanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            try {
                if (CommonUtils.nullSafeEquals(strSanitizeString, this.userId.getReference())) {
                    return;
                }
                this.userId.set(strSanitizeString, true);
                this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UserMetadata.$r8$lambda$dCuOoYutJUFqjZ4zVe0P6kT6Mi8(this.f$0);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object $r8$lambda$dCuOoYutJUFqjZ4zVe0P6kT6Mi8(UserMetadata userMetadata) throws Throwable {
        userMetadata.serializeUserDataIfNeeded();
        return null;
    }

    public Map<String, String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public Map<String, String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(String str, String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            try {
                if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                    return false;
                }
                final List<RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
                this.backgroundWorker.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return UserMetadata.$r8$lambda$Cx0JEx7XPsPjCsFtXdU7fYfqAaM(this.f$0, rolloutAssignmentList);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ Object $r8$lambda$Cx0JEx7XPsPjCsFtXdU7fYfqAaM(UserMetadata userMetadata, List list) throws Throwable {
        userMetadata.metaDataStore.writeRolloutState(userMetadata.sessionIdentifier, list);
        return null;
    }

    private void serializeUserDataIfNeeded() throws Throwable {
        boolean z;
        String userId;
        synchronized (this.userId) {
            try {
                z = false;
                if (this.userId.isMarked()) {
                    userId = getUserId();
                    this.userId.set(userId, false);
                    z = true;
                } else {
                    userId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, userId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final AtomicMarkableReference<KeysMap> map;
        private final AtomicReference<Callable<Void>> queuedSerializer = new AtomicReference<>(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new AtomicMarkableReference<>(new KeysMap(64, z ? 8192 : 1024), false);
        }

        public Map<String, String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.map.getReference().setKey(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    scheduleSerializationTaskIfNeeded();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void scheduleSerializationTaskIfNeeded() {
            Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return UserMetadata.SerializeableKeysMap.$r8$lambda$MRS7FQg6LwlQlWElOiIBARH1194(this.f$0);
                }
            };
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.queuedSerializer, null, callable)) {
                UserMetadata.this.backgroundWorker.submit(callable);
            }
        }

        public static /* synthetic */ Void $r8$lambda$MRS7FQg6LwlQlWElOiIBARH1194(SerializeableKeysMap serializeableKeysMap) throws Throwable {
            serializeableKeysMap.queuedSerializer.set(null);
            serializeableKeysMap.serializeIfMarked();
            return null;
        }

        private void serializeIfMarked() throws Throwable {
            Map<String, String> keys;
            synchronized (this) {
                try {
                    if (this.map.isMarked()) {
                        keys = this.map.getReference().getKeys();
                        AtomicMarkableReference<KeysMap> atomicMarkableReference = this.map;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        keys = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (keys != null) {
                UserMetadata.this.metaDataStore.writeKeyData(UserMetadata.this.sessionIdentifier, keys, this.isInternal);
            }
        }
    }
}
