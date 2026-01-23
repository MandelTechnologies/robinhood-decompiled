package com.robinhood.android.designsystem.row;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.UnofficialBentoComponent;
import com.robinhood.android.designsystem.extensions.TypedArrays;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.viewstubholder.ViewStubHolder;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: RdsRowView.kt */
@Metadata(m3635d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\b\u0017\u0018\u0000 ³\u00012\u00020\u0001:\u0006²\u0001³\u0001´\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u008e\u0001\u001a\u00030\u008f\u00012\u0007\u0010\u0090\u0001\u001a\u00020'2\u000b\b\u0002\u0010\u0091\u0001\u001a\u0004\u0018\u00010'2\u000b\b\u0002\u0010\u0092\u0001\u001a\u0004\u0018\u00010'2\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010'2\u000b\b\u0002\u0010\u0094\u0001\u001a\u0004\u0018\u00010'J\u001b\u0010\u0095\u0001\u001a\u00030\u008f\u00012\u0011\u0010\u0096\u0001\u001a\f\u0012\u0005\u0012\u00030\u008f\u0001\u0018\u00010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00030\u008f\u00012\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u009a\u0001J\u0018\u0010\u009b\u0001\u001a\u00030\u008f\u00012\u000e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u0002000\u009d\u0001J\u001a\u0010\u009e\u0001\u001a\u00030\u008f\u00012\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u009a\u0001J\u001a\u0010\u009f\u0001\u001a\u00030\u008f\u00012\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u009a\u0001J\u001a\u0010 \u0001\u001a\u00030\u008f\u00012\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u009a\u0001J\u001a\u0010¡\u0001\u001a\u00030\u008f\u00012\u0010\u0010\u0099\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u009a\u0001J\b\u0010¢\u0001\u001a\u00030\u008f\u0001J\b\u0010£\u0001\u001a\u00030\u008f\u0001J\u0014\u0010¤\u0001\u001a\u00030\u008f\u00012\n\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u0001J\u0011\u0010§\u0001\u001a\u00030\u008f\u00012\u0007\u0010¨\u0001\u001a\u000200J\u0012\u0010©\u0001\u001a\u00030\u008f\u00012\b\u0010ª\u0001\u001a\u00030«\u0001J\u0013\u0010¬\u0001\u001a\u00030\u008f\u00012\t\b\u0001\u0010\u00ad\u0001\u001a\u000200J\u0013\u0010®\u0001\u001a\u00030\u008f\u00012\u0007\u0010¯\u0001\u001a\u00020?H\u0002J\u0013\u0010°\u0001\u001a\u00030\u008f\u00012\u0007\u0010±\u0001\u001a\u00020?H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R$\u00101\u001a\u0002002\u0006\u0010&\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0002002\u0006\u0010&\u001a\u0002008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105R(\u0010:\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010@\u001a\u00020?2\u0006\u0010&\u001a\u00020?8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010C\"\u0004\bD\u0010ER(\u0010F\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010*\"\u0004\bH\u0010,R(\u0010I\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R*\u0010L\u001a\u00020?2\u0006\u0010&\u001a\u00020?8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bM\u0010B\u001a\u0004\bL\u0010C\"\u0004\bN\u0010ER(\u0010O\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010*\"\u0004\bQ\u0010,R(\u0010R\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010<\"\u0004\bT\u0010>R(\u0010V\u001a\u0004\u0018\u00010U2\b\u0010&\u001a\u0004\u0018\u00010U@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010*\"\u0004\b]\u0010,R(\u0010^\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010<\"\u0004\b`\u0010>R(\u0010a\u001a\u0004\u0018\u00010U2\b\u0010&\u001a\u0004\u0018\u00010U@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010X\"\u0004\bc\u0010ZR(\u0010d\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010*\"\u0004\bf\u0010,R(\u0010h\u001a\u0004\u0018\u00010g2\b\u0010&\u001a\u0004\u0018\u00010g@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR.\u0010n\u001a\u0004\u0018\u00010m2\b\u0010&\u001a\u0004\u0018\u00010m8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\bo\u0010B\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR(\u0010t\u001a\u0004\u0018\u0001002\b\u0010&\u001a\u0004\u0018\u0001008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u0001092\b\u0010&\u001a\u0004\u0018\u0001098F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010<\"\u0004\b{\u0010>R(\u0010|\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b}\u0010*\"\u0004\b~\u0010,R*\u0010\u007f\u001a\u0004\u0018\u00010'2\b\u0010&\u001a\u0004\u0018\u00010'8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010*\"\u0005\b\u0081\u0001\u0010,R'\u0010\u0082\u0001\u001a\u00020?2\u0006\u0010&\u001a\u00020?8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010C\"\u0005\b\u0084\u0001\u0010ER'\u0010\u0085\u0001\u001a\u00020?2\u0006\u0010&\u001a\u00020?@FX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010C\"\u0005\b\u0087\u0001\u0010ER/\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00012\t\u0010&\u001a\u0005\u0018\u00010\u0088\u0001@FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006µ\u0001"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "rowContainerLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getRowContainerLayout$lib_design_system_externalDebug", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "rowContentLayout", "getRowContentLayout$lib_design_system_externalDebug", StatisticsSection2.DIVIDER, "Landroid/view/View;", "getDivider$lib_design_system_externalDebug", "()Landroid/view/View;", "textContainerView", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "ctaTextView", "Landroid/widget/TextView;", "metadataContainerViewStubHolder", "Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "Lcom/robinhood/android/designsystem/row/component/RdsRowMetadataContainerView;", "leadingIconViewStubHolder", "Landroid/widget/ImageView;", "trailingIconViewStubHolder", "caretViewStubHolder", "numberPogViewStubHolder", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "pogViewStubHolder", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "", "primaryTextMaxLines", "getPrimaryTextMaxLines", "()I", "setPrimaryTextMaxLines", "(I)V", "secondaryTextMaxLines", "getSecondaryTextMaxLines", "setSecondaryTextMaxLines", "Landroid/graphics/drawable/Drawable;", "primaryTextIcon", "getPrimaryTextIcon", "()Landroid/graphics/drawable/Drawable;", "setPrimaryTextIcon", "(Landroid/graphics/drawable/Drawable;)V", "", "isMainTextEnabled", "isMainTextEnabled$annotations", "()V", "()Z", "setMainTextEnabled", "(Z)V", "metadataPrimaryText", "getMetadataPrimaryText", "setMetadataPrimaryText", "metadataSecondaryText", "getMetadataSecondaryText", "setMetadataSecondaryText", "isMetadataEnabled", "isMetadataEnabled$annotations", "setMetadataEnabled", "ctaText", "getCtaText", "setCtaText", "leadingIconDrawable", "getLeadingIconDrawable", "setLeadingIconDrawable", "Landroid/content/res/ColorStateList;", "leadingIconTint", "getLeadingIconTint", "()Landroid/content/res/ColorStateList;", "setLeadingIconTint", "(Landroid/content/res/ColorStateList;)V", "leadingIconContentDescription", "getLeadingIconContentDescription", "setLeadingIconContentDescription", "trailingIconDrawable", "getTrailingIconDrawable", "setTrailingIconDrawable", "trailingIconTint", "getTrailingIconTint", "setTrailingIconTint", "trailingIconContentDescription", "getTrailingIconContentDescription", "setTrailingIconContentDescription", "Lcom/robinhood/android/designsystem/row/RdsRowView$Caret;", "caret", "getCaret", "()Lcom/robinhood/android/designsystem/row/RdsRowView$Caret;", "setCaret", "(Lcom/robinhood/android/designsystem/row/RdsRowView$Caret;)V", "", "numberPogChar", "getNumberPogChar$annotations", "getNumberPogChar", "()Ljava/lang/Character;", "setNumberPogChar", "(Ljava/lang/Character;)V", "pogNumber", "getPogNumber", "()Ljava/lang/Integer;", "setPogNumber", "(Ljava/lang/Integer;)V", "pogPictogram", "getPogPictogram", "setPogPictogram", "pogText", "getPogText", "setPogText", "infoTagText", "getInfoTagText", "setInfoTagText", "showBottomDivider", "getShowBottomDivider", "setShowBottomDivider", "allowClickWhenDisabledCompat", "getAllowClickWhenDisabledCompat", "setAllowClickWhenDisabledCompat", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "metadataPrimaryEventData", "getMetadataPrimaryEventData", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "setMetadataPrimaryEventData", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;)V", "bind", "", "newPrimaryText", "newSecondaryText", "newMetadataPrimaryText", "newMetadataSecondaryText", "newInfoTagText", "onPrimaryMetadataClick", "listener", "Lkotlin/Function0;", "setPrimaryTextColor", ResourceTypes.COLOR, "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "setPrimaryTextIconTint", "themedResourceReference", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "setSecondaryTextColor", "setSecondaryTextLinkColor", "setPrimaryMetadataTextColor", "setSecondaryMetadataTextColor", "animateMetadataIn", "animateMetadataOut", "setLeadingIconImage", MarkdownText4.TagImageUrl, "Lokhttp3/HttpUrl;", "setLeadingIconMarginTop", "top", "setLeadingIconVerticalBias", "bias", "", "setTrailingIconResource", "iconResourceId", "setTrailingIconStyle", "condensed", "setEnabled", "enabled", "Caret", "Companion", "ValuePropRowInflater", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class RdsRowView extends Hammer_RdsRowView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private boolean allowClickWhenDisabledCompat;
    private Caret caret;
    private final ViewStubHolder<ImageView> caretViewStubHolder;
    private final TextView ctaTextView;
    private final View divider;
    public ImageLoader imageLoader;
    private CharSequence leadingIconContentDescription;
    private ColorStateList leadingIconTint;
    private final ViewStubHolder<ImageView> leadingIconViewStubHolder;
    private final ViewStubHolder<RdsRowMetadataContainerView> metadataContainerViewStubHolder;
    private UserInteractionEventDescriptor metadataPrimaryEventData;
    private final ViewStubHolder<RdsPogView> numberPogViewStubHolder;
    private final ViewStubHolder<RdsPogView> pogViewStubHolder;
    private final ConstraintLayout rowContainerLayout;
    private final ConstraintLayout rowContentLayout;
    private final RdsRowTextContainerView textContainerView;
    private CharSequence trailingIconContentDescription;
    private ColorStateList trailingIconTint;
    private final ViewStubHolder<ImageView> trailingIconViewStubHolder;

    @UnofficialBentoComponent
    public static /* synthetic */ void getNumberPogChar$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void isMainTextEnabled$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void isMetadataEnabled$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RdsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(context, "context");
        Caret caret = null;
        View.inflate(context, C13997R.layout.merge_rds_row, this);
        View viewFindViewById = findViewById(C13997R.id.row_container_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.rowContainerLayout = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(C13997R.id.row_content_layout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.rowContentLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(C13997R.id.row_bottom_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.divider = viewFindViewById3;
        View viewFindViewById4 = findViewById(C13997R.id.row_text_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.textContainerView = (RdsRowTextContainerView) viewFindViewById4;
        View viewFindViewById5 = findViewById(C13997R.id.row_cta_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.ctaTextView = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(C13997R.id.row_metadata_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.metadataContainerViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById6);
        View viewFindViewById7 = findViewById(C13997R.id.row_leading_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.leadingIconViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById7);
        View viewFindViewById8 = findViewById(C13997R.id.row_trailing_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.trailingIconViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById8);
        View viewFindViewById9 = findViewById(C13997R.id.row_caret);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        this.caretViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById9);
        View viewFindViewById10 = findViewById(C13997R.id.row_number_pog);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        this.numberPogViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById10);
        View viewFindViewById11 = findViewById(C13997R.id.row_pog);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        this.pogViewStubHolder = new ViewStubHolder<>((ViewStub) viewFindViewById11);
        int[] RdsRowView = C13997R.styleable.RdsRowView;
        Intrinsics.checkNotNullExpressionValue(RdsRowView, "RdsRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RdsRowView, 0, 0);
        setPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_primaryText));
        setPrimaryTextIcon(typedArrayObtainStyledAttributes.getDrawable(C13997R.styleable.RdsRowView_primaryTextIcon));
        setSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_secondaryText));
        setPrimaryTextMaxLines(typedArrayObtainStyledAttributes.getInteger(C13997R.styleable.RdsRowView_primaryTextMaxLines, getPrimaryTextMaxLines()));
        setSecondaryTextMaxLines(typedArrayObtainStyledAttributes.getInteger(C13997R.styleable.RdsRowView_secondaryTextMaxLines, getSecondaryTextMaxLines()));
        setMetadataPrimaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_metadataPrimaryText));
        setMetadataSecondaryText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_metadataSecondaryText));
        setCtaText(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_ctaText));
        CharSequence text = typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_infoTagText);
        if (text != null) {
            setInfoTagText(text);
        }
        setLeadingIconDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsRowView_leadingIcon));
        setLeadingIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsRowView_leadingIconTint));
        setLeadingIconContentDescription(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_leadingIconContentDescription));
        setTrailingIconDrawable(TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsRowView_trailingIcon));
        setTrailingIconTint(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.RdsRowView_trailingIconTint));
        setTrailingIconContentDescription(typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_trailingIconContentDescription));
        Integer intOrNull = TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsRowView_caret);
        if (intOrNull != null) {
            caret = Caret.values()[intOrNull.intValue()];
        }
        setCaret(caret);
        setPogNumber(TypedArrays3.getIntOrNull(typedArrayObtainStyledAttributes, C13997R.styleable.RdsRowView_pogNumber));
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(C13997R.styleable.RdsRowView_pogText);
        if (text2 != null) {
            setPogText(text2);
        }
        Drawable drawableCompat = TypedArrays.getDrawableCompat(typedArrayObtainStyledAttributes, context, C13997R.styleable.RdsRowView_pogPictogram);
        if (drawableCompat != null) {
            setPogPictogram(drawableCompat);
        }
        setShowBottomDivider(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_showBottomDivider, false));
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_android_enabled, isEnabled()));
        setAllowClickWhenDisabledCompat(typedArrayObtainStyledAttributes.getBoolean(C13997R.styleable.RdsRowView_allowClickWhenDisabled, false));
        typedArrayObtainStyledAttributes.recycle();
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

    /* renamed from: getRowContainerLayout$lib_design_system_externalDebug, reason: from getter */
    public final ConstraintLayout getRowContainerLayout() {
        return this.rowContainerLayout;
    }

    /* renamed from: getRowContentLayout$lib_design_system_externalDebug, reason: from getter */
    public final ConstraintLayout getRowContentLayout() {
        return this.rowContentLayout;
    }

    /* renamed from: getDivider$lib_design_system_externalDebug, reason: from getter */
    public final View getDivider() {
        return this.divider;
    }

    public final CharSequence getPrimaryText() {
        return this.textContainerView.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.textContainerView.setPrimaryText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return this.textContainerView.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.textContainerView.setSecondaryText(charSequence);
    }

    public final int getPrimaryTextMaxLines() {
        return this.textContainerView.getPrimaryTextMaxLines();
    }

    public final void setPrimaryTextMaxLines(int i) {
        this.textContainerView.setPrimaryTextMaxLines(i);
    }

    public final int getSecondaryTextMaxLines() {
        return this.textContainerView.getSecondaryTextMaxLines();
    }

    public final void setSecondaryTextMaxLines(int i) {
        this.textContainerView.setSecondaryTextMaxLines(i);
    }

    public final Drawable getPrimaryTextIcon() {
        return this.textContainerView.getPrimaryTextIcon();
    }

    public final void setPrimaryTextIcon(Drawable drawable) {
        this.textContainerView.setPrimaryTextIcon(drawable);
    }

    public final boolean isMainTextEnabled() {
        return this.textContainerView.isEnabled();
    }

    public final void setMainTextEnabled(boolean z) {
        this.textContainerView.setEnabled(z);
    }

    public final CharSequence getMetadataPrimaryText() {
        if (this.metadataContainerViewStubHolder.isInflated()) {
            return ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).getPrimaryText();
        }
        return null;
    }

    public final void setMetadataPrimaryText(CharSequence charSequence) {
        CharSequence metadataSecondaryText;
        if (charSequence != null || this.metadataContainerViewStubHolder.isInflated()) {
            RdsRowMetadataContainerView rdsRowMetadataContainerView = (RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get();
            rdsRowMetadataContainerView.setPrimaryText(charSequence);
            rdsRowMetadataContainerView.setVisibility((charSequence != null && charSequence.length() != 0) || ((metadataSecondaryText = getMetadataSecondaryText()) != null && metadataSecondaryText.length() != 0) ? 0 : 8);
            rdsRowMetadataContainerView.setEnabled(isEnabled());
            if (getTrailingIconDrawable() != null) {
                setTrailingIconStyle((charSequence == null || charSequence.length() == 0 || getTrailingIconDrawable() == null) ? false : true);
            }
        }
    }

    public final CharSequence getMetadataSecondaryText() {
        if (this.metadataContainerViewStubHolder.isInflated()) {
            return ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).getSecondaryText();
        }
        return null;
    }

    public final void setMetadataSecondaryText(CharSequence charSequence) {
        CharSequence metadataPrimaryText;
        if (charSequence != null || this.metadataContainerViewStubHolder.isInflated()) {
            RdsRowMetadataContainerView rdsRowMetadataContainerView = (RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get();
            rdsRowMetadataContainerView.setSecondaryText(charSequence);
            rdsRowMetadataContainerView.setVisibility((charSequence != null && charSequence.length() != 0) || ((metadataPrimaryText = getMetadataPrimaryText()) != null && metadataPrimaryText.length() != 0) ? 0 : 8);
            rdsRowMetadataContainerView.setEnabled(isEnabled());
        }
    }

    public final boolean isMetadataEnabled() {
        if (this.metadataContainerViewStubHolder.isInflated()) {
            return ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).isEnabled();
        }
        return true;
    }

    public final void setMetadataEnabled(boolean z) {
        if (this.metadataContainerViewStubHolder.isInflated()) {
            ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).setEnabled(z);
        }
    }

    public final CharSequence getCtaText() {
        return this.ctaTextView.getText();
    }

    public final void setCtaText(CharSequence charSequence) {
        this.ctaTextView.setText(charSequence);
        this.ctaTextView.setVisibility(charSequence != null ? 0 : 8);
    }

    public final Drawable getLeadingIconDrawable() {
        if (this.leadingIconViewStubHolder.isInflated()) {
            return ((ImageView) this.leadingIconViewStubHolder.get()).getDrawable();
        }
        return null;
    }

    public final void setLeadingIconDrawable(Drawable drawable) {
        if (drawable != null || this.leadingIconViewStubHolder.isInflated()) {
            ImageView imageView = (ImageView) this.leadingIconViewStubHolder.get();
            imageView.setImageDrawable(drawable);
            imageView.setImageTintList(this.leadingIconTint);
            imageView.setContentDescription(this.leadingIconContentDescription);
            imageView.setVisibility(drawable != null ? 0 : 8);
            imageView.setEnabled(isEnabled());
        }
    }

    public final ColorStateList getLeadingIconTint() {
        return this.leadingIconTint;
    }

    public final void setLeadingIconTint(ColorStateList colorStateList) {
        this.leadingIconTint = colorStateList;
        if (this.leadingIconViewStubHolder.isInflated()) {
            ((ImageView) this.leadingIconViewStubHolder.get()).setImageTintList(colorStateList);
        }
    }

    public final CharSequence getLeadingIconContentDescription() {
        return this.leadingIconContentDescription;
    }

    public final void setLeadingIconContentDescription(CharSequence charSequence) {
        this.leadingIconContentDescription = charSequence;
        if (this.leadingIconViewStubHolder.isInflated()) {
            ((ImageView) this.leadingIconViewStubHolder.get()).setContentDescription(charSequence);
        }
    }

    public final Drawable getTrailingIconDrawable() {
        if (this.trailingIconViewStubHolder.isInflated()) {
            return ((ImageView) this.trailingIconViewStubHolder.get()).getDrawable();
        }
        return null;
    }

    public final void setTrailingIconDrawable(Drawable drawable) {
        CharSequence metadataPrimaryText;
        if (drawable != null || this.trailingIconViewStubHolder.isInflated()) {
            ImageView imageView = (ImageView) this.trailingIconViewStubHolder.get();
            imageView.setImageDrawable(drawable);
            imageView.setImageTintList(this.trailingIconTint);
            imageView.setContentDescription(this.trailingIconContentDescription);
            imageView.setVisibility(drawable != null ? 0 : 8);
            imageView.setEnabled(isEnabled());
            setTrailingIconStyle((drawable == null || (metadataPrimaryText = getMetadataPrimaryText()) == null || metadataPrimaryText.length() == 0) ? false : true);
        }
    }

    public final ColorStateList getTrailingIconTint() {
        return this.trailingIconTint;
    }

    public final void setTrailingIconTint(ColorStateList colorStateList) {
        this.trailingIconTint = colorStateList;
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setImageTintList(colorStateList);
        }
    }

    public final CharSequence getTrailingIconContentDescription() {
        return this.trailingIconContentDescription;
    }

    public final void setTrailingIconContentDescription(CharSequence charSequence) {
        this.trailingIconContentDescription = charSequence;
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setContentDescription(charSequence);
        }
    }

    public final Caret getCaret() {
        return this.caret;
    }

    public final void setCaret(Caret caret) {
        this.caret = caret;
        if (caret == null) {
            if (this.caretViewStubHolder.isInflated()) {
                ((ImageView) this.caretViewStubHolder.get()).setVisibility(8);
            }
        } else {
            ImageView imageView = (ImageView) this.caretViewStubHolder.get();
            imageView.setImageResource(caret.getResId());
            imageView.setVisibility(0);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RdsRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsRowView$Caret;", "", "resId", "", "<init>", "(Ljava/lang/String;II)V", "getResId", "()I", "UP", "DOWN", "RIGHT", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Caret {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Caret[] $VALUES;
        private final int resId;

        /* renamed from: UP */
        public static final Caret f4106UP = new Caret("UP", 0, C20690R.drawable.ic_rds_caret_up_16dp);
        public static final Caret DOWN = new Caret("DOWN", 1, C20690R.drawable.ic_rds_caret_down_16dp);
        public static final Caret RIGHT = new Caret("RIGHT", 2, C20690R.drawable.ic_rds_caret_right_16dp);

        private static final /* synthetic */ Caret[] $values() {
            return new Caret[]{f4106UP, DOWN, RIGHT};
        }

        public static EnumEntries<Caret> getEntries() {
            return $ENTRIES;
        }

        private Caret(String str, int i, int i2) {
            this.resId = i2;
        }

        public final int getResId() {
            return this.resId;
        }

        static {
            Caret[] caretArr$values = $values();
            $VALUES = caretArr$values;
            $ENTRIES = EnumEntries2.enumEntries(caretArr$values);
        }

        public static Caret valueOf(String str) {
            return (Caret) Enum.valueOf(Caret.class, str);
        }

        public static Caret[] values() {
            return (Caret[]) $VALUES.clone();
        }
    }

    public final Character getNumberPogChar() {
        CharSequence text;
        if (!this.numberPogViewStubHolder.isInflated() || (text = ((RdsPogView) this.numberPogViewStubHolder.get()).getText()) == null) {
            return null;
        }
        return StringsKt.singleOrNull(text);
    }

    public final void setNumberPogChar(Character ch) {
        if (ch != null || this.numberPogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.numberPogViewStubHolder.get();
            rdsPogView.setText(ch != null ? ch.toString() : null);
            rdsPogView.setVisibility(ch != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final Integer getPogNumber() {
        if (this.numberPogViewStubHolder.isInflated()) {
            return ((RdsPogView) this.numberPogViewStubHolder.get()).getNumber();
        }
        return null;
    }

    public final void setPogNumber(Integer num) {
        if (num != null || this.numberPogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.numberPogViewStubHolder.get();
            rdsPogView.setNumber(num);
            rdsPogView.setVisibility(num != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final Drawable getPogPictogram() {
        if (this.pogViewStubHolder.isInflated()) {
            return ((RdsPogView) this.pogViewStubHolder.get()).getPictogram();
        }
        return null;
    }

    public final void setPogPictogram(Drawable drawable) {
        if (drawable != null || this.pogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.pogViewStubHolder.get();
            rdsPogView.setPictogram(drawable);
            rdsPogView.setVisibility(drawable != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final CharSequence getPogText() {
        if (this.pogViewStubHolder.isInflated()) {
            return ((RdsPogView) this.pogViewStubHolder.get()).getText();
        }
        return null;
    }

    public final void setPogText(CharSequence charSequence) {
        if (charSequence != null || this.pogViewStubHolder.isInflated()) {
            RdsPogView rdsPogView = (RdsPogView) this.pogViewStubHolder.get();
            rdsPogView.setText(charSequence);
            rdsPogView.setVisibility(charSequence != null ? 0 : 8);
            rdsPogView.setEnabled(isEnabled());
        }
    }

    public final CharSequence getInfoTagText() {
        return this.textContainerView.getInfoTagText();
    }

    public final void setInfoTagText(CharSequence charSequence) {
        this.textContainerView.setInfoTagText(charSequence);
    }

    public final boolean getShowBottomDivider() {
        return this.divider.getVisibility() == 0;
    }

    public final void setShowBottomDivider(boolean z) {
        this.divider.setVisibility(z ? 0 : 8);
    }

    public final boolean getAllowClickWhenDisabledCompat() {
        return this.allowClickWhenDisabledCompat;
    }

    public final void setAllowClickWhenDisabledCompat(boolean z) {
        this.allowClickWhenDisabledCompat = z;
        if (Build.VERSION.SDK_INT >= 31) {
            setAllowClickWhenDisabled(z);
        } else {
            if (isEnabled()) {
                return;
            }
            super.setEnabled(true);
        }
    }

    public final UserInteractionEventDescriptor getMetadataPrimaryEventData() {
        return this.metadataPrimaryEventData;
    }

    public final void setMetadataPrimaryEventData(UserInteractionEventDescriptor userInteractionEventDescriptor) {
        this.metadataPrimaryEventData = userInteractionEventDescriptor;
        if (this.metadataContainerViewStubHolder.isInflated()) {
            ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).setMetadataPrimaryEventData(userInteractionEventDescriptor);
        }
    }

    public static /* synthetic */ void bind$default(RdsRowView rdsRowView, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
        }
        if ((i & 2) != 0) {
            charSequence2 = null;
        }
        if ((i & 4) != 0) {
            charSequence3 = null;
        }
        if ((i & 8) != 0) {
            charSequence4 = null;
        }
        if ((i & 16) != 0) {
            charSequence5 = null;
        }
        rdsRowView.bind(charSequence, charSequence2, charSequence3, charSequence4, charSequence5);
    }

    public final void bind(CharSequence newPrimaryText, CharSequence newSecondaryText, CharSequence newMetadataPrimaryText, CharSequence newMetadataSecondaryText, CharSequence newInfoTagText) {
        Intrinsics.checkNotNullParameter(newPrimaryText, "newPrimaryText");
        setPrimaryText(newPrimaryText);
        setSecondaryText(newSecondaryText);
        setMetadataPrimaryText(newMetadataPrimaryText);
        setMetadataSecondaryText(newMetadataSecondaryText);
        setInfoTagText(newInfoTagText);
    }

    public final void onPrimaryMetadataClick(Function0<Unit> listener) {
        if (this.metadataContainerViewStubHolder.isInflated()) {
            ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).onPrimaryMetadataClick(listener);
        }
    }

    public final void setPrimaryTextColor(ResourceReferences4<? extends ColorStateList> color) {
        this.textContainerView.setPrimaryTextColor$lib_design_system_externalDebug(color);
    }

    public final void setPrimaryTextIconTint(ThemedResourceReference<Integer> themedResourceReference) {
        Intrinsics.checkNotNullParameter(themedResourceReference, "themedResourceReference");
        ScarletManager2.overrideAttribute(this.textContainerView, C13997R.attr.primaryTextIconTint, themedResourceReference);
    }

    public final void setSecondaryTextColor(ResourceReferences4<? extends ColorStateList> color) {
        this.textContainerView.setSecondaryTextColor$lib_design_system_externalDebug(color);
    }

    public final void setSecondaryTextLinkColor(ResourceReferences4<? extends ColorStateList> color) {
        this.textContainerView.setSecondaryTextLinkColor$lib_design_system_externalDebug(color);
    }

    public final void setPrimaryMetadataTextColor(ResourceReferences4<? extends ColorStateList> color) {
        ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).setPrimaryTextColor(color);
    }

    public final void setSecondaryMetadataTextColor(ResourceReferences4<? extends ColorStateList> color) {
        ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).setSecondaryTextColor(color);
    }

    public final void animateMetadataIn() {
        ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).animateMetadataIn();
    }

    public final void animateMetadataOut() {
        ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).animateMetadataOut();
    }

    public final void setLeadingIconImage(HttpUrl imageUrl) {
        ImageView imageView = (ImageView) this.leadingIconViewStubHolder.get();
        if (imageUrl != null) {
            ImageLoader.ImageRequest.DefaultImpls.into$default(getImageLoader().load(imageUrl), imageView, null, null, 6, null);
        } else {
            getImageLoader().cancelRequest(imageView);
            imageView.setImageDrawable(null);
        }
    }

    public final void setLeadingIconMarginTop(int top) {
        if (this.leadingIconViewStubHolder.isInflated()) {
            ViewsKt.setMarginTop((ImageView) this.leadingIconViewStubHolder.get(), top);
        }
    }

    public final void setLeadingIconVerticalBias(float bias) {
        if (this.leadingIconViewStubHolder.isInflated()) {
            ImageView imageView = (ImageView) this.leadingIconViewStubHolder.get();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.verticalBias = bias;
            imageView.setLayoutParams(layoutParams2);
        }
    }

    public final void setTrailingIconResource(int iconResourceId) {
        setTrailingIconDrawable(ViewsKt.getDrawable(this, iconResourceId));
    }

    private final void setTrailingIconStyle(boolean condensed) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.trailingIconViewStubHolder.get()).getLayoutParams();
        if (condensed) {
            i = C13997R.dimen.row_condensed_trailing_icon_size;
        } else {
            i = C13997R.dimen.row_trailing_icon_size;
        }
        int dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, i);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (condensed) {
                i2 = C13997R.dimen.rds_spacing_small;
            } else {
                i2 = C13997R.dimen.rds_spacing_default;
            }
            marginLayoutParams.setMarginStart(ViewsKt.getDimensionPixelSize(this, i2));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled || !this.allowClickWhenDisabledCompat) {
            super.setEnabled(enabled);
        }
        this.textContainerView.setEnabled(enabled);
        this.ctaTextView.setEnabled(enabled);
        if (this.metadataContainerViewStubHolder.isInflated()) {
            ((RdsRowMetadataContainerView) this.metadataContainerViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.leadingIconViewStubHolder.isInflated()) {
            ((ImageView) this.leadingIconViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.trailingIconViewStubHolder.isInflated()) {
            ((ImageView) this.trailingIconViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.numberPogViewStubHolder.isInflated()) {
            ((RdsPogView) this.numberPogViewStubHolder.get()).setEnabled(enabled);
        }
        if (this.pogViewStubHolder.isInflated()) {
            ((RdsPogView) this.pogViewStubHolder.get()).setEnabled(enabled);
        }
    }

    /* compiled from: RdsRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RdsRowView> {
        private final /* synthetic */ Inflater<RdsRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_row_with_divider);
        }
    }

    /* compiled from: RdsRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/designsystem/row/RdsRowView$ValuePropRowInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class ValuePropRowInflater implements Inflater<RdsRowView> {
        public static final ValuePropRowInflater INSTANCE = new ValuePropRowInflater();
        private final /* synthetic */ Inflater<RdsRowView> $$delegate_0 = Inflater.INSTANCE.include(C13997R.layout.include_rds_value_prop_row);

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RdsRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RdsRowView) this.$$delegate_0.inflate(parent);
        }

        private ValuePropRowInflater() {
        }
    }
}
