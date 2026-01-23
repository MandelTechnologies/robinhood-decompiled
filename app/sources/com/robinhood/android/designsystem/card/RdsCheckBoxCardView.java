package com.robinhood.android.designsystem.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.UnofficialBentoComponent;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RdsCheckBoxCardView.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,H\u0014R\u0014\u0010\f\u001a\u00020\r8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*\u0004\b\u001a\u0010\u001bR/\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f*\u0004\b!\u0010\u001bR(\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010$\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001f¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/designsystem/card/RdsCheckBoxCardView;", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView;", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "accessibilityOptions", "Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "getAccessibilityOptions", "()Lcom/robinhood/android/designsystem/selectioncontrol/AbstractCheckableView$AccessibilityOptions;", "titleTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "descriptionTxt", "goldInfoTag", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "checkBox", "Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsCheckBox;", "<set-?>", "", "titleText", "getTitleText$delegate", "(Lcom/robinhood/android/designsystem/card/RdsCheckBoxCardView;)Ljava/lang/Object;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "descriptionText", "getDescriptionText$delegate", "getDescriptionText", "setDescriptionText", "value", "goldInfoTagText", "getGoldInfoTagText", "setGoldInfoTagText", "onCheckedChange", "", "view", "isChecked", "", "performCheckedChange", "checked", "notify", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@UnofficialBentoComponent
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RdsCheckBoxCardView extends AbstractCheckableView implements AbstractCheckableView.OnCheckedChangeListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final NewRdsCheckBox checkBox;
    private final RhTextView descriptionTxt;
    private final RdsInfoTag goldInfoTag;
    private final RhTextView titleTxt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RdsCheckBoxCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C13997R.layout.merge_rds_check_box_card_view, this);
        View viewFindViewById = findViewById(C13997R.id.title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (RhTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.description_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.descriptionTxt = (RhTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.gold_info_tag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.goldInfoTag = (RdsInfoTag) viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.check_box);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        NewRdsCheckBox newRdsCheckBox = (NewRdsCheckBox) viewFindViewById4;
        this.checkBox = newRdsCheckBox;
        newRdsCheckBox.onCheckedChange(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RdsCheckBoxCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, INSTANCE.getDefStyleAttr());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RdsCheckBoxCardView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView
    protected AbstractCheckableView.AccessibilityOptions getAccessibilityOptions() {
        return new AbstractCheckableView.AccessibilityOptions(ViewsKt.getString(this, C13997R.string.selected), ViewsKt.getString(this, C13997R.string.unselected));
    }

    public final CharSequence getTitleText() {
        return TextViewsKt.getVisibilityText(this.titleTxt);
    }

    public final void setTitleText(CharSequence charSequence) {
        TextViewsKt.setVisibilityText(this.titleTxt, charSequence);
    }

    public final CharSequence getDescriptionText() {
        return TextViewsKt.getVisibilityText(this.descriptionTxt);
    }

    public final void setDescriptionText(CharSequence charSequence) {
        TextViewsKt.setVisibilityText(this.descriptionTxt, charSequence);
    }

    public final CharSequence getGoldInfoTagText() {
        return this.goldInfoTag.getText();
    }

    public final void setGoldInfoTagText(CharSequence charSequence) {
        this.goldInfoTag.setText(charSequence);
        this.goldInfoTag.setVisibility(charSequence != null ? 0 : 8);
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView.OnCheckedChangeListener
    public void onCheckedChange(AbstractCheckableView view, boolean isChecked) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view != this.checkBox) {
            throw new IllegalStateException("Check failed.");
        }
        setChecked(isChecked);
    }

    @Override // com.robinhood.android.designsystem.selectioncontrol.AbstractCheckableView
    protected void performCheckedChange(boolean checked, boolean notify) {
        super.performCheckedChange(checked, notify);
        this.checkBox.setChecked(checked, false);
    }

    /* compiled from: RdsCheckBoxCardView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/card/RdsCheckBoxCardView$Companion;", "Lcom/robinhood/scarlet/view/DefStyleProvider;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/card/RdsCheckBoxCardView;", "<init>", "()V", "defStyleAttr", "", "getDefStyleAttr", "()I", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DefStyleProvider, Inflater<RdsCheckBoxCardView> {
        private final /* synthetic */ Inflater<RdsCheckBoxCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsCheckBoxCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsCheckBoxCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_check_box_card_view);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleRes() {
            return DefStyleProvider.DefaultImpls.getDefStyleRes(this);
        }

        @Override // com.robinhood.scarlet.view.DefStyleProvider
        public int getDefStyleAttr() {
            return C20690R.attr.checkboxCardStyle;
        }
    }
}
