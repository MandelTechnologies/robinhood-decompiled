package com.robinhood.android.cart;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CartRowView.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001c2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u001cJ\u0010\u00107\u001a\u0002042\u0006\u00108\u001a\u00020-H\u0016J\u0014\u00109\u001a\u0002042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002040;J\u000e\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020-R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001b\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020-8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/cart/CartRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rowContainerLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRowContainerLayout$lib_cart_externalDebug", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rowContentLayout", "getRowContentLayout$lib_cart_externalDebug", StatisticsSection2.DIVIDER, "Landroid/view/View;", "textViewPrimary", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTextViewPrimary$lib_cart_externalDebug", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "textViewSecondary", "getTextViewSecondary$lib_cart_externalDebug", "caretViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Landroid/widget/ImageView;", "getCaretViewStubHolder$lib_cart_externalDebug", "()Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "continueButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "Lcom/robinhood/android/cart/CartRowView$Caret;", "caret", "getCaret", "()Lcom/robinhood/android/cart/CartRowView$Caret;", "setCaret", "(Lcom/robinhood/android/cart/CartRowView$Caret;)V", "", "showBottomDivider", "getShowBottomDivider", "()Z", "setShowBottomDivider", "(Z)V", "bind", "", "newPrimaryText", "newSecondaryText", "setEnabled", "enabled", "setContinueOnClick", "action", "Lkotlin/Function0;", "setContinueEnabled", "isEnabled", "Caret", "Companion", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public class CartRowView extends RdsRippleContainerView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Caret caret;
    private final ViewStubHolder<ImageView> caretViewStubHolder;
    private final RdsButton continueButton;
    private final View divider;
    private final ConstraintLayout rowContainerLayout;
    private final ConstraintLayout rowContentLayout;
    private final RhTextView textViewPrimary;
    private final RhTextView textViewSecondary;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartRowView(Context context, AttributeSet attributeSet) {
        Caret caret;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C9955R.layout.merge_cart_row, this);
        View viewFindViewById = findViewById(C9955R.id.row_container_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.rowContainerLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C9955R.id.row_content_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.rowContentLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(C9955R.id.row_top_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.divider = viewFindViewById3;
        View viewFindViewById4 = findViewById(C9955R.id.row_text_primary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.textViewPrimary = (RhTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C9955R.id.row_text_secondary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.textViewSecondary = (RhTextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.row_caret);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.caretViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById6);
        View viewFindViewById7 = findViewById(C9955R.id.continue_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.continueButton = (RdsButton) viewFindViewById7;
        int[] RdsRowView = C13997R.styleable.RdsRowView;
        Intrinsics.checkNotNullExpressionValue(RdsRowView, "RdsRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRowView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_primaryText));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_secondaryText));
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsRowView_caret);
        if (intOrNull != null) {
            caret = Caret.values()[intOrNull.intValue()];
        } else {
            caret = null;
        }
        setCaret(caret);
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_showBottomDivider, true));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_android_enabled, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: getRowContainerLayout$lib_cart_externalDebug, reason: from getter */
    public final ConstraintLayout getRowContainerLayout() {
        return this.rowContainerLayout;
    }

    /* renamed from: getRowContentLayout$lib_cart_externalDebug, reason: from getter */
    public final ConstraintLayout getRowContentLayout() {
        return this.rowContentLayout;
    }

    /* renamed from: getTextViewPrimary$lib_cart_externalDebug, reason: from getter */
    public final RhTextView getTextViewPrimary() {
        return this.textViewPrimary;
    }

    /* renamed from: getTextViewSecondary$lib_cart_externalDebug, reason: from getter */
    public final RhTextView getTextViewSecondary() {
        return this.textViewSecondary;
    }

    public final ViewStubHolder<ImageView> getCaretViewStubHolder$lib_cart_externalDebug() {
        return this.caretViewStubHolder;
    }

    public final CharSequence getPrimaryText() {
        return this.textViewPrimary.getText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textViewPrimary.setText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return this.textViewSecondary.getText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.textViewSecondary.setText(charSequence);
    }

    public final Caret getCaret() {
        return this.caret;
    }

    public final void setCaret(Caret caret) {
        this.caret = caret;
        if (caret == null) {
            if (this.caretViewStubHolder.isInflated()) {
                ((ImageView) this.caretViewStubHolder.get()).setVisibility(8);
            }
        } else {
            ImageView imageView = (ImageView) this.caretViewStubHolder.get();
            imageView.setImageResource(caret.getResId());
            imageView.setVisibility(0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CartRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cart/CartRowView$Caret;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "UP", "DOWN", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Caret {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Caret[] $VALUES;
        private final int resId;

        /* renamed from: UP */
        public static final Caret f3933UP = new Caret("UP", 0, C20690R.drawable.ic_rds_caret_up_16dp);
        public static final Caret DOWN = new Caret("DOWN", 1, C20690R.drawable.ic_rds_caret_down_16dp);

        private static final /* synthetic */ Caret[] $values() {
            return new Caret[]{f3933UP, DOWN};
        }

        public static EnumEntries<Caret> getEntries() {
            return $ENTRIES;
        }

        private Caret(String str, int i, int i2) {
            this.resId = i2;
        }

        public final int getResId() {
            return this.resId;
        }

        static {
            Caret[] caretArr$values = $values();
            $VALUES = caretArr$values;
            $ENTRIES = EnumEntries2.enumEntries(caretArr$values);
        }

        public static Caret valueOf(String str) {
            return (Caret) Enum.valueOf(Caret.class, str);
        }

        public static Caret[] values() {
            return (Caret[]) $VALUES.clone();
        }
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void bind$default(CartRowView cartRowView, CharSequence charSequence, CharSequence charSequence2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        cartRowView.bind(charSequence, charSequence2);
    }

    public final void bind(CharSequence newPrimaryText, CharSequence newSecondaryText) {
        Intrinsics.checkNotNullParameter(newPrimaryText, "newPrimaryText");
        setPrimaryText(newPrimaryText);
        setSecondaryText(newSecondaryText);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled) {
            super.setEnabled(enabled);
        }
    }

    public final void setContinueOnClick(Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OnClickListeners.onClick(this.continueButton, action);
    }

    public final void setContinueEnabled(boolean isEnabled) {
        this.continueButton.setEnabled(isEnabled);
    }

    /* compiled from: CartRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cart/CartRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cart/CartRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-cart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CartRowView> {
        private final /* synthetic */ Inflater<CartRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CartRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CartRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C9955R.layout.include_cart_row);
        }
    }
}
