package com.robinhood.shared.iac.extensions;

import android.R;
import android.content.Context;
import androidx.core.content.ContextCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IacInfoBanners.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¨\u0006\u000e"}, m3636d2 = {"bindIacInfoBanner", "", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacInfoBanner;", "callbacks", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "findByLocation", "", "location", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "generateEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "existingEventDescriptor", "lib-iac-info-banner_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.iac.extensions.IacInfoBannersKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class IacInfoBanners {
    public static /* synthetic */ void bindIacInfoBanner$default(RdsInfoBannerView rdsInfoBannerView, IacInfoBanner iacInfoBanner, InfoBannerCallbacks infoBannerCallbacks, int i, Object obj) {
        if ((i & 2) != 0) {
            infoBannerCallbacks = null;
        }
        bindIacInfoBanner(rdsInfoBannerView, iacInfoBanner, infoBannerCallbacks);
    }

    public static final void bindIacInfoBanner(RdsInfoBannerView rdsInfoBannerView, final IacInfoBanner iacInfoBanner, final InfoBannerCallbacks infoBannerCallbacks) {
        Intrinsics.checkNotNullParameter(rdsInfoBannerView, "<this>");
        if (iacInfoBanner == null) {
            rdsInfoBannerView.setVisibility(8);
            return;
        }
        ServerToBentoAssetMapper2 icon = iacInfoBanner.getIcon();
        rdsInfoBannerView.setIcon(icon != null ? ContextCompat.getDrawable(rdsInfoBannerView.getContext(), icon.getResourceId()) : null);
        RichText text = iacInfoBanner.getText();
        Context context = rdsInfoBannerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsInfoBannerView.setText(RichTexts.toSpannableString$default(text, context, null, false, null, 14, null));
        rdsInfoBannerView.setCtaText(iacInfoBanner.getCtaText());
        if (infoBannerCallbacks != null) {
            OnClickListeners.onClick(rdsInfoBannerView, iacInfoBanner.getCtaAction() != null ? new Function0() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IacInfoBanners.bindIacInfoBanner$lambda$1(infoBannerCallbacks, iacInfoBanner);
                }
            } : null);
            if (iacInfoBanner.getCanDismiss()) {
                rdsInfoBannerView.onDismiss(new Function0() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannersKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IacInfoBanners.bindIacInfoBanner$lambda$2(infoBannerCallbacks, iacInfoBanner);
                    }
                });
            }
        }
        ServerToBentoColorMapper serverToBentoColorMapper = ServerToBentoColorMapper.INSTANCE;
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = serverToBentoColorMapper.mapDayNightSelectorServerColor(iacInfoBanner.getStyle().getTextColor().getLight(), iacInfoBanner.getStyle().getTextColor().getDark());
        if (resourceReferences4MapDayNightSelectorServerColor == null) {
            resourceReferences4MapDayNightSelectorServerColor = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorForegroundInfoBanner);
        }
        rdsInfoBannerView.setTextColor(resourceReferences4MapDayNightSelectorServerColor);
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor2 = serverToBentoColorMapper.mapDayNightSelectorServerColor(iacInfoBanner.getStyle().getBackgroundColor().getLight(), iacInfoBanner.getStyle().getBackgroundColor().getDark());
        if (resourceReferences4MapDayNightSelectorServerColor2 == null) {
            resourceReferences4MapDayNightSelectorServerColor2 = new ThemedResourceReference<>(ResourceType.COLOR.INSTANCE, C13997R.attr.colorBackgroundInfoBanner);
        }
        ScarletManager2.overrideAttribute(rdsInfoBannerView, R.attr.backgroundTint, resourceReferences4MapDayNightSelectorServerColor2);
        rdsInfoBannerView.setVisibility(0);
        ViewsKt.setLoggingConfig(rdsInfoBannerView, new AutoLoggingConfig(false, false, 2, null));
        ViewsKt.eventData$default(rdsInfoBannerView, false, new Function0() { // from class: com.robinhood.shared.iac.extensions.IacInfoBannersKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IacInfoBanners.bindIacInfoBanner$lambda$3(iacInfoBanner);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIacInfoBanner$lambda$1(InfoBannerCallbacks infoBannerCallbacks, IacInfoBanner iacInfoBanner) {
        infoBannerCallbacks.onClickInfoBanner(iacInfoBanner);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIacInfoBanner$lambda$2(InfoBannerCallbacks infoBannerCallbacks, IacInfoBanner iacInfoBanner) {
        infoBannerCallbacks.onDismissInfoBanner(iacInfoBanner);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindIacInfoBanner$lambda$3(IacInfoBanner iacInfoBanner) {
        return generateEventDescriptor$default(iacInfoBanner, null, 1, null);
    }

    public static final IacInfoBanner findByLocation(List<IacInfoBanner> list, IacInfoBannerLocation location) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(location, "location");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((IacInfoBanner) next).getLocation() == location) {
                break;
            }
        }
        return (IacInfoBanner) next;
    }

    public static /* synthetic */ UserInteractionEventDescriptor generateEventDescriptor$default(IacInfoBanner iacInfoBanner, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = null;
        }
        return generateEventDescriptor(iacInfoBanner, userInteractionEventDescriptor);
    }

    public static final UserInteractionEventDescriptor generateEventDescriptor(IacInfoBanner iacInfoBanner, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        com.robinhood.rosetta.eventlogging.Context contextCopy$default;
        Intrinsics.checkNotNullParameter(iacInfoBanner, "<this>");
        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor == null ? new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null) : userInteractionEventDescriptor;
        String string2 = iacInfoBanner.getReceiptUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        InAppComm inAppComm = new InAppComm(string2, null, iacInfoBanner.getText().getText(), iacInfoBanner.getLocation().getServerValue(), null, null, null, null, EnumC7081g.f2778x3356acf6, null);
        Component.ComponentType componentType = Component.ComponentType.INFO_BANNER;
        String loggingIdentifier = iacInfoBanner.getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        Component component = new Component(componentType, loggingIdentifier, null, 4, null);
        com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor2.getContext();
        return UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, (context == null || (contextCopy$default = com.robinhood.rosetta.eventlogging.Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, inAppComm, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null)) == null) ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, inAppComm, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33554433, -1, -1, -1, -1, -1, 16383, null) : contextCopy$default, component, null, 39, null);
    }
}
