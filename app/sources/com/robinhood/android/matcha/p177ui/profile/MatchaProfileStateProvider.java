package com.robinhood.android.matcha.p177ui.profile;

import com.robinhood.android.matcha.p177ui.profile.MatchaProfileViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaProfileStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/profile/MatchaProfileStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaProfileStateProvider implements StateProvider<MatchaProfileDataState, MatchaProfileViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MatchaProfileViewState reduce(MatchaProfileDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getErrorAlert() != null) {
            return new MatchaProfileViewState.Error(dataState.getErrorAlert().getTitle(), new BentoAlertDialog2.Body.Text(dataState.getErrorAlert().getSubtitleMarkdown()), ((GenericButton) CollectionsKt.first((List) dataState.getErrorAlert().getButtons())).getTitle());
        }
        if (dataState.getProfileSduiResponse() != null && dataState.getSocialProfile() != null) {
            return new MatchaProfileViewState.Loaded(dataState.getProfileSduiResponse().getComponents(), dataState.getSocialProfile().getFull_name(), dataState.isUserBlocked(), dataState.getCanReportUser(), dataState.isPayButtonVisible(), dataState.isRequestButtonVisible(), dataState.getShowBlockConfirmationDialog(), !dataState.isPreOnboarding());
        }
        return MatchaProfileViewState.Loading.INSTANCE;
    }
}
