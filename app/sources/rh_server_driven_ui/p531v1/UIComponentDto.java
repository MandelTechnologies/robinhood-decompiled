package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Spacer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.ActivityFeedRowDto;
import rh_server_driven_ui.p531v1.AnimatedAppearanceDto;
import rh_server_driven_ui.p531v1.AnimatedRevealTextDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.CardDto;
import rh_server_driven_ui.p531v1.ChartGroupDto;
import rh_server_driven_ui.p531v1.CheckboxDto;
import rh_server_driven_ui.p531v1.CircularProgressDto;
import rh_server_driven_ui.p531v1.DataRowCondensedDto;
import rh_server_driven_ui.p531v1.DataRowStackedDto;
import rh_server_driven_ui.p531v1.DecoratorDto;
import rh_server_driven_ui.p531v1.FlagIconDto;
import rh_server_driven_ui.p531v1.HStackDto;
import rh_server_driven_ui.p531v1.IconButtonDto;
import rh_server_driven_ui.p531v1.ImageDto;
import rh_server_driven_ui.p531v1.InfoBannerDto;
import rh_server_driven_ui.p531v1.InfoTagDto;
import rh_server_driven_ui.p531v1.ListDto;
import rh_server_driven_ui.p531v1.LottieDto;
import rh_server_driven_ui.p531v1.MarginTieredInterestRatesDto;
import rh_server_driven_ui.p531v1.NavigationRowDto;
import rh_server_driven_ui.p531v1.NumberPogDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;
import rh_server_driven_ui.p531v1.RadioButtonDto;
import rh_server_driven_ui.p531v1.ShimmerLoaderDto;
import rh_server_driven_ui.p531v1.SpacerDto;
import rh_server_driven_ui.p531v1.SwitchDto;
import rh_server_driven_ui.p531v1.TableColumnHeaderDto;
import rh_server_driven_ui.p531v1.TableInstrumentNameDto;
import rh_server_driven_ui.p531v1.TextButtonDto;
import rh_server_driven_ui.p531v1.TextDto;
import rh_server_driven_ui.p531v1.TextInputDto;
import rh_server_driven_ui.p531v1.TextPogDto;
import rh_server_driven_ui.p531v1.ThemedComponentDto;
import rh_server_driven_ui.p531v1.TickerTextDto;
import rh_server_driven_ui.p531v1.TimelineDto;
import rh_server_driven_ui.p531v1.VStackDto;
import rh_server_driven_ui.p531v1.ValuePropWithIconDto;
import rh_server_driven_ui.p531v1.ValuePropWithNumberDto;
import rh_server_driven_ui.p531v1.ValuePropWithPictogramDto;
import rh_server_driven_ui.p531v1.VideoPlayerDto;
import rh_server_driven_ui.p531v1.ZStackDto;

