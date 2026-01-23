package com.robinhood.android.advanced.alert.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.databinding.MergeAddAlertButtonViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AddAlertButtonView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010!\u001a\u00020\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010&\u001a\u00020\u001cR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001c8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AddAlertButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/advanced/alert/databinding/MergeAddAlertButtonViewBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/MergeAddAlertButtonViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "addAlertBtn", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getAddAlertBtn", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "value", "", "addAlertText", "getAddAlertText", "()Ljava/lang/CharSequence;", "setAddAlertText", "(Ljava/lang/CharSequence;)V", "subtitleText", "getSubtitleText", "setSubtitleText", "", "isAddButtonEnabled", "()Z", "setAddButtonEnabled", "(Z)V", "bind", "", "addButtonText", "", "maximumAlertText", "maximumAlertReach", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AddAlertButtonView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AddAlertButtonView.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/MergeAddAlertButtonViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddAlertButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, C8387R.layout.merge_add_alert_button_view, this);
        this.binding = ViewBinding5.viewBinding(this, AddAlertButtonView2.INSTANCE);
    }

    private final MergeAddAlertButtonViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAddAlertButtonViewBinding) value;
    }

    public final RdsButton getAddAlertBtn() {
        RdsButton addAlertBtn = getBinding().addAlertBtn;
        Intrinsics.checkNotNullExpressionValue(addAlertBtn, "addAlertBtn");
        return addAlertBtn;
    }

    public final CharSequence getAddAlertText() {
        return getBinding().addAlertBtn.getText();
    }

    public final void setAddAlertText(CharSequence charSequence) {
        getBinding().addAlertBtn.setText(charSequence);
    }

    public final CharSequence getSubtitleText() {
        return getBinding().addAlertSubtitle.getText();
    }

    public final void setSubtitleText(CharSequence charSequence) {
        getBinding().addAlertSubtitle.setText(charSequence);
    }

    public final boolean isAddButtonEnabled() {
        return getBinding().addAlertBtn.isEnabled();
    }

    public final void setAddButtonEnabled(boolean z) {
        getBinding().addAlertBtn.setEnabled(z);
    }

    public static /* synthetic */ void bind$default(AddAlertButtonView addAlertButtonView, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        addAlertButtonView.bind(str, str2, z);
    }

    public final void bind(String addButtonText, String maximumAlertText, boolean maximumAlertReach) {
        setAddAlertText(addButtonText);
        setSubtitleText(maximumAlertText);
        RhTextView addAlertSubtitle = getBinding().addAlertSubtitle;
        Intrinsics.checkNotNullExpressionValue(addAlertSubtitle, "addAlertSubtitle");
        addAlertSubtitle.setVisibility(maximumAlertReach ? 0 : 8);
        setAddButtonEnabled(!maximumAlertReach);
    }

    /* compiled from: AddAlertButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/view/AddAlertButtonView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/advanced/alert/view/AddAlertButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<AddAlertButtonView> {
        private final /* synthetic */ Inflater<AddAlertButtonView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public AddAlertButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (AddAlertButtonView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8387R.layout.include_add_alert_button_view);
        }
    }
}
