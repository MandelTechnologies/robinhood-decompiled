package com.robinhood.android.feature.instantinfo.p137ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.feature_instant_info.C16914R;
import com.robinhood.android.feature_instant_info.databinding.MergeInstantInfoCtaViewBinding;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.bonfire.instantinfo.ApiInstantInfoCta;
import com.robinhood.models.api.bonfire.instantinfo.InstantInfoCtaStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: InstantInfoCtaView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/ui/InstantInfoCtaView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/api/bonfire/instantinfo/ApiInstantInfoCta;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBinding", "Lcom/robinhood/android/feature_instant_info/databinding/MergeInstantInfoCtaViewBinding;", "getViewBinding", "()Lcom/robinhood/android/feature_instant_info/databinding/MergeInstantInfoCtaViewBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "setOnCtaClickListener", "listener", "Landroid/view/View$OnClickListener;", "Companion", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstantInfoCtaView extends FrameLayout implements Bindable<ApiInstantInfoCta> {

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InstantInfoCtaView.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/feature_instant_info/databinding/MergeInstantInfoCtaViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstantInfoCtaView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstantInfoCtaStyle.values().length];
            try {
                iArr[InstantInfoCtaStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InstantInfoCtaStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantInfoCtaView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.viewBinding = ViewBinding5.viewBinding(this, InstantInfoCtaView2.INSTANCE);
        ViewGroups.inflate(this, C16914R.layout.merge_instant_info_cta_view, true);
    }

    private final MergeInstantInfoCtaViewBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeInstantInfoCtaViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final ApiInstantInfoCta state) {
        final int i;
        Intrinsics.checkNotNullParameter(state, "state");
        final RdsButton rdsButton = getViewBinding().button;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.feature.instantinfo.ui.InstantInfoCtaView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InstantInfoCtaView.bind$lambda$2$lambda$0(state);
            }
        }, 1, null);
        rdsButton.setText(state.getTitle());
        int i2 = WhenMappings.$EnumSwitchMapping$0[state.getStyle().ordinal()];
        if (i2 == 1) {
            i = C20690R.attr.primaryMonochromeButtonStyle;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C20690R.attr.secondaryMonochromeButtonStyle;
        }
        OneShotPreDrawListener.add(rdsButton, new Runnable() { // from class: com.robinhood.android.feature.instantinfo.ui.InstantInfoCtaView$bind$lambda$2$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                Intrinsics.checkNotNull(rdsButton);
                ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, i), false, 2, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$2$lambda$0(ApiInstantInfoCta apiInstantInfoCta) {
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, apiInstantInfoCta.getLoggingIdentifier(), null, 4, null), null, 47, null);
    }

    public final void setOnCtaClickListener(View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getViewBinding().button.setOnClickListener(listener);
    }

    /* compiled from: InstantInfoCtaView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/instantinfo/ui/InstantInfoCtaView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/feature/instantinfo/ui/InstantInfoCtaView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-instant-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<InstantInfoCtaView> {
        private final /* synthetic */ Inflater<InstantInfoCtaView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public InstantInfoCtaView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (InstantInfoCtaView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C16914R.layout.include_instant_info_cta_view);
        }
    }
}
