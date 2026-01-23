package com.robinhood.android.designsystem.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsButtonBarView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001fJ\u0016\u00102\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001fJ\u0016\u0010;\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001fJ\b\u0010>\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R(\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R$\u00100\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R(\u00103\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0016\"\u0004\b5\u0010\u0018R(\u00106\u001a\u0004\u0018\u00010#2\b\u0010\u0012\u001a\u0004\u0018\u00010#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010&\"\u0004\b8\u0010(R$\u00109\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R$\u0010<\u001a\u00020)2\u0006\u0010\u0012\u001a\u00020)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsButtonBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ruleLine", "Landroid/view/View;", "textView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "disclosureButton", "Landroid/widget/FrameLayout;", "disclosureTextView", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/designsystem/button/RdsButton;", WiresInvalidAccountContentComposable.SecondaryButtonTag, "value", "", "text", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "disclosureText", "getDisclosureText", "setDisclosureText", "onDisclosureClick", "", "action", "Lkotlin/Function0;", "primaryButtonText", "getPrimaryButtonText", "setPrimaryButtonText", "Landroid/graphics/drawable/Drawable;", "primaryButtonIcon", "getPrimaryButtonIcon", "()Landroid/graphics/drawable/Drawable;", "setPrimaryButtonIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "isPrimaryButtonLoading", "()Z", "setPrimaryButtonLoading", "(Z)V", "isPrimaryButtonEnabled", "setPrimaryButtonEnabled", "isSecondaryButtonEnabled", "setSecondaryButtonEnabled", "onPrimaryButtonClick", "secondaryButtonText", "getSecondaryButtonText", "setSecondaryButtonText", "secondaryButtonIcon", "getSecondaryButtonIcon", "setSecondaryButtonIcon", "isSecondaryButtonLoading", "setSecondaryButtonLoading", "onSecondaryButtonClick", "isRuleLineInvisible", "setRuleLineInvisible", "checkTextAndDisclosureText", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsButtonBarView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final FrameLayout disclosureButton;
    private final RhTextView disclosureTextView;
    private final RdsButton primaryButton;
    private final View ruleLine;
    private final RdsButton secondaryButton;
    private final RhTextView textView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsButtonBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, INSTANCE.getDefStyleAttr());
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_button_bar, this);
        View viewFindViewById = findViewById(C13997R.id.button_bar_rule_line);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.ruleLine = viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.button_bar_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.textView = (RhTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.button_bar_disclosure_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.disclosureButton = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.button_bar_disclosure_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.disclosureTextView = (RhTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.button_bar_primary_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.primaryButton = (RdsButton) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.button_bar_secondary_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.secondaryButton = (RdsButton) viewFindViewById6;
        int[] RdsButtonBarView = C13997R.styleable.RdsButtonBarView;
        Intrinsics.checkNotNullExpressionValue(RdsButtonBarView, "RdsButtonBarView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsButtonBarView, 0, 0);
        setText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsButtonBarView_android_text));
        setDisclosureText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsButtonBarView_disclosureText));
        setPrimaryButtonText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsButtonBarView_primaryButtonText));
        setSecondaryButtonText(typedArrayObtainStyledAttributes.getString(C13997R.styleable.RdsButtonBarView_secondaryButtonText));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final CharSequence getText() {
        return this.textView.getText();
    }

    public final void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
        this.textView.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        checkTextAndDisclosureText();
    }

    public final CharSequence getDisclosureText() {
        return this.disclosureTextView.getText();
    }

    public final void setDisclosureText(CharSequence charSequence) {
        this.disclosureTextView.setText(charSequence);
        this.disclosureButton.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
        checkTextAndDisclosureText();
    }

    public final void onDisclosureClick(Function0<Unit> action) {
        OnClickListeners.onClick(this.disclosureButton, action);
    }

    public final CharSequence getPrimaryButtonText() {
        return this.primaryButton.getText();
    }

    public final void setPrimaryButtonText(CharSequence charSequence) {
        this.primaryButton.setText(charSequence);
        this.primaryButton.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }

    public final Drawable getPrimaryButtonIcon() {
        return this.primaryButton.getIcon();
    }

    public final void setPrimaryButtonIcon(Drawable drawable) {
        this.primaryButton.setIcon(drawable);
    }

    public final boolean isPrimaryButtonLoading() {
        return this.primaryButton.getIsLoading();
    }

    public final void setPrimaryButtonLoading(boolean z) {
        this.primaryButton.setLoading(z);
    }

    public final boolean isPrimaryButtonEnabled() {
        return this.primaryButton.isEnabled();
    }

    public final void setPrimaryButtonEnabled(boolean z) {
        this.primaryButton.setEnabled(z);
    }

    public final boolean isSecondaryButtonEnabled() {
        return this.secondaryButton.isEnabled();
    }

    public final void setSecondaryButtonEnabled(boolean z) {
        this.secondaryButton.setEnabled(z);
    }

    public final void onPrimaryButtonClick(Function0<Unit> action) {
        OnClickListeners.onClick(this.primaryButton, action);
    }

    public final CharSequence getSecondaryButtonText() {
        return this.secondaryButton.getText();
    }

    public final void setSecondaryButtonText(CharSequence charSequence) {
        this.secondaryButton.setText(charSequence);
        this.secondaryButton.setVisibility(charSequence == null || charSequence.length() == 0 ? 8 : 0);
    }

    public final Drawable getSecondaryButtonIcon() {
        return this.secondaryButton.getIcon();
    }

    public final void setSecondaryButtonIcon(Drawable drawable) {
        this.secondaryButton.setIcon(drawable);
    }

    public final boolean isSecondaryButtonLoading() {
        return this.secondaryButton.getIsLoading();
    }

    public final void setSecondaryButtonLoading(boolean z) {
        this.secondaryButton.setLoading(z);
    }

    public final void onSecondaryButtonClick(Function0<Unit> action) {
        OnClickListeners.onClick(this.secondaryButton, action);
    }

    public final boolean isRuleLineInvisible() {
        return this.ruleLine.getVisibility() == 4;
    }

    public final void setRuleLineInvisible(boolean z) {
        this.ruleLine.setVisibility(z ? 4 : 0);
    }

    private final void checkTextAndDisclosureText() {
        if (this.textView.getVisibility() == 0 && this.disclosureButton.getVisibility() == 0) {
            throw new IllegalStateException("Cannot have both text and disclosure text.");
        }
    }

    /* compiled from: RdsButtonBarView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/button/RdsButtonBarView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/button/RdsButtonBarView;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "<init>", "()V", "defStyleAttr", "", "getDefStyleAttr", "()I", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsButtonBarView>, DefStyleProvider {
        private final /* synthetic */ Inflater<RdsButtonBarView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsButtonBarView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsButtonBarView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_button_bar);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.buttonBarStyle;
        }
    }
}
