package com.robinhood.android.serverclientcomponents.extensions;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.serverdriven.p347db.BannerComponent;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsInfoBannerViews.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ap\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b2#\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, m3636d2 = {"bind", "", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/serverdriven/db/BannerComponent;", "onClick", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "Lkotlin/ParameterName;", "name", "action", "", "onDismiss", "Lcom/robinhood/models/serverdriven/db/GenericAction$DismissAction;", "userInteractionEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.extensions.RdsInfoBannerViewsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RdsInfoBannerViews {
    public static /* synthetic */ void bind$default(RdsInfoBannerView rdsInfoBannerView, Navigator navigator, BannerComponent bannerComponent, Function1 function1, Function1 function12, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
        if ((i & 16) != 0) {
            userInteractionEventDescriptor = null;
        }
        bind(rdsInfoBannerView, navigator, bannerComponent, function1, function12, userInteractionEventDescriptor);
    }

    public static final void bind(final RdsInfoBannerView rdsInfoBannerView, final Navigator navigator, final BannerComponent banner, final Function1<? super GenericAction.DeeplinkAction, Boolean> function1, final Function1<? super GenericAction.DismissAction, Unit> function12, final UserInteractionEventDescriptor userInteractionEventDescriptor) {
        Intrinsics.checkNotNullParameter(rdsInfoBannerView, "<this>");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getIcon() != null) {
            Context context = rdsInfoBannerView.getContext();
            ServerToBentoAssetMapper2 icon = banner.getIcon();
            Intrinsics.checkNotNull(icon);
            rdsInfoBannerView.setIcon(ContextCompat.getDrawable(context, icon.getResourceId()));
        }
        RichText title = banner.getTitle();
        Context context2 = rdsInfoBannerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rdsInfoBannerView.setText(RichTexts.toSpannableString$default(title, context2, null, false, null, 14, null));
        GenericAction action = banner.getAction();
        if (action != null) {
            if (action instanceof GenericAction.DeeplinkAction) {
                rdsInfoBannerView.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.serverclientcomponents.extensions.RdsInfoBannerViewsKt.bind.1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Function1<GenericAction.DeeplinkAction, Boolean> function13 = function1;
                        if (function13 != null) {
                            GenericAction action2 = banner.getAction();
                            Intrinsics.checkNotNull(action2, "null cannot be cast to non-null type com.robinhood.models.serverdriven.db.GenericAction.DeeplinkAction");
                            if (function13.invoke((GenericAction.DeeplinkAction) action2).booleanValue()) {
                                return;
                            }
                        }
                        GenericAction action3 = banner.getAction();
                        Intrinsics.checkNotNull(action3, "null cannot be cast to non-null type com.robinhood.models.serverdriven.db.GenericAction.DeeplinkAction");
                        Uri uri = ((GenericAction.DeeplinkAction) action3).getUri();
                        Navigator navigator2 = navigator;
                        Context context3 = rdsInfoBannerView.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator2, context3, uri, null, null, false, null, 60, null);
                    }
                });
            } else if (action instanceof GenericAction.DismissAction) {
                rdsInfoBannerView.onDismiss(new Function0() { // from class: com.robinhood.android.serverclientcomponents.extensions.RdsInfoBannerViewsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RdsInfoBannerViews.bind$lambda$0(function12, banner);
                    }
                });
            }
        }
        ViewsKt.eventData$default(rdsInfoBannerView, false, new Function0() { // from class: com.robinhood.android.serverclientcomponents.extensions.RdsInfoBannerViewsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RdsInfoBannerViews.bind$lambda$1(userInteractionEventDescriptor);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(Function1 function1, BannerComponent bannerComponent) {
        if (function1 != null) {
            GenericAction action = bannerComponent.getAction();
            Intrinsics.checkNotNull(action, "null cannot be cast to non-null type com.robinhood.models.serverdriven.db.GenericAction.DismissAction");
            function1.invoke((GenericAction.DismissAction) action);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bind$lambda$1(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        return userInteractionEventDescriptor == null ? new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_BANNER, null, null, 6, null), null, 47, null) : userInteractionEventDescriptor;
    }
}
