package com.robinhood.android.settings.p254ui.drip;

import android.content.Context;
import android.content.res.Resources;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.settings.p254ui.drip.DripSettingsAdapter;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DripSettingsOverallHeader.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\"B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u001c\u0010\u001e\u001a\u00020\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001c\u0018\u00010 R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsOverallHeader;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsAdapter$DripSettingsRowType$DripOverallHeader;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "toggleView", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getToggleView", "()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "toggleView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "descriptionTxt", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getDescriptionTxt", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "descriptionTxt$delegate", "bind", "", "state", "onCheckChanged", "listener", "Lkotlin/Function1;", "", "Companion", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class DripSettingsOverallHeader extends Hammer_DripSettingsOverallHeader implements Bindable<DripSettingsAdapter.DripSettingsRowType.DripOverallHeader> {

    /* renamed from: descriptionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTxt;
    public Navigator navigator;

    /* renamed from: toggleView$delegate, reason: from kotlin metadata */
    private final Interfaces2 toggleView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DripSettingsOverallHeader.class, "toggleView", "getToggleView()Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", 0)), Reflection.property1(new PropertyReference1Impl(DripSettingsOverallHeader.class, "descriptionTxt", "getDescriptionTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    public DripSettingsOverallHeader(final Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultConstructorMarker defaultConstructorMarker = null;
        super(context, attributeSet, defaultConstructorMarker);
        this.toggleView = BindViewDelegate2.bindView$default(this, C28363R.id.header_toggle, null, 2, null);
        this.descriptionTxt = BindViewDelegate2.bindView$default(this, C28363R.id.header_description, null, 2, null);
        int i = 1;
        ViewGroups.inflate(this, C28363R.layout.merge_drip_settings_overall_header, true);
        RhTextView descriptionTxt = getDescriptionTxt();
        String string2 = ViewsKt.getString(descriptionTxt, C28363R.string.drip_settings_toggle_description);
        boolean z = false;
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore((TextView) descriptionTxt, (CharSequence) string2, false, false, num != null ? ViewsKt.getString(descriptionTxt, num.intValue()) : null, (ClickableSpan) new ActionSpan(z, new Function0<Unit>() { // from class: com.robinhood.android.settings.ui.drip.DripSettingsOverallHeader$special$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws Resources.NotFoundException {
                String string3 = this.this$0.getResources().getString(C28363R.string.drip_settings_drip_url);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigators3.showHelpCenterWebViewFragment(this.this$0.getNavigator(), context, string3);
            }
        }, i, defaultConstructorMarker));
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    private final RdsToggleView getToggleView() {
        return (RdsToggleView) this.toggleView.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getDescriptionTxt() {
        return (RhTextView) this.descriptionTxt.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(DripSettingsAdapter.DripSettingsRowType.DripOverallHeader state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        getToggleView().setCheckedProgrammatically(state.getEnabled());
    }

    public final void onCheckChanged(Function1<? super Boolean, Unit> listener) {
        getToggleView().onCheckedChanged(listener);
    }

    /* compiled from: DripSettingsOverallHeader.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/drip/DripSettingsOverallHeader$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/drip/DripSettingsOverallHeader;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-drip-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<DripSettingsOverallHeader> {
        private final /* synthetic */ Inflater<DripSettingsOverallHeader> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public DripSettingsOverallHeader inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (DripSettingsOverallHeader) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28363R.layout.include_drip_settings_overall_header);
        }
    }
}
