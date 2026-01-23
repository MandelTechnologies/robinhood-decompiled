package microgram.p507ui.sdui;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.sdui.SduiIcon;
import microgram.p507ui.sdui.SduiTextStyle;

/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bY\b\u0087\b\u0018\u0000 \u009b\u00012\u00020\u0001:\u0004\u009c\u0001\u009b\u0001BÙ\u0003\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010 \u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0001\u0010*\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010-\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J(\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207HÁ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010BHÖ\u0003¢\u0006\u0004\bE\u0010FR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010G\u0012\u0004\bJ\u0010K\u001a\u0004\bH\u0010IR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010L\u0012\u0004\bO\u0010K\u001a\u0004\bM\u0010NR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010G\u0012\u0004\bQ\u0010K\u001a\u0004\bP\u0010IR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010R\u0012\u0004\bU\u0010K\u001a\u0004\bS\u0010TR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010V\u0012\u0004\bY\u0010K\u001a\u0004\bW\u0010XR(\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010Z\u0012\u0004\b]\u0010K\u001a\u0004\b[\u0010\\R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010^\u0012\u0004\ba\u0010K\u001a\u0004\b_\u0010`R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010b\u0012\u0004\be\u0010K\u001a\u0004\bc\u0010dR\"\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010f\u0012\u0004\bi\u0010K\u001a\u0004\bg\u0010hR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010^\u0012\u0004\bk\u0010K\u001a\u0004\bj\u0010`R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010G\u0012\u0004\bm\u0010K\u001a\u0004\bl\u0010IR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010V\u001a\u0004\bn\u0010XR(\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010Z\u0012\u0004\bp\u0010K\u001a\u0004\bo\u0010\\R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010^\u0012\u0004\br\u0010K\u001a\u0004\bq\u0010`R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010b\u0012\u0004\bt\u0010K\u001a\u0004\bs\u0010dR\"\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010f\u0012\u0004\bv\u0010K\u001a\u0004\bu\u0010hR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010^\u0012\u0004\bx\u0010K\u001a\u0004\bw\u0010`R\"\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010G\u0012\u0004\bz\u0010K\u001a\u0004\by\u0010IR\u0017\u0010\u001f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010V\u001a\u0004\b{\u0010XR(\u0010 \u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010Z\u0012\u0004\b}\u0010K\u001a\u0004\b|\u0010\\R\"\u0010!\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010^\u0012\u0004\b\u007f\u0010K\u001a\u0004\b~\u0010`R$\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b\"\u0010b\u0012\u0005\b\u0081\u0001\u0010K\u001a\u0005\b\u0080\u0001\u0010dR$\u0010#\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b#\u0010f\u0012\u0005\b\u0083\u0001\u0010K\u001a\u0005\b\u0082\u0001\u0010hR$\u0010$\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b$\u0010^\u0012\u0005\b\u0085\u0001\u0010K\u001a\u0005\b\u0084\u0001\u0010`R$\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b%\u0010G\u0012\u0005\b\u0087\u0001\u0010K\u001a\u0005\b\u0086\u0001\u0010IR$\u0010&\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b&\u0010G\u0012\u0005\b\u0089\u0001\u0010K\u001a\u0005\b\u0088\u0001\u0010IR$\u0010'\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b'\u0010L\u0012\u0005\b\u008b\u0001\u0010K\u001a\u0005\b\u008a\u0001\u0010NR$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b(\u0010G\u0012\u0005\b\u008d\u0001\u0010K\u001a\u0005\b\u008c\u0001\u0010IR\u001a\u0010)\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\r\n\u0004\b)\u0010V\u001a\u0005\b\u008e\u0001\u0010XR*\u0010*\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b*\u0010Z\u0012\u0005\b\u0090\u0001\u0010K\u001a\u0005\b\u008f\u0001\u0010\\R$\u0010+\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b+\u0010^\u0012\u0005\b\u0092\u0001\u0010K\u001a\u0005\b\u0091\u0001\u0010`R$\u0010,\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b,\u0010b\u0012\u0005\b\u0094\u0001\u0010K\u001a\u0005\b\u0093\u0001\u0010dR$\u0010-\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b-\u0010f\u0012\u0005\b\u0096\u0001\u0010K\u001a\u0005\b\u0095\u0001\u0010hR$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b.\u0010^\u0012\u0005\b\u0098\u0001\u0010K\u001a\u0005\b\u0097\u0001\u0010`R$\u0010/\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0014\n\u0004\b/\u0010G\u0012\u0005\b\u009a\u0001\u0010K\u001a\u0005\b\u0099\u0001\u0010I¨\u0006\u009d\u0001"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCryptoDemeterDataRowCondensed;", "Lmicrogram/ui/sdui/SduiComponent;", "", "seen1", "seen2", "", "bottomInset", "leadingAccessory", "leadingAccessorySpacing", "Lmicrogram/ui/sdui/SduiComponentType;", "sduiComponentType", "Lmicrogram/ui/sdui/SduiRenderableText;", "secondaryValue", "Lmicrogram/ui/sdui/SduiAction;", "Lmicrogram/ui/sdui/SduiActionType;", "secondaryValueTapAction", "Lmicrogram/ui/sdui/SduiThemedColor;", "secondaryValueTextColor", "Lmicrogram/ui/sdui/SduiTextStyle;", "secondaryValueTextStyle", "Lmicrogram/ui/sdui/SduiIcon;", "secondaryValueTrailingIcon", "secondaryValueTrailingIconColor", "secondaryValueTrailingIconSpacing", "subtitle", "subtitleTapAction", "subtitleTextColor", "subtitleTextStyle", "subtitleTrailingIcon", "subtitleTrailingIconColor", "subtitleTrailingIconSpacing", "title", "titleTapAction", "titleTextColor", "titleTextStyle", "titleTrailingIcon", "titleTrailingIconColor", "titleTrailingIconSpacing", "topInset", "trailingAccessory", "trailingAccessorySpacing", "value", "valueTapAction", "valueTextColor", "valueTextStyle", "valueTrailingIcon", "valueTrailingIconColor", "valueTrailingIconSpacing", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(IILjava/lang/Double;Lmicrogram/ui/sdui/SduiComponent;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiComponentType;Lmicrogram/ui/sdui/SduiRenderableText;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiRenderableText;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiRenderableText;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/Double;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiComponent;Ljava/lang/Double;Lmicrogram/ui/sdui/SduiRenderableText;Lmicrogram/ui/sdui/SduiAction;Lmicrogram/ui/sdui/SduiThemedColor;Lmicrogram/ui/sdui/SduiTextStyle;Lmicrogram/ui/sdui/SduiIcon;Lmicrogram/ui/sdui/SduiThemedColor;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_ui", "(Lmicrogram/ui/sdui/SduiCryptoDemeterDataRowCondensed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getBottomInset", "()Ljava/lang/Double;", "getBottomInset$annotations", "()V", "Lmicrogram/ui/sdui/SduiComponent;", "getLeadingAccessory", "()Lmicrogram/ui/sdui/SduiComponent;", "getLeadingAccessory$annotations", "getLeadingAccessorySpacing", "getLeadingAccessorySpacing$annotations", "Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType", "()Lmicrogram/ui/sdui/SduiComponentType;", "getSduiComponentType$annotations", "Lmicrogram/ui/sdui/SduiRenderableText;", "getSecondaryValue", "()Lmicrogram/ui/sdui/SduiRenderableText;", "getSecondaryValue$annotations", "Lmicrogram/ui/sdui/SduiAction;", "getSecondaryValueTapAction", "()Lmicrogram/ui/sdui/SduiAction;", "getSecondaryValueTapAction$annotations", "Lmicrogram/ui/sdui/SduiThemedColor;", "getSecondaryValueTextColor", "()Lmicrogram/ui/sdui/SduiThemedColor;", "getSecondaryValueTextColor$annotations", "Lmicrogram/ui/sdui/SduiTextStyle;", "getSecondaryValueTextStyle", "()Lmicrogram/ui/sdui/SduiTextStyle;", "getSecondaryValueTextStyle$annotations", "Lmicrogram/ui/sdui/SduiIcon;", "getSecondaryValueTrailingIcon", "()Lmicrogram/ui/sdui/SduiIcon;", "getSecondaryValueTrailingIcon$annotations", "getSecondaryValueTrailingIconColor", "getSecondaryValueTrailingIconColor$annotations", "getSecondaryValueTrailingIconSpacing", "getSecondaryValueTrailingIconSpacing$annotations", "getSubtitle", "getSubtitleTapAction", "getSubtitleTapAction$annotations", "getSubtitleTextColor", "getSubtitleTextColor$annotations", "getSubtitleTextStyle", "getSubtitleTextStyle$annotations", "getSubtitleTrailingIcon", "getSubtitleTrailingIcon$annotations", "getSubtitleTrailingIconColor", "getSubtitleTrailingIconColor$annotations", "getSubtitleTrailingIconSpacing", "getSubtitleTrailingIconSpacing$annotations", "getTitle", "getTitleTapAction", "getTitleTapAction$annotations", "getTitleTextColor", "getTitleTextColor$annotations", "getTitleTextStyle", "getTitleTextStyle$annotations", "getTitleTrailingIcon", "getTitleTrailingIcon$annotations", "getTitleTrailingIconColor", "getTitleTrailingIconColor$annotations", "getTitleTrailingIconSpacing", "getTitleTrailingIconSpacing$annotations", "getTopInset", "getTopInset$annotations", "getTrailingAccessory", "getTrailingAccessory$annotations", "getTrailingAccessorySpacing", "getTrailingAccessorySpacing$annotations", "getValue", "getValueTapAction", "getValueTapAction$annotations", "getValueTextColor", "getValueTextColor$annotations", "getValueTextStyle", "getValueTextStyle$annotations", "getValueTrailingIcon", "getValueTrailingIcon$annotations", "getValueTrailingIconColor", "getValueTrailingIconColor$annotations", "getValueTrailingIconSpacing", "getValueTrailingIconSpacing$annotations", "Companion", "$serializer", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final /* data */ class SduiCryptoDemeterDataRowCondensed extends SduiComponent {

    @JvmField
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Double bottomInset;
    private final SduiComponent leadingAccessory;
    private final Double leadingAccessorySpacing;
    private final SduiComponentType sduiComponentType;
    private final SduiRenderableText secondaryValue;
    private final SduiAction secondaryValueTapAction;
    private final SduiThemedColor secondaryValueTextColor;
    private final SduiTextStyle secondaryValueTextStyle;
    private final SduiIcon secondaryValueTrailingIcon;
    private final SduiThemedColor secondaryValueTrailingIconColor;
    private final Double secondaryValueTrailingIconSpacing;
    private final SduiRenderableText subtitle;
    private final SduiAction subtitleTapAction;
    private final SduiThemedColor subtitleTextColor;
    private final SduiTextStyle subtitleTextStyle;
    private final SduiIcon subtitleTrailingIcon;
    private final SduiThemedColor subtitleTrailingIconColor;
    private final Double subtitleTrailingIconSpacing;
    private final SduiRenderableText title;
    private final SduiAction titleTapAction;
    private final SduiThemedColor titleTextColor;
    private final SduiTextStyle titleTextStyle;
    private final SduiIcon titleTrailingIcon;
    private final SduiThemedColor titleTrailingIconColor;
    private final Double titleTrailingIconSpacing;
    private final Double topInset;
    private final SduiComponent trailingAccessory;
    private final Double trailingAccessorySpacing;
    private final SduiRenderableText value;
    private final SduiAction valueTapAction;
    private final SduiThemedColor valueTextColor;
    private final SduiTextStyle valueTextStyle;
    private final SduiIcon valueTrailingIcon;
    private final SduiThemedColor valueTrailingIconColor;
    private final Double valueTrailingIconSpacing;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SduiCryptoDemeterDataRowCondensed)) {
            return false;
        }
        SduiCryptoDemeterDataRowCondensed sduiCryptoDemeterDataRowCondensed = (SduiCryptoDemeterDataRowCondensed) other;
        return Intrinsics.areEqual((Object) this.bottomInset, (Object) sduiCryptoDemeterDataRowCondensed.bottomInset) && Intrinsics.areEqual(this.leadingAccessory, sduiCryptoDemeterDataRowCondensed.leadingAccessory) && Intrinsics.areEqual((Object) this.leadingAccessorySpacing, (Object) sduiCryptoDemeterDataRowCondensed.leadingAccessorySpacing) && this.sduiComponentType == sduiCryptoDemeterDataRowCondensed.sduiComponentType && Intrinsics.areEqual(this.secondaryValue, sduiCryptoDemeterDataRowCondensed.secondaryValue) && Intrinsics.areEqual(this.secondaryValueTapAction, sduiCryptoDemeterDataRowCondensed.secondaryValueTapAction) && Intrinsics.areEqual(this.secondaryValueTextColor, sduiCryptoDemeterDataRowCondensed.secondaryValueTextColor) && this.secondaryValueTextStyle == sduiCryptoDemeterDataRowCondensed.secondaryValueTextStyle && this.secondaryValueTrailingIcon == sduiCryptoDemeterDataRowCondensed.secondaryValueTrailingIcon && Intrinsics.areEqual(this.secondaryValueTrailingIconColor, sduiCryptoDemeterDataRowCondensed.secondaryValueTrailingIconColor) && Intrinsics.areEqual((Object) this.secondaryValueTrailingIconSpacing, (Object) sduiCryptoDemeterDataRowCondensed.secondaryValueTrailingIconSpacing) && Intrinsics.areEqual(this.subtitle, sduiCryptoDemeterDataRowCondensed.subtitle) && Intrinsics.areEqual(this.subtitleTapAction, sduiCryptoDemeterDataRowCondensed.subtitleTapAction) && Intrinsics.areEqual(this.subtitleTextColor, sduiCryptoDemeterDataRowCondensed.subtitleTextColor) && this.subtitleTextStyle == sduiCryptoDemeterDataRowCondensed.subtitleTextStyle && this.subtitleTrailingIcon == sduiCryptoDemeterDataRowCondensed.subtitleTrailingIcon && Intrinsics.areEqual(this.subtitleTrailingIconColor, sduiCryptoDemeterDataRowCondensed.subtitleTrailingIconColor) && Intrinsics.areEqual((Object) this.subtitleTrailingIconSpacing, (Object) sduiCryptoDemeterDataRowCondensed.subtitleTrailingIconSpacing) && Intrinsics.areEqual(this.title, sduiCryptoDemeterDataRowCondensed.title) && Intrinsics.areEqual(this.titleTapAction, sduiCryptoDemeterDataRowCondensed.titleTapAction) && Intrinsics.areEqual(this.titleTextColor, sduiCryptoDemeterDataRowCondensed.titleTextColor) && this.titleTextStyle == sduiCryptoDemeterDataRowCondensed.titleTextStyle && this.titleTrailingIcon == sduiCryptoDemeterDataRowCondensed.titleTrailingIcon && Intrinsics.areEqual(this.titleTrailingIconColor, sduiCryptoDemeterDataRowCondensed.titleTrailingIconColor) && Intrinsics.areEqual((Object) this.titleTrailingIconSpacing, (Object) sduiCryptoDemeterDataRowCondensed.titleTrailingIconSpacing) && Intrinsics.areEqual((Object) this.topInset, (Object) sduiCryptoDemeterDataRowCondensed.topInset) && Intrinsics.areEqual(this.trailingAccessory, sduiCryptoDemeterDataRowCondensed.trailingAccessory) && Intrinsics.areEqual((Object) this.trailingAccessorySpacing, (Object) sduiCryptoDemeterDataRowCondensed.trailingAccessorySpacing) && Intrinsics.areEqual(this.value, sduiCryptoDemeterDataRowCondensed.value) && Intrinsics.areEqual(this.valueTapAction, sduiCryptoDemeterDataRowCondensed.valueTapAction) && Intrinsics.areEqual(this.valueTextColor, sduiCryptoDemeterDataRowCondensed.valueTextColor) && this.valueTextStyle == sduiCryptoDemeterDataRowCondensed.valueTextStyle && this.valueTrailingIcon == sduiCryptoDemeterDataRowCondensed.valueTrailingIcon && Intrinsics.areEqual(this.valueTrailingIconColor, sduiCryptoDemeterDataRowCondensed.valueTrailingIconColor) && Intrinsics.areEqual((Object) this.valueTrailingIconSpacing, (Object) sduiCryptoDemeterDataRowCondensed.valueTrailingIconSpacing);
    }

    public int hashCode() {
        Double d = this.bottomInset;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        SduiComponent sduiComponent = this.leadingAccessory;
        int iHashCode2 = (iHashCode + (sduiComponent == null ? 0 : sduiComponent.hashCode())) * 31;
        Double d2 = this.leadingAccessorySpacing;
        int iHashCode3 = (((iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31) + this.sduiComponentType.hashCode()) * 31;
        SduiRenderableText sduiRenderableText = this.secondaryValue;
        int iHashCode4 = (iHashCode3 + (sduiRenderableText == null ? 0 : sduiRenderableText.hashCode())) * 31;
        SduiAction sduiAction = this.secondaryValueTapAction;
        int iHashCode5 = (iHashCode4 + (sduiAction == null ? 0 : sduiAction.hashCode())) * 31;
        SduiThemedColor sduiThemedColor = this.secondaryValueTextColor;
        int iHashCode6 = (iHashCode5 + (sduiThemedColor == null ? 0 : sduiThemedColor.hashCode())) * 31;
        SduiTextStyle sduiTextStyle = this.secondaryValueTextStyle;
        int iHashCode7 = (iHashCode6 + (sduiTextStyle == null ? 0 : sduiTextStyle.hashCode())) * 31;
        SduiIcon sduiIcon = this.secondaryValueTrailingIcon;
        int iHashCode8 = (iHashCode7 + (sduiIcon == null ? 0 : sduiIcon.hashCode())) * 31;
        SduiThemedColor sduiThemedColor2 = this.secondaryValueTrailingIconColor;
        int iHashCode9 = (iHashCode8 + (sduiThemedColor2 == null ? 0 : sduiThemedColor2.hashCode())) * 31;
        Double d3 = this.secondaryValueTrailingIconSpacing;
        int iHashCode10 = (iHashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        SduiRenderableText sduiRenderableText2 = this.subtitle;
        int iHashCode11 = (iHashCode10 + (sduiRenderableText2 == null ? 0 : sduiRenderableText2.hashCode())) * 31;
        SduiAction sduiAction2 = this.subtitleTapAction;
        int iHashCode12 = (iHashCode11 + (sduiAction2 == null ? 0 : sduiAction2.hashCode())) * 31;
        SduiThemedColor sduiThemedColor3 = this.subtitleTextColor;
        int iHashCode13 = (iHashCode12 + (sduiThemedColor3 == null ? 0 : sduiThemedColor3.hashCode())) * 31;
        SduiTextStyle sduiTextStyle2 = this.subtitleTextStyle;
        int iHashCode14 = (iHashCode13 + (sduiTextStyle2 == null ? 0 : sduiTextStyle2.hashCode())) * 31;
        SduiIcon sduiIcon2 = this.subtitleTrailingIcon;
        int iHashCode15 = (iHashCode14 + (sduiIcon2 == null ? 0 : sduiIcon2.hashCode())) * 31;
        SduiThemedColor sduiThemedColor4 = this.subtitleTrailingIconColor;
        int iHashCode16 = (iHashCode15 + (sduiThemedColor4 == null ? 0 : sduiThemedColor4.hashCode())) * 31;
        Double d4 = this.subtitleTrailingIconSpacing;
        int iHashCode17 = (((iHashCode16 + (d4 == null ? 0 : d4.hashCode())) * 31) + this.title.hashCode()) * 31;
        SduiAction sduiAction3 = this.titleTapAction;
        int iHashCode18 = (iHashCode17 + (sduiAction3 == null ? 0 : sduiAction3.hashCode())) * 31;
        SduiThemedColor sduiThemedColor5 = this.titleTextColor;
        int iHashCode19 = (iHashCode18 + (sduiThemedColor5 == null ? 0 : sduiThemedColor5.hashCode())) * 31;
        SduiTextStyle sduiTextStyle3 = this.titleTextStyle;
        int iHashCode20 = (iHashCode19 + (sduiTextStyle3 == null ? 0 : sduiTextStyle3.hashCode())) * 31;
        SduiIcon sduiIcon3 = this.titleTrailingIcon;
        int iHashCode21 = (iHashCode20 + (sduiIcon3 == null ? 0 : sduiIcon3.hashCode())) * 31;
        SduiThemedColor sduiThemedColor6 = this.titleTrailingIconColor;
        int iHashCode22 = (iHashCode21 + (sduiThemedColor6 == null ? 0 : sduiThemedColor6.hashCode())) * 31;
        Double d5 = this.titleTrailingIconSpacing;
        int iHashCode23 = (iHashCode22 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.topInset;
        int iHashCode24 = (iHashCode23 + (d6 == null ? 0 : d6.hashCode())) * 31;
        SduiComponent sduiComponent2 = this.trailingAccessory;
        int iHashCode25 = (iHashCode24 + (sduiComponent2 == null ? 0 : sduiComponent2.hashCode())) * 31;
        Double d7 = this.trailingAccessorySpacing;
        int iHashCode26 = (iHashCode25 + (d7 == null ? 0 : d7.hashCode())) * 31;
        SduiRenderableText sduiRenderableText3 = this.value;
        int iHashCode27 = (iHashCode26 + (sduiRenderableText3 == null ? 0 : sduiRenderableText3.hashCode())) * 31;
        SduiAction sduiAction4 = this.valueTapAction;
        int iHashCode28 = (iHashCode27 + (sduiAction4 == null ? 0 : sduiAction4.hashCode())) * 31;
        SduiThemedColor sduiThemedColor7 = this.valueTextColor;
        int iHashCode29 = (iHashCode28 + (sduiThemedColor7 == null ? 0 : sduiThemedColor7.hashCode())) * 31;
        SduiTextStyle sduiTextStyle4 = this.valueTextStyle;
        int iHashCode30 = (iHashCode29 + (sduiTextStyle4 == null ? 0 : sduiTextStyle4.hashCode())) * 31;
        SduiIcon sduiIcon4 = this.valueTrailingIcon;
        int iHashCode31 = (iHashCode30 + (sduiIcon4 == null ? 0 : sduiIcon4.hashCode())) * 31;
        SduiThemedColor sduiThemedColor8 = this.valueTrailingIconColor;
        int iHashCode32 = (iHashCode31 + (sduiThemedColor8 == null ? 0 : sduiThemedColor8.hashCode())) * 31;
        Double d8 = this.valueTrailingIconSpacing;
        return iHashCode32 + (d8 != null ? d8.hashCode() : 0);
    }

    public String toString() {
        return "SduiCryptoDemeterDataRowCondensed(bottomInset=" + this.bottomInset + ", leadingAccessory=" + this.leadingAccessory + ", leadingAccessorySpacing=" + this.leadingAccessorySpacing + ", sduiComponentType=" + this.sduiComponentType + ", secondaryValue=" + this.secondaryValue + ", secondaryValueTapAction=" + this.secondaryValueTapAction + ", secondaryValueTextColor=" + this.secondaryValueTextColor + ", secondaryValueTextStyle=" + this.secondaryValueTextStyle + ", secondaryValueTrailingIcon=" + this.secondaryValueTrailingIcon + ", secondaryValueTrailingIconColor=" + this.secondaryValueTrailingIconColor + ", secondaryValueTrailingIconSpacing=" + this.secondaryValueTrailingIconSpacing + ", subtitle=" + this.subtitle + ", subtitleTapAction=" + this.subtitleTapAction + ", subtitleTextColor=" + this.subtitleTextColor + ", subtitleTextStyle=" + this.subtitleTextStyle + ", subtitleTrailingIcon=" + this.subtitleTrailingIcon + ", subtitleTrailingIconColor=" + this.subtitleTrailingIconColor + ", subtitleTrailingIconSpacing=" + this.subtitleTrailingIconSpacing + ", title=" + this.title + ", titleTapAction=" + this.titleTapAction + ", titleTextColor=" + this.titleTextColor + ", titleTextStyle=" + this.titleTextStyle + ", titleTrailingIcon=" + this.titleTrailingIcon + ", titleTrailingIconColor=" + this.titleTrailingIconColor + ", titleTrailingIconSpacing=" + this.titleTrailingIconSpacing + ", topInset=" + this.topInset + ", trailingAccessory=" + this.trailingAccessory + ", trailingAccessorySpacing=" + this.trailingAccessorySpacing + ", value=" + this.value + ", valueTapAction=" + this.valueTapAction + ", valueTextColor=" + this.valueTextColor + ", valueTextStyle=" + this.valueTextStyle + ", valueTrailingIcon=" + this.valueTrailingIcon + ", valueTrailingIconColor=" + this.valueTrailingIconColor + ", valueTrailingIconSpacing=" + this.valueTrailingIconSpacing + ")";
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiCryptoDemeterDataRowCondensed$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiCryptoDemeterDataRowCondensed;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SduiCryptoDemeterDataRowCondensed> serializer() {
            return SduiCryptoDemeterDataRowCondensed$$serializer.INSTANCE;
        }
    }

    static {
        KSerializer<SduiComponentType> kSerializerSerializer = SduiComponentType.INSTANCE.serializer();
        SduiTextStyle.Companion companion = SduiTextStyle.INSTANCE;
        KSerializer<SduiTextStyle> kSerializerSerializer2 = companion.serializer();
        SduiIcon.Companion companion2 = SduiIcon.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, kSerializerSerializer, null, null, null, kSerializerSerializer2, companion2.serializer(), null, null, null, null, null, companion.serializer(), companion2.serializer(), null, null, null, null, null, companion.serializer(), companion2.serializer(), null, null, null, null, null, null, null, null, companion.serializer(), companion2.serializer(), null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ SduiCryptoDemeterDataRowCondensed(int i, int i2, @SerialName("bottom_inset") Double d, @SerialName("leading_accessory") SduiComponent sduiComponent, @SerialName("leading_accessory_spacing") Double d2, @SerialName("sdui_component_type") SduiComponentType sduiComponentType, @SerialName("secondary_value") SduiRenderableText sduiRenderableText, @SerialName("secondary_value_tap_action") SduiAction sduiAction, @SerialName("secondary_value_text_color") SduiThemedColor sduiThemedColor, @SerialName("secondary_value_text_style") SduiTextStyle sduiTextStyle, @SerialName("secondary_value_trailing_icon") SduiIcon sduiIcon, @SerialName("secondary_value_trailing_icon_color") SduiThemedColor sduiThemedColor2, @SerialName("secondary_value_trailing_icon_spacing") Double d3, SduiRenderableText sduiRenderableText2, @SerialName("subtitle_tap_action") SduiAction sduiAction2, @SerialName("subtitle_text_color") SduiThemedColor sduiThemedColor3, @SerialName("subtitle_text_style") SduiTextStyle sduiTextStyle2, @SerialName("subtitle_trailing_icon") SduiIcon sduiIcon2, @SerialName("subtitle_trailing_icon_color") SduiThemedColor sduiThemedColor4, @SerialName("subtitle_trailing_icon_spacing") Double d4, SduiRenderableText sduiRenderableText3, @SerialName("title_tap_action") SduiAction sduiAction3, @SerialName("title_text_color") SduiThemedColor sduiThemedColor5, @SerialName("title_text_style") SduiTextStyle sduiTextStyle3, @SerialName("title_trailing_icon") SduiIcon sduiIcon3, @SerialName("title_trailing_icon_color") SduiThemedColor sduiThemedColor6, @SerialName("title_trailing_icon_spacing") Double d5, @SerialName("top_inset") Double d6, @SerialName("trailing_accessory") SduiComponent sduiComponent2, @SerialName("trailing_accessory_spacing") Double d7, SduiRenderableText sduiRenderableText4, @SerialName("value_tap_action") SduiAction sduiAction4, @SerialName("value_text_color") SduiThemedColor sduiThemedColor7, @SerialName("value_text_style") SduiTextStyle sduiTextStyle4, @SerialName("value_trailing_icon") SduiIcon sduiIcon4, @SerialName("value_trailing_icon_color") SduiThemedColor sduiThemedColor8, @SerialName("value_trailing_icon_spacing") Double d8, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (262144 != (i & 262144)) {
            PluginExceptions.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{262144, 0}, SduiCryptoDemeterDataRowCondensed$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.bottomInset = null;
        } else {
            this.bottomInset = d;
        }
        if ((i & 2) == 0) {
            this.leadingAccessory = null;
        } else {
            this.leadingAccessory = sduiComponent;
        }
        if ((i & 4) == 0) {
            this.leadingAccessorySpacing = null;
        } else {
            this.leadingAccessorySpacing = d2;
        }
        if ((i & 8) == 0) {
            this.sduiComponentType = SduiComponentType.CRYPTO_DEMETER_DATA_ROW_CONDENSED;
        } else {
            this.sduiComponentType = sduiComponentType;
        }
        if ((i & 16) == 0) {
            this.secondaryValue = null;
        } else {
            this.secondaryValue = sduiRenderableText;
        }
        if ((i & 32) == 0) {
            this.secondaryValueTapAction = null;
        } else {
            this.secondaryValueTapAction = sduiAction;
        }
        if ((i & 64) == 0) {
            this.secondaryValueTextColor = null;
        } else {
            this.secondaryValueTextColor = sduiThemedColor;
        }
        if ((i & 128) == 0) {
            this.secondaryValueTextStyle = null;
        } else {
            this.secondaryValueTextStyle = sduiTextStyle;
        }
        if ((i & 256) == 0) {
            this.secondaryValueTrailingIcon = null;
        } else {
            this.secondaryValueTrailingIcon = sduiIcon;
        }
        if ((i & 512) == 0) {
            this.secondaryValueTrailingIconColor = null;
        } else {
            this.secondaryValueTrailingIconColor = sduiThemedColor2;
        }
        if ((i & 1024) == 0) {
            this.secondaryValueTrailingIconSpacing = null;
        } else {
            this.secondaryValueTrailingIconSpacing = d3;
        }
        if ((i & 2048) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = sduiRenderableText2;
        }
        if ((i & 4096) == 0) {
            this.subtitleTapAction = null;
        } else {
            this.subtitleTapAction = sduiAction2;
        }
        if ((i & 8192) == 0) {
            this.subtitleTextColor = null;
        } else {
            this.subtitleTextColor = sduiThemedColor3;
        }
        if ((i & 16384) == 0) {
            this.subtitleTextStyle = null;
        } else {
            this.subtitleTextStyle = sduiTextStyle2;
        }
        if ((32768 & i) == 0) {
            this.subtitleTrailingIcon = null;
        } else {
            this.subtitleTrailingIcon = sduiIcon2;
        }
        if ((65536 & i) == 0) {
            this.subtitleTrailingIconColor = null;
        } else {
            this.subtitleTrailingIconColor = sduiThemedColor4;
        }
        if ((131072 & i) == 0) {
            this.subtitleTrailingIconSpacing = null;
        } else {
            this.subtitleTrailingIconSpacing = d4;
        }
        this.title = sduiRenderableText3;
        if ((524288 & i) == 0) {
            this.titleTapAction = null;
        } else {
            this.titleTapAction = sduiAction3;
        }
        if ((1048576 & i) == 0) {
            this.titleTextColor = null;
        } else {
            this.titleTextColor = sduiThemedColor5;
        }
        if ((2097152 & i) == 0) {
            this.titleTextStyle = null;
        } else {
            this.titleTextStyle = sduiTextStyle3;
        }
        if ((4194304 & i) == 0) {
            this.titleTrailingIcon = null;
        } else {
            this.titleTrailingIcon = sduiIcon3;
        }
        if ((8388608 & i) == 0) {
            this.titleTrailingIconColor = null;
        } else {
            this.titleTrailingIconColor = sduiThemedColor6;
        }
        if ((16777216 & i) == 0) {
            this.titleTrailingIconSpacing = null;
        } else {
            this.titleTrailingIconSpacing = d5;
        }
        if ((33554432 & i) == 0) {
            this.topInset = null;
        } else {
            this.topInset = d6;
        }
        if ((67108864 & i) == 0) {
            this.trailingAccessory = null;
        } else {
            this.trailingAccessory = sduiComponent2;
        }
        if ((134217728 & i) == 0) {
            this.trailingAccessorySpacing = null;
        } else {
            this.trailingAccessorySpacing = d7;
        }
        if ((268435456 & i) == 0) {
            this.value = null;
        } else {
            this.value = sduiRenderableText4;
        }
        if ((536870912 & i) == 0) {
            this.valueTapAction = null;
        } else {
            this.valueTapAction = sduiAction4;
        }
        if ((1073741824 & i) == 0) {
            this.valueTextColor = null;
        } else {
            this.valueTextColor = sduiThemedColor7;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.valueTextStyle = null;
        } else {
            this.valueTextStyle = sduiTextStyle4;
        }
        if ((i2 & 1) == 0) {
            this.valueTrailingIcon = null;
        } else {
            this.valueTrailingIcon = sduiIcon4;
        }
        if ((i2 & 2) == 0) {
            this.valueTrailingIconColor = null;
        } else {
            this.valueTrailingIconColor = sduiThemedColor8;
        }
        if ((i2 & 4) == 0) {
            this.valueTrailingIconSpacing = null;
        } else {
            this.valueTrailingIconSpacing = d8;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$microgram_ui(SduiCryptoDemeterDataRowCondensed self, Encoding3 output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.bottomInset != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DoubleSerializer.INSTANCE, self.bottomInset);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.leadingAccessory != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SduiComponentSerializer.INSTANCE, self.leadingAccessory);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.leadingAccessorySpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, DoubleSerializer.INSTANCE, self.leadingAccessorySpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.sduiComponentType != SduiComponentType.CRYPTO_DEMETER_DATA_ROW_CONDENSED) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.sduiComponentType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.secondaryValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SduiRenderableTextSerializer.INSTANCE, self.secondaryValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.secondaryValueTapAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SduiAction2.INSTANCE, self.secondaryValueTapAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.secondaryValueTextColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, SduiThemedColor$$serializer.INSTANCE, self.secondaryValueTextColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.secondaryValueTextStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, kSerializerArr[7], self.secondaryValueTextStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.secondaryValueTrailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, kSerializerArr[8], self.secondaryValueTrailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.secondaryValueTrailingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, SduiThemedColor$$serializer.INSTANCE, self.secondaryValueTrailingIconColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.secondaryValueTrailingIconSpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, DoubleSerializer.INSTANCE, self.secondaryValueTrailingIconSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, SduiRenderableTextSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.subtitleTapAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, SduiAction2.INSTANCE, self.subtitleTapAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.subtitleTextColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, SduiThemedColor$$serializer.INSTANCE, self.subtitleTextColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.subtitleTextStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, kSerializerArr[14], self.subtitleTextStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.subtitleTrailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, kSerializerArr[15], self.subtitleTrailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || self.subtitleTrailingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 16, SduiThemedColor$$serializer.INSTANCE, self.subtitleTrailingIconColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17) || self.subtitleTrailingIconSpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 17, DoubleSerializer.INSTANCE, self.subtitleTrailingIconSpacing);
        }
        SduiRenderableTextSerializer sduiRenderableTextSerializer = SduiRenderableTextSerializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 18, sduiRenderableTextSerializer, self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 19) || self.titleTapAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 19, SduiAction2.INSTANCE, self.titleTapAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 20) || self.titleTextColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 20, SduiThemedColor$$serializer.INSTANCE, self.titleTextColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 21) || self.titleTextStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 21, kSerializerArr[21], self.titleTextStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 22) || self.titleTrailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 22, kSerializerArr[22], self.titleTrailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.titleTrailingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, SduiThemedColor$$serializer.INSTANCE, self.titleTrailingIconColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.titleTrailingIconSpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 24, DoubleSerializer.INSTANCE, self.titleTrailingIconSpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.topInset != null) {
            output.encodeNullableSerializableElement(serialDesc, 25, DoubleSerializer.INSTANCE, self.topInset);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || self.trailingAccessory != null) {
            output.encodeNullableSerializableElement(serialDesc, 26, SduiComponentSerializer.INSTANCE, self.trailingAccessory);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || self.trailingAccessorySpacing != null) {
            output.encodeNullableSerializableElement(serialDesc, 27, DoubleSerializer.INSTANCE, self.trailingAccessorySpacing);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 28) || self.value != null) {
            output.encodeNullableSerializableElement(serialDesc, 28, sduiRenderableTextSerializer, self.value);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 29) || self.valueTapAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 29, SduiAction2.INSTANCE, self.valueTapAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 30) || self.valueTextColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 30, SduiThemedColor$$serializer.INSTANCE, self.valueTextColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 31) || self.valueTextStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 31, kSerializerArr[31], self.valueTextStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 32) || self.valueTrailingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 32, kSerializerArr[32], self.valueTrailingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 33) || self.valueTrailingIconColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 33, SduiThemedColor$$serializer.INSTANCE, self.valueTrailingIconColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 34) && self.valueTrailingIconSpacing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 34, DoubleSerializer.INSTANCE, self.valueTrailingIconSpacing);
    }
}
