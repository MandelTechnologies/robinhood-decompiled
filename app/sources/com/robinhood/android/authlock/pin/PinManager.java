package com.robinhood.android.authlock.pin;

import com.robinhood.android.authlock.LockscreenExperiments2;
import com.robinhood.android.authlock.prefs.FailedPinAttemptsPref;
import com.robinhood.android.authlock.prefs.PinPref;
import com.robinhood.android.authlock.prefs.UserPinPref;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.singular.sdk.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PinManager.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*BU\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0001\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0007J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0007J\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u001fJ\u0006\u0010)\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b \u0010\u0016¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/authlock/pin/PinManager;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "userPinPref", "Lcom/robinhood/prefs/MoshiSecurePreference;", "", "", "pinPref", "Lcom/robinhood/prefs/StringPreference;", "failedAttemptsPref", "Lcom/robinhood/prefs/IntPreference;", "userUuidPref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "isInPersistentPinExperiment", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "isPinEnabled", "()Z", "value", "userPin", "getUserPin", "()Ljava/lang/String;", "setUserPin", "(Ljava/lang/String;)V", "tentativePin", "disablePin", "", "isTentativePinSet", "setTentativePin", Constants.RequestParamsKeys.SESSION_ID_KEY, "verifyTentativePin", "secondPin", "setPin", "pin", "unlock", "synchronizePins", "canTryAgain", "Companion", "lib-auth-lock_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PinManager {
    private static final int ALLOWED_ATTEMPTS = 3;
    private final CoroutineScope coroutineScope;
    private final IntPreference failedAttemptsPref;
    private final StateFlow<Boolean> isInPersistentPinExperiment;
    private final StringPreference pinPref;
    private String tentativePin;
    private final MoshiSecurePreference<Map<String, String>> userPinPref;
    private final StringPreference userUuidPref;
    public static final int $stable = 8;

    public PinManager(@RootCoroutineScope CoroutineScope coroutineScope, @UserPinPref MoshiSecurePreference<Map<String, String>> userPinPref, @PinPref StringPreference pinPref, @FailedPinAttemptsPref IntPreference failedAttemptsPref, @UserUuidPref StringPreference userUuidPref, ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userPinPref, "userPinPref");
        Intrinsics.checkNotNullParameter(pinPref, "pinPref");
        Intrinsics.checkNotNullParameter(failedAttemptsPref, "failedAttemptsPref");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.coroutineScope = coroutineScope;
        this.userPinPref = userPinPref;
        this.pinPref = pinPref;
        this.failedAttemptsPref = failedAttemptsPref;
        this.userUuidPref = userUuidPref;
        this.isInPersistentPinExperiment = FlowKt.stateIn(ExperimentsProvider.DefaultImpls.streamStateFlow$default(experimentsStore, new Experiment[]{LockscreenExperiments2.INSTANCE}, false, null, 6, null), coroutineScope, SharingStarted.INSTANCE.getEagerly(), Boolean.FALSE);
    }

    public final StateFlow<Boolean> isInPersistentPinExperiment() {
        return this.isInPersistentPinExperiment;
    }

    public final boolean isPinEnabled() {
        if (this.isInPersistentPinExperiment.getValue().booleanValue()) {
            return getUserPin() != null;
        }
        return this.pinPref.mo23850isSet();
    }

    private final String getUserPin() {
        Map<String, String> value = this.userPinPref.getValue();
        if (value != null) {
            return value.get(this.userUuidPref.get());
        }
        return null;
    }

    private final void setUserPin(String str) {
        Map<String, String> mapPlus;
        String str2 = this.userUuidPref.get();
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Map<String, String> value = this.userPinPref.getValue();
        if (value == null) {
            value = MapsKt.emptyMap();
        }
        MoshiSecurePreference<Map<String, String>> moshiSecurePreference = this.userPinPref;
        if (str == null) {
            mapPlus = MapsKt.minus(value, str2);
        } else {
            mapPlus = MapsKt.plus(value, Tuples4.m3642to(str2, str));
        }
        moshiSecurePreference.set((MoshiSecurePreference<Map<String, String>>) mapPlus);
    }

    public final void disablePin() {
        this.pinPref.delete();
        setUserPin(null);
    }

    public final boolean isTentativePinSet() {
        return this.tentativePin != null;
    }

    public final void setTentativePin(String s) {
        this.tentativePin = s;
    }

    public final boolean verifyTentativePin(String secondPin) {
        Intrinsics.checkNotNullParameter(secondPin, "secondPin");
        boolean zAreEqual = Intrinsics.areEqual(this.tentativePin, secondPin);
        if (zAreEqual) {
            setPin(secondPin);
        }
        this.tentativePin = null;
        return zAreEqual;
    }

    private final void setPin(String pin) {
        this.pinPref.set(pin);
        setUserPin(pin);
    }

    public final boolean unlock(String pin) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (this.isInPersistentPinExperiment.getValue().booleanValue()) {
            zAreEqual = Intrinsics.areEqual(pin, getUserPin());
        } else {
            zAreEqual = Intrinsics.areEqual(pin, this.pinPref.get());
        }
        if (zAreEqual) {
            this.failedAttemptsPref.delete();
            return zAreEqual;
        }
        IntPreference intPreference = this.failedAttemptsPref;
        intPreference.set(intPreference.get() + 1);
        return zAreEqual;
    }

    public final void synchronizePins() {
        if (Intrinsics.areEqual(getUserPin(), this.pinPref.get())) {
            return;
        }
        if (this.isInPersistentPinExperiment.getValue().booleanValue()) {
            if (this.pinPref.get() == null) {
                this.pinPref.set(getUserPin());
                return;
            } else {
                setUserPin(this.pinPref.get());
                return;
            }
        }
        setUserPin(this.pinPref.get());
    }

    public final boolean canTryAgain() {
        return this.failedAttemptsPref.get() < 3;
    }
}