/* compiled from: UIComponentDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/UIComponent;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "concrete", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;)V", "toProto", "()Lrh_server_driven_ui/v1/UIComponent;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;", "getConcrete", "()Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Companion", "Surrogate", "ConcreteDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class UIComponentDto implements Dto3<UIComponent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<UIComponentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UIComponentDto, UIComponent>> binaryBase64Serializer$delegate;
    private static final UIComponentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UIComponentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UIComponentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ConcreteDto getConcrete() {
        if (this.surrogate.getButton() != null) {
            return new ConcreteDto.Button(this.surrogate.getButton());
        }
        if (this.surrogate.getText() != null) {
            return new ConcreteDto.Text(this.surrogate.getText());
        }
        if (this.surrogate.getV_stack() != null) {
            return new ConcreteDto.VStack(this.surrogate.getV_stack());
        }
        if (this.surrogate.getH_stack() != null) {
            return new ConcreteDto.HStack(this.surrogate.getH_stack());
        }
        if (this.surrogate.getDecorator() != null) {
            return new ConcreteDto.Decorator(this.surrogate.getDecorator());
        }
        if (this.surrogate.getCard() != null) {
            return new ConcreteDto.Card(this.surrogate.getCard());
        }
        if (this.surrogate.getZ_stack() != null) {
            return new ConcreteDto.ZStack(this.surrogate.getZ_stack());
        }
        if (this.surrogate.getValue_prop_with_pictogram() != null) {
            return new ConcreteDto.ValuePropWithPictogram(this.surrogate.getValue_prop_with_pictogram());
        }
        if (this.surrogate.getValue_prop_with_icon() != null) {
            return new ConcreteDto.ValuePropWithIcon(this.surrogate.getValue_prop_with_icon());
        }
        if (this.surrogate.getValue_prop_with_number() != null) {
            return new ConcreteDto.ValuePropWithNumber(this.surrogate.getValue_prop_with_number());
        }
        if (this.surrogate.getImage() != null) {
            return new ConcreteDto.Image(this.surrogate.getImage());
        }
        if (this.surrogate.getLottie() != null) {
            return new ConcreteDto.Lottie(this.surrogate.getLottie());
        }
        if (this.surrogate.getInfo_tag() != null) {
            return new ConcreteDto.InfoTag(this.surrogate.getInfo_tag());
        }
        if (this.surrogate.getNumber_pog() != null) {
            return new ConcreteDto.NumberPog(this.surrogate.getNumber_pog());
        }
        if (this.surrogate.getText_pog() != null) {
            return new ConcreteDto.TextPog(this.surrogate.getText_pog());
        }
        if (this.surrogate.getTimeline() != null) {
            return new ConcreteDto.Timeline(this.surrogate.getTimeline());
        }
        if (this.surrogate.getNavigation_row() != null) {
            return new ConcreteDto.NavigationRow(this.surrogate.getNavigation_row());
        }
        if (this.surrogate.getPog_with_pictogram() != null) {
            return new ConcreteDto.PogWithPictogram(this.surrogate.getPog_with_pictogram());
        }
        if (this.surrogate.getText_button() != null) {
            return new ConcreteDto.TextButton(this.surrogate.getText_button());
        }
        if (this.surrogate.getIcon_button() != null) {
            return new ConcreteDto.IconButton(this.surrogate.getIcon_button());
        }
        if (this.surrogate.getText_input() != null) {
            return new ConcreteDto.TextInput(this.surrogate.getText_input());
        }
        if (this.surrogate.getSpacer() != null) {
            return new ConcreteDto.Spacer(this.surrogate.getSpacer());
        }
        if (this.surrogate.getData_row_stacked() != null) {
            return new ConcreteDto.DataRowStacked(this.surrogate.getData_row_stacked());
        }
        if (this.surrogate.getData_row_condensed() != null) {
            return new ConcreteDto.DataRowCondensed(this.surrogate.getData_row_condensed());
        }
        if (this.surrogate.getCheckbox() != null) {
            return new ConcreteDto.Checkbox(this.surrogate.getCheckbox());
        }
        if (this.surrogate.getThemed_component() != null) {
            return new ConcreteDto.ThemedComponent(this.surrogate.getThemed_component());
        }
        if (this.surrogate.getShimmer_loader() != null) {
            return new ConcreteDto.ShimmerLoader(this.surrogate.getShimmer_loader());
        }
        if (this.surrogate.getInfo_banner() != null) {
            return new ConcreteDto.InfoBanner(this.surrogate.getInfo_banner());
        }
        if (this.surrogate.getCircular_progress() != null) {
            return new ConcreteDto.CircularProgress(this.surrogate.getCircular_progress());
        }
        if (this.surrogate.getMargin_tiered_interest_rates() != null) {
            return new ConcreteDto.MarginTieredInterestRates(this.surrogate.getMargin_tiered_interest_rates());
        }
        if (this.surrogate.getTable_column_header() != null) {
            return new ConcreteDto.TableColumnHeader(this.surrogate.getTable_column_header());
        }
        if (this.surrogate.getFlag_icon() != null) {
            return new ConcreteDto.FlagIcon(this.surrogate.getFlag_icon());
        }
        if (this.surrogate.getTable_instrument_name() != null) {
            return new ConcreteDto.TableInstrumentName(this.surrogate.getTable_instrument_name());
        }
        if (this.surrogate.getAnimated_appearance() != null) {
            return new ConcreteDto.AnimatedAppearance(this.surrogate.getAnimated_appearance());
        }
        if (this.surrogate.getAnimated_reveal_text() != null) {
            return new ConcreteDto.AnimatedRevealText(this.surrogate.getAnimated_reveal_text());
        }
        if (this.surrogate.getTicker_text() != null) {
            return new ConcreteDto.TickerText(this.surrogate.getTicker_text());
        }
        if (this.surrogate.getChart_group() != null) {
            return new ConcreteDto.ChartGroup(this.surrogate.getChart_group());
        }
        if (this.surrogate.getVideo_player() != null) {
            return new ConcreteDto.VideoPlayer(this.surrogate.getVideo_player());
        }
        if (this.surrogate.getActivity_feed_row() != null) {
            return new ConcreteDto.ActivityFeedRow(this.surrogate.getActivity_feed_row());
        }
        if (this.surrogate.getRadio_button() != null) {
            return new ConcreteDto.RadioButton(this.surrogate.getRadio_button());
        }
        if (this.surrogate.getSwitch() != null) {
            return new ConcreteDto.Switch(this.surrogate.getSwitch());
        }
        if (this.surrogate.getList() != null) {
            return new ConcreteDto.List(this.surrogate.getList());
        }
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public UIComponentDto(rh_server_driven_ui.v1.UIComponentDto.ConcreteDto r46) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.UIComponentDto.<init>(rh_server_driven_ui.v1.UIComponentDto$ConcreteDto):void");
    }

    public /* synthetic */ UIComponentDto(ConcreteDto concreteDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : concreteDto);
    }

    @Override // com.robinhood.idl.Dto
    public UIComponent toProto() {
        ButtonDto button = this.surrogate.getButton();
        Button proto = button != null ? button.toProto() : null;
        TextDto text = this.surrogate.getText();
        Text proto2 = text != null ? text.toProto() : null;
        VStackDto v_stack = this.surrogate.getV_stack();
        VStack proto3 = v_stack != null ? v_stack.toProto() : null;
        HStackDto h_stack = this.surrogate.getH_stack();
        HStack proto4 = h_stack != null ? h_stack.toProto() : null;
        DecoratorDto decorator = this.surrogate.getDecorator();
        Decorator proto5 = decorator != null ? decorator.toProto() : null;
        CardDto card = this.surrogate.getCard();
        Card proto6 = card != null ? card.toProto() : null;
        ZStackDto z_stack = this.surrogate.getZ_stack();
        ZStack proto7 = z_stack != null ? z_stack.toProto() : null;
        ValuePropWithPictogramDto value_prop_with_pictogram = this.surrogate.getValue_prop_with_pictogram();
        ValuePropWithPictogram proto8 = value_prop_with_pictogram != null ? value_prop_with_pictogram.toProto() : null;
        ValuePropWithIconDto value_prop_with_icon = this.surrogate.getValue_prop_with_icon();
        ValuePropWithIcon proto9 = value_prop_with_icon != null ? value_prop_with_icon.toProto() : null;
        ValuePropWithNumberDto value_prop_with_number = this.surrogate.getValue_prop_with_number();
        ValuePropWithNumber proto10 = value_prop_with_number != null ? value_prop_with_number.toProto() : null;
        ImageDto image = this.surrogate.getImage();
        Image proto11 = image != null ? image.toProto() : null;
        LottieDto lottie = this.surrogate.getLottie();
        Lottie proto12 = lottie != null ? lottie.toProto() : null;
        InfoTagDto info_tag = this.surrogate.getInfo_tag();
        InfoTag proto13 = info_tag != null ? info_tag.toProto() : null;
        NumberPogDto number_pog = this.surrogate.getNumber_pog();
        NumberPog proto14 = number_pog != null ? number_pog.toProto() : null;
        TextPogDto text_pog = this.surrogate.getText_pog();
        TextPog proto15 = text_pog != null ? text_pog.toProto() : null;
        TimelineDto timeline = this.surrogate.getTimeline();
        Timeline proto16 = timeline != null ? timeline.toProto() : null;
        NavigationRowDto navigation_row = this.surrogate.getNavigation_row();
        NavigationRow proto17 = navigation_row != null ? navigation_row.toProto() : null;
        PogWithPictogramDto pog_with_pictogram = this.surrogate.getPog_with_pictogram();
        PogWithPictogram proto18 = pog_with_pictogram != null ? pog_with_pictogram.toProto() : null;
        TextButtonDto text_button = this.surrogate.getText_button();
        TextButton proto19 = text_button != null ? text_button.toProto() : null;
        IconButtonDto icon_button = this.surrogate.getIcon_button();
        IconButton proto20 = icon_button != null ? icon_button.toProto() : null;
        TextInputDto text_input = this.surrogate.getText_input();
        TextInput proto21 = text_input != null ? text_input.toProto() : null;
        SpacerDto spacer = this.surrogate.getSpacer();
        Spacer proto22 = spacer != null ? spacer.toProto() : null;
        DataRowStackedDto data_row_stacked = this.surrogate.getData_row_stacked();
        DataRowStacked proto23 = data_row_stacked != null ? data_row_stacked.toProto() : null;
        DataRowCondensedDto data_row_condensed = this.surrogate.getData_row_condensed();
        DataRowCondensed proto24 = data_row_condensed != null ? data_row_condensed.toProto() : null;
        CheckboxDto checkbox = this.surrogate.getCheckbox();
        Checkbox proto25 = checkbox != null ? checkbox.toProto() : null;
        ThemedComponentDto themed_component = this.surrogate.getThemed_component();
        ThemedComponent proto26 = themed_component != null ? themed_component.toProto() : null;
        ShimmerLoaderDto shimmer_loader = this.surrogate.getShimmer_loader();
        ShimmerLoader proto27 = shimmer_loader != null ? shimmer_loader.toProto() : null;
        InfoBannerDto info_banner = this.surrogate.getInfo_banner();
        InfoBanner proto28 = info_banner != null ? info_banner.toProto() : null;
        CircularProgressDto circular_progress = this.surrogate.getCircular_progress();
        CircularProgress proto29 = circular_progress != null ? circular_progress.toProto() : null;
        MarginTieredInterestRatesDto margin_tiered_interest_rates = this.surrogate.getMargin_tiered_interest_rates();
        MarginTieredInterestRates proto30 = margin_tiered_interest_rates != null ? margin_tiered_interest_rates.toProto() : null;
        TableColumnHeaderDto table_column_header = this.surrogate.getTable_column_header();
        TableColumnHeader proto31 = table_column_header != null ? table_column_header.toProto() : null;
        FlagIconDto flag_icon = this.surrogate.getFlag_icon();
        FlagIcon proto32 = flag_icon != null ? flag_icon.toProto() : null;
        TableInstrumentNameDto table_instrument_name = this.surrogate.getTable_instrument_name();
        TableInstrumentName proto33 = table_instrument_name != null ? table_instrument_name.toProto() : null;
        AnimatedAppearanceDto animated_appearance = this.surrogate.getAnimated_appearance();
        AnimatedAppearance proto34 = animated_appearance != null ? animated_appearance.toProto() : null;
        AnimatedRevealTextDto animated_reveal_text = this.surrogate.getAnimated_reveal_text();
        AnimatedRevealText proto35 = animated_reveal_text != null ? animated_reveal_text.toProto() : null;
        TickerTextDto ticker_text = this.surrogate.getTicker_text();
        TickerText proto36 = ticker_text != null ? ticker_text.toProto() : null;
        ChartGroupDto chart_group = this.surrogate.getChart_group();
        ChartGroup proto37 = chart_group != null ? chart_group.toProto() : null;
        VideoPlayerDto video_player = this.surrogate.getVideo_player();
        VideoPlayer proto38 = video_player != null ? video_player.toProto() : null;
        ActivityFeedRowDto activity_feed_row = this.surrogate.getActivity_feed_row();
        ActivityFeedRow proto39 = activity_feed_row != null ? activity_feed_row.toProto() : null;
        RadioButtonDto radio_button = this.surrogate.getRadio_button();
        RadioButton proto40 = radio_button != null ? radio_button.toProto() : null;
        SwitchDto switchDto = this.surrogate.getSwitch();
        Switch proto41 = switchDto != null ? switchDto.toProto() : null;
        ListDto list = this.surrogate.getList();
        return new UIComponent(proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, proto21, proto22, proto23, proto24, proto25, proto26, proto27, proto28, proto29, proto30, proto31, proto32, proto33, proto34, proto35, proto36, proto37, proto38, proto39, proto40, proto41, list != null ? list.toProto() : null, null, 0, 1024, null);
    }

    public String toString() {
        return "[UIComponentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UIComponentDto) && Intrinsics.areEqual(((UIComponentDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UIComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000»\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0003\b®\u0001\b\u0083\b\u0018\u0000 \u0099\u00022\u00020\u0001:\u0004\u009a\u0002\u0099\u0002Bÿ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010T¢\u0006\u0004\bV\u0010WBÇ\u0003\b\u0010\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010Z\u001a\u00020X\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\b\u00107\u001a\u0004\u0018\u000106\u0012\b\u00109\u001a\u0004\u0018\u000108\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010>\u0012\b\u0010A\u001a\u0004\u0018\u00010@\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\b\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\b\u0010M\u001a\u0004\u0018\u00010L\u0012\b\u0010O\u001a\u0004\u0018\u00010N\u0012\b\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\u0010S\u001a\u0004\u0018\u00010R\u0012\b\u0010U\u001a\u0004\u0018\u00010T\u0012\b\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\bV\u0010]J'\u0010f\u001a\u00020c2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010`\u001a\u00020_2\u0006\u0010b\u001a\u00020aH\u0001¢\u0006\u0004\bd\u0010eJ\u0010\u0010h\u001a\u00020gHÖ\u0001¢\u0006\u0004\bh\u0010iJ\u0010\u0010j\u001a\u00020XHÖ\u0001¢\u0006\u0004\bj\u0010kJ\u001a\u0010n\u001a\u00020m2\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bn\u0010oR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010p\u0012\u0004\bs\u0010t\u001a\u0004\bq\u0010rR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010u\u0012\u0004\bx\u0010t\u001a\u0004\bv\u0010wR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010y\u0012\u0004\b|\u0010t\u001a\u0004\bz\u0010{R#\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0013\n\u0004\b\t\u0010}\u0012\u0005\b\u0080\u0001\u0010t\u001a\u0004\b~\u0010\u007fR&\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000b\u0010\u0081\u0001\u0012\u0005\b\u0084\u0001\u0010t\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R&\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\r\u0010\u0085\u0001\u0012\u0005\b\u0088\u0001\u0010t\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R&\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u000f\u0010\u0089\u0001\u0012\u0005\b\u008c\u0001\u0010t\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R&\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0011\u0010\u008d\u0001\u0012\u0005\b\u0090\u0001\u0010t\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0013\u0010\u0091\u0001\u0012\u0005\b\u0094\u0001\u0010t\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R&\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0015\u0010\u0095\u0001\u0012\u0005\b\u0098\u0001\u0010t\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R&\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0017\u0010\u0099\u0001\u0012\u0005\b\u009c\u0001\u0010t\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R&\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u009d\u0001\u0012\u0005\b \u0001\u0010t\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001b\u0010¡\u0001\u0012\u0005\b¤\u0001\u0010t\u001a\u0006\b¢\u0001\u0010£\u0001R&\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001d\u0010¥\u0001\u0012\u0005\b¨\u0001\u0010t\u001a\u0006\b¦\u0001\u0010§\u0001R&\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001f\u0010©\u0001\u0012\u0005\b¬\u0001\u0010t\u001a\u0006\bª\u0001\u0010«\u0001R&\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b!\u0010\u00ad\u0001\u0012\u0005\b°\u0001\u0010t\u001a\u0006\b®\u0001\u0010¯\u0001R&\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b#\u0010±\u0001\u0012\u0005\b´\u0001\u0010t\u001a\u0006\b²\u0001\u0010³\u0001R&\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b%\u0010µ\u0001\u0012\u0005\b¸\u0001\u0010t\u001a\u0006\b¶\u0001\u0010·\u0001R&\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b'\u0010¹\u0001\u0012\u0005\b¼\u0001\u0010t\u001a\u0006\bº\u0001\u0010»\u0001R&\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b)\u0010½\u0001\u0012\u0005\bÀ\u0001\u0010t\u001a\u0006\b¾\u0001\u0010¿\u0001R&\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b+\u0010Á\u0001\u0012\u0005\bÄ\u0001\u0010t\u001a\u0006\bÂ\u0001\u0010Ã\u0001R&\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b-\u0010Å\u0001\u0012\u0005\bÈ\u0001\u0010t\u001a\u0006\bÆ\u0001\u0010Ç\u0001R&\u0010/\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b/\u0010É\u0001\u0012\u0005\bÌ\u0001\u0010t\u001a\u0006\bÊ\u0001\u0010Ë\u0001R&\u00101\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b1\u0010Í\u0001\u0012\u0005\bÐ\u0001\u0010t\u001a\u0006\bÎ\u0001\u0010Ï\u0001R&\u00103\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b3\u0010Ñ\u0001\u0012\u0005\bÔ\u0001\u0010t\u001a\u0006\bÒ\u0001\u0010Ó\u0001R&\u00105\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b5\u0010Õ\u0001\u0012\u0005\bØ\u0001\u0010t\u001a\u0006\bÖ\u0001\u0010×\u0001R&\u00107\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b7\u0010Ù\u0001\u0012\u0005\bÜ\u0001\u0010t\u001a\u0006\bÚ\u0001\u0010Û\u0001R&\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b9\u0010Ý\u0001\u0012\u0005\bà\u0001\u0010t\u001a\u0006\bÞ\u0001\u0010ß\u0001R&\u0010;\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b;\u0010á\u0001\u0012\u0005\bä\u0001\u0010t\u001a\u0006\bâ\u0001\u0010ã\u0001R&\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b=\u0010å\u0001\u0012\u0005\bè\u0001\u0010t\u001a\u0006\bæ\u0001\u0010ç\u0001R&\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b?\u0010é\u0001\u0012\u0005\bì\u0001\u0010t\u001a\u0006\bê\u0001\u0010ë\u0001R&\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bA\u0010í\u0001\u0012\u0005\bð\u0001\u0010t\u001a\u0006\bî\u0001\u0010ï\u0001R&\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bC\u0010ñ\u0001\u0012\u0005\bô\u0001\u0010t\u001a\u0006\bò\u0001\u0010ó\u0001R&\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bE\u0010õ\u0001\u0012\u0005\bø\u0001\u0010t\u001a\u0006\bö\u0001\u0010÷\u0001R&\u0010G\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bG\u0010ù\u0001\u0012\u0005\bü\u0001\u0010t\u001a\u0006\bú\u0001\u0010û\u0001R&\u0010I\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bI\u0010ý\u0001\u0012\u0005\b\u0080\u0002\u0010t\u001a\u0006\bþ\u0001\u0010ÿ\u0001R&\u0010K\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bK\u0010\u0081\u0002\u0012\u0005\b\u0084\u0002\u0010t\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R&\u0010M\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bM\u0010\u0085\u0002\u0012\u0005\b\u0088\u0002\u0010t\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R&\u0010O\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bO\u0010\u0089\u0002\u0012\u0005\b\u008c\u0002\u0010t\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R&\u0010Q\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bQ\u0010\u008d\u0002\u0012\u0005\b\u0090\u0002\u0010t\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R&\u0010S\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bS\u0010\u0091\u0002\u0012\u0005\b\u0094\u0002\u0010t\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R&\u0010U\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\bU\u0010\u0095\u0002\u0012\u0005\b\u0098\u0002\u0010t\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002¨\u0006\u009b\u0002"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ButtonDto;", "button", "Lrh_server_driven_ui/v1/TextDto;", "text", "Lrh_server_driven_ui/v1/VStackDto;", "v_stack", "Lrh_server_driven_ui/v1/HStackDto;", "h_stack", "Lrh_server_driven_ui/v1/DecoratorDto;", "decorator", "Lrh_server_driven_ui/v1/CardDto;", "card", "Lrh_server_driven_ui/v1/ZStackDto;", "z_stack", "Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "value_prop_with_pictogram", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "value_prop_with_icon", "Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "value_prop_with_number", "Lrh_server_driven_ui/v1/ImageDto;", "image", "Lrh_server_driven_ui/v1/LottieDto;", "lottie", "Lrh_server_driven_ui/v1/InfoTagDto;", "info_tag", "Lrh_server_driven_ui/v1/NumberPogDto;", "number_pog", "Lrh_server_driven_ui/v1/TextPogDto;", "text_pog", "Lrh_server_driven_ui/v1/TimelineDto;", "timeline", "Lrh_server_driven_ui/v1/NavigationRowDto;", "navigation_row", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "pog_with_pictogram", "Lrh_server_driven_ui/v1/TextButtonDto;", AdvancedOrderNumpadLayout.TEXT_BUTTON_TEST_TAG, "Lrh_server_driven_ui/v1/IconButtonDto;", "icon_button", "Lrh_server_driven_ui/v1/TextInputDto;", "text_input", "Lrh_server_driven_ui/v1/SpacerDto;", Spacer.f10659type, "Lrh_server_driven_ui/v1/DataRowStackedDto;", "data_row_stacked", "Lrh_server_driven_ui/v1/DataRowCondensedDto;", "data_row_condensed", "Lrh_server_driven_ui/v1/CheckboxDto;", "checkbox", "Lrh_server_driven_ui/v1/ThemedComponentDto;", "themed_component", "Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "shimmer_loader", "Lrh_server_driven_ui/v1/InfoBannerDto;", TestTags.INFO_BANNER, "Lrh_server_driven_ui/v1/CircularProgressDto;", "circular_progress", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "margin_tiered_interest_rates", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "table_column_header", "Lrh_server_driven_ui/v1/FlagIconDto;", "flag_icon", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "table_instrument_name", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "animated_appearance", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "animated_reveal_text", "Lrh_server_driven_ui/v1/TickerTextDto;", "ticker_text", "Lrh_server_driven_ui/v1/ChartGroupDto;", "chart_group", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "video_player", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "activity_feed_row", "Lrh_server_driven_ui/v1/RadioButtonDto;", "radio_button", "Lrh_server_driven_ui/v1/SwitchDto;", "switch", "Lrh_server_driven_ui/v1/ListDto;", "list", "<init>", "(Lrh_server_driven_ui/v1/ButtonDto;Lrh_server_driven_ui/v1/TextDto;Lrh_server_driven_ui/v1/VStackDto;Lrh_server_driven_ui/v1/HStackDto;Lrh_server_driven_ui/v1/DecoratorDto;Lrh_server_driven_ui/v1/CardDto;Lrh_server_driven_ui/v1/ZStackDto;Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;Lrh_server_driven_ui/v1/ValuePropWithIconDto;Lrh_server_driven_ui/v1/ValuePropWithNumberDto;Lrh_server_driven_ui/v1/ImageDto;Lrh_server_driven_ui/v1/LottieDto;Lrh_server_driven_ui/v1/InfoTagDto;Lrh_server_driven_ui/v1/NumberPogDto;Lrh_server_driven_ui/v1/TextPogDto;Lrh_server_driven_ui/v1/TimelineDto;Lrh_server_driven_ui/v1/NavigationRowDto;Lrh_server_driven_ui/v1/PogWithPictogramDto;Lrh_server_driven_ui/v1/TextButtonDto;Lrh_server_driven_ui/v1/IconButtonDto;Lrh_server_driven_ui/v1/TextInputDto;Lrh_server_driven_ui/v1/SpacerDto;Lrh_server_driven_ui/v1/DataRowStackedDto;Lrh_server_driven_ui/v1/DataRowCondensedDto;Lrh_server_driven_ui/v1/CheckboxDto;Lrh_server_driven_ui/v1/ThemedComponentDto;Lrh_server_driven_ui/v1/ShimmerLoaderDto;Lrh_server_driven_ui/v1/InfoBannerDto;Lrh_server_driven_ui/v1/CircularProgressDto;Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;Lrh_server_driven_ui/v1/TableColumnHeaderDto;Lrh_server_driven_ui/v1/FlagIconDto;Lrh_server_driven_ui/v1/TableInstrumentNameDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto;Lrh_server_driven_ui/v1/AnimatedRevealTextDto;Lrh_server_driven_ui/v1/TickerTextDto;Lrh_server_driven_ui/v1/ChartGroupDto;Lrh_server_driven_ui/v1/VideoPlayerDto;Lrh_server_driven_ui/v1/ActivityFeedRowDto;Lrh_server_driven_ui/v1/RadioButtonDto;Lrh_server_driven_ui/v1/SwitchDto;Lrh_server_driven_ui/v1/ListDto;)V", "", "seen0", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILrh_server_driven_ui/v1/ButtonDto;Lrh_server_driven_ui/v1/TextDto;Lrh_server_driven_ui/v1/VStackDto;Lrh_server_driven_ui/v1/HStackDto;Lrh_server_driven_ui/v1/DecoratorDto;Lrh_server_driven_ui/v1/CardDto;Lrh_server_driven_ui/v1/ZStackDto;Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;Lrh_server_driven_ui/v1/ValuePropWithIconDto;Lrh_server_driven_ui/v1/ValuePropWithNumberDto;Lrh_server_driven_ui/v1/ImageDto;Lrh_server_driven_ui/v1/LottieDto;Lrh_server_driven_ui/v1/InfoTagDto;Lrh_server_driven_ui/v1/NumberPogDto;Lrh_server_driven_ui/v1/TextPogDto;Lrh_server_driven_ui/v1/TimelineDto;Lrh_server_driven_ui/v1/NavigationRowDto;Lrh_server_driven_ui/v1/PogWithPictogramDto;Lrh_server_driven_ui/v1/TextButtonDto;Lrh_server_driven_ui/v1/IconButtonDto;Lrh_server_driven_ui/v1/TextInputDto;Lrh_server_driven_ui/v1/SpacerDto;Lrh_server_driven_ui/v1/DataRowStackedDto;Lrh_server_driven_ui/v1/DataRowCondensedDto;Lrh_server_driven_ui/v1/CheckboxDto;Lrh_server_driven_ui/v1/ThemedComponentDto;Lrh_server_driven_ui/v1/ShimmerLoaderDto;Lrh_server_driven_ui/v1/InfoBannerDto;Lrh_server_driven_ui/v1/CircularProgressDto;Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;Lrh_server_driven_ui/v1/TableColumnHeaderDto;Lrh_server_driven_ui/v1/FlagIconDto;Lrh_server_driven_ui/v1/TableInstrumentNameDto;Lrh_server_driven_ui/v1/AnimatedAppearanceDto;Lrh_server_driven_ui/v1/AnimatedRevealTextDto;Lrh_server_driven_ui/v1/TickerTextDto;Lrh_server_driven_ui/v1/ChartGroupDto;Lrh_server_driven_ui/v1/VideoPlayerDto;Lrh_server_driven_ui/v1/ActivityFeedRowDto;Lrh_server_driven_ui/v1/RadioButtonDto;Lrh_server_driven_ui/v1/SwitchDto;Lrh_server_driven_ui/v1/ListDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ButtonDto;", "getButton", "()Lrh_server_driven_ui/v1/ButtonDto;", "getButton$annotations", "()V", "Lrh_server_driven_ui/v1/TextDto;", "getText", "()Lrh_server_driven_ui/v1/TextDto;", "getText$annotations", "Lrh_server_driven_ui/v1/VStackDto;", "getV_stack", "()Lrh_server_driven_ui/v1/VStackDto;", "getV_stack$annotations", "Lrh_server_driven_ui/v1/HStackDto;", "getH_stack", "()Lrh_server_driven_ui/v1/HStackDto;", "getH_stack$annotations", "Lrh_server_driven_ui/v1/DecoratorDto;", "getDecorator", "()Lrh_server_driven_ui/v1/DecoratorDto;", "getDecorator$annotations", "Lrh_server_driven_ui/v1/CardDto;", "getCard", "()Lrh_server_driven_ui/v1/CardDto;", "getCard$annotations", "Lrh_server_driven_ui/v1/ZStackDto;", "getZ_stack", "()Lrh_server_driven_ui/v1/ZStackDto;", "getZ_stack$annotations", "Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "getValue_prop_with_pictogram", "()Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "getValue_prop_with_pictogram$annotations", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "getValue_prop_with_icon", "()Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "getValue_prop_with_icon$annotations", "Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "getValue_prop_with_number", "()Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "getValue_prop_with_number$annotations", "Lrh_server_driven_ui/v1/ImageDto;", "getImage", "()Lrh_server_driven_ui/v1/ImageDto;", "getImage$annotations", "Lrh_server_driven_ui/v1/LottieDto;", "getLottie", "()Lrh_server_driven_ui/v1/LottieDto;", "getLottie$annotations", "Lrh_server_driven_ui/v1/InfoTagDto;", "getInfo_tag", "()Lrh_server_driven_ui/v1/InfoTagDto;", "getInfo_tag$annotations", "Lrh_server_driven_ui/v1/NumberPogDto;", "getNumber_pog", "()Lrh_server_driven_ui/v1/NumberPogDto;", "getNumber_pog$annotations", "Lrh_server_driven_ui/v1/TextPogDto;", "getText_pog", "()Lrh_server_driven_ui/v1/TextPogDto;", "getText_pog$annotations", "Lrh_server_driven_ui/v1/TimelineDto;", "getTimeline", "()Lrh_server_driven_ui/v1/TimelineDto;", "getTimeline$annotations", "Lrh_server_driven_ui/v1/NavigationRowDto;", "getNavigation_row", "()Lrh_server_driven_ui/v1/NavigationRowDto;", "getNavigation_row$annotations", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getPog_with_pictogram", "()Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getPog_with_pictogram$annotations", "Lrh_server_driven_ui/v1/TextButtonDto;", "getText_button", "()Lrh_server_driven_ui/v1/TextButtonDto;", "getText_button$annotations", "Lrh_server_driven_ui/v1/IconButtonDto;", "getIcon_button", "()Lrh_server_driven_ui/v1/IconButtonDto;", "getIcon_button$annotations", "Lrh_server_driven_ui/v1/TextInputDto;", "getText_input", "()Lrh_server_driven_ui/v1/TextInputDto;", "getText_input$annotations", "Lrh_server_driven_ui/v1/SpacerDto;", "getSpacer", "()Lrh_server_driven_ui/v1/SpacerDto;", "getSpacer$annotations", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "getData_row_stacked", "()Lrh_server_driven_ui/v1/DataRowStackedDto;", "getData_row_stacked$annotations", "Lrh_server_driven_ui/v1/DataRowCondensedDto;", "getData_row_condensed", "()Lrh_server_driven_ui/v1/DataRowCondensedDto;", "getData_row_condensed$annotations", "Lrh_server_driven_ui/v1/CheckboxDto;", "getCheckbox", "()Lrh_server_driven_ui/v1/CheckboxDto;", "getCheckbox$annotations", "Lrh_server_driven_ui/v1/ThemedComponentDto;", "getThemed_component", "()Lrh_server_driven_ui/v1/ThemedComponentDto;", "getThemed_component$annotations", "Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "getShimmer_loader", "()Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "getShimmer_loader$annotations", "Lrh_server_driven_ui/v1/InfoBannerDto;", "getInfo_banner", "()Lrh_server_driven_ui/v1/InfoBannerDto;", "getInfo_banner$annotations", "Lrh_server_driven_ui/v1/CircularProgressDto;", "getCircular_progress", "()Lrh_server_driven_ui/v1/CircularProgressDto;", "getCircular_progress$annotations", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "getMargin_tiered_interest_rates", "()Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "getMargin_tiered_interest_rates$annotations", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "getTable_column_header", "()Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "getTable_column_header$annotations", "Lrh_server_driven_ui/v1/FlagIconDto;", "getFlag_icon", "()Lrh_server_driven_ui/v1/FlagIconDto;", "getFlag_icon$annotations", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "getTable_instrument_name", "()Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "getTable_instrument_name$annotations", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "getAnimated_appearance", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "getAnimated_appearance$annotations", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "getAnimated_reveal_text", "()Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "getAnimated_reveal_text$annotations", "Lrh_server_driven_ui/v1/TickerTextDto;", "getTicker_text", "()Lrh_server_driven_ui/v1/TickerTextDto;", "getTicker_text$annotations", "Lrh_server_driven_ui/v1/ChartGroupDto;", "getChart_group", "()Lrh_server_driven_ui/v1/ChartGroupDto;", "getChart_group$annotations", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "getVideo_player", "()Lrh_server_driven_ui/v1/VideoPlayerDto;", "getVideo_player$annotations", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "getActivity_feed_row", "()Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "getActivity_feed_row$annotations", "Lrh_server_driven_ui/v1/RadioButtonDto;", "getRadio_button", "()Lrh_server_driven_ui/v1/RadioButtonDto;", "getRadio_button$annotations", "Lrh_server_driven_ui/v1/SwitchDto;", "getSwitch", "()Lrh_server_driven_ui/v1/SwitchDto;", "getSwitch$annotations", "Lrh_server_driven_ui/v1/ListDto;", "getList", "()Lrh_server_driven_ui/v1/ListDto;", "getList$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActivityFeedRowDto activity_feed_row;
        private final AnimatedAppearanceDto animated_appearance;
        private final AnimatedRevealTextDto animated_reveal_text;
        private final ButtonDto button;
        private final CardDto card;
        private final ChartGroupDto chart_group;
        private final CheckboxDto checkbox;
        private final CircularProgressDto circular_progress;
        private final DataRowCondensedDto data_row_condensed;
        private final DataRowStackedDto data_row_stacked;
        private final DecoratorDto decorator;
        private final FlagIconDto flag_icon;
        private final HStackDto h_stack;
        private final IconButtonDto icon_button;
        private final ImageDto image;
        private final InfoBannerDto info_banner;
        private final InfoTagDto info_tag;
        private final ListDto list;
        private final LottieDto lottie;
        private final MarginTieredInterestRatesDto margin_tiered_interest_rates;
        private final NavigationRowDto navigation_row;
        private final NumberPogDto number_pog;
        private final PogWithPictogramDto pog_with_pictogram;
        private final RadioButtonDto radio_button;
        private final ShimmerLoaderDto shimmer_loader;
        private final SpacerDto spacer;
        private final SwitchDto switch;
        private final TableColumnHeaderDto table_column_header;
        private final TableInstrumentNameDto table_instrument_name;
        private final TextDto text;
        private final TextButtonDto text_button;
        private final TextInputDto text_input;
        private final TextPogDto text_pog;
        private final ThemedComponentDto themed_component;
        private final TickerTextDto ticker_text;
        private final TimelineDto timeline;
        private final VStackDto v_stack;
        private final ValuePropWithIconDto value_prop_with_icon;
        private final ValuePropWithNumberDto value_prop_with_number;
        private final ValuePropWithPictogramDto value_prop_with_pictogram;
        private final VideoPlayerDto video_player;
        private final ZStackDto z_stack;

        public Surrogate() {
            this((ButtonDto) null, (TextDto) null, (VStackDto) null, (HStackDto) null, (DecoratorDto) null, (CardDto) null, (ZStackDto) null, (ValuePropWithPictogramDto) null, (ValuePropWithIconDto) null, (ValuePropWithNumberDto) null, (ImageDto) null, (LottieDto) null, (InfoTagDto) null, (NumberPogDto) null, (TextPogDto) null, (TimelineDto) null, (NavigationRowDto) null, (PogWithPictogramDto) null, (TextButtonDto) null, (IconButtonDto) null, (TextInputDto) null, (SpacerDto) null, (DataRowStackedDto) null, (DataRowCondensedDto) null, (CheckboxDto) null, (ThemedComponentDto) null, (ShimmerLoaderDto) null, (InfoBannerDto) null, (CircularProgressDto) null, (MarginTieredInterestRatesDto) null, (TableColumnHeaderDto) null, (FlagIconDto) null, (TableInstrumentNameDto) null, (AnimatedAppearanceDto) null, (AnimatedRevealTextDto) null, (TickerTextDto) null, (ChartGroupDto) null, (VideoPlayerDto) null, (ActivityFeedRowDto) null, (RadioButtonDto) null, (SwitchDto) null, (ListDto) null, -1, 1023, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.button, surrogate.button) && Intrinsics.areEqual(this.text, surrogate.text) && Intrinsics.areEqual(this.v_stack, surrogate.v_stack) && Intrinsics.areEqual(this.h_stack, surrogate.h_stack) && Intrinsics.areEqual(this.decorator, surrogate.decorator) && Intrinsics.areEqual(this.card, surrogate.card) && Intrinsics.areEqual(this.z_stack, surrogate.z_stack) && Intrinsics.areEqual(this.value_prop_with_pictogram, surrogate.value_prop_with_pictogram) && Intrinsics.areEqual(this.value_prop_with_icon, surrogate.value_prop_with_icon) && Intrinsics.areEqual(this.value_prop_with_number, surrogate.value_prop_with_number) && Intrinsics.areEqual(this.image, surrogate.image) && Intrinsics.areEqual(this.lottie, surrogate.lottie) && Intrinsics.areEqual(this.info_tag, surrogate.info_tag) && Intrinsics.areEqual(this.number_pog, surrogate.number_pog) && Intrinsics.areEqual(this.text_pog, surrogate.text_pog) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.navigation_row, surrogate.navigation_row) && Intrinsics.areEqual(this.pog_with_pictogram, surrogate.pog_with_pictogram) && Intrinsics.areEqual(this.text_button, surrogate.text_button) && Intrinsics.areEqual(this.icon_button, surrogate.icon_button) && Intrinsics.areEqual(this.text_input, surrogate.text_input) && Intrinsics.areEqual(this.spacer, surrogate.spacer) && Intrinsics.areEqual(this.data_row_stacked, surrogate.data_row_stacked) && Intrinsics.areEqual(this.data_row_condensed, surrogate.data_row_condensed) && Intrinsics.areEqual(this.checkbox, surrogate.checkbox) && Intrinsics.areEqual(this.themed_component, surrogate.themed_component) && Intrinsics.areEqual(this.shimmer_loader, surrogate.shimmer_loader) && Intrinsics.areEqual(this.info_banner, surrogate.info_banner) && Intrinsics.areEqual(this.circular_progress, surrogate.circular_progress) && Intrinsics.areEqual(this.margin_tiered_interest_rates, surrogate.margin_tiered_interest_rates) && Intrinsics.areEqual(this.table_column_header, surrogate.table_column_header) && Intrinsics.areEqual(this.flag_icon, surrogate.flag_icon) && Intrinsics.areEqual(this.table_instrument_name, surrogate.table_instrument_name) && Intrinsics.areEqual(this.animated_appearance, surrogate.animated_appearance) && Intrinsics.areEqual(this.animated_reveal_text, surrogate.animated_reveal_text) && Intrinsics.areEqual(this.ticker_text, surrogate.ticker_text) && Intrinsics.areEqual(this.chart_group, surrogate.chart_group) && Intrinsics.areEqual(this.video_player, surrogate.video_player) && Intrinsics.areEqual(this.activity_feed_row, surrogate.activity_feed_row) && Intrinsics.areEqual(this.radio_button, surrogate.radio_button) && Intrinsics.areEqual(this.switch, surrogate.switch) && Intrinsics.areEqual(this.list, surrogate.list);
        }

        public int hashCode() {
            ButtonDto buttonDto = this.button;
            int iHashCode = (buttonDto == null ? 0 : buttonDto.hashCode()) * 31;
            TextDto textDto = this.text;
            int iHashCode2 = (iHashCode + (textDto == null ? 0 : textDto.hashCode())) * 31;
            VStackDto vStackDto = this.v_stack;
            int iHashCode3 = (iHashCode2 + (vStackDto == null ? 0 : vStackDto.hashCode())) * 31;
            HStackDto hStackDto = this.h_stack;
            int iHashCode4 = (iHashCode3 + (hStackDto == null ? 0 : hStackDto.hashCode())) * 31;
            DecoratorDto decoratorDto = this.decorator;
            int iHashCode5 = (iHashCode4 + (decoratorDto == null ? 0 : decoratorDto.hashCode())) * 31;
            CardDto cardDto = this.card;
            int iHashCode6 = (iHashCode5 + (cardDto == null ? 0 : cardDto.hashCode())) * 31;
            ZStackDto zStackDto = this.z_stack;
            int iHashCode7 = (iHashCode6 + (zStackDto == null ? 0 : zStackDto.hashCode())) * 31;
            ValuePropWithPictogramDto valuePropWithPictogramDto = this.value_prop_with_pictogram;
            int iHashCode8 = (iHashCode7 + (valuePropWithPictogramDto == null ? 0 : valuePropWithPictogramDto.hashCode())) * 31;
            ValuePropWithIconDto valuePropWithIconDto = this.value_prop_with_icon;
            int iHashCode9 = (iHashCode8 + (valuePropWithIconDto == null ? 0 : valuePropWithIconDto.hashCode())) * 31;
            ValuePropWithNumberDto valuePropWithNumberDto = this.value_prop_with_number;
            int iHashCode10 = (iHashCode9 + (valuePropWithNumberDto == null ? 0 : valuePropWithNumberDto.hashCode())) * 31;
            ImageDto imageDto = this.image;
            int iHashCode11 = (iHashCode10 + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
            LottieDto lottieDto = this.lottie;
            int iHashCode12 = (iHashCode11 + (lottieDto == null ? 0 : lottieDto.hashCode())) * 31;
            InfoTagDto infoTagDto = this.info_tag;
            int iHashCode13 = (iHashCode12 + (infoTagDto == null ? 0 : infoTagDto.hashCode())) * 31;
            NumberPogDto numberPogDto = this.number_pog;
            int iHashCode14 = (iHashCode13 + (numberPogDto == null ? 0 : numberPogDto.hashCode())) * 31;
            TextPogDto textPogDto = this.text_pog;
            int iHashCode15 = (iHashCode14 + (textPogDto == null ? 0 : textPogDto.hashCode())) * 31;
            TimelineDto timelineDto = this.timeline;
            int iHashCode16 = (iHashCode15 + (timelineDto == null ? 0 : timelineDto.hashCode())) * 31;
            NavigationRowDto navigationRowDto = this.navigation_row;
            int iHashCode17 = (iHashCode16 + (navigationRowDto == null ? 0 : navigationRowDto.hashCode())) * 31;
            PogWithPictogramDto pogWithPictogramDto = this.pog_with_pictogram;
            int iHashCode18 = (iHashCode17 + (pogWithPictogramDto == null ? 0 : pogWithPictogramDto.hashCode())) * 31;
            TextButtonDto textButtonDto = this.text_button;
            int iHashCode19 = (iHashCode18 + (textButtonDto == null ? 0 : textButtonDto.hashCode())) * 31;
            IconButtonDto iconButtonDto = this.icon_button;
            int iHashCode20 = (iHashCode19 + (iconButtonDto == null ? 0 : iconButtonDto.hashCode())) * 31;
            TextInputDto textInputDto = this.text_input;
            int iHashCode21 = (iHashCode20 + (textInputDto == null ? 0 : textInputDto.hashCode())) * 31;
            SpacerDto spacerDto = this.spacer;
            int iHashCode22 = (iHashCode21 + (spacerDto == null ? 0 : spacerDto.hashCode())) * 31;
            DataRowStackedDto dataRowStackedDto = this.data_row_stacked;
            int iHashCode23 = (iHashCode22 + (dataRowStackedDto == null ? 0 : dataRowStackedDto.hashCode())) * 31;
            DataRowCondensedDto dataRowCondensedDto = this.data_row_condensed;
            int iHashCode24 = (iHashCode23 + (dataRowCondensedDto == null ? 0 : dataRowCondensedDto.hashCode())) * 31;
            CheckboxDto checkboxDto = this.checkbox;
            int iHashCode25 = (iHashCode24 + (checkboxDto == null ? 0 : checkboxDto.hashCode())) * 31;
            ThemedComponentDto themedComponentDto = this.themed_component;
            int iHashCode26 = (iHashCode25 + (themedComponentDto == null ? 0 : themedComponentDto.hashCode())) * 31;
            ShimmerLoaderDto shimmerLoaderDto = this.shimmer_loader;
            int iHashCode27 = (iHashCode26 + (shimmerLoaderDto == null ? 0 : shimmerLoaderDto.hashCode())) * 31;
            InfoBannerDto infoBannerDto = this.info_banner;
            int iHashCode28 = (iHashCode27 + (infoBannerDto == null ? 0 : infoBannerDto.hashCode())) * 31;
            CircularProgressDto circularProgressDto = this.circular_progress;
            int iHashCode29 = (iHashCode28 + (circularProgressDto == null ? 0 : circularProgressDto.hashCode())) * 31;
            MarginTieredInterestRatesDto marginTieredInterestRatesDto = this.margin_tiered_interest_rates;
            int iHashCode30 = (iHashCode29 + (marginTieredInterestRatesDto == null ? 0 : marginTieredInterestRatesDto.hashCode())) * 31;
            TableColumnHeaderDto tableColumnHeaderDto = this.table_column_header;
            int iHashCode31 = (iHashCode30 + (tableColumnHeaderDto == null ? 0 : tableColumnHeaderDto.hashCode())) * 31;
            FlagIconDto flagIconDto = this.flag_icon;
            int iHashCode32 = (iHashCode31 + (flagIconDto == null ? 0 : flagIconDto.hashCode())) * 31;
            TableInstrumentNameDto tableInstrumentNameDto = this.table_instrument_name;
            int iHashCode33 = (iHashCode32 + (tableInstrumentNameDto == null ? 0 : tableInstrumentNameDto.hashCode())) * 31;
            AnimatedAppearanceDto animatedAppearanceDto = this.animated_appearance;
            int iHashCode34 = (iHashCode33 + (animatedAppearanceDto == null ? 0 : animatedAppearanceDto.hashCode())) * 31;
            AnimatedRevealTextDto animatedRevealTextDto = this.animated_reveal_text;
            int iHashCode35 = (iHashCode34 + (animatedRevealTextDto == null ? 0 : animatedRevealTextDto.hashCode())) * 31;
            TickerTextDto tickerTextDto = this.ticker_text;
            int iHashCode36 = (iHashCode35 + (tickerTextDto == null ? 0 : tickerTextDto.hashCode())) * 31;
            ChartGroupDto chartGroupDto = this.chart_group;
            int iHashCode37 = (iHashCode36 + (chartGroupDto == null ? 0 : chartGroupDto.hashCode())) * 31;
            VideoPlayerDto videoPlayerDto = this.video_player;
            int iHashCode38 = (iHashCode37 + (videoPlayerDto == null ? 0 : videoPlayerDto.hashCode())) * 31;
            ActivityFeedRowDto activityFeedRowDto = this.activity_feed_row;
            int iHashCode39 = (iHashCode38 + (activityFeedRowDto == null ? 0 : activityFeedRowDto.hashCode())) * 31;
            RadioButtonDto radioButtonDto = this.radio_button;
            int iHashCode40 = (iHashCode39 + (radioButtonDto == null ? 0 : radioButtonDto.hashCode())) * 31;
            SwitchDto switchDto = this.switch;
            int iHashCode41 = (iHashCode40 + (switchDto == null ? 0 : switchDto.hashCode())) * 31;
            ListDto listDto = this.list;
            return iHashCode41 + (listDto != null ? listDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(button=" + this.button + ", text=" + this.text + ", v_stack=" + this.v_stack + ", h_stack=" + this.h_stack + ", decorator=" + this.decorator + ", card=" + this.card + ", z_stack=" + this.z_stack + ", value_prop_with_pictogram=" + this.value_prop_with_pictogram + ", value_prop_with_icon=" + this.value_prop_with_icon + ", value_prop_with_number=" + this.value_prop_with_number + ", image=" + this.image + ", lottie=" + this.lottie + ", info_tag=" + this.info_tag + ", number_pog=" + this.number_pog + ", text_pog=" + this.text_pog + ", timeline=" + this.timeline + ", navigation_row=" + this.navigation_row + ", pog_with_pictogram=" + this.pog_with_pictogram + ", text_button=" + this.text_button + ", icon_button=" + this.icon_button + ", text_input=" + this.text_input + ", spacer=" + this.spacer + ", data_row_stacked=" + this.data_row_stacked + ", data_row_condensed=" + this.data_row_condensed + ", checkbox=" + this.checkbox + ", themed_component=" + this.themed_component + ", shimmer_loader=" + this.shimmer_loader + ", info_banner=" + this.info_banner + ", circular_progress=" + this.circular_progress + ", margin_tiered_interest_rates=" + this.margin_tiered_interest_rates + ", table_column_header=" + this.table_column_header + ", flag_icon=" + this.flag_icon + ", table_instrument_name=" + this.table_instrument_name + ", animated_appearance=" + this.animated_appearance + ", animated_reveal_text=" + this.animated_reveal_text + ", ticker_text=" + this.ticker_text + ", chart_group=" + this.chart_group + ", video_player=" + this.video_player + ", activity_feed_row=" + this.activity_feed_row + ", radio_button=" + this.radio_button + ", switch=" + this.switch + ", list=" + this.list + ")";
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UIComponentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, ButtonDto buttonDto, TextDto textDto, VStackDto vStackDto, HStackDto hStackDto, DecoratorDto decoratorDto, CardDto cardDto, ZStackDto zStackDto, ValuePropWithPictogramDto valuePropWithPictogramDto, ValuePropWithIconDto valuePropWithIconDto, ValuePropWithNumberDto valuePropWithNumberDto, ImageDto imageDto, LottieDto lottieDto, InfoTagDto infoTagDto, NumberPogDto numberPogDto, TextPogDto textPogDto, TimelineDto timelineDto, NavigationRowDto navigationRowDto, PogWithPictogramDto pogWithPictogramDto, TextButtonDto textButtonDto, IconButtonDto iconButtonDto, TextInputDto textInputDto, SpacerDto spacerDto, DataRowStackedDto dataRowStackedDto, DataRowCondensedDto dataRowCondensedDto, CheckboxDto checkboxDto, ThemedComponentDto themedComponentDto, ShimmerLoaderDto shimmerLoaderDto, InfoBannerDto infoBannerDto, CircularProgressDto circularProgressDto, MarginTieredInterestRatesDto marginTieredInterestRatesDto, TableColumnHeaderDto tableColumnHeaderDto, FlagIconDto flagIconDto, TableInstrumentNameDto tableInstrumentNameDto, AnimatedAppearanceDto animatedAppearanceDto, AnimatedRevealTextDto animatedRevealTextDto, TickerTextDto tickerTextDto, ChartGroupDto chartGroupDto, VideoPlayerDto videoPlayerDto, ActivityFeedRowDto activityFeedRowDto, RadioButtonDto radioButtonDto, SwitchDto switchDto, ListDto listDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.button = null;
            } else {
                this.button = buttonDto;
            }
            if ((i & 2) == 0) {
                this.text = null;
            } else {
                this.text = textDto;
            }
            if ((i & 4) == 0) {
                this.v_stack = null;
            } else {
                this.v_stack = vStackDto;
            }
            if ((i & 8) == 0) {
                this.h_stack = null;
            } else {
                this.h_stack = hStackDto;
            }
            if ((i & 16) == 0) {
                this.decorator = null;
            } else {
                this.decorator = decoratorDto;
            }
            if ((i & 32) == 0) {
                this.card = null;
            } else {
                this.card = cardDto;
            }
            if ((i & 64) == 0) {
                this.z_stack = null;
            } else {
                this.z_stack = zStackDto;
            }
            if ((i & 128) == 0) {
                this.value_prop_with_pictogram = null;
            } else {
                this.value_prop_with_pictogram = valuePropWithPictogramDto;
            }
            if ((i & 256) == 0) {
                this.value_prop_with_icon = null;
            } else {
                this.value_prop_with_icon = valuePropWithIconDto;
            }
            if ((i & 512) == 0) {
                this.value_prop_with_number = null;
            } else {
                this.value_prop_with_number = valuePropWithNumberDto;
            }
            if ((i & 1024) == 0) {
                this.image = null;
            } else {
                this.image = imageDto;
            }
            if ((i & 2048) == 0) {
                this.lottie = null;
            } else {
                this.lottie = lottieDto;
            }
            if ((i & 4096) == 0) {
                this.info_tag = null;
            } else {
                this.info_tag = infoTagDto;
            }
            if ((i & 8192) == 0) {
                this.number_pog = null;
            } else {
                this.number_pog = numberPogDto;
            }
            if ((i & 16384) == 0) {
                this.text_pog = null;
            } else {
                this.text_pog = textPogDto;
            }
            if ((32768 & i) == 0) {
                this.timeline = null;
            } else {
                this.timeline = timelineDto;
            }
            if ((65536 & i) == 0) {
                this.navigation_row = null;
            } else {
                this.navigation_row = navigationRowDto;
            }
            if ((131072 & i) == 0) {
                this.pog_with_pictogram = null;
            } else {
                this.pog_with_pictogram = pogWithPictogramDto;
            }
            if ((262144 & i) == 0) {
                this.text_button = null;
            } else {
                this.text_button = textButtonDto;
            }
            if ((524288 & i) == 0) {
                this.icon_button = null;
            } else {
                this.icon_button = iconButtonDto;
            }
            if ((1048576 & i) == 0) {
                this.text_input = null;
            } else {
                this.text_input = textInputDto;
            }
            if ((2097152 & i) == 0) {
                this.spacer = null;
            } else {
                this.spacer = spacerDto;
            }
            if ((4194304 & i) == 0) {
                this.data_row_stacked = null;
            } else {
                this.data_row_stacked = dataRowStackedDto;
            }
            if ((8388608 & i) == 0) {
                this.data_row_condensed = null;
            } else {
                this.data_row_condensed = dataRowCondensedDto;
            }
            if ((16777216 & i) == 0) {
                this.checkbox = null;
            } else {
                this.checkbox = checkboxDto;
            }
            if ((33554432 & i) == 0) {
                this.themed_component = null;
            } else {
                this.themed_component = themedComponentDto;
            }
            if ((67108864 & i) == 0) {
                this.shimmer_loader = null;
            } else {
                this.shimmer_loader = shimmerLoaderDto;
            }
            if ((134217728 & i) == 0) {
                this.info_banner = null;
            } else {
                this.info_banner = infoBannerDto;
            }
            if ((268435456 & i) == 0) {
                this.circular_progress = null;
            } else {
                this.circular_progress = circularProgressDto;
            }
            if ((536870912 & i) == 0) {
                this.margin_tiered_interest_rates = null;
            } else {
                this.margin_tiered_interest_rates = marginTieredInterestRatesDto;
            }
            if ((1073741824 & i) == 0) {
                this.table_column_header = null;
            } else {
                this.table_column_header = tableColumnHeaderDto;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.flag_icon = null;
            } else {
                this.flag_icon = flagIconDto;
            }
            if ((i2 & 1) == 0) {
                this.table_instrument_name = null;
            } else {
                this.table_instrument_name = tableInstrumentNameDto;
            }
            if ((i2 & 2) == 0) {
                this.animated_appearance = null;
            } else {
                this.animated_appearance = animatedAppearanceDto;
            }
            if ((i2 & 4) == 0) {
                this.animated_reveal_text = null;
            } else {
                this.animated_reveal_text = animatedRevealTextDto;
            }
            if ((i2 & 8) == 0) {
                this.ticker_text = null;
            } else {
                this.ticker_text = tickerTextDto;
            }
            if ((i2 & 16) == 0) {
                this.chart_group = null;
            } else {
                this.chart_group = chartGroupDto;
            }
            if ((i2 & 32) == 0) {
                this.video_player = null;
            } else {
                this.video_player = videoPlayerDto;
            }
            if ((i2 & 64) == 0) {
                this.activity_feed_row = null;
            } else {
                this.activity_feed_row = activityFeedRowDto;
            }
            if ((i2 & 128) == 0) {
                this.radio_button = null;
            } else {
                this.radio_button = radioButtonDto;
            }
            if ((i2 & 256) == 0) {
                this.switch = null;
            } else {
                this.switch = switchDto;
            }
            if ((i2 & 512) == 0) {
                this.list = null;
            } else {
                this.list = listDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ButtonDto buttonDto = self.button;
            if (buttonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ButtonDto.Serializer.INSTANCE, buttonDto);
            }
            TextDto textDto = self.text;
            if (textDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TextDto.Serializer.INSTANCE, textDto);
            }
            VStackDto vStackDto = self.v_stack;
            if (vStackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, VStackDto.Serializer.INSTANCE, vStackDto);
            }
            HStackDto hStackDto = self.h_stack;
            if (hStackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, HStackDto.Serializer.INSTANCE, hStackDto);
            }
            DecoratorDto decoratorDto = self.decorator;
            if (decoratorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, DecoratorDto.Serializer.INSTANCE, decoratorDto);
            }
            CardDto cardDto = self.card;
            if (cardDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CardDto.Serializer.INSTANCE, cardDto);
            }
            ZStackDto zStackDto = self.z_stack;
            if (zStackDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ZStackDto.Serializer.INSTANCE, zStackDto);
            }
            ValuePropWithPictogramDto valuePropWithPictogramDto = self.value_prop_with_pictogram;
            if (valuePropWithPictogramDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ValuePropWithPictogramDto.Serializer.INSTANCE, valuePropWithPictogramDto);
            }
            ValuePropWithIconDto valuePropWithIconDto = self.value_prop_with_icon;
            if (valuePropWithIconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ValuePropWithIconDto.Serializer.INSTANCE, valuePropWithIconDto);
            }
            ValuePropWithNumberDto valuePropWithNumberDto = self.value_prop_with_number;
            if (valuePropWithNumberDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ValuePropWithNumberDto.Serializer.INSTANCE, valuePropWithNumberDto);
            }
            ImageDto imageDto = self.image;
            if (imageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ImageDto.Serializer.INSTANCE, imageDto);
            }
            LottieDto lottieDto = self.lottie;
            if (lottieDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, LottieDto.Serializer.INSTANCE, lottieDto);
            }
            InfoTagDto infoTagDto = self.info_tag;
            if (infoTagDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, InfoTagDto.Serializer.INSTANCE, infoTagDto);
            }
            NumberPogDto numberPogDto = self.number_pog;
            if (numberPogDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, NumberPogDto.Serializer.INSTANCE, numberPogDto);
            }
            TextPogDto textPogDto = self.text_pog;
            if (textPogDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, TextPogDto.Serializer.INSTANCE, textPogDto);
            }
            TimelineDto timelineDto = self.timeline;
            if (timelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, TimelineDto.Serializer.INSTANCE, timelineDto);
            }
            NavigationRowDto navigationRowDto = self.navigation_row;
            if (navigationRowDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, NavigationRowDto.Serializer.INSTANCE, navigationRowDto);
            }
            PogWithPictogramDto pogWithPictogramDto = self.pog_with_pictogram;
            if (pogWithPictogramDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, PogWithPictogramDto.Serializer.INSTANCE, pogWithPictogramDto);
            }
            TextButtonDto textButtonDto = self.text_button;
            if (textButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, TextButtonDto.Serializer.INSTANCE, textButtonDto);
            }
            IconButtonDto iconButtonDto = self.icon_button;
            if (iconButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, IconButtonDto.Serializer.INSTANCE, iconButtonDto);
            }
            TextInputDto textInputDto = self.text_input;
            if (textInputDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, TextInputDto.Serializer.INSTANCE, textInputDto);
            }
            SpacerDto spacerDto = self.spacer;
            if (spacerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, SpacerDto.Serializer.INSTANCE, spacerDto);
            }
            DataRowStackedDto dataRowStackedDto = self.data_row_stacked;
            if (dataRowStackedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 22, DataRowStackedDto.Serializer.INSTANCE, dataRowStackedDto);
            }
            DataRowCondensedDto dataRowCondensedDto = self.data_row_condensed;
            if (dataRowCondensedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 23, DataRowCondensedDto.Serializer.INSTANCE, dataRowCondensedDto);
            }
            CheckboxDto checkboxDto = self.checkbox;
            if (checkboxDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 24, CheckboxDto.Serializer.INSTANCE, checkboxDto);
            }
            ThemedComponentDto themedComponentDto = self.themed_component;
            if (themedComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 25, ThemedComponentDto.Serializer.INSTANCE, themedComponentDto);
            }
            ShimmerLoaderDto shimmerLoaderDto = self.shimmer_loader;
            if (shimmerLoaderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 26, ShimmerLoaderDto.Serializer.INSTANCE, shimmerLoaderDto);
            }
            InfoBannerDto infoBannerDto = self.info_banner;
            if (infoBannerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 27, InfoBannerDto.Serializer.INSTANCE, infoBannerDto);
            }
            CircularProgressDto circularProgressDto = self.circular_progress;
            if (circularProgressDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 28, CircularProgressDto.Serializer.INSTANCE, circularProgressDto);
            }
            MarginTieredInterestRatesDto marginTieredInterestRatesDto = self.margin_tiered_interest_rates;
            if (marginTieredInterestRatesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 29, MarginTieredInterestRatesDto.Serializer.INSTANCE, marginTieredInterestRatesDto);
            }
            TableColumnHeaderDto tableColumnHeaderDto = self.table_column_header;
            if (tableColumnHeaderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 30, TableColumnHeaderDto.Serializer.INSTANCE, tableColumnHeaderDto);
            }
            FlagIconDto flagIconDto = self.flag_icon;
            if (flagIconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 31, FlagIconDto.Serializer.INSTANCE, flagIconDto);
            }
            TableInstrumentNameDto tableInstrumentNameDto = self.table_instrument_name;
            if (tableInstrumentNameDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 32, TableInstrumentNameDto.Serializer.INSTANCE, tableInstrumentNameDto);
            }
            AnimatedAppearanceDto animatedAppearanceDto = self.animated_appearance;
            if (animatedAppearanceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 33, AnimatedAppearanceDto.Serializer.INSTANCE, animatedAppearanceDto);
            }
            AnimatedRevealTextDto animatedRevealTextDto = self.animated_reveal_text;
            if (animatedRevealTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 34, AnimatedRevealTextDto.Serializer.INSTANCE, animatedRevealTextDto);
            }
            TickerTextDto tickerTextDto = self.ticker_text;
            if (tickerTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 35, TickerTextDto.Serializer.INSTANCE, tickerTextDto);
            }
            ChartGroupDto chartGroupDto = self.chart_group;
            if (chartGroupDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 36, ChartGroupDto.Serializer.INSTANCE, chartGroupDto);
            }
            VideoPlayerDto videoPlayerDto = self.video_player;
            if (videoPlayerDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 37, VideoPlayerDto.Serializer.INSTANCE, videoPlayerDto);
            }
            ActivityFeedRowDto activityFeedRowDto = self.activity_feed_row;
            if (activityFeedRowDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 38, ActivityFeedRowDto.Serializer.INSTANCE, activityFeedRowDto);
            }
            RadioButtonDto radioButtonDto = self.radio_button;
            if (radioButtonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 39, RadioButtonDto.Serializer.INSTANCE, radioButtonDto);
            }
            SwitchDto switchDto = self.switch;
            if (switchDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 40, SwitchDto.Serializer.INSTANCE, switchDto);
            }
            ListDto listDto = self.list;
            if (listDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 41, ListDto.Serializer.INSTANCE, listDto);
            }
        }

        public Surrogate(ButtonDto buttonDto, TextDto textDto, VStackDto vStackDto, HStackDto hStackDto, DecoratorDto decoratorDto, CardDto cardDto, ZStackDto zStackDto, ValuePropWithPictogramDto valuePropWithPictogramDto, ValuePropWithIconDto valuePropWithIconDto, ValuePropWithNumberDto valuePropWithNumberDto, ImageDto imageDto, LottieDto lottieDto, InfoTagDto infoTagDto, NumberPogDto numberPogDto, TextPogDto textPogDto, TimelineDto timelineDto, NavigationRowDto navigationRowDto, PogWithPictogramDto pogWithPictogramDto, TextButtonDto textButtonDto, IconButtonDto iconButtonDto, TextInputDto textInputDto, SpacerDto spacerDto, DataRowStackedDto dataRowStackedDto, DataRowCondensedDto dataRowCondensedDto, CheckboxDto checkboxDto, ThemedComponentDto themedComponentDto, ShimmerLoaderDto shimmerLoaderDto, InfoBannerDto infoBannerDto, CircularProgressDto circularProgressDto, MarginTieredInterestRatesDto marginTieredInterestRatesDto, TableColumnHeaderDto tableColumnHeaderDto, FlagIconDto flagIconDto, TableInstrumentNameDto tableInstrumentNameDto, AnimatedAppearanceDto animatedAppearanceDto, AnimatedRevealTextDto animatedRevealTextDto, TickerTextDto tickerTextDto, ChartGroupDto chartGroupDto, VideoPlayerDto videoPlayerDto, ActivityFeedRowDto activityFeedRowDto, RadioButtonDto radioButtonDto, SwitchDto switchDto, ListDto listDto) {
            this.button = buttonDto;
            this.text = textDto;
            this.v_stack = vStackDto;
            this.h_stack = hStackDto;
            this.decorator = decoratorDto;
            this.card = cardDto;
            this.z_stack = zStackDto;
            this.value_prop_with_pictogram = valuePropWithPictogramDto;
            this.value_prop_with_icon = valuePropWithIconDto;
            this.value_prop_with_number = valuePropWithNumberDto;
            this.image = imageDto;
            this.lottie = lottieDto;
            this.info_tag = infoTagDto;
            this.number_pog = numberPogDto;
            this.text_pog = textPogDto;
            this.timeline = timelineDto;
            this.navigation_row = navigationRowDto;
            this.pog_with_pictogram = pogWithPictogramDto;
            this.text_button = textButtonDto;
            this.icon_button = iconButtonDto;
            this.text_input = textInputDto;
            this.spacer = spacerDto;
            this.data_row_stacked = dataRowStackedDto;
            this.data_row_condensed = dataRowCondensedDto;
            this.checkbox = checkboxDto;
            this.themed_component = themedComponentDto;
            this.shimmer_loader = shimmerLoaderDto;
            this.info_banner = infoBannerDto;
            this.circular_progress = circularProgressDto;
            this.margin_tiered_interest_rates = marginTieredInterestRatesDto;
            this.table_column_header = tableColumnHeaderDto;
            this.flag_icon = flagIconDto;
            this.table_instrument_name = tableInstrumentNameDto;
            this.animated_appearance = animatedAppearanceDto;
            this.animated_reveal_text = animatedRevealTextDto;
            this.ticker_text = tickerTextDto;
            this.chart_group = chartGroupDto;
            this.video_player = videoPlayerDto;
            this.activity_feed_row = activityFeedRowDto;
            this.radio_button = radioButtonDto;
            this.switch = switchDto;
            this.list = listDto;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Surrogate(ButtonDto buttonDto, TextDto textDto, VStackDto vStackDto, HStackDto hStackDto, DecoratorDto decoratorDto, CardDto cardDto, ZStackDto zStackDto, ValuePropWithPictogramDto valuePropWithPictogramDto, ValuePropWithIconDto valuePropWithIconDto, ValuePropWithNumberDto valuePropWithNumberDto, ImageDto imageDto, LottieDto lottieDto, InfoTagDto infoTagDto, NumberPogDto numberPogDto, TextPogDto textPogDto, TimelineDto timelineDto, NavigationRowDto navigationRowDto, PogWithPictogramDto pogWithPictogramDto, TextButtonDto textButtonDto, IconButtonDto iconButtonDto, TextInputDto textInputDto, SpacerDto spacerDto, DataRowStackedDto dataRowStackedDto, DataRowCondensedDto dataRowCondensedDto, CheckboxDto checkboxDto, ThemedComponentDto themedComponentDto, ShimmerLoaderDto shimmerLoaderDto, InfoBannerDto infoBannerDto, CircularProgressDto circularProgressDto, MarginTieredInterestRatesDto marginTieredInterestRatesDto, TableColumnHeaderDto tableColumnHeaderDto, FlagIconDto flagIconDto, TableInstrumentNameDto tableInstrumentNameDto, AnimatedAppearanceDto animatedAppearanceDto, AnimatedRevealTextDto animatedRevealTextDto, TickerTextDto tickerTextDto, ChartGroupDto chartGroupDto, VideoPlayerDto videoPlayerDto, ActivityFeedRowDto activityFeedRowDto, RadioButtonDto radioButtonDto, SwitchDto switchDto, ListDto listDto, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            ButtonDto buttonDto2 = (i & 1) != 0 ? null : buttonDto;
            this(buttonDto2, (i & 2) != 0 ? null : textDto, (i & 4) != 0 ? null : vStackDto, (i & 8) != 0 ? null : hStackDto, (i & 16) != 0 ? null : decoratorDto, (i & 32) != 0 ? null : cardDto, (i & 64) != 0 ? null : zStackDto, (i & 128) != 0 ? null : valuePropWithPictogramDto, (i & 256) != 0 ? null : valuePropWithIconDto, (i & 512) != 0 ? null : valuePropWithNumberDto, (i & 1024) != 0 ? null : imageDto, (i & 2048) != 0 ? null : lottieDto, (i & 4096) != 0 ? null : infoTagDto, (i & 8192) != 0 ? null : numberPogDto, (i & 16384) != 0 ? null : textPogDto, (i & 32768) != 0 ? null : timelineDto, (i & 65536) != 0 ? null : navigationRowDto, (i & 131072) != 0 ? null : pogWithPictogramDto, (i & 262144) != 0 ? null : textButtonDto, (i & 524288) != 0 ? null : iconButtonDto, (i & 1048576) != 0 ? null : textInputDto, (i & 2097152) != 0 ? null : spacerDto, (i & 4194304) != 0 ? null : dataRowStackedDto, (i & 8388608) != 0 ? null : dataRowCondensedDto, (i & 16777216) != 0 ? null : checkboxDto, (i & 33554432) != 0 ? null : themedComponentDto, (i & 67108864) != 0 ? null : shimmerLoaderDto, (i & 134217728) != 0 ? null : infoBannerDto, (i & 268435456) != 0 ? null : circularProgressDto, (i & 536870912) != 0 ? null : marginTieredInterestRatesDto, (i & 1073741824) != 0 ? null : tableColumnHeaderDto, (i & Integer.MIN_VALUE) != 0 ? null : flagIconDto, (i2 & 1) != 0 ? null : tableInstrumentNameDto, (i2 & 2) != 0 ? null : animatedAppearanceDto, (i2 & 4) != 0 ? null : animatedRevealTextDto, (i2 & 8) != 0 ? null : tickerTextDto, (i2 & 16) != 0 ? null : chartGroupDto, (i2 & 32) != 0 ? null : videoPlayerDto, (i2 & 64) != 0 ? null : activityFeedRowDto, (i2 & 128) != 0 ? null : radioButtonDto, (i2 & 256) != 0 ? null : switchDto, (i2 & 512) != 0 ? null : listDto);
        }

        public final ButtonDto getButton() {
            return this.button;
        }

        public final TextDto getText() {
            return this.text;
        }

        public final VStackDto getV_stack() {
            return this.v_stack;
        }

        public final HStackDto getH_stack() {
            return this.h_stack;
        }

        public final DecoratorDto getDecorator() {
            return this.decorator;
        }

        public final CardDto getCard() {
            return this.card;
        }

        public final ZStackDto getZ_stack() {
            return this.z_stack;
        }

        public final ValuePropWithPictogramDto getValue_prop_with_pictogram() {
            return this.value_prop_with_pictogram;
        }

        public final ValuePropWithIconDto getValue_prop_with_icon() {
            return this.value_prop_with_icon;
        }

        public final ValuePropWithNumberDto getValue_prop_with_number() {
            return this.value_prop_with_number;
        }

        public final ImageDto getImage() {
            return this.image;
        }

        public final LottieDto getLottie() {
            return this.lottie;
        }

        public final InfoTagDto getInfo_tag() {
            return this.info_tag;
        }

        public final NumberPogDto getNumber_pog() {
            return this.number_pog;
        }

        public final TextPogDto getText_pog() {
            return this.text_pog;
        }

        public final TimelineDto getTimeline() {
            return this.timeline;
        }

        public final NavigationRowDto getNavigation_row() {
            return this.navigation_row;
        }

        public final PogWithPictogramDto getPog_with_pictogram() {
            return this.pog_with_pictogram;
        }

        public final TextButtonDto getText_button() {
            return this.text_button;
        }

        public final IconButtonDto getIcon_button() {
            return this.icon_button;
        }

        public final TextInputDto getText_input() {
            return this.text_input;
        }

        public final SpacerDto getSpacer() {
            return this.spacer;
        }

        public final DataRowStackedDto getData_row_stacked() {
            return this.data_row_stacked;
        }

        public final DataRowCondensedDto getData_row_condensed() {
            return this.data_row_condensed;
        }

        public final CheckboxDto getCheckbox() {
            return this.checkbox;
        }

        public final ThemedComponentDto getThemed_component() {
            return this.themed_component;
        }

        public final ShimmerLoaderDto getShimmer_loader() {
            return this.shimmer_loader;
        }

        public final InfoBannerDto getInfo_banner() {
            return this.info_banner;
        }

        public final CircularProgressDto getCircular_progress() {
            return this.circular_progress;
        }

        public final MarginTieredInterestRatesDto getMargin_tiered_interest_rates() {
            return this.margin_tiered_interest_rates;
        }

        public final TableColumnHeaderDto getTable_column_header() {
            return this.table_column_header;
        }

        public final FlagIconDto getFlag_icon() {
            return this.flag_icon;
        }

        public final TableInstrumentNameDto getTable_instrument_name() {
            return this.table_instrument_name;
        }

        public final AnimatedAppearanceDto getAnimated_appearance() {
            return this.animated_appearance;
        }

        public final AnimatedRevealTextDto getAnimated_reveal_text() {
            return this.animated_reveal_text;
        }

        public final TickerTextDto getTicker_text() {
            return this.ticker_text;
        }

        public final ChartGroupDto getChart_group() {
            return this.chart_group;
        }

        public final VideoPlayerDto getVideo_player() {
            return this.video_player;
        }

        public final ActivityFeedRowDto getActivity_feed_row() {
            return this.activity_feed_row;
        }

        public final RadioButtonDto getRadio_button() {
            return this.radio_button;
        }

        public final SwitchDto getSwitch() {
            return this.switch;
        }

        public final ListDto getList() {
            return this.list;
        }
    }

    /* compiled from: UIComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/UIComponentDto;", "Lrh_server_driven_ui/v1/UIComponent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/UIComponentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UIComponentDto, UIComponent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UIComponentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UIComponentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UIComponentDto> getBinaryBase64Serializer() {
            return (KSerializer) UIComponentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UIComponent> getProtoAdapter() {
            return UIComponent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UIComponentDto getZeroValue() {
            return UIComponentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UIComponentDto fromProto(UIComponent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Button button = proto.getButton();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ButtonDto buttonDtoFromProto = button != null ? ButtonDto.INSTANCE.fromProto(button) : null;
            Text text = proto.getText();
            TextDto textDtoFromProto = text != null ? TextDto.INSTANCE.fromProto(text) : null;
            VStack v_stack = proto.getV_stack();
            VStackDto vStackDtoFromProto = v_stack != null ? VStackDto.INSTANCE.fromProto(v_stack) : null;
            HStack h_stack = proto.getH_stack();
            HStackDto hStackDtoFromProto = h_stack != null ? HStackDto.INSTANCE.fromProto(h_stack) : null;
            Decorator decorator = proto.getDecorator();
            DecoratorDto decoratorDtoFromProto = decorator != null ? DecoratorDto.INSTANCE.fromProto(decorator) : null;
            Card card = proto.getCard();
            CardDto cardDtoFromProto = card != null ? CardDto.INSTANCE.fromProto(card) : null;
            ZStack z_stack = proto.getZ_stack();
            ZStackDto zStackDtoFromProto = z_stack != null ? ZStackDto.INSTANCE.fromProto(z_stack) : null;
            ValuePropWithPictogram value_prop_with_pictogram = proto.getValue_prop_with_pictogram();
            ValuePropWithPictogramDto valuePropWithPictogramDtoFromProto = value_prop_with_pictogram != null ? ValuePropWithPictogramDto.INSTANCE.fromProto(value_prop_with_pictogram) : null;
            ValuePropWithIcon value_prop_with_icon = proto.getValue_prop_with_icon();
            ValuePropWithIconDto valuePropWithIconDtoFromProto = value_prop_with_icon != null ? ValuePropWithIconDto.INSTANCE.fromProto(value_prop_with_icon) : null;
            ValuePropWithNumber value_prop_with_number = proto.getValue_prop_with_number();
            ValuePropWithNumberDto valuePropWithNumberDtoFromProto = value_prop_with_number != null ? ValuePropWithNumberDto.INSTANCE.fromProto(value_prop_with_number) : null;
            Image image = proto.getImage();
            ImageDto imageDtoFromProto = image != null ? ImageDto.INSTANCE.fromProto(image) : null;
            Lottie lottie = proto.getLottie();
            LottieDto lottieDtoFromProto = lottie != null ? LottieDto.INSTANCE.fromProto(lottie) : null;
            InfoTag info_tag = proto.getInfo_tag();
            InfoTagDto infoTagDtoFromProto = info_tag != null ? InfoTagDto.INSTANCE.fromProto(info_tag) : null;
            NumberPog number_pog = proto.getNumber_pog();
            NumberPogDto numberPogDtoFromProto = number_pog != null ? NumberPogDto.INSTANCE.fromProto(number_pog) : null;
            TextPog text_pog = proto.getText_pog();
            TextPogDto textPogDtoFromProto = text_pog != null ? TextPogDto.INSTANCE.fromProto(text_pog) : null;
            Timeline timeline = proto.getTimeline();
            TimelineDto timelineDtoFromProto = timeline != null ? TimelineDto.INSTANCE.fromProto(timeline) : null;
            NavigationRow navigation_row = proto.getNavigation_row();
            NavigationRowDto navigationRowDtoFromProto = navigation_row != null ? NavigationRowDto.INSTANCE.fromProto(navigation_row) : null;
            PogWithPictogram pog_with_pictogram = proto.getPog_with_pictogram();
            PogWithPictogramDto pogWithPictogramDtoFromProto = pog_with_pictogram != null ? PogWithPictogramDto.INSTANCE.fromProto(pog_with_pictogram) : null;
            TextButton text_button = proto.getText_button();
            TextButtonDto textButtonDtoFromProto = text_button != null ? TextButtonDto.INSTANCE.fromProto(text_button) : null;
            IconButton icon_button = proto.getIcon_button();
            IconButtonDto iconButtonDtoFromProto = icon_button != null ? IconButtonDto.INSTANCE.fromProto(icon_button) : null;
            TextInput text_input = proto.getText_input();
            TextInputDto textInputDtoFromProto = text_input != null ? TextInputDto.INSTANCE.fromProto(text_input) : null;
            Spacer spacer = proto.getSpacer();
            SpacerDto spacerDtoFromProto = spacer != null ? SpacerDto.INSTANCE.fromProto(spacer) : null;
            DataRowStacked data_row_stacked = proto.getData_row_stacked();
            DataRowStackedDto dataRowStackedDtoFromProto = data_row_stacked != null ? DataRowStackedDto.INSTANCE.fromProto(data_row_stacked) : null;
            DataRowCondensed data_row_condensed = proto.getData_row_condensed();
            DataRowCondensedDto dataRowCondensedDtoFromProto = data_row_condensed != null ? DataRowCondensedDto.INSTANCE.fromProto(data_row_condensed) : null;
            Checkbox checkbox = proto.getCheckbox();
            CheckboxDto checkboxDtoFromProto = checkbox != null ? CheckboxDto.INSTANCE.fromProto(checkbox) : null;
            ThemedComponent themed_component = proto.getThemed_component();
            ThemedComponentDto themedComponentDtoFromProto = themed_component != null ? ThemedComponentDto.INSTANCE.fromProto(themed_component) : null;
            ShimmerLoader shimmer_loader = proto.getShimmer_loader();
            ShimmerLoaderDto shimmerLoaderDtoFromProto = shimmer_loader != null ? ShimmerLoaderDto.INSTANCE.fromProto(shimmer_loader) : null;
            InfoBanner info_banner = proto.getInfo_banner();
            InfoBannerDto infoBannerDtoFromProto = info_banner != null ? InfoBannerDto.INSTANCE.fromProto(info_banner) : null;
            CircularProgress circular_progress = proto.getCircular_progress();
            CircularProgressDto circularProgressDtoFromProto = circular_progress != null ? CircularProgressDto.INSTANCE.fromProto(circular_progress) : null;
            MarginTieredInterestRates margin_tiered_interest_rates = proto.getMargin_tiered_interest_rates();
            MarginTieredInterestRatesDto marginTieredInterestRatesDtoFromProto = margin_tiered_interest_rates != null ? MarginTieredInterestRatesDto.INSTANCE.fromProto(margin_tiered_interest_rates) : null;
            TableColumnHeader table_column_header = proto.getTable_column_header();
            TableColumnHeaderDto tableColumnHeaderDtoFromProto = table_column_header != null ? TableColumnHeaderDto.INSTANCE.fromProto(table_column_header) : null;
            FlagIcon flag_icon = proto.getFlag_icon();
            FlagIconDto flagIconDtoFromProto = flag_icon != null ? FlagIconDto.INSTANCE.fromProto(flag_icon) : null;
            TableInstrumentName table_instrument_name = proto.getTable_instrument_name();
            TableInstrumentNameDto tableInstrumentNameDtoFromProto = table_instrument_name != null ? TableInstrumentNameDto.INSTANCE.fromProto(table_instrument_name) : null;
            AnimatedAppearance animated_appearance = proto.getAnimated_appearance();
            AnimatedAppearanceDto animatedAppearanceDtoFromProto = animated_appearance != null ? AnimatedAppearanceDto.INSTANCE.fromProto(animated_appearance) : null;
            AnimatedRevealText animated_reveal_text = proto.getAnimated_reveal_text();
            AnimatedRevealTextDto animatedRevealTextDtoFromProto = animated_reveal_text != null ? AnimatedRevealTextDto.INSTANCE.fromProto(animated_reveal_text) : null;
            TickerText ticker_text = proto.getTicker_text();
            TickerTextDto tickerTextDtoFromProto = ticker_text != null ? TickerTextDto.INSTANCE.fromProto(ticker_text) : null;
            ChartGroup chart_group = proto.getChart_group();
            ChartGroupDto chartGroupDtoFromProto = chart_group != null ? ChartGroupDto.INSTANCE.fromProto(chart_group) : null;
            VideoPlayer video_player = proto.getVideo_player();
            VideoPlayerDto videoPlayerDtoFromProto = video_player != null ? VideoPlayerDto.INSTANCE.fromProto(video_player) : null;
            ActivityFeedRow activity_feed_row = proto.getActivity_feed_row();
            ActivityFeedRowDto activityFeedRowDtoFromProto = activity_feed_row != null ? ActivityFeedRowDto.INSTANCE.fromProto(activity_feed_row) : null;
            RadioButton radio_button = proto.getRadio_button();
            RadioButtonDto radioButtonDtoFromProto = radio_button != null ? RadioButtonDto.INSTANCE.fromProto(radio_button) : null;
            Switch r0 = proto.getSwitch();
            SwitchDto switchDtoFromProto = r0 != null ? SwitchDto.INSTANCE.fromProto(r0) : null;
            List list = proto.getList();
            return new UIComponentDto(new Surrogate(buttonDtoFromProto, textDtoFromProto, vStackDtoFromProto, hStackDtoFromProto, decoratorDtoFromProto, cardDtoFromProto, zStackDtoFromProto, valuePropWithPictogramDtoFromProto, valuePropWithIconDtoFromProto, valuePropWithNumberDtoFromProto, imageDtoFromProto, lottieDtoFromProto, infoTagDtoFromProto, numberPogDtoFromProto, textPogDtoFromProto, timelineDtoFromProto, navigationRowDtoFromProto, pogWithPictogramDtoFromProto, textButtonDtoFromProto, iconButtonDtoFromProto, textInputDtoFromProto, spacerDtoFromProto, dataRowStackedDtoFromProto, dataRowCondensedDtoFromProto, checkboxDtoFromProto, themedComponentDtoFromProto, shimmerLoaderDtoFromProto, infoBannerDtoFromProto, circularProgressDtoFromProto, marginTieredInterestRatesDtoFromProto, tableColumnHeaderDtoFromProto, flagIconDtoFromProto, tableInstrumentNameDtoFromProto, animatedAppearanceDtoFromProto, animatedRevealTextDtoFromProto, tickerTextDtoFromProto, chartGroupDtoFromProto, videoPlayerDtoFromProto, activityFeedRowDtoFromProto, radioButtonDtoFromProto, switchDtoFromProto, list != null ? ListDto.INSTANCE.fromProto(list) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.UIComponentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UIComponentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UIComponentDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: UIComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 .2\u00020\u0001:+\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001*/0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWX¨\u0006Y"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Button", "Text", "VStack", "HStack", "Decorator", "Card", "ZStack", "ValuePropWithPictogram", "ValuePropWithIcon", "ValuePropWithNumber", "Image", "Lottie", "InfoTag", "NumberPog", "TextPog", "Timeline", "NavigationRow", "PogWithPictogram", "TextButton", "IconButton", "TextInput", "Spacer", "DataRowStacked", "DataRowCondensed", "Checkbox", "ThemedComponent", "ShimmerLoader", "InfoBanner", "CircularProgress", "MarginTieredInterestRates", "TableColumnHeader", "FlagIcon", "TableInstrumentName", "AnimatedAppearance", "AnimatedRevealText", "TickerText", "ChartGroup", "VideoPlayer", "ActivityFeedRow", "RadioButton", "Switch", "List", "Companion", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ActivityFeedRow;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$AnimatedAppearance;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$AnimatedRevealText;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Button;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Card;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ChartGroup;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Checkbox;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$CircularProgress;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$DataRowCondensed;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$DataRowStacked;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Decorator;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$FlagIcon;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$HStack;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$IconButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Image;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$InfoBanner;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$InfoTag;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$List;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Lottie;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$MarginTieredInterestRates;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$NavigationRow;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$NumberPog;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$PogWithPictogram;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$RadioButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ShimmerLoader;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Spacer;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Switch;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TableColumnHeader;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TableInstrumentName;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Text;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextInput;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextPog;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ThemedComponent;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TickerText;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Timeline;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$VStack;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithIcon;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithNumber;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithPictogram;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$VideoPlayer;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ZStack;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ConcreteDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ConcreteDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConcreteDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Button;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ButtonDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ButtonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ButtonDto;", "getValue", "()Lrh_server_driven_ui/v1/ButtonDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Button extends ConcreteDto {
            private final ButtonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Button) && Intrinsics.areEqual(this.value, ((Button) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Button(value=" + this.value + ")";
            }

            public final ButtonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(ButtonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Text;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TextDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextDto;", "getValue", "()Lrh_server_driven_ui/v1/TextDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Text extends ConcreteDto {
            private final TextDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.value, ((Text) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Text(value=" + this.value + ")";
            }

            public final TextDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(TextDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$VStack;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/VStackDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/VStackDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/VStackDto;", "getValue", "()Lrh_server_driven_ui/v1/VStackDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class VStack extends ConcreteDto {
            private final VStackDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VStack) && Intrinsics.areEqual(this.value, ((VStack) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "VStack(value=" + this.value + ")";
            }

            public final VStackDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VStack(VStackDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$HStack;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/HStackDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/HStackDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/HStackDto;", "getValue", "()Lrh_server_driven_ui/v1/HStackDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HStack extends ConcreteDto {
            private final HStackDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HStack) && Intrinsics.areEqual(this.value, ((HStack) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "HStack(value=" + this.value + ")";
            }

            public final HStackDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HStack(HStackDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Decorator;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/DecoratorDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DecoratorDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DecoratorDto;", "getValue", "()Lrh_server_driven_ui/v1/DecoratorDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Decorator extends ConcreteDto {
            private final DecoratorDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Decorator) && Intrinsics.areEqual(this.value, ((Decorator) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Decorator(value=" + this.value + ")";
            }

            public final DecoratorDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Decorator(DecoratorDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Card;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/CardDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/CardDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/CardDto;", "getValue", "()Lrh_server_driven_ui/v1/CardDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Card extends ConcreteDto {
            private final CardDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Card) && Intrinsics.areEqual(this.value, ((Card) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Card(value=" + this.value + ")";
            }

            public final CardDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Card(CardDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ZStack;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ZStackDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ZStackDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ZStackDto;", "getValue", "()Lrh_server_driven_ui/v1/ZStackDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ZStack extends ConcreteDto {
            private final ZStackDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ZStack) && Intrinsics.areEqual(this.value, ((ZStack) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ZStack(value=" + this.value + ")";
            }

            public final ZStackDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ZStack(ZStackDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithPictogram;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "getValue", "()Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValuePropWithPictogram extends ConcreteDto {
            private final ValuePropWithPictogramDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValuePropWithPictogram) && Intrinsics.areEqual(this.value, ((ValuePropWithPictogram) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ValuePropWithPictogram(value=" + this.value + ")";
            }

            public final ValuePropWithPictogramDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValuePropWithPictogram(ValuePropWithPictogramDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithIcon;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ValuePropWithIconDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "getValue", "()Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValuePropWithIcon extends ConcreteDto {
            private final ValuePropWithIconDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValuePropWithIcon) && Intrinsics.areEqual(this.value, ((ValuePropWithIcon) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ValuePropWithIcon(value=" + this.value + ")";
            }

            public final ValuePropWithIconDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValuePropWithIcon(ValuePropWithIconDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ValuePropWithNumber;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ValuePropWithNumberDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "getValue", "()Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ValuePropWithNumber extends ConcreteDto {
            private final ValuePropWithNumberDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ValuePropWithNumber) && Intrinsics.areEqual(this.value, ((ValuePropWithNumber) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ValuePropWithNumber(value=" + this.value + ")";
            }

            public final ValuePropWithNumberDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ValuePropWithNumber(ValuePropWithNumberDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Image;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ImageDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ImageDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ImageDto;", "getValue", "()Lrh_server_driven_ui/v1/ImageDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Image extends ConcreteDto {
            private final ImageDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Image) && Intrinsics.areEqual(this.value, ((Image) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Image(value=" + this.value + ")";
            }

            public final ImageDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(ImageDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Lottie;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/LottieDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/LottieDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/LottieDto;", "getValue", "()Lrh_server_driven_ui/v1/LottieDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Lottie extends ConcreteDto {
            private final LottieDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Lottie) && Intrinsics.areEqual(this.value, ((Lottie) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Lottie(value=" + this.value + ")";
            }

            public final LottieDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Lottie(LottieDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$InfoTag;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/InfoTagDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/InfoTagDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/InfoTagDto;", "getValue", "()Lrh_server_driven_ui/v1/InfoTagDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InfoTag extends ConcreteDto {
            private final InfoTagDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoTag) && Intrinsics.areEqual(this.value, ((InfoTag) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InfoTag(value=" + this.value + ")";
            }

            public final InfoTagDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoTag(InfoTagDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$NumberPog;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/NumberPogDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/NumberPogDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/NumberPogDto;", "getValue", "()Lrh_server_driven_ui/v1/NumberPogDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NumberPog extends ConcreteDto {
            private final NumberPogDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NumberPog) && Intrinsics.areEqual(this.value, ((NumberPog) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NumberPog(value=" + this.value + ")";
            }

            public final NumberPogDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NumberPog(NumberPogDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextPog;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TextPogDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextPogDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextPogDto;", "getValue", "()Lrh_server_driven_ui/v1/TextPogDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextPog extends ConcreteDto {
            private final TextPogDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextPog) && Intrinsics.areEqual(this.value, ((TextPog) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextPog(value=" + this.value + ")";
            }

            public final TextPogDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextPog(TextPogDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Timeline;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TimelineDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TimelineDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TimelineDto;", "getValue", "()Lrh_server_driven_ui/v1/TimelineDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Timeline extends ConcreteDto {
            private final TimelineDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Timeline) && Intrinsics.areEqual(this.value, ((Timeline) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Timeline(value=" + this.value + ")";
            }

            public final TimelineDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Timeline(TimelineDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$NavigationRow;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/NavigationRowDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/NavigationRowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/NavigationRowDto;", "getValue", "()Lrh_server_driven_ui/v1/NavigationRowDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NavigationRow extends ConcreteDto {
            private final NavigationRowDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NavigationRow) && Intrinsics.areEqual(this.value, ((NavigationRow) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NavigationRow(value=" + this.value + ")";
            }

            public final NavigationRowDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavigationRow(NavigationRowDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$PogWithPictogram;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/PogWithPictogramDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "getValue", "()Lrh_server_driven_ui/v1/PogWithPictogramDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PogWithPictogram extends ConcreteDto {
            private final PogWithPictogramDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PogWithPictogram) && Intrinsics.areEqual(this.value, ((PogWithPictogram) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PogWithPictogram(value=" + this.value + ")";
            }

            public final PogWithPictogramDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PogWithPictogram(PogWithPictogramDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TextButtonDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextButtonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextButtonDto;", "getValue", "()Lrh_server_driven_ui/v1/TextButtonDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextButton extends ConcreteDto {
            private final TextButtonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextButton) && Intrinsics.areEqual(this.value, ((TextButton) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextButton(value=" + this.value + ")";
            }

            public final TextButtonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextButton(TextButtonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$IconButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/IconButtonDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/IconButtonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconButtonDto;", "getValue", "()Lrh_server_driven_ui/v1/IconButtonDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class IconButton extends ConcreteDto {
            private final IconButtonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof IconButton) && Intrinsics.areEqual(this.value, ((IconButton) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "IconButton(value=" + this.value + ")";
            }

            public final IconButtonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IconButton(IconButtonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TextInput;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TextInputDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TextInputDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TextInputDto;", "getValue", "()Lrh_server_driven_ui/v1/TextInputDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TextInput extends ConcreteDto {
            private final TextInputDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TextInput) && Intrinsics.areEqual(this.value, ((TextInput) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TextInput(value=" + this.value + ")";
            }

            public final TextInputDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextInput(TextInputDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Spacer;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/SpacerDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/SpacerDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/SpacerDto;", "getValue", "()Lrh_server_driven_ui/v1/SpacerDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Spacer extends ConcreteDto {
            private final SpacerDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Spacer) && Intrinsics.areEqual(this.value, ((Spacer) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Spacer(value=" + this.value + ")";
            }

            public final SpacerDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Spacer(SpacerDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$DataRowStacked;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DataRowStackedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DataRowStackedDto;", "getValue", "()Lrh_server_driven_ui/v1/DataRowStackedDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DataRowStacked extends ConcreteDto {
            private final DataRowStackedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DataRowStacked) && Intrinsics.areEqual(this.value, ((DataRowStacked) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DataRowStacked(value=" + this.value + ")";
            }

            public final DataRowStackedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataRowStacked(DataRowStackedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$DataRowCondensed;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/DataRowCondensedDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DataRowCondensedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DataRowCondensedDto;", "getValue", "()Lrh_server_driven_ui/v1/DataRowCondensedDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DataRowCondensed extends ConcreteDto {
            private final DataRowCondensedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DataRowCondensed) && Intrinsics.areEqual(this.value, ((DataRowCondensed) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DataRowCondensed(value=" + this.value + ")";
            }

            public final DataRowCondensedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataRowCondensed(DataRowCondensedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Checkbox;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/CheckboxDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/CheckboxDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/CheckboxDto;", "getValue", "()Lrh_server_driven_ui/v1/CheckboxDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Checkbox extends ConcreteDto {
            private final CheckboxDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Checkbox) && Intrinsics.areEqual(this.value, ((Checkbox) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Checkbox(value=" + this.value + ")";
            }

            public final CheckboxDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Checkbox(CheckboxDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ThemedComponent;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ThemedComponentDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ThemedComponentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedComponentDto;", "getValue", "()Lrh_server_driven_ui/v1/ThemedComponentDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ThemedComponent extends ConcreteDto {
            private final ThemedComponentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThemedComponent) && Intrinsics.areEqual(this.value, ((ThemedComponent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ThemedComponent(value=" + this.value + ")";
            }

            public final ThemedComponentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThemedComponent(ThemedComponentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ShimmerLoader;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ShimmerLoaderDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "getValue", "()Lrh_server_driven_ui/v1/ShimmerLoaderDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShimmerLoader extends ConcreteDto {
            private final ShimmerLoaderDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ShimmerLoader) && Intrinsics.areEqual(this.value, ((ShimmerLoader) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ShimmerLoader(value=" + this.value + ")";
            }

            public final ShimmerLoaderDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShimmerLoader(ShimmerLoaderDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$InfoBanner;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/InfoBannerDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/InfoBannerDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/InfoBannerDto;", "getValue", "()Lrh_server_driven_ui/v1/InfoBannerDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InfoBanner extends ConcreteDto {
            private final InfoBannerDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InfoBanner) && Intrinsics.areEqual(this.value, ((InfoBanner) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InfoBanner(value=" + this.value + ")";
            }

            public final InfoBannerDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InfoBanner(InfoBannerDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$CircularProgress;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/CircularProgressDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/CircularProgressDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/CircularProgressDto;", "getValue", "()Lrh_server_driven_ui/v1/CircularProgressDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class CircularProgress extends ConcreteDto {
            private final CircularProgressDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CircularProgress) && Intrinsics.areEqual(this.value, ((CircularProgress) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CircularProgress(value=" + this.value + ")";
            }

            public final CircularProgressDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CircularProgress(CircularProgressDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$MarginTieredInterestRates;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "getValue", "()Lrh_server_driven_ui/v1/MarginTieredInterestRatesDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class MarginTieredInterestRates extends ConcreteDto {
            private final MarginTieredInterestRatesDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarginTieredInterestRates) && Intrinsics.areEqual(this.value, ((MarginTieredInterestRates) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MarginTieredInterestRates(value=" + this.value + ")";
            }

            public final MarginTieredInterestRatesDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarginTieredInterestRates(MarginTieredInterestRatesDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TableColumnHeader;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TableColumnHeaderDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "getValue", "()Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class TableColumnHeader extends ConcreteDto {
            private final TableColumnHeaderDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TableColumnHeader) && Intrinsics.areEqual(this.value, ((TableColumnHeader) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TableColumnHeader(value=" + this.value + ")";
            }

            public final TableColumnHeaderDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TableColumnHeader(TableColumnHeaderDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$FlagIcon;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/FlagIconDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/FlagIconDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/FlagIconDto;", "getValue", "()Lrh_server_driven_ui/v1/FlagIconDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class FlagIcon extends ConcreteDto {
            private final FlagIconDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FlagIcon) && Intrinsics.areEqual(this.value, ((FlagIcon) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "FlagIcon(value=" + this.value + ")";
            }

            public final FlagIconDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FlagIcon(FlagIconDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TableInstrumentName;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TableInstrumentNameDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "getValue", "()Lrh_server_driven_ui/v1/TableInstrumentNameDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class TableInstrumentName extends ConcreteDto {
            private final TableInstrumentNameDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TableInstrumentName) && Intrinsics.areEqual(this.value, ((TableInstrumentName) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TableInstrumentName(value=" + this.value + ")";
            }

            public final TableInstrumentNameDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TableInstrumentName(TableInstrumentNameDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$AnimatedAppearance;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearanceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "getValue", "()Lrh_server_driven_ui/v1/AnimatedAppearanceDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class AnimatedAppearance extends ConcreteDto {
            private final AnimatedAppearanceDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AnimatedAppearance) && Intrinsics.areEqual(this.value, ((AnimatedAppearance) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AnimatedAppearance(value=" + this.value + ")";
            }

            public final AnimatedAppearanceDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnimatedAppearance(AnimatedAppearanceDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$AnimatedRevealText;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/AnimatedRevealTextDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "getValue", "()Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class AnimatedRevealText extends ConcreteDto {
            private final AnimatedRevealTextDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AnimatedRevealText) && Intrinsics.areEqual(this.value, ((AnimatedRevealText) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AnimatedRevealText(value=" + this.value + ")";
            }

            public final AnimatedRevealTextDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnimatedRevealText(AnimatedRevealTextDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$TickerText;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/TickerTextDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/TickerTextDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TickerTextDto;", "getValue", "()Lrh_server_driven_ui/v1/TickerTextDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class TickerText extends ConcreteDto {
            private final TickerTextDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TickerText) && Intrinsics.areEqual(this.value, ((TickerText) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "TickerText(value=" + this.value + ")";
            }

            public final TickerTextDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TickerText(TickerTextDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ChartGroup;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ChartGroupDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ChartGroupDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ChartGroupDto;", "getValue", "()Lrh_server_driven_ui/v1/ChartGroupDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class ChartGroup extends ConcreteDto {
            private final ChartGroupDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ChartGroup) && Intrinsics.areEqual(this.value, ((ChartGroup) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ChartGroup(value=" + this.value + ")";
            }

            public final ChartGroupDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ChartGroup(ChartGroupDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$VideoPlayer;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/VideoPlayerDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/VideoPlayerDto;", "getValue", "()Lrh_server_driven_ui/v1/VideoPlayerDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class VideoPlayer extends ConcreteDto {
            private final VideoPlayerDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof VideoPlayer) && Intrinsics.areEqual(this.value, ((VideoPlayer) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "VideoPlayer(value=" + this.value + ")";
            }

            public final VideoPlayerDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoPlayer(VideoPlayerDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$ActivityFeedRow;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ActivityFeedRowDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "getValue", "()Lrh_server_driven_ui/v1/ActivityFeedRowDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class ActivityFeedRow extends ConcreteDto {
            private final ActivityFeedRowDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ActivityFeedRow) && Intrinsics.areEqual(this.value, ((ActivityFeedRow) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ActivityFeedRow(value=" + this.value + ")";
            }

            public final ActivityFeedRowDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityFeedRow(ActivityFeedRowDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$RadioButton;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/RadioButtonDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/RadioButtonDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/RadioButtonDto;", "getValue", "()Lrh_server_driven_ui/v1/RadioButtonDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class RadioButton extends ConcreteDto {
            private final RadioButtonDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RadioButton) && Intrinsics.areEqual(this.value, ((RadioButton) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RadioButton(value=" + this.value + ")";
            }

            public final RadioButtonDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RadioButton(RadioButtonDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Switch;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/SwitchDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/SwitchDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/SwitchDto;", "getValue", "()Lrh_server_driven_ui/v1/SwitchDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class Switch extends ConcreteDto {
            private final SwitchDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Switch) && Intrinsics.areEqual(this.value, ((Switch) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Switch(value=" + this.value + ")";
            }

            public final SwitchDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Switch(SwitchDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$List;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/ListDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/ListDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ListDto;", "getValue", "()Lrh_server_driven_ui/v1/ListDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final /* data */ class List extends ConcreteDto {
            private final ListDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof List) && Intrinsics.areEqual(this.value, ((List) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "List(value=" + this.value + ")";
            }

            public final ListDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public List(ListDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: UIComponentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "Lrh_server_driven_ui/v1/UIComponent;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto4.Creator<ConcreteDto, UIComponent> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<UIComponent> getProtoAdapter() {
                return UIComponent.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ConcreteDto fromProto(UIComponent proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getButton() != null) {
                    return new Button(ButtonDto.INSTANCE.fromProto(proto.getButton()));
                }
                if (proto.getText() != null) {
                    return new Text(TextDto.INSTANCE.fromProto(proto.getText()));
                }
                if (proto.getV_stack() != null) {
                    return new VStack(VStackDto.INSTANCE.fromProto(proto.getV_stack()));
                }
                if (proto.getH_stack() != null) {
                    return new HStack(HStackDto.INSTANCE.fromProto(proto.getH_stack()));
                }
                if (proto.getDecorator() != null) {
                    return new Decorator(DecoratorDto.INSTANCE.fromProto(proto.getDecorator()));
                }
                if (proto.getCard() != null) {
                    return new Card(CardDto.INSTANCE.fromProto(proto.getCard()));
                }
                if (proto.getZ_stack() != null) {
                    return new ZStack(ZStackDto.INSTANCE.fromProto(proto.getZ_stack()));
                }
                if (proto.getValue_prop_with_pictogram() != null) {
                    return new ValuePropWithPictogram(ValuePropWithPictogramDto.INSTANCE.fromProto(proto.getValue_prop_with_pictogram()));
                }
                if (proto.getValue_prop_with_icon() != null) {
                    return new ValuePropWithIcon(ValuePropWithIconDto.INSTANCE.fromProto(proto.getValue_prop_with_icon()));
                }
                if (proto.getValue_prop_with_number() != null) {
                    return new ValuePropWithNumber(ValuePropWithNumberDto.INSTANCE.fromProto(proto.getValue_prop_with_number()));
                }
                if (proto.getImage() != null) {
                    return new Image(ImageDto.INSTANCE.fromProto(proto.getImage()));
                }
                if (proto.getLottie() != null) {
                    return new Lottie(LottieDto.INSTANCE.fromProto(proto.getLottie()));
                }
                if (proto.getInfo_tag() != null) {
                    return new InfoTag(InfoTagDto.INSTANCE.fromProto(proto.getInfo_tag()));
                }
                if (proto.getNumber_pog() != null) {
                    return new NumberPog(NumberPogDto.INSTANCE.fromProto(proto.getNumber_pog()));
                }
                if (proto.getText_pog() != null) {
                    return new TextPog(TextPogDto.INSTANCE.fromProto(proto.getText_pog()));
                }
                if (proto.getTimeline() != null) {
                    return new Timeline(TimelineDto.INSTANCE.fromProto(proto.getTimeline()));
                }
                if (proto.getNavigation_row() != null) {
                    return new NavigationRow(NavigationRowDto.INSTANCE.fromProto(proto.getNavigation_row()));
                }
                if (proto.getPog_with_pictogram() != null) {
                    return new PogWithPictogram(PogWithPictogramDto.INSTANCE.fromProto(proto.getPog_with_pictogram()));
                }
                if (proto.getText_button() != null) {
                    return new TextButton(TextButtonDto.INSTANCE.fromProto(proto.getText_button()));
                }
                if (proto.getIcon_button() != null) {
                    return new IconButton(IconButtonDto.INSTANCE.fromProto(proto.getIcon_button()));
                }
                if (proto.getText_input() != null) {
                    return new TextInput(TextInputDto.INSTANCE.fromProto(proto.getText_input()));
                }
                if (proto.getSpacer() != null) {
                    return new Spacer(SpacerDto.INSTANCE.fromProto(proto.getSpacer()));
                }
                if (proto.getData_row_stacked() != null) {
                    return new DataRowStacked(DataRowStackedDto.INSTANCE.fromProto(proto.getData_row_stacked()));
                }
                if (proto.getData_row_condensed() != null) {
                    return new DataRowCondensed(DataRowCondensedDto.INSTANCE.fromProto(proto.getData_row_condensed()));
                }
                if (proto.getCheckbox() != null) {
                    return new Checkbox(CheckboxDto.INSTANCE.fromProto(proto.getCheckbox()));
                }
                if (proto.getThemed_component() != null) {
                    return new ThemedComponent(ThemedComponentDto.INSTANCE.fromProto(proto.getThemed_component()));
                }
                if (proto.getShimmer_loader() != null) {
                    return new ShimmerLoader(ShimmerLoaderDto.INSTANCE.fromProto(proto.getShimmer_loader()));
                }
                if (proto.getInfo_banner() != null) {
                    return new InfoBanner(InfoBannerDto.INSTANCE.fromProto(proto.getInfo_banner()));
                }
                if (proto.getCircular_progress() != null) {
                    return new CircularProgress(CircularProgressDto.INSTANCE.fromProto(proto.getCircular_progress()));
                }
                if (proto.getMargin_tiered_interest_rates() != null) {
                    return new MarginTieredInterestRates(MarginTieredInterestRatesDto.INSTANCE.fromProto(proto.getMargin_tiered_interest_rates()));
                }
                if (proto.getTable_column_header() != null) {
                    return new TableColumnHeader(TableColumnHeaderDto.INSTANCE.fromProto(proto.getTable_column_header()));
                }
                if (proto.getFlag_icon() != null) {
                    return new FlagIcon(FlagIconDto.INSTANCE.fromProto(proto.getFlag_icon()));
                }
                if (proto.getTable_instrument_name() != null) {
                    return new TableInstrumentName(TableInstrumentNameDto.INSTANCE.fromProto(proto.getTable_instrument_name()));
                }
                if (proto.getAnimated_appearance() != null) {
                    return new AnimatedAppearance(AnimatedAppearanceDto.INSTANCE.fromProto(proto.getAnimated_appearance()));
                }
                if (proto.getAnimated_reveal_text() != null) {
                    return new AnimatedRevealText(AnimatedRevealTextDto.INSTANCE.fromProto(proto.getAnimated_reveal_text()));
                }
                if (proto.getTicker_text() != null) {
                    return new TickerText(TickerTextDto.INSTANCE.fromProto(proto.getTicker_text()));
                }
                if (proto.getChart_group() != null) {
                    return new ChartGroup(ChartGroupDto.INSTANCE.fromProto(proto.getChart_group()));
                }
                if (proto.getVideo_player() != null) {
                    return new VideoPlayer(VideoPlayerDto.INSTANCE.fromProto(proto.getVideo_player()));
                }
                if (proto.getActivity_feed_row() != null) {
                    return new ActivityFeedRow(ActivityFeedRowDto.INSTANCE.fromProto(proto.getActivity_feed_row()));
                }
                if (proto.getRadio_button() != null) {
                    return new RadioButton(RadioButtonDto.INSTANCE.fromProto(proto.getRadio_button()));
                }
                if (proto.getSwitch() != null) {
                    return new Switch(SwitchDto.INSTANCE.fromProto(proto.getSwitch()));
                }
                if (proto.getList() != null) {
                    return new List(ListDto.INSTANCE.fromProto(proto.getList()));
                }
                return null;
            }
        }
    }

    /* compiled from: UIComponentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/UIComponentDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/UIComponentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UIComponentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.UIComponent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UIComponentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UIComponentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UIComponentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UIComponentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.UIComponentDto";
        }
    }
}
