package com.robinhood.android.serverclientcomponents.alert;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.mediaservice.MediaImageLoader;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView;
import com.robinhood.android.serverclientcomponents.databinding.MergeClientComponentAlertViewBinding;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ClientComponentAlertView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u001bR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "mediaImageLoader", "Lcom/robinhood/android/mediaservice/MediaImageLoader;", "getMediaImageLoader", "()Lcom/robinhood/android/mediaservice/MediaImageLoader;", "setMediaImageLoader", "(Lcom/robinhood/android/mediaservice/MediaImageLoader;)V", "binding", "Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentAlertViewBinding;", "getBinding", "()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentAlertViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertView$Callbacks;", "forCrypto", "", "getForCrypto", "()Z", "setForCrypto", "(Z)V", "buttonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "bind", "", "alert", "Lcom/robinhood/models/ui/ServerDrivenAlert;", "Callbacks", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ClientComponentAlertView extends Hammer_ClientComponentAlertView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientComponentAlertView.class, "binding", "getBinding()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentAlertViewBinding;", 0))};

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;
    private Callbacks callbacks;
    private boolean forCrypto;
    public Markwon markwon;
    public MediaImageLoader mediaImageLoader;

    /* compiled from: ClientComponentAlertView.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertView$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ClientComponentButtonView.Callbacks {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientComponentAlertView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.binding = ViewBinding5.viewBinding(this, ClientComponentAlertView2.INSTANCE);
        GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(ClientComponentButtonView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ClientComponentAlertView.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.buttonAdapter = genericListAdapterM2987of;
        ViewGroups.inflate(this, C28308R.layout.merge_client_component_alert_view, true);
        getBinding().buttonRecyclerView.setAdapter(genericListAdapterM2987of);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final MediaImageLoader getMediaImageLoader() {
        MediaImageLoader mediaImageLoader = this.mediaImageLoader;
        if (mediaImageLoader != null) {
            return mediaImageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mediaImageLoader");
        return null;
    }

    public final void setMediaImageLoader(MediaImageLoader mediaImageLoader) {
        Intrinsics.checkNotNullParameter(mediaImageLoader, "<set-?>");
        this.mediaImageLoader = mediaImageLoader;
    }

    private final MergeClientComponentAlertViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeClientComponentAlertViewBinding) value;
    }

    public final boolean getForCrypto() {
        return this.forCrypto;
    }

    public final void setForCrypto(boolean z) {
        this.forCrypto = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(final ClientComponentAlertView clientComponentAlertView, ClientComponentButtonView of, ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(button, "button");
        of.setCallbacks(new ClientComponentAlertFragment.Callbacks() { // from class: com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertView$buttonAdapter$1$buttonCallbacks$1
            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
            public boolean onActionClicked(ServerDrivenButton button2) {
                Intrinsics.checkNotNullParameter(button2, "button");
                ClientComponentAlertView.Callbacks callbacks = this.this$0.callbacks;
                return callbacks != null && callbacks.onActionClicked(button2);
            }
        });
        of.setForCrypto(clientComponentAlertView.forCrypto);
        of.bind(button);
        return Unit.INSTANCE;
    }

    public final void bind(ServerDrivenAlert alert, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        getBinding().alertTitle.setText(alert.getTitle());
        this.buttonAdapter.submitList(alert.getButtons());
        this.callbacks = callbacks;
        if (alert instanceof ServerDrivenAlert.Alert) {
            ImageView alertImage = getBinding().alertImage;
            Intrinsics.checkNotNullExpressionValue(alertImage, "alertImage");
            alertImage.setVisibility(8);
            ServerDrivenAlert.Alert alert2 = (ServerDrivenAlert.Alert) alert;
            getBinding().alertSubtitle.setText(Markwons.toSpanned$default(getMarkwon(), alert2.getSubtitleMarkdownContent(), null, 2, null));
            if (alert2.getPog() == null) {
                RdsPogView alertPog = getBinding().alertPog;
                Intrinsics.checkNotNullExpressionValue(alertPog, "alertPog");
                alertPog.setVisibility(8);
                return;
            } else {
                RdsPogView alertPog2 = getBinding().alertPog;
                Intrinsics.checkNotNullExpressionValue(alertPog2, "alertPog");
                alertPog2.setVisibility(0);
                RdsPogView rdsPogView = getBinding().alertPog;
                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(alert2.getPog());
                rdsPogView.setPictogram(serverToBentoAssetMapper3FromServerValue != null ? ViewsKt.getDrawable(this, serverToBentoAssetMapper3FromServerValue.getResourceId()) : null);
                return;
            }
        }
        if (!(alert instanceof ServerDrivenAlert.LegacyAlert)) {
            throw new NoWhenBranchMatchedException();
        }
        RdsPogView alertPog3 = getBinding().alertPog;
        Intrinsics.checkNotNullExpressionValue(alertPog3, "alertPog");
        alertPog3.setVisibility(8);
        ServerDrivenAlert.LegacyAlert legacyAlert = (ServerDrivenAlert.LegacyAlert) alert;
        getBinding().alertSubtitle.setText(legacyAlert.getSubtitle());
        MediaMetadata image = legacyAlert.getImage();
        if (image == null) {
            ImageView alertImage2 = getBinding().alertImage;
            Intrinsics.checkNotNullExpressionValue(alertImage2, "alertImage");
            alertImage2.setVisibility(8);
            return;
        }
        ImageView alertImage3 = getBinding().alertImage;
        Intrinsics.checkNotNullExpressionValue(alertImage3, "alertImage");
        alertImage3.setVisibility(0);
        ImageLoader.ImageRequest imageRequestLoad = getMediaImageLoader().load(image);
        ImageView alertImage4 = getBinding().alertImage;
        Intrinsics.checkNotNullExpressionValue(alertImage4, "alertImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, alertImage4, null, null, 6, null);
    }
}
