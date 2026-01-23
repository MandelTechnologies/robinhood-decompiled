package com.robinhood.android.serverclientcomponents.actionbutton;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.databinding.MergeClientComponentActionButtonBinding;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.p347db.ActionButton;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ClientComponentButtonView.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 72\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u000267B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0003H\u0016J\u0014\u0010(\u001a\u00020&*\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0014\u0010+\u001a\u00020&*\u00020)2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0010\u0010,\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0012\u0010-\u001a\u00020\u001d2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0014\u00100\u001a\u00020&*\u00020)2\u0006\u00101\u001a\u000202H\u0002J\u0014\u00100\u001a\u00020&*\u00020)2\u0006\u00103\u001a\u000204H\u0003J\u0014\u00105\u001a\u00020&*\u00020)2\u0006\u00103\u001a\u000204H\u0003R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "callbacks", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;)V", "viewBinding", "Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentActionButtonBinding;", "getViewBinding", "()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentActionButtonBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "forCrypto", "", "getForCrypto", "()Z", "setForCrypto", "(Z)V", "value", "isLoading", "setLoading", "bind", "", "state", "setStyle", "Lcom/robinhood/android/designsystem/button/RdsButton;", "button", "setIcon", "onClick", "handleDeeplink", "uri", "Landroid/net/Uri;", "bindStyle", "genericButtonType", "Lcom/robinhood/models/serverdriven/GenericButtonType;", ResourceTypes.STYLE, "Lcom/robinhood/models/serverdriven/db/ActionButton$Style;", "bindStyleForCrypto", "Callbacks", "Companion", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public class ClientComponentButtonView extends Hammer_ClientComponentButtonView implements Bindable<ServerDrivenButton> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientComponentButtonView.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentActionButtonBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Callbacks callbacks;
    private boolean forCrypto;
    private boolean isLoading;
    public Navigator navigator;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;

    /* compiled from: ClientComponentButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onActionClicked(ServerDrivenButton button);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientComponentButtonView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C28308R.layout.merge_client_component_action_button, true);
        this.viewBinding = ViewBinding5.viewBinding(this, ClientComponentButtonView2.INSTANCE);
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

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final MergeClientComponentActionButtonBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeClientComponentActionButtonBinding) value;
    }

    public final boolean getForCrypto() {
        return this.forCrypto;
    }

    public final void setForCrypto(boolean z) {
        this.forCrypto = z;
    }

    /* renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
        getViewBinding().button.setLoading(z);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(final ServerDrivenButton state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RdsButton rdsButton = getViewBinding().button;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientComponentButtonView.bind$lambda$2$lambda$0(state);
            }
        }, 1, null);
        rdsButton.setText(state.getTitle());
        rdsButton.setEnabled(state.getIsEnabled());
        setStyle(rdsButton, state);
        setIcon(rdsButton, state);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ClientComponentButtonView.bind$lambda$2$lambda$1(this.f$0, state);
            }
        });
        rdsButton.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$2$lambda$0(ServerDrivenButton serverDrivenButton) {
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, serverDrivenButton.getLoggingIdentifier(), null, 4, null), null, 47, null);
    }

    private final void bindStyle(final RdsButton rdsButton, final GenericButtonType genericButtonType) {
        OneShotPreDrawListener.add(rdsButton, new Runnable() { // from class: com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView$bindStyle$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, GenericButtonTypes.getStyleAttr(genericButtonType)), false, 2, null);
            }
        });
    }

    @Deprecated
    private final void bindStyle(final RdsButton rdsButton, final ActionButton.Style style) {
        OneShotPreDrawListener.add(rdsButton, new Runnable() { // from class: com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView$bindStyle$$inlined$doOnPreDraw$2
            @Override // java.lang.Runnable
            public final void run() {
                int colorAttr = ActionButtons.getColorAttr(style);
                if (style.isFilled()) {
                    ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryButtonStyle), false, 2, null);
                    ScarletManager2.overrideAttribute(rdsButton, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, colorAttr));
                } else {
                    ScarletManager2.overrideAttribute(rdsButton, R.attr.textColor, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, colorAttr));
                }
            }
        });
    }

    @Deprecated
    private final void bindStyleForCrypto(final RdsButton rdsButton, final ActionButton.Style style) {
        OneShotPreDrawListener.add(rdsButton, new Runnable() { // from class: com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView$bindStyleForCrypto$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                if (style.isFilled()) {
                    ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
                } else {
                    ScarletManager2.overrideStyle$default(rdsButton, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.legacyGhostMonochromeButtonStyle), false, 2, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(ClientComponentButtonView clientComponentButtonView, ServerDrivenButton serverDrivenButton) {
        clientComponentButtonView.onClick(serverDrivenButton);
        return Unit.INSTANCE;
    }

    private final void setStyle(RdsButton rdsButton, ServerDrivenButton serverDrivenButton) {
        if (serverDrivenButton instanceof ServerDrivenButton.LegacyButton) {
            if (this.forCrypto) {
                bindStyleForCrypto(rdsButton, ((ServerDrivenButton.LegacyButton) serverDrivenButton).getActionButtonStyle());
                return;
            } else {
                bindStyle(rdsButton, ((ServerDrivenButton.LegacyButton) serverDrivenButton).getActionButtonStyle());
                return;
            }
        }
        if (!(serverDrivenButton instanceof ServerDrivenButton.Button)) {
            throw new NoWhenBranchMatchedException();
        }
        bindStyle(rdsButton, ((ServerDrivenButton.Button) serverDrivenButton).getGenericButtonType());
    }

    private final void setIcon(RdsButton rdsButton, ServerDrivenButton serverDrivenButton) {
        ServerToBentoAssetMapper2 icon;
        ServerDrivenButton.Button button = serverDrivenButton instanceof ServerDrivenButton.Button ? (ServerDrivenButton.Button) serverDrivenButton : null;
        Integer numValueOf = (button == null || (icon = button.getIcon()) == null) ? null : Integer.valueOf(icon.getResourceId());
        rdsButton.setIcon(numValueOf != null ? com.robinhood.utils.extensions.ViewsKt.getDrawable(rdsButton, numValueOf.intValue()) : null);
    }

    private final void onClick(ServerDrivenButton button) {
        Callbacks callbacks = this.callbacks;
        if (callbacks == null || !callbacks.onActionClicked(button)) {
            GenericAction typedAction = button.getTypedAction();
            if (!(typedAction != null && (typedAction instanceof GenericAction.DeeplinkAction) && handleDeeplink(((GenericAction.DeeplinkAction) typedAction).getUri())) && (button instanceof ServerDrivenButton.LegacyButton)) {
                handleDeeplink(((ServerDrivenButton.LegacyButton) button).getUri());
            }
        }
    }

    private final boolean handleDeeplink(Uri uri) {
        if (uri == null) {
            return false;
        }
        Navigator navigator = getNavigator();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
    }

    /* compiled from: ClientComponentButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ClientComponentButtonView> {
        private final /* synthetic */ Inflater<ClientComponentButtonView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ClientComponentButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ClientComponentButtonView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28308R.layout.include_client_component_action_button);
        }
    }
}
