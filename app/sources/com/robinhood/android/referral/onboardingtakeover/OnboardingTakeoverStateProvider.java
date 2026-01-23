package com.robinhood.android.referral.onboardingtakeover;

import android.os.Parcelable;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ReferralLandingSdui;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.OnboardingWelcomeTakeoverAction;
import com.robinhood.models.serverdriven.experimental.api.TextInput;
import com.robinhood.models.serverdriven.experimental.api.TextInputState;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OnboardingTakeoverStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverDataState;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverViewState;", "<init>", "()V", "reduce", "dataState", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class OnboardingTakeoverStateProvider implements StateProvider<OnboardingTakeoverState, OnboardingTakeoverViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OnboardingTakeoverViewState reduce(OnboardingTakeoverState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState instanceof OnboardingTakeoverState.Fresh) {
            return new OnboardingTakeoverViewState(((OnboardingTakeoverState.Fresh) dataState).getContent());
        }
        if (dataState instanceof OnboardingTakeoverState.EmailSuggestionAccepted) {
            OnboardingTakeoverState.EmailSuggestionAccepted emailSuggestionAccepted = (OnboardingTakeoverState.EmailSuggestionAccepted) dataState;
            ReferralLandingSdui content = emailSuggestionAccepted.getContent();
            List<UIComponent<OnboardingWelcomeTakeoverAction>> body_components = emailSuggestionAccepted.getContent().getBody_components();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(body_components, 10));
            for (Parcelable parcelableCopy$default : body_components) {
                if (parcelableCopy$default instanceof TextInput) {
                    parcelableCopy$default = TextInput.copy$default((TextInput) parcelableCopy$default, null, new TextInputState(emailSuggestionAccepted.getSuggestedEmail()), null, null, false, null, false, null, null, null, null, null, false, 8189, null);
                }
                arrayList.add(parcelableCopy$default);
            }
            return new OnboardingTakeoverViewState(ReferralLandingSdui.copy$default(content, null, arrayList, null, null, false, null, false, 125, null));
        }
        if (!(dataState instanceof OnboardingTakeoverState.LoadingChanged)) {
            throw new NoWhenBranchMatchedException();
        }
        OnboardingTakeoverState.LoadingChanged loadingChanged = (OnboardingTakeoverState.LoadingChanged) dataState;
        ReferralLandingSdui content2 = loadingChanged.getContent();
        List<UIComponent<OnboardingWelcomeTakeoverAction>> footer_components = loadingChanged.getContent().getFooter_components();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(footer_components, 10));
        for (Parcelable parcelableCopy$default2 : footer_components) {
            if (parcelableCopy$default2 instanceof Button) {
                parcelableCopy$default2 = Button.copy$default((Button) parcelableCopy$default2, null, null, null, !loadingChanged.isLoading(), null, null, null, null, null, null, 1015, null);
            }
            arrayList2.add(parcelableCopy$default2);
        }
        return new OnboardingTakeoverViewState(ReferralLandingSdui.copy$default(content2, null, null, arrayList2, null, false, null, false, 123, null));
    }
}
