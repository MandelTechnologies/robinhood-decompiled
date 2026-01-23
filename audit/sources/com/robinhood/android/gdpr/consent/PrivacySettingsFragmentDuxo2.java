package com.robinhood.android.gdpr.consent;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrivacySettingsFragmentDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gdpr/consent/PrivacySettingsFragmentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onStart$2$1", m3645f = "PrivacySettingsFragmentDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gdpr.consent.PrivacySettingsFragmentDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PrivacySettingsFragmentDuxo2 extends ContinuationImpl7 implements Function2<PrivacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState>, Object> {
    final /* synthetic */ CountryCode.Supported $countryCode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PrivacySettingsFragmentDuxo2(CountryCode.Supported supported, Continuation<? super PrivacySettingsFragmentDuxo2> continuation) {
        super(2, continuation);
        this.$countryCode = supported;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PrivacySettingsFragmentDuxo2 privacySettingsFragmentDuxo2 = new PrivacySettingsFragmentDuxo2(this.$countryCode, continuation);
        privacySettingsFragmentDuxo2.L$0 = obj;
        return privacySettingsFragmentDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PrivacySettingsFragmentViewState privacySettingsFragmentViewState, Continuation<? super PrivacySettingsFragmentViewState> continuation) {
        return ((PrivacySettingsFragmentDuxo2) create(privacySettingsFragmentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PrivacySettingsFragmentViewState privacySettingsFragmentViewState = (PrivacySettingsFragmentViewState) this.L$0;
        if (Intrinsics.areEqual(this.$countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, null, null, companion.invoke(C17671R.string.privacy_settings_privacy_policy_link_gb, new Object[0]), companion.invoke(C17671R.string.privacy_settings_cookie_policy_link_gb, new Object[0]), 3, null);
        }
        if (CountryCode.Supported.INSTANCE.getEU_COUNTRIES().contains(this.$countryCode)) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            return PrivacySettingsFragmentViewState.copy$default(privacySettingsFragmentViewState, null, null, companion2.invoke(C17671R.string.privacy_settings_privacy_policy_link_eu, new Object[0]), companion2.invoke(C17671R.string.privacy_settings_cookie_policy_link_eu, new Object[0]), 3, null);
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException(this.$countryCode + " user entered PrivacySettingsFragment"), false, null, 6, null);
        return privacySettingsFragmentViewState;
    }
}
