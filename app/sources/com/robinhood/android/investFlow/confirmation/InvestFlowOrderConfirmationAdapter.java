package com.robinhood.android.investFlow.confirmation;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationViewState;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowOrderConfirmationAdapter.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007J\u001e\u0010\r\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState$UiInvestFlowReceiptRow;", "<init>", "()V", "context", "Landroid/content/Context;", "setRows", "", "rows", "", "newContext", "onBindViewHolder", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowOrderConfirmationAdapter extends GenericListAdapter<RdsRowView, InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow> {
    public static final int $stable = 8;
    private Context context;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow uiInvestFlowReceiptRow) throws Resources.NotFoundException {
        onBindViewHolder2((GenericViewHolder<? extends RdsRowView>) genericViewHolder, uiInvestFlowReceiptRow);
    }

    public InvestFlowOrderConfirmationAdapter() {
        super(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderConfirmationAdapter._init_$lambda$0((InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getPrimaryText();
    }

    public static /* synthetic */ void setRows$default(InvestFlowOrderConfirmationAdapter investFlowOrderConfirmationAdapter, List list, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        investFlowOrderConfirmationAdapter.setRows(list, context);
    }

    public final void setRows(List<InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow> rows, Context newContext) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        submitList(rows);
        if (newContext == null && (newContext = this.context) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            newContext = null;
        }
        this.context = newContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onBindViewHolder2(GenericViewHolder<? extends RdsRowView> holder, InvestFlowOrderConfirmationViewState.UiInvestFlowReceiptRow item) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        Context context;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        RdsRowView rdsRowView = (RdsRowView) holder.getView();
        StringResource primaryText = item.getPrimaryText();
        Context context2 = this.context;
        SpannableString spannableString$default = null;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text3 = primaryText.getText(resources);
        StringResource secondaryPrimaryText = item.getSecondaryPrimaryText();
        if (secondaryPrimaryText != null) {
            Context context3 = this.context;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context3 = null;
            }
            Resources resources2 = context3.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = secondaryPrimaryText.getText(resources2);
        } else {
            text = null;
        }
        StringResource secondaryMetadataString = item.getSecondaryMetadataString();
        if (secondaryMetadataString == null) {
            RichText secondaryMetadataRichText = item.getSecondaryMetadataRichText();
            if (secondaryMetadataRichText != null) {
                Context context4 = this.context;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                    context = null;
                } else {
                    context = context4;
                }
                spannableString$default = RichTexts.toSpannableString$default(secondaryMetadataRichText, context, null, false, null, 14, null);
            }
            text2 = spannableString$default;
        } else {
            Context context5 = this.context;
            if (context5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context5 = null;
            }
            Resources resources3 = context5.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text2 = secondaryMetadataString.getText(resources3);
            if (text2 == null) {
            }
        }
        RdsRowView.bind$default(rdsRowView, text3, null, text, text2, null, 18, null);
    }
}
