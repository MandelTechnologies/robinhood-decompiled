package com.robinhood.android.designsystem.row;

import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsSectionHeaderAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u000b¢\u0006\u0004\b\f\u0010\rBE\b\u0016\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u000b¢\u0006\u0004\b\f\u0010\u000fBC\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u000b¢\u0006\u0004\b\f\u0010\u0010J*\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0014R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsSectionHeaderAdapter;", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/row/RdsHeaderRowView;", "Lcom/robinhood/utils/Either;", "", "", "sectionTitle", "isVisible", "", "useDisplayStyle", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "(Lcom/robinhood/utils/Either;ZZLandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "sectionTitleRes", "(IZZLandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "(Ljava/lang/CharSequence;ZZLandroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getSectionTitle", "()Lcom/robinhood/utils/Either;", "value", "()Z", "setVisible", "(Z)V", "isInTopPosition", "setInTopPosition", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RdsSectionHeaderAdapter extends SingleItemAdapter<RdsHeaderRowView, Either<? extends Integer, ? extends CharSequence>> {
    private boolean isInTopPosition;
    private final Either<Integer, CharSequence> sectionTitle;
    private final boolean useDisplayStyle;

    @Override // com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, Either<? extends Integer, ? extends CharSequence> either) {
        onBindViewHolder2((GenericViewHolder<RdsHeaderRowView>) genericViewHolder, (Either<Integer, ? extends CharSequence>) either);
    }

    public final Either<Integer, CharSequence> getSectionTitle() {
        return this.sectionTitle;
    }

    public /* synthetic */ RdsSectionHeaderAdapter(Either either, boolean z, boolean z2, DiffUtil.ItemCallback itemCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((Either<Integer, ? extends CharSequence>) either, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>>) ((i & 8) != 0 ? DiffCallbacks.Equality.INSTANCE : itemCallback));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RdsSectionHeaderAdapter(Either<Integer, ? extends CharSequence> sectionTitle, boolean z, boolean z2, DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>> diffCallback) {
        super(RdsHeaderRowView.INSTANCE, diffCallback);
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.sectionTitle = sectionTitle;
        this.useDisplayStyle = z2;
        setVisible(z);
    }

    public /* synthetic */ RdsSectionHeaderAdapter(int i, boolean z, boolean z2, DiffUtil.ItemCallback itemCallback, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>>) ((i2 & 8) != 0 ? DiffCallbacks.Equality.INSTANCE : itemCallback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RdsSectionHeaderAdapter(int i, boolean z, boolean z2, DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>> diffCallback) {
        this(Either2.asLeft(Integer.valueOf(i)), z, z2, diffCallback);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    public /* synthetic */ RdsSectionHeaderAdapter(CharSequence charSequence, boolean z, boolean z2, DiffUtil.ItemCallback itemCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>>) ((i & 8) != 0 ? DiffCallbacks.Equality.INSTANCE : itemCallback));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RdsSectionHeaderAdapter(CharSequence sectionTitle, boolean z, boolean z2, DiffUtil.ItemCallback<? super Either<Integer, ? extends CharSequence>> diffCallback) {
        this(Either2.asRight(sectionTitle), z, z2, diffCallback);
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    public final boolean isVisible() {
        return getData() != null;
    }

    public final void setVisible(boolean z) {
        setData(z ? this.sectionTitle : null);
    }

    /* renamed from: isInTopPosition, reason: from getter */
    public final boolean getIsInTopPosition() {
        return this.isInTopPosition;
    }

    public final void setInTopPosition(boolean z) {
        if (this.isInTopPosition != z) {
            this.isInTopPosition = z;
            if (isVisible()) {
                notifyItemChanged(0);
            }
        }
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<RdsHeaderRowView> holder, Either<Integer, ? extends CharSequence> item) {
        CharSequence string2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        RdsHeaderRowView rdsHeaderRowView = (RdsHeaderRowView) holder.getView();
        if (item instanceof Either.Left) {
            string2 = ViewsKt.getString(rdsHeaderRowView, ((Number) ((Either.Left) item).getValue()).intValue());
        } else {
            if (!(item instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = (CharSequence) ((Either.Right) item).getValue();
        }
        RdsHeaderRowView.bind$default(rdsHeaderRowView, string2, rdsHeaderRowView.getIsInTopPosition(), this.useDisplayStyle, null, null, 24, null);
    }
}
