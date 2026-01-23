package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.directipo.models.api.ApiDirectIpoDspFundAccount;
import com.robinhood.models.api.PostOnboardingFundAccountDetailScreenContent;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PostSignupOnboardingContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PostSignUpFundAccountDetailState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDataState;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailViewState;", "<init>", "()V", "reduce", "dataState", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountDetailState4 implements StateProvider<PostSignUpFundAccountDetailDataState, PostSignUpFundAccountDetailViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public PostSignUpFundAccountDetailViewState reduce(PostSignUpFundAccountDetailDataState dataState) {
        Context context;
        Boolean r0;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiApplication userApplication = dataState.getUserApplication();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        if (userApplication != null) {
            if (userApplication.isApproved()) {
                r0 = Boolean.TRUE;
            } else {
                r0 = Boolean.FALSE;
            }
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostSignupOnboardingContext(r0, objArr4 == true ? 1 : 0, 2, objArr3 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -5, 16383, null);
        } else {
            context = null;
        }
        ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount = dataState.getApiDirectIpoDspFundAccount();
        ApiDirectIpoDspFundAccount.ViewModel view_model = apiDirectIpoDspFundAccount != null ? apiDirectIpoDspFundAccount.getView_model() : null;
        if (view_model == null && dataState.getFundAccountDetailScreenContent() == null) {
            return new PostSignUpFundAccountDetailViewState(objArr2 == true ? 1 : 0, context, 1, objArr == true ? 1 : 0);
        }
        if (view_model != null) {
            RichText richText = new RichText(view_model.getTitle(), CollectionsKt.emptyList());
            String subtitle_markdown = view_model.getSubtitle_markdown();
            List<ApiDirectIpoDspFundAccount.Row> rows = view_model.getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            for (ApiDirectIpoDspFundAccount.Row row : rows) {
                Icon iconFromServerValue = Icon.INSTANCE.fromServerValue(row.getIcon().getServerValue());
                if (iconFromServerValue == null) {
                    iconFromServerValue = Icon.SPARKLE_BULLET_24;
                }
                arrayList.add(new ValuePropWithIcon(iconFromServerValue, row.getTitle(), row.getSubtitle_markdown(), null, null, null, null, null, null, 504, null));
            }
            return new PostSignUpFundAccountDetailViewState(new PostSignUpFundAccountDetailContent(richText, null, subtitle_markdown, arrayList, null, view_model.getLink_account_button_title(), null, 82, null), context);
        }
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent = dataState.getFundAccountDetailScreenContent();
        RichText title = fundAccountDetailScreenContent != null ? fundAccountDetailScreenContent.getTitle() : null;
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent2 = dataState.getFundAccountDetailScreenContent();
        RichText subtitle = fundAccountDetailScreenContent2 != null ? fundAccountDetailScreenContent2.getSubtitle() : null;
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent3 = dataState.getFundAccountDetailScreenContent();
        List<ValuePropWithIcon<GenericAction>> valueProps = fundAccountDetailScreenContent3 != null ? fundAccountDetailScreenContent3.getValueProps() : null;
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent4 = dataState.getFundAccountDetailScreenContent();
        RichText disclosureText = fundAccountDetailScreenContent4 != null ? fundAccountDetailScreenContent4.getDisclosureText() : null;
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent5 = dataState.getFundAccountDetailScreenContent();
        String buttonText = fundAccountDetailScreenContent5 != null ? fundAccountDetailScreenContent5.getButtonText() : null;
        PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent6 = dataState.getFundAccountDetailScreenContent();
        return new PostSignUpFundAccountDetailViewState(new PostSignUpFundAccountDetailContent(title, subtitle, null, valueProps, disclosureText, buttonText, fundAccountDetailScreenContent6 != null ? fundAccountDetailScreenContent6.getExitButtonText() : null, 4, null), context);
    }
}
