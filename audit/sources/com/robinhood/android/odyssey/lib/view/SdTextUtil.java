package com.robinhood.android.odyssey.lib.view;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.adjust.sdk.Constants;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextAttribute;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTextStyle;
import com.robinhood.models.serverdriven.api.ApiThemedColor;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdTextUtil.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u001a&\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u001a(\u0010\f\u001a\u00020\u000b*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0012\u0010\u0018\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\r\u001a\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u001c2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\"\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m3636d2 = {"buildSpannableString", "Landroid/text/SpannableString;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData;", "context", "Landroid/content/Context;", "view", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "buildSpannableStringForPopup", "handleDeeplink", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "bindTextComponent", "Lcom/robinhood/android/designsystem/text/RhTextView;", WebsocketGatewayConstants.DATA_KEY, "baseView", "setAlignment", "alignment", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$Alignment;", "attrRes", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$TextAppearance;", "getAttrRes", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextComponentData$TextAppearance;)I", "styleTextView", "textView", "getCharacterStyle", "Landroid/text/style/CharacterStyle;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTextStyle;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.view.SdTextUtilKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdTextUtil {

    /* compiled from: SdTextUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.view.SdTextUtilKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiSdTextComponentData.Alignment.values().length];
            try {
                iArr[ApiSdTextComponentData.Alignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSdTextComponentData.Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSdTextComponentData.Alignment.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiSdTextComponentData.TextAppearance.values().length];
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.DISPLAY_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.DISPLAY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.DISPLAY_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.REGULAR_SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.REGULAR_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.REGULAR_LARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.BOOK_COVER_CAPSULE.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ApiSdTextComponentData.TextAppearance.BOOK_COVER_NIB.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiSdTextStyle.values().length];
            try {
                iArr3[ApiSdTextStyle.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiSdTextStyle.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ApiSdTextStyle.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final SpannableString buildSpannableString(ApiSdTextComponentData apiSdTextComponentData, Context context, final SdBaseView<?, ?, ?> view) {
        final Uri link;
        Intrinsics.checkNotNullParameter(apiSdTextComponentData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        SpannableString spannableString = new SpannableString(apiSdTextComponentData.getText());
        List<ApiSdTextAttribute> attributes = apiSdTextComponentData.getAttributes();
        if (attributes != null) {
            for (final ApiSdTextAttribute apiSdTextAttribute : attributes) {
                CharacterStyle characterStyle = getCharacterStyle(apiSdTextAttribute.getStyle(), context);
                if (characterStyle != null) {
                    spannableString.setSpan(characterStyle, apiSdTextAttribute.getLocation(), apiSdTextAttribute.getLocation() + apiSdTextAttribute.getLength(), 17);
                }
                if (apiSdTextAttribute.getLink() != null) {
                    Uri link2 = apiSdTextAttribute.getLink();
                    Intrinsics.checkNotNull(link2);
                    if (link2.getScheme() == null) {
                        Uri link3 = apiSdTextAttribute.getLink();
                        Intrinsics.checkNotNull(link3);
                        link = link3.buildUpon().scheme(Constants.SCHEME).build();
                    } else {
                        link = apiSdTextAttribute.getLink();
                    }
                    spannableString.setSpan(new ActionSpan(true, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdTextUtilKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdTextUtil.buildSpannableString$lambda$1(link, view);
                        }
                    }), apiSdTextAttribute.getLocation(), apiSdTextAttribute.getLocation() + apiSdTextAttribute.getLength(), 17);
                } else if (apiSdTextAttribute.getOn_click() != null) {
                    spannableString.setSpan(new ActionSpan(true, (Function0<Unit>) new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdTextUtilKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdTextUtil.buildSpannableString$lambda$2(view, apiSdTextAttribute);
                        }
                    }), apiSdTextAttribute.getLocation(), apiSdTextAttribute.getLocation() + apiSdTextAttribute.getLength(), 17);
                }
            }
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSpannableString$lambda$1(Uri uri, SdBaseView sdBaseView) {
        if (uri != null) {
            sdBaseView.requireComponentCallbacks().handleDeepLink(uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSpannableString$lambda$2(SdBaseView sdBaseView, ApiSdTextAttribute apiSdTextAttribute) {
        SdBaseView.Callbacks callbacksRequireComponentCallbacks = sdBaseView.requireComponentCallbacks();
        ApiSdBaseIndividualComponentData data = sdBaseView.getData();
        Intrinsics.checkNotNull(data);
        String id = data.getId();
        ApiSdAction on_click = apiSdTextAttribute.getOn_click();
        Intrinsics.checkNotNull(on_click);
        callbacksRequireComponentCallbacks.onComponentAction(id, on_click);
        return Unit.INSTANCE;
    }

    public static final SpannableString buildSpannableStringForPopup(ApiSdTextComponentData apiSdTextComponentData, Context context, final Function1<? super Uri, Unit> handleDeeplink) {
        final Uri link;
        Intrinsics.checkNotNullParameter(apiSdTextComponentData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handleDeeplink, "handleDeeplink");
        SpannableString spannableString = new SpannableString(apiSdTextComponentData.getText());
        List<ApiSdTextAttribute> attributes = apiSdTextComponentData.getAttributes();
        if (attributes != null) {
            for (ApiSdTextAttribute apiSdTextAttribute : attributes) {
                CharacterStyle characterStyle = getCharacterStyle(apiSdTextAttribute.getStyle(), context);
                if (characterStyle != null) {
                    spannableString.setSpan(characterStyle, apiSdTextAttribute.getLocation(), apiSdTextAttribute.getLocation() + apiSdTextAttribute.getLength(), 17);
                }
                if (apiSdTextAttribute.getLink() != null) {
                    Uri link2 = apiSdTextAttribute.getLink();
                    Intrinsics.checkNotNull(link2);
                    if (link2.getScheme() == null) {
                        Uri link3 = apiSdTextAttribute.getLink();
                        Intrinsics.checkNotNull(link3);
                        link = link3.buildUpon().scheme(Constants.SCHEME).build();
                    } else {
                        link = apiSdTextAttribute.getLink();
                    }
                    spannableString.setSpan(new ActionSpan(false, new Function0() { // from class: com.robinhood.android.odyssey.lib.view.SdTextUtilKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SdTextUtil.buildSpannableStringForPopup$lambda$4(link, handleDeeplink);
                        }
                    }, 1, (DefaultConstructorMarker) null), apiSdTextAttribute.getLocation(), apiSdTextAttribute.getLocation() + apiSdTextAttribute.getLength(), 17);
                }
            }
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildSpannableStringForPopup$lambda$4(Uri uri, Function1 function1) {
        if (uri != null) {
            function1.invoke(uri);
        }
        return Unit.INSTANCE;
    }

    public static final void bindTextComponent(RhTextView rhTextView, ApiSdTextComponentData apiSdTextComponentData, SdBaseView<?, ?, ?> baseView) {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        Intrinsics.checkNotNullParameter(baseView, "baseView");
        if (apiSdTextComponentData == null) {
            return;
        }
        if (apiSdTextComponentData.getText() != null) {
            Context context = rhTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rhTextView.setText(buildSpannableString(apiSdTextComponentData, context, baseView));
        }
        ApiSdTextComponentData.Alignment alignment = apiSdTextComponentData.getAlignment();
        if (alignment != null) {
            setAlignment(rhTextView, alignment);
        }
        ApiSdTextComponentData.TextAppearance style = apiSdTextComponentData.getStyle();
        Integer numValueOf = style != null ? Integer.valueOf(getAttrRes(style)) : null;
        if (numValueOf != null) {
            Context context2 = rhTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TextViewsKt.setTextAppearanceCompat(rhTextView, ContextsUiExtensions.requireThemeAttribute(context2, numValueOf.intValue()));
        }
        styleTextView(apiSdTextComponentData, rhTextView);
        ServerToBentoAssetMapper2 start_icon = apiSdTextComponentData.getStart_icon();
        if (start_icon != null) {
            TextViewsKt.setDrawableStart(rhTextView, ViewsKt.getDrawable(rhTextView, start_icon.getResourceId()));
        }
        ServerToBentoAssetMapper2 end_icon = apiSdTextComponentData.getEnd_icon();
        if (end_icon != null) {
            TextViewsKt.setDrawableEnd(rhTextView, ViewsKt.getDrawable(rhTextView, end_icon.getResourceId()));
        }
    }

    private static final void setAlignment(RhTextView rhTextView, ApiSdTextComponentData.Alignment alignment) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else if (i2 == 2) {
            i = 17;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8388613;
        }
        rhTextView.setGravity(i);
    }

    private static final int getAttrRes(ApiSdTextComponentData.TextAppearance textAppearance) {
        switch (WhenMappings.$EnumSwitchMapping$1[textAppearance.ordinal()]) {
            case 1:
                return C20690R.attr.textAppearanceDisplaySmall;
            case 2:
                return C20690R.attr.textAppearanceDisplayMedium;
            case 3:
                return C20690R.attr.textAppearanceDisplayLarge;
            case 4:
                return C20690R.attr.textAppearanceRegularSmall;
            case 5:
                return C20690R.attr.textAppearanceRegularMedium;
            case 6:
                return C20690R.attr.textAppearanceRegularLarge;
            case 7:
                return C20690R.attr.textAppearanceBookCoverSmall;
            case 8:
                return C20690R.attr.textAppearanceBookCoverSmallNib;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void styleTextView(ApiSdTextComponentData apiSdTextComponentData, RhTextView textView) {
        Intrinsics.checkNotNullParameter(apiSdTextComponentData, "<this>");
        Intrinsics.checkNotNullParameter(textView, "textView");
        ApiThemedColor text_color = apiSdTextComponentData.getText_color();
        if (text_color != null) {
            ViewUtils2.overrideColor(textView, text_color, R.attr.textColor);
            ViewUtils2.overrideColor(textView, text_color, R.attr.drawableTint);
        }
        ApiThemedColor link_color = apiSdTextComponentData.getLink_color();
        if (link_color != null) {
            ViewUtils2.overrideColor(textView, link_color, R.attr.textColorLink);
        }
    }

    private static final CharacterStyle getCharacterStyle(ApiSdTextStyle apiSdTextStyle, Context context) {
        int i = apiSdTextStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$2[apiSdTextStyle.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return new CustomTypefaceSpan(RhTypeface.BOLD.load(context));
        }
        if (i == 2) {
            return new StyleSpan(2);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new UnderlineSpan();
    }
}
