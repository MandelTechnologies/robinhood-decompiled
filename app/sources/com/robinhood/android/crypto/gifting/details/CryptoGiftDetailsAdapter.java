package com.robinhood.android.crypto.gifting.details;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.crypto.gifting.C12906R;
import com.robinhood.android.crypto.gifting.details.models.CryptoGiftEditorViewData;
import com.robinhood.android.crypto.gifting.details.models.DisclaimerViewData;
import com.robinhood.android.crypto.gifting.details.models.MessageViewData;
import com.robinhood.android.crypto.gifting.details.p092ui.DisclaimerRowView;
import com.robinhood.android.crypto.gifting.details.p092ui.GiftCardRowView;
import com.robinhood.android.crypto.gifting.details.p092ui.MessageRowView;
import com.robinhood.android.crypto.gifting.details.utils.RdsDataRowExtensions;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsAdapter.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0002\u0014\u0015B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u001e\u0010\u0012\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "onClick", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "CondensedRowInflaterWithDivider", "Companion", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoGiftDetailsAdapter extends ListAdapter<Object, GenericViewHolder<? extends View>> {
    private final Function1<GenericAction, Unit> onClick;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int GIFT_CARD = CryptoGiftEditorViewData.GiftCardViewData.class.hashCode();
    private static final int MESSAGE = MessageViewData.class.hashCode();
    private static final int SUMMARY_ITEM = StandardRow.class.hashCode();
    private static final int DISCLAIMER = DisclaimerViewData.class.hashCode();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(Object obj) {
        return obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoGiftDetailsAdapter(Function1<? super GenericAction, Unit> onClick) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoGiftDetailsAdapter._init_$lambda$0(obj);
            }
        }));
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).getClass().hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == GIFT_CARD) {
            viewInflate = GiftCardRowView.INSTANCE.inflate(parent);
        } else if (viewType == MESSAGE) {
            viewInflate = MessageRowView.INSTANCE.inflate(parent);
        } else if (viewType == SUMMARY_ITEM) {
            viewInflate = CondensedRowInflaterWithDivider.INSTANCE.inflate(parent);
        } else {
            if (viewType != DISCLAIMER) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
            }
            viewInflate = DisclaimerRowView.INSTANCE.inflate(parent);
        }
        return new GenericViewHolder<>(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        if (item instanceof CryptoGiftEditorViewData) {
            KeyEvent.Callback view = holder.getView();
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.crypto.gifting.details.models.CryptoGiftEditorViewData>");
            ((Bindable) view).bind(item);
            return;
        }
        if (item instanceof MessageViewData) {
            KeyEvent.Callback view2 = holder.getView();
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.crypto.gifting.details.models.MessageViewData>");
            ((Bindable) view2).bind(item);
        } else if (item instanceof StandardRow) {
            RdsDataRowView rdsDataRowView = (RdsDataRowView) holder.getView().findViewById(C12906R.id.row_view);
            Intrinsics.checkNotNull(rdsDataRowView);
            RdsDataRowExtensions.bindStandardRow(rdsDataRowView, (StandardRow) item, new Function1() { // from class: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoGiftDetailsAdapter.onBindViewHolder$lambda$1(this.f$0, (GenericAction) obj);
                }
            });
        } else {
            if (!(item instanceof DisclaimerViewData)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
                throw new ExceptionsH();
            }
            KeyEvent.Callback view3 = holder.getView();
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.crypto.gifting.details.models.DisclaimerViewData>");
            ((Bindable) view3).bind(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(CryptoGiftDetailsAdapter cryptoGiftDetailsAdapter, GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        cryptoGiftDetailsAdapter.onClick.invoke(action);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoGiftDetailsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsAdapter$CondensedRowInflaterWithDivider;", "Lcom/robinhood/utils/ui/view/Inflater;", "Landroid/view/View;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class CondensedRowInflaterWithDivider implements Inflater<View> {
        public static final CondensedRowInflaterWithDivider INSTANCE = new CondensedRowInflaterWithDivider();
        private final /* synthetic */ Inflater<View> $$delegate_0 = Inflater.INSTANCE.include(C12906R.layout.include_rds_data_condensed_row_with_divider);

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public View inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.$$delegate_0.inflate(parent);
        }

        private CondensedRowInflaterWithDivider() {
        }
    }

    /* compiled from: CryptoGiftDetailsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/crypto/gifting/details/CryptoGiftDetailsAdapter$Companion;", "", "<init>", "()V", "GIFT_CARD", "", "getGIFT_CARD", "()I", "MESSAGE", "getMESSAGE", "SUMMARY_ITEM", "getSUMMARY_ITEM", "DISCLAIMER", "getDISCLAIMER", "feature-crypto-gifting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getGIFT_CARD() {
            return CryptoGiftDetailsAdapter.GIFT_CARD;
        }

        public final int getMESSAGE() {
            return CryptoGiftDetailsAdapter.MESSAGE;
        }

        public final int getSUMMARY_ITEM() {
            return CryptoGiftDetailsAdapter.SUMMARY_ITEM;
        }

        public final int getDISCLAIMER() {
            return CryptoGiftDetailsAdapter.DISCLAIMER;
        }
    }
}
