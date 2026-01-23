package com.robinhood.android.psp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.R$attr;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.font.CustomTypefaceSpan;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.psp.databinding.MergeProgramDetailCardViewBinding;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.p320db.bonfire.ProgramDetailSection;
import com.robinhood.models.serverdriven.p347db.ImageSource;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.text.PillSpan;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ProgramDetailCardView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000  2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002\u001f B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailCardView;", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/psp/ProgramDetailCardView$GiftDetailsCard;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "boldTypeface", "Landroid/graphics/Typeface;", "getBoldTypeface", "()Landroid/graphics/Typeface;", "boldTypeface$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/psp/databinding/MergeProgramDetailCardViewBinding;", "getBinding", "()Lcom/robinhood/android/psp/databinding/MergeProgramDetailCardViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "GiftDetailsCard", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProgramDetailCardView extends Hammer_ProgramDetailCardView implements Bindable<GiftDetailsCard> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: boldTypeface$delegate, reason: from kotlin metadata */
    private final Lazy boldTypeface;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProgramDetailCardView.class, "binding", "getBinding()Lcom/robinhood/android/psp/databinding/MergeProgramDetailCardViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramDetailCardView(final Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.boldTypeface = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.psp.ProgramDetailCardView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgramDetailCardView.boldTypeface_delegate$lambda$0(context);
            }
        });
        ViewGroups.inflate(this, C25966R.layout.merge_program_detail_card_view, true);
        this.binding = ViewBinding5.viewBinding(this, ProgramDetailCardView2.INSTANCE);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface boldTypeface_delegate$lambda$0(Context context) {
        return RhTypeface.BOLD.load(context);
    }

    private final Typeface getBoldTypeface() {
        return (Typeface) this.boldTypeface.getValue();
    }

    private final MergeProgramDetailCardViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeProgramDetailCardViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(GiftDetailsCard state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeProgramDetailCardViewBinding binding = getBinding();
        binding.headerLabel.setText(state.getHeaderLabel());
        int color = getContext().getResources().getColor(C20690R.color.mobius_black, getContext().getTheme());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, C20690R.attr.textAppearanceDisplayLarge);
        ProgramDetailSection.TextRange headerValueLargeTextRange = state.getHeaderValueLargeTextRange();
        int location = headerValueLargeTextRange.getLocation();
        int location2 = headerValueLargeTextRange.getLocation() + headerValueLargeTextRange.getLength();
        ProgramDetailSection.TextRange headerValuePillTextRange = state.getHeaderValuePillTextRange();
        int location3 = headerValuePillTextRange.getLocation();
        int length = headerValuePillTextRange.getLength() + headerValuePillTextRange.getLocation();
        RhTextView rhTextView = binding.headerValue;
        SpannableString spannableString = new SpannableString(state.getHeaderValue());
        if (themeAttribute != null) {
            spannableString.setSpan(new TextAppearanceSpan(getContext(), themeAttribute.intValue()), location, location2, 17);
        }
        spannableString.setSpan(new PillSpan(color, null, null, ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_xxsmall), (int) ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_xsmall), (int) ViewsKt.getDimension(this, C13997R.dimen.rds_spacing_default), false, 70, null), location3, length, 17);
        rhTextView.setText(spannableString);
        ImageLoader imageLoader = getImageLoader();
        ImageSource light = state.getHeaderLogo().getLight();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ImageLoader.ImageRequest imageRequestCenterInside = imageLoader.load(light.toImageUrl(context2)).fit().centerInside();
        ImageView headerLogoImg = binding.headerLogoImg;
        Intrinsics.checkNotNullExpressionValue(headerLogoImg, "headerLogoImg");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestCenterInside, headerLogoImg, null, null, 6, null);
        RdsCardView headerLogoCard = binding.headerLogoCard;
        Intrinsics.checkNotNullExpressionValue(headerLogoCard, "headerLogoCard");
        int i = R$attr.cardBackgroundColor;
        ResourceType.COLOR color2 = ResourceType.COLOR.INSTANCE;
        ScarletManager2.overrideAttribute(headerLogoCard, i, new ResourceValue(color2, Integer.valueOf(Color.parseColor(state.getHeaderLogoBackgroundColor()))));
        binding.middleLabelTxt.setText(state.getMiddleLabel());
        binding.middleValueTxt.setText(state.getMiddleValue());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(getBoldTypeface());
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) state.getPrimaryText());
        spannableStringBuilder.setSpan(customTypefaceSpan, length2, spannableStringBuilder.length(), 17);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        CustomTypefaceSpan customTypefaceSpan2 = new CustomTypefaceSpan(getBoldTypeface());
        int length3 = spannableStringBuilder2.length();
        spannableStringBuilder2.append((CharSequence) state.getMetadataPrimaryText());
        spannableStringBuilder2.setSpan(customTypefaceSpan2, length3, spannableStringBuilder2.length(), 17);
        SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
        ThemedResourceReference themedResourceReference = new ThemedResourceReference(color2, android.R.attr.textColorPrimary);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(themedResourceReference);
        int length4 = spannableStringBuilder3.length();
        spannableStringBuilder3.append((CharSequence) state.getSecondaryText());
        spannableStringBuilder3.setSpan(themableColorSpans3, length4, spannableStringBuilder3.length(), 17);
        SpannedString spannedString3 = new SpannedString(spannableStringBuilder3);
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        ThemableColorSpans3 themableColorSpans32 = new ThemableColorSpans3(themedResourceReference);
        int length5 = spannableStringBuilder4.length();
        spannableStringBuilder4.append((CharSequence) state.getMetadataSecondaryText());
        spannableStringBuilder4.setSpan(themableColorSpans32, length5, spannableStringBuilder4.length(), 17);
        RdsRowView.bind$default(binding.footerRow, spannedString, spannedString3, spannedString2, new SpannedString(spannableStringBuilder4), null, 16, null);
    }

    /* compiled from: ProgramDetailCardView.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailCardView$GiftDetailsCard;", "", "headerLabel", "", "headerValue", "headerValueLargeTextRange", "Lcom/robinhood/models/db/bonfire/ProgramDetailSection$TextRange;", "headerValuePillTextRange", "headerLogo", "Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "headerLogoBackgroundColor", "middleLabel", "middleValue", "primaryText", "secondaryText", "metadataPrimaryText", "metadataSecondaryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/db/bonfire/ProgramDetailSection$TextRange;Lcom/robinhood/models/db/bonfire/ProgramDetailSection$TextRange;Lcom/robinhood/models/serverdriven/db/ThemedImageSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeaderLabel", "()Ljava/lang/String;", "getHeaderValue", "getHeaderValueLargeTextRange", "()Lcom/robinhood/models/db/bonfire/ProgramDetailSection$TextRange;", "getHeaderValuePillTextRange", "getHeaderLogo", "()Lcom/robinhood/models/serverdriven/db/ThemedImageSource;", "getHeaderLogoBackgroundColor", "getMiddleLabel", "getMiddleValue", "getPrimaryText", "getSecondaryText", "getMetadataPrimaryText", "getMetadataSecondaryText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GiftDetailsCard {
        public static final int $stable = 8;
        private final String headerLabel;
        private final ThemedImageSource headerLogo;
        private final String headerLogoBackgroundColor;
        private final String headerValue;
        private final ProgramDetailSection.TextRange headerValueLargeTextRange;
        private final ProgramDetailSection.TextRange headerValuePillTextRange;
        private final String metadataPrimaryText;
        private final String metadataSecondaryText;
        private final String middleLabel;
        private final String middleValue;
        private final String primaryText;
        private final String secondaryText;

        public static /* synthetic */ GiftDetailsCard copy$default(GiftDetailsCard giftDetailsCard, String str, String str2, ProgramDetailSection.TextRange textRange, ProgramDetailSection.TextRange textRange2, ThemedImageSource themedImageSource, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            if ((i & 1) != 0) {
                str = giftDetailsCard.headerLabel;
            }
            if ((i & 2) != 0) {
                str2 = giftDetailsCard.headerValue;
            }
            if ((i & 4) != 0) {
                textRange = giftDetailsCard.headerValueLargeTextRange;
            }
            if ((i & 8) != 0) {
                textRange2 = giftDetailsCard.headerValuePillTextRange;
            }
            if ((i & 16) != 0) {
                themedImageSource = giftDetailsCard.headerLogo;
            }
            if ((i & 32) != 0) {
                str3 = giftDetailsCard.headerLogoBackgroundColor;
            }
            if ((i & 64) != 0) {
                str4 = giftDetailsCard.middleLabel;
            }
            if ((i & 128) != 0) {
                str5 = giftDetailsCard.middleValue;
            }
            if ((i & 256) != 0) {
                str6 = giftDetailsCard.primaryText;
            }
            if ((i & 512) != 0) {
                str7 = giftDetailsCard.secondaryText;
            }
            if ((i & 1024) != 0) {
                str8 = giftDetailsCard.metadataPrimaryText;
            }
            if ((i & 2048) != 0) {
                str9 = giftDetailsCard.metadataSecondaryText;
            }
            String str10 = str8;
            String str11 = str9;
            String str12 = str6;
            String str13 = str7;
            String str14 = str4;
            String str15 = str5;
            ThemedImageSource themedImageSource2 = themedImageSource;
            String str16 = str3;
            return giftDetailsCard.copy(str, str2, textRange, textRange2, themedImageSource2, str16, str14, str15, str12, str13, str10, str11);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeaderLabel() {
            return this.headerLabel;
        }

        /* renamed from: component10, reason: from getter */
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component11, reason: from getter */
        public final String getMetadataPrimaryText() {
            return this.metadataPrimaryText;
        }

        /* renamed from: component12, reason: from getter */
        public final String getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHeaderValue() {
            return this.headerValue;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgramDetailSection.TextRange getHeaderValueLargeTextRange() {
            return this.headerValueLargeTextRange;
        }

        /* renamed from: component4, reason: from getter */
        public final ProgramDetailSection.TextRange getHeaderValuePillTextRange() {
            return this.headerValuePillTextRange;
        }

        /* renamed from: component5, reason: from getter */
        public final ThemedImageSource getHeaderLogo() {
            return this.headerLogo;
        }

        /* renamed from: component6, reason: from getter */
        public final String getHeaderLogoBackgroundColor() {
            return this.headerLogoBackgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final String getMiddleLabel() {
            return this.middleLabel;
        }

        /* renamed from: component8, reason: from getter */
        public final String getMiddleValue() {
            return this.middleValue;
        }

        /* renamed from: component9, reason: from getter */
        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final GiftDetailsCard copy(String headerLabel, String headerValue, ProgramDetailSection.TextRange headerValueLargeTextRange, ProgramDetailSection.TextRange headerValuePillTextRange, ThemedImageSource headerLogo, String headerLogoBackgroundColor, String middleLabel, String middleValue, String primaryText, String secondaryText, String metadataPrimaryText, String metadataSecondaryText) {
            Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
            Intrinsics.checkNotNullParameter(headerValue, "headerValue");
            Intrinsics.checkNotNullParameter(headerValueLargeTextRange, "headerValueLargeTextRange");
            Intrinsics.checkNotNullParameter(headerValuePillTextRange, "headerValuePillTextRange");
            Intrinsics.checkNotNullParameter(headerLogo, "headerLogo");
            Intrinsics.checkNotNullParameter(headerLogoBackgroundColor, "headerLogoBackgroundColor");
            Intrinsics.checkNotNullParameter(middleLabel, "middleLabel");
            Intrinsics.checkNotNullParameter(middleValue, "middleValue");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(metadataPrimaryText, "metadataPrimaryText");
            Intrinsics.checkNotNullParameter(metadataSecondaryText, "metadataSecondaryText");
            return new GiftDetailsCard(headerLabel, headerValue, headerValueLargeTextRange, headerValuePillTextRange, headerLogo, headerLogoBackgroundColor, middleLabel, middleValue, primaryText, secondaryText, metadataPrimaryText, metadataSecondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GiftDetailsCard)) {
                return false;
            }
            GiftDetailsCard giftDetailsCard = (GiftDetailsCard) other;
            return Intrinsics.areEqual(this.headerLabel, giftDetailsCard.headerLabel) && Intrinsics.areEqual(this.headerValue, giftDetailsCard.headerValue) && Intrinsics.areEqual(this.headerValueLargeTextRange, giftDetailsCard.headerValueLargeTextRange) && Intrinsics.areEqual(this.headerValuePillTextRange, giftDetailsCard.headerValuePillTextRange) && Intrinsics.areEqual(this.headerLogo, giftDetailsCard.headerLogo) && Intrinsics.areEqual(this.headerLogoBackgroundColor, giftDetailsCard.headerLogoBackgroundColor) && Intrinsics.areEqual(this.middleLabel, giftDetailsCard.middleLabel) && Intrinsics.areEqual(this.middleValue, giftDetailsCard.middleValue) && Intrinsics.areEqual(this.primaryText, giftDetailsCard.primaryText) && Intrinsics.areEqual(this.secondaryText, giftDetailsCard.secondaryText) && Intrinsics.areEqual(this.metadataPrimaryText, giftDetailsCard.metadataPrimaryText) && Intrinsics.areEqual(this.metadataSecondaryText, giftDetailsCard.metadataSecondaryText);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.headerLabel.hashCode() * 31) + this.headerValue.hashCode()) * 31) + this.headerValueLargeTextRange.hashCode()) * 31) + this.headerValuePillTextRange.hashCode()) * 31) + this.headerLogo.hashCode()) * 31) + this.headerLogoBackgroundColor.hashCode()) * 31) + this.middleLabel.hashCode()) * 31) + this.middleValue.hashCode()) * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode()) * 31) + this.metadataPrimaryText.hashCode()) * 31) + this.metadataSecondaryText.hashCode();
        }

        public String toString() {
            return "GiftDetailsCard(headerLabel=" + this.headerLabel + ", headerValue=" + this.headerValue + ", headerValueLargeTextRange=" + this.headerValueLargeTextRange + ", headerValuePillTextRange=" + this.headerValuePillTextRange + ", headerLogo=" + this.headerLogo + ", headerLogoBackgroundColor=" + this.headerLogoBackgroundColor + ", middleLabel=" + this.middleLabel + ", middleValue=" + this.middleValue + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ", metadataPrimaryText=" + this.metadataPrimaryText + ", metadataSecondaryText=" + this.metadataSecondaryText + ")";
        }

        public GiftDetailsCard(String headerLabel, String headerValue, ProgramDetailSection.TextRange headerValueLargeTextRange, ProgramDetailSection.TextRange headerValuePillTextRange, ThemedImageSource headerLogo, String headerLogoBackgroundColor, String middleLabel, String middleValue, String primaryText, String secondaryText, String metadataPrimaryText, String metadataSecondaryText) {
            Intrinsics.checkNotNullParameter(headerLabel, "headerLabel");
            Intrinsics.checkNotNullParameter(headerValue, "headerValue");
            Intrinsics.checkNotNullParameter(headerValueLargeTextRange, "headerValueLargeTextRange");
            Intrinsics.checkNotNullParameter(headerValuePillTextRange, "headerValuePillTextRange");
            Intrinsics.checkNotNullParameter(headerLogo, "headerLogo");
            Intrinsics.checkNotNullParameter(headerLogoBackgroundColor, "headerLogoBackgroundColor");
            Intrinsics.checkNotNullParameter(middleLabel, "middleLabel");
            Intrinsics.checkNotNullParameter(middleValue, "middleValue");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            Intrinsics.checkNotNullParameter(metadataPrimaryText, "metadataPrimaryText");
            Intrinsics.checkNotNullParameter(metadataSecondaryText, "metadataSecondaryText");
            this.headerLabel = headerLabel;
            this.headerValue = headerValue;
            this.headerValueLargeTextRange = headerValueLargeTextRange;
            this.headerValuePillTextRange = headerValuePillTextRange;
            this.headerLogo = headerLogo;
            this.headerLogoBackgroundColor = headerLogoBackgroundColor;
            this.middleLabel = middleLabel;
            this.middleValue = middleValue;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
            this.metadataPrimaryText = metadataPrimaryText;
            this.metadataSecondaryText = metadataSecondaryText;
        }

        public final String getHeaderLabel() {
            return this.headerLabel;
        }

        public final String getHeaderValue() {
            return this.headerValue;
        }

        public final ProgramDetailSection.TextRange getHeaderValueLargeTextRange() {
            return this.headerValueLargeTextRange;
        }

        public final ProgramDetailSection.TextRange getHeaderValuePillTextRange() {
            return this.headerValuePillTextRange;
        }

        public final ThemedImageSource getHeaderLogo() {
            return this.headerLogo;
        }

        public final String getHeaderLogoBackgroundColor() {
            return this.headerLogoBackgroundColor;
        }

        public final String getMiddleLabel() {
            return this.middleLabel;
        }

        public final String getMiddleValue() {
            return this.middleValue;
        }

        public final String getPrimaryText() {
            return this.primaryText;
        }

        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final String getMetadataPrimaryText() {
            return this.metadataPrimaryText;
        }

        public final String getMetadataSecondaryText() {
            return this.metadataSecondaryText;
        }
    }

    /* compiled from: ProgramDetailCardView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailCardView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/psp/ProgramDetailCardView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProgramDetailCardView> {
        private final /* synthetic */ Inflater<ProgramDetailCardView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProgramDetailCardView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProgramDetailCardView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25966R.layout.include_program_details_card_view);
        }
    }
}
