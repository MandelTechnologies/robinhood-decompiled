package com.robinhood.android.privacysettings.p217ui.visibility;

import com.robinhood.android.privacy.ProfileDiscoverabilityManager;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import com.robinhood.models.api.identi.OptOutConsentType;
import com.robinhood.udf.UiEvent;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ProfileVisibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;", "profileDiscoverabilityManager", "Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;", "<init>", "(Lcom/robinhood/android/privacy/ProfileDiscoverabilityManager;)V", "onCreate", "", "onConsentTypeRowClicked", "type", "Lcom/robinhood/models/api/identi/OptOutConsentType;", "isChecked", "", "onAnyoneRowClicked", "onNobodyRowClicked", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProfileVisibilityDuxo extends OldBaseDuxo<ProfileVisibilityViewState> {
    public static final int $stable = 8;
    private final ProfileDiscoverabilityManager profileDiscoverabilityManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileVisibilityDuxo(ProfileDiscoverabilityManager profileDiscoverabilityManager) {
        super(new ProfileVisibilityViewState(false, false, null, null, 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(profileDiscoverabilityManager, "profileDiscoverabilityManager");
        this.profileDiscoverabilityManager = profileDiscoverabilityManager;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.profileDiscoverabilityManager.getDiscoverabilityConsentStatuses(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onCreate$lambda$2(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onCreate$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(ProfileVisibilityDuxo profileVisibilityDuxo, final List statuses) {
        Intrinsics.checkNotNullParameter(statuses, "statuses");
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onCreate$lambda$2$lambda$1(statuses, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onCreate$lambda$2$lambda$1(List list, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<ApiOptOutConsentStatus> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ApiOptOutConsentStatus apiOptOutConsentStatus : list2) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(apiOptOutConsentStatus.getType(), Boolean.valueOf(apiOptOutConsentStatus.getConsent_status()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, null, linkedHashMap, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(ProfileVisibilityDuxo profileVisibilityDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onCreate$lambda$4$lambda$3(t, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onCreate$lambda$4$lambda$3(Throwable th, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, new UiEvent(th), null, 11, null);
    }

    public final void onConsentTypeRowClicked(final OptOutConsentType type2, final boolean isChecked) {
        Intrinsics.checkNotNullParameter(type2, "type");
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onConsentTypeRowClicked$lambda$5((ProfileVisibilityViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.profileDiscoverabilityManager.updateDiscoverabilityConsentStatus(type2, !isChecked), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileVisibilityDuxo.onConsentTypeRowClicked$lambda$7(this.f$0, type2, isChecked);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onConsentTypeRowClicked$lambda$9(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onConsentTypeRowClicked$lambda$5(ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, true, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConsentTypeRowClicked$lambda$7(ProfileVisibilityDuxo profileVisibilityDuxo, final OptOutConsentType optOutConsentType, final boolean z) {
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onConsentTypeRowClicked$lambda$7$lambda$6(optOutConsentType, z, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onConsentTypeRowClicked$lambda$7$lambda$6(OptOutConsentType optOutConsentType, boolean z, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, null, MapsKt.plus(applyMutation.getStatuses(), Tuples4.m3642to(optOutConsentType, Boolean.valueOf(!z))), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConsentTypeRowClicked$lambda$9(ProfileVisibilityDuxo profileVisibilityDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onConsentTypeRowClicked$lambda$9$lambda$8(t, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onConsentTypeRowClicked$lambda$9$lambda$8(Throwable th, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, new UiEvent(th), null, 11, null);
    }

    public final void onAnyoneRowClicked(boolean isChecked) {
        if (isChecked) {
            return;
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onAnyoneRowClicked$lambda$10((ProfileVisibilityViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.profileDiscoverabilityManager.toggleDiscoverability(true), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileVisibilityDuxo.onAnyoneRowClicked$lambda$12(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onAnyoneRowClicked$lambda$14(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onAnyoneRowClicked$lambda$10(ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, true, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnyoneRowClicked$lambda$12(ProfileVisibilityDuxo profileVisibilityDuxo) {
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onAnyoneRowClicked$lambda$12$lambda$11((ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onAnyoneRowClicked$lambda$12$lambda$11(ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OptOutConsentType optOutConsentType = OptOutConsentType.STICKER_DISCOVERABILITY_CONSENT;
        Boolean bool = Boolean.TRUE;
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, null, MapsKt.mapOf(Tuples4.m3642to(optOutConsentType, bool), Tuples4.m3642to(OptOutConsentType.PHONE_DISCOVERABILITY_CONSENT, bool), Tuples4.m3642to(OptOutConsentType.EMAIL_DISCOVERABILITY_CONSENT, bool)), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnyoneRowClicked$lambda$14(ProfileVisibilityDuxo profileVisibilityDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onAnyoneRowClicked$lambda$14$lambda$13(t, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onAnyoneRowClicked$lambda$14$lambda$13(Throwable th, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, new UiEvent(th), null, 11, null);
    }

    public final void onNobodyRowClicked(boolean isChecked) {
        if (isChecked) {
            return;
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onNobodyRowClicked$lambda$15((ProfileVisibilityViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.profileDiscoverabilityManager.toggleDiscoverability(false), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfileVisibilityDuxo.onNobodyRowClicked$lambda$17(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onNobodyRowClicked$lambda$19(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onNobodyRowClicked$lambda$15(ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, true, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNobodyRowClicked$lambda$17(ProfileVisibilityDuxo profileVisibilityDuxo) {
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onNobodyRowClicked$lambda$17$lambda$16((ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onNobodyRowClicked$lambda$17$lambda$16(ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, null, MapsKt.emptyMap(), 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNobodyRowClicked$lambda$19(ProfileVisibilityDuxo profileVisibilityDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        profileVisibilityDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileVisibilityDuxo.onNobodyRowClicked$lambda$19$lambda$18(t, (ProfileVisibilityViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileVisibilityViewState onNobodyRowClicked$lambda$19$lambda$18(Throwable th, ProfileVisibilityViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileVisibilityViewState.copy$default(applyMutation, false, false, new UiEvent(th), null, 11, null);
    }
}
