package com.robinhood.android.onboarding.p205ui.usercreation.loading;

import com.robinhood.android.onboarding.p205ui.usercreation.loading.UserCreationLoadingDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.OnboardingGbExperiments;
import com.robinhood.librobinhood.data.store.UserRegionStore;
import com.robinhood.models.api.UserRegion;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserCreationLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/onboarding/ui/usercreation/loading/UserCreationLoadingEvent;", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "userRegionStore", "Lcom/robinhood/librobinhood/data/store/UserRegionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/UserRegionStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "checkIfGbSignupActive", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class UserCreationLoadingDuxo extends BaseDuxo5<Unit, UserCreationLoadingDuxo2> {
    public static final int $stable = 8;
    private final ExperimentsStore experimentStore;
    private final UserRegionStore userRegionStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserCreationLoadingDuxo(ExperimentsStore experimentStore, UserRegionStore userRegionStore, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(experimentStore, "experimentStore");
        Intrinsics.checkNotNullParameter(userRegionStore, "userRegionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.experimentStore = experimentStore;
        this.userRegionStore = userRegionStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.userRegionStore.getCurrentRegion(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationLoadingDuxo.onCreate$lambda$0(this.f$0, (UserRegion) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationLoadingDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(UserCreationLoadingDuxo userCreationLoadingDuxo, UserRegion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            CountryCode.Companion companion = CountryCode.INSTANCE;
            String upperCase = it.getRegion().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String parentLocality = companion.getInstance(upperCase).getParentLocality();
            if (Intrinsics.areEqual(parentLocality, CountryCode.COUNTRY_CODE_US)) {
                userCreationLoadingDuxo.submit(UserCreationLoadingDuxo2.UserCreationStartsWithEmail.INSTANCE);
            } else if (Intrinsics.areEqual(parentLocality, CountryCode.COUNTRY_CODE_GB)) {
                userCreationLoadingDuxo.checkIfGbSignupActive();
            } else {
                userCreationLoadingDuxo.submit(UserCreationLoadingDuxo2.UserCreationStartsWithRegion.INSTANCE);
            }
        } catch (Exception unused) {
            userCreationLoadingDuxo.submit(UserCreationLoadingDuxo2.UserCreationStartsWithRegion.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(UserCreationLoadingDuxo userCreationLoadingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userCreationLoadingDuxo.submit(UserCreationLoadingDuxo2.UserCreationStartsWithRegion.INSTANCE);
        return Unit.INSTANCE;
    }

    private final void checkIfGbSignupActive() {
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsStore.getState$default(this.experimentStore, OnboardingGbExperiments.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationLoadingDuxo.checkIfGbSignupActive$lambda$2(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.onboarding.ui.usercreation.loading.UserCreationLoadingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UserCreationLoadingDuxo.checkIfGbSignupActive$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkIfGbSignupActive$lambda$2(UserCreationLoadingDuxo userCreationLoadingDuxo, boolean z) {
        Object obj;
        if (z) {
            obj = UserCreationLoadingDuxo2.UserCreationStartsWithEmail.INSTANCE;
        } else {
            obj = UserCreationLoadingDuxo2.UserCreationStartsWithRegion.INSTANCE;
        }
        userCreationLoadingDuxo.submit(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkIfGbSignupActive$lambda$3(UserCreationLoadingDuxo userCreationLoadingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userCreationLoadingDuxo.submit(UserCreationLoadingDuxo2.UserCreationStartsWithRegion.INSTANCE);
        return Unit.INSTANCE;
    }
}
