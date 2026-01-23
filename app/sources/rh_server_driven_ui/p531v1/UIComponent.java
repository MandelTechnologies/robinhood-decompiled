package rh_server_driven_ui.p531v1;

import com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Spacer;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UIComponent.kt */
@Metadata(m3635d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 ¹\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002¹\u0001B\u0089\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010W\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\t\u0010¯\u0001\u001a\u00020\u0002H\u0017J\u0017\u0010°\u0001\u001a\u00030±\u00012\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001H\u0096\u0002J\n\u0010´\u0001\u001a\u00030µ\u0001H\u0016J\n\u0010¶\u0001\u001a\u00030·\u0001H\u0016J\u0089\u0004\u0010¸\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\b\b\u0002\u0010W\u001a\u00020XR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010nR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bs\u0010tR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010vR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0019\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001a\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001a\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001a\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001a\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001a\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001a\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010G\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010I\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010M\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010O\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010Q\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010®\u0001¨\u0006º\u0001"}, m3636d2 = {"Lrh_server_driven_ui/v1/UIComponent;", "Lcom/squareup/wire/Message;", "", "button", "Lrh_server_driven_ui/v1/Button;", "text", "Lrh_server_driven_ui/v1/Text;", "v_stack", "Lrh_server_driven_ui/v1/VStack;", "h_stack", "Lrh_server_driven_ui/v1/HStack;", "decorator", "Lrh_server_driven_ui/v1/Decorator;", "card", "Lrh_server_driven_ui/v1/Card;", "z_stack", "Lrh_server_driven_ui/v1/ZStack;", "value_prop_with_pictogram", "Lrh_server_driven_ui/v1/ValuePropWithPictogram;", "value_prop_with_icon", "Lrh_server_driven_ui/v1/ValuePropWithIcon;", "value_prop_with_number", "Lrh_server_driven_ui/v1/ValuePropWithNumber;", "image", "Lrh_server_driven_ui/v1/Image;", "lottie", "Lrh_server_driven_ui/v1/Lottie;", "info_tag", "Lrh_server_driven_ui/v1/InfoTag;", "number_pog", "Lrh_server_driven_ui/v1/NumberPog;", "text_pog", "Lrh_server_driven_ui/v1/TextPog;", "timeline", "Lrh_server_driven_ui/v1/Timeline;", "navigation_row", "Lrh_server_driven_ui/v1/NavigationRow;", "pog_with_pictogram", "Lrh_server_driven_ui/v1/PogWithPictogram;", AdvancedOrderNumpadLayout.TEXT_BUTTON_TEST_TAG, "Lrh_server_driven_ui/v1/TextButton;", "icon_button", "Lrh_server_driven_ui/v1/IconButton;", "text_input", "Lrh_server_driven_ui/v1/TextInput;", Spacer.f10659type, "Lrh_server_driven_ui/v1/Spacer;", "data_row_stacked", "Lrh_server_driven_ui/v1/DataRowStacked;", "data_row_condensed", "Lrh_server_driven_ui/v1/DataRowCondensed;", "checkbox", "Lrh_server_driven_ui/v1/Checkbox;", "themed_component", "Lrh_server_driven_ui/v1/ThemedComponent;", "shimmer_loader", "Lrh_server_driven_ui/v1/ShimmerLoader;", TestTags.INFO_BANNER, "Lrh_server_driven_ui/v1/InfoBanner;", "circular_progress", "Lrh_server_driven_ui/v1/CircularProgress;", "margin_tiered_interest_rates", "Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "table_column_header", "Lrh_server_driven_ui/v1/TableColumnHeader;", "flag_icon", "Lrh_server_driven_ui/v1/FlagIcon;", "table_instrument_name", "Lrh_server_driven_ui/v1/TableInstrumentName;", "animated_appearance", "Lrh_server_driven_ui/v1/AnimatedAppearance;", "animated_reveal_text", "Lrh_server_driven_ui/v1/AnimatedRevealText;", "ticker_text", "Lrh_server_driven_ui/v1/TickerText;", "chart_group", "Lrh_server_driven_ui/v1/ChartGroup;", "video_player", "Lrh_server_driven_ui/v1/VideoPlayer;", "activity_feed_row", "Lrh_server_driven_ui/v1/ActivityFeedRow;", "radio_button", "Lrh_server_driven_ui/v1/RadioButton;", "switch", "Lrh_server_driven_ui/v1/Switch;", "list", "Lrh_server_driven_ui/v1/List;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/Button;Lrh_server_driven_ui/v1/Text;Lrh_server_driven_ui/v1/VStack;Lrh_server_driven_ui/v1/HStack;Lrh_server_driven_ui/v1/Decorator;Lrh_server_driven_ui/v1/Card;Lrh_server_driven_ui/v1/ZStack;Lrh_server_driven_ui/v1/ValuePropWithPictogram;Lrh_server_driven_ui/v1/ValuePropWithIcon;Lrh_server_driven_ui/v1/ValuePropWithNumber;Lrh_server_driven_ui/v1/Image;Lrh_server_driven_ui/v1/Lottie;Lrh_server_driven_ui/v1/InfoTag;Lrh_server_driven_ui/v1/NumberPog;Lrh_server_driven_ui/v1/TextPog;Lrh_server_driven_ui/v1/Timeline;Lrh_server_driven_ui/v1/NavigationRow;Lrh_server_driven_ui/v1/PogWithPictogram;Lrh_server_driven_ui/v1/TextButton;Lrh_server_driven_ui/v1/IconButton;Lrh_server_driven_ui/v1/TextInput;Lrh_server_driven_ui/v1/Spacer;Lrh_server_driven_ui/v1/DataRowStacked;Lrh_server_driven_ui/v1/DataRowCondensed;Lrh_server_driven_ui/v1/Checkbox;Lrh_server_driven_ui/v1/ThemedComponent;Lrh_server_driven_ui/v1/ShimmerLoader;Lrh_server_driven_ui/v1/InfoBanner;Lrh_server_driven_ui/v1/CircularProgress;Lrh_server_driven_ui/v1/MarginTieredInterestRates;Lrh_server_driven_ui/v1/TableColumnHeader;Lrh_server_driven_ui/v1/FlagIcon;Lrh_server_driven_ui/v1/TableInstrumentName;Lrh_server_driven_ui/v1/AnimatedAppearance;Lrh_server_driven_ui/v1/AnimatedRevealText;Lrh_server_driven_ui/v1/TickerText;Lrh_server_driven_ui/v1/ChartGroup;Lrh_server_driven_ui/v1/VideoPlayer;Lrh_server_driven_ui/v1/ActivityFeedRow;Lrh_server_driven_ui/v1/RadioButton;Lrh_server_driven_ui/v1/Switch;Lrh_server_driven_ui/v1/List;Lokio/ByteString;)V", "getButton", "()Lrh_server_driven_ui/v1/Button;", "getText", "()Lrh_server_driven_ui/v1/Text;", "getV_stack", "()Lrh_server_driven_ui/v1/VStack;", "getH_stack", "()Lrh_server_driven_ui/v1/HStack;", "getDecorator", "()Lrh_server_driven_ui/v1/Decorator;", "getCard", "()Lrh_server_driven_ui/v1/Card;", "getZ_stack", "()Lrh_server_driven_ui/v1/ZStack;", "getValue_prop_with_pictogram", "()Lrh_server_driven_ui/v1/ValuePropWithPictogram;", "getValue_prop_with_icon", "()Lrh_server_driven_ui/v1/ValuePropWithIcon;", "getValue_prop_with_number", "()Lrh_server_driven_ui/v1/ValuePropWithNumber;", "getImage", "()Lrh_server_driven_ui/v1/Image;", "getLottie", "()Lrh_server_driven_ui/v1/Lottie;", "getInfo_tag", "()Lrh_server_driven_ui/v1/InfoTag;", "getNumber_pog", "()Lrh_server_driven_ui/v1/NumberPog;", "getText_pog", "()Lrh_server_driven_ui/v1/TextPog;", "getTimeline", "()Lrh_server_driven_ui/v1/Timeline;", "getNavigation_row", "()Lrh_server_driven_ui/v1/NavigationRow;", "getPog_with_pictogram", "()Lrh_server_driven_ui/v1/PogWithPictogram;", "getText_button", "()Lrh_server_driven_ui/v1/TextButton;", "getIcon_button", "()Lrh_server_driven_ui/v1/IconButton;", "getText_input", "()Lrh_server_driven_ui/v1/TextInput;", "getSpacer", "()Lrh_server_driven_ui/v1/Spacer;", "getData_row_stacked", "()Lrh_server_driven_ui/v1/DataRowStacked;", "getData_row_condensed", "()Lrh_server_driven_ui/v1/DataRowCondensed;", "getCheckbox", "()Lrh_server_driven_ui/v1/Checkbox;", "getThemed_component", "()Lrh_server_driven_ui/v1/ThemedComponent;", "getShimmer_loader", "()Lrh_server_driven_ui/v1/ShimmerLoader;", "getInfo_banner", "()Lrh_server_driven_ui/v1/InfoBanner;", "getCircular_progress", "()Lrh_server_driven_ui/v1/CircularProgress;", "getMargin_tiered_interest_rates", "()Lrh_server_driven_ui/v1/MarginTieredInterestRates;", "getTable_column_header", "()Lrh_server_driven_ui/v1/TableColumnHeader;", "getFlag_icon", "()Lrh_server_driven_ui/v1/FlagIcon;", "getTable_instrument_name", "()Lrh_server_driven_ui/v1/TableInstrumentName;", "getAnimated_appearance", "()Lrh_server_driven_ui/v1/AnimatedAppearance;", "getAnimated_reveal_text", "()Lrh_server_driven_ui/v1/AnimatedRevealText;", "getTicker_text", "()Lrh_server_driven_ui/v1/TickerText;", "getChart_group", "()Lrh_server_driven_ui/v1/ChartGroup;", "getVideo_player", "()Lrh_server_driven_ui/v1/VideoPlayer;", "getActivity_feed_row", "()Lrh_server_driven_ui/v1/ActivityFeedRow;", "getRadio_button", "()Lrh_server_driven_ui/v1/RadioButton;", "getSwitch", "()Lrh_server_driven_ui/v1/Switch;", "getList", "()Lrh_server_driven_ui/v1/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class UIComponent extends Message {

    @JvmField
    public static final ProtoAdapter<UIComponent> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.ActivityFeedRow#ADAPTER", jsonName = "activityFeedRow", oneofName = "concrete", schemaIndex = 38, tag = 39)
    private final ActivityFeedRow activity_feed_row;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance#ADAPTER", jsonName = "animatedAppearance", oneofName = "concrete", schemaIndex = 33, tag = 34)
    private final AnimatedAppearance animated_appearance;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedRevealText#ADAPTER", jsonName = "animatedRevealText", oneofName = "concrete", schemaIndex = 34, tag = 35)
    private final AnimatedRevealText animated_reveal_text;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final Button button;

    @WireField(adapter = "rh_server_driven_ui.v1.Card#ADAPTER", oneofName = "concrete", schemaIndex = 5, tag = 6)
    private final Card card;

    @WireField(adapter = "rh_server_driven_ui.v1.ChartGroup#ADAPTER", jsonName = "chartGroup", oneofName = "concrete", schemaIndex = 36, tag = 37)
    private final ChartGroup chart_group;

    @WireField(adapter = "rh_server_driven_ui.v1.Checkbox#ADAPTER", oneofName = "concrete", schemaIndex = 24, tag = 25)
    private final Checkbox checkbox;

    @WireField(adapter = "rh_server_driven_ui.v1.CircularProgress#ADAPTER", jsonName = "circularProgress", oneofName = "concrete", schemaIndex = 28, tag = 29)
    private final CircularProgress circular_progress;

    @WireField(adapter = "rh_server_driven_ui.v1.DataRowCondensed#ADAPTER", jsonName = "dataRowCondensed", oneofName = "concrete", schemaIndex = 23, tag = 24)
    private final DataRowCondensed data_row_condensed;

    @WireField(adapter = "rh_server_driven_ui.v1.DataRowStacked#ADAPTER", jsonName = "dataRowStacked", oneofName = "concrete", schemaIndex = 22, tag = 23)
    private final DataRowStacked data_row_stacked;

    @WireField(adapter = "rh_server_driven_ui.v1.Decorator#ADAPTER", oneofName = "concrete", schemaIndex = 4, tag = 5)
    private final Decorator decorator;

    @WireField(adapter = "rh_server_driven_ui.v1.FlagIcon#ADAPTER", jsonName = "flagIcon", oneofName = "concrete", schemaIndex = 31, tag = 32)
    private final FlagIcon flag_icon;

    @WireField(adapter = "rh_server_driven_ui.v1.HStack#ADAPTER", jsonName = "hStack", oneofName = "concrete", schemaIndex = 3, tag = 4)
    private final HStack h_stack;

    @WireField(adapter = "rh_server_driven_ui.v1.IconButton#ADAPTER", jsonName = "iconButton", oneofName = "concrete", schemaIndex = 19, tag = 20)
    private final IconButton icon_button;

    @WireField(adapter = "rh_server_driven_ui.v1.Image#ADAPTER", oneofName = "concrete", schemaIndex = 10, tag = 11)
    private final Image image;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoBanner#ADAPTER", jsonName = "infoBanner", oneofName = "concrete", schemaIndex = 27, tag = 28)
    private final InfoBanner info_banner;

    @WireField(adapter = "rh_server_driven_ui.v1.InfoTag#ADAPTER", jsonName = "infoTag", oneofName = "concrete", schemaIndex = 12, tag = 13)
    private final InfoTag info_tag;

    @WireField(adapter = "rh_server_driven_ui.v1.List#ADAPTER", oneofName = "concrete", schemaIndex = 41, tag = 42)
    private final List list;

    @WireField(adapter = "rh_server_driven_ui.v1.Lottie#ADAPTER", oneofName = "concrete", schemaIndex = 11, tag = 12)
    private final Lottie lottie;

    @WireField(adapter = "rh_server_driven_ui.v1.MarginTieredInterestRates#ADAPTER", jsonName = "marginTieredInterestRates", oneofName = "concrete", schemaIndex = 29, tag = 30)
    private final MarginTieredInterestRates margin_tiered_interest_rates;

    @WireField(adapter = "rh_server_driven_ui.v1.NavigationRow#ADAPTER", jsonName = "navigationRow", oneofName = "concrete", schemaIndex = 16, tag = 17)
    private final NavigationRow navigation_row;

    @WireField(adapter = "rh_server_driven_ui.v1.NumberPog#ADAPTER", jsonName = "numberPog", oneofName = "concrete", schemaIndex = 13, tag = 14)
    private final NumberPog number_pog;

    @WireField(adapter = "rh_server_driven_ui.v1.PogWithPictogram#ADAPTER", jsonName = "pogWithPictogram", oneofName = "concrete", schemaIndex = 17, tag = 18)
    private final PogWithPictogram pog_with_pictogram;

    @WireField(adapter = "rh_server_driven_ui.v1.RadioButton#ADAPTER", jsonName = "radioButton", oneofName = "concrete", schemaIndex = 39, tag = 40)
    private final RadioButton radio_button;

    @WireField(adapter = "rh_server_driven_ui.v1.ShimmerLoader#ADAPTER", jsonName = "shimmerLoader", oneofName = "concrete", schemaIndex = 26, tag = 27)
    private final ShimmerLoader shimmer_loader;

    @WireField(adapter = "rh_server_driven_ui.v1.Spacer#ADAPTER", oneofName = "concrete", schemaIndex = 21, tag = 22)
    private final Spacer spacer;

    @WireField(adapter = "rh_server_driven_ui.v1.Switch#ADAPTER", oneofName = "concrete", schemaIndex = 40, tag = 41)
    private final Switch switch;

    @WireField(adapter = "rh_server_driven_ui.v1.TableColumnHeader#ADAPTER", jsonName = "tableColumnHeader", oneofName = "concrete", schemaIndex = 30, tag = 31)
    private final TableColumnHeader table_column_header;

    @WireField(adapter = "rh_server_driven_ui.v1.TableInstrumentName#ADAPTER", jsonName = "tableInstrumentName", oneofName = "concrete", schemaIndex = 32, tag = 33)
    private final TableInstrumentName table_instrument_name;

    @WireField(adapter = "rh_server_driven_ui.v1.Text#ADAPTER", oneofName = "concrete", schemaIndex = 1, tag = 2)
    private final Text text;

    @WireField(adapter = "rh_server_driven_ui.v1.TextButton#ADAPTER", jsonName = "textButton", oneofName = "concrete", schemaIndex = 18, tag = 19)
    private final TextButton text_button;

    @WireField(adapter = "rh_server_driven_ui.v1.TextInput#ADAPTER", jsonName = "textInput", oneofName = "concrete", schemaIndex = 20, tag = 21)
    private final TextInput text_input;

    @WireField(adapter = "rh_server_driven_ui.v1.TextPog#ADAPTER", jsonName = "textPog", oneofName = "concrete", schemaIndex = 14, tag = 15)
    private final TextPog text_pog;

    @WireField(adapter = "rh_server_driven_ui.v1.ThemedComponent#ADAPTER", jsonName = "themedComponent", oneofName = "concrete", schemaIndex = 25, tag = 26)
    private final ThemedComponent themed_component;

    @WireField(adapter = "rh_server_driven_ui.v1.TickerText#ADAPTER", jsonName = "tickerText", oneofName = "concrete", schemaIndex = 35, tag = 36)
    private final TickerText ticker_text;

    @WireField(adapter = "rh_server_driven_ui.v1.Timeline#ADAPTER", oneofName = "concrete", schemaIndex = 15, tag = 16)
    private final Timeline timeline;

    @WireField(adapter = "rh_server_driven_ui.v1.VStack#ADAPTER", jsonName = "vStack", oneofName = "concrete", schemaIndex = 2, tag = 3)
    private final VStack v_stack;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropWithIcon#ADAPTER", jsonName = "valuePropWithIcon", oneofName = "concrete", schemaIndex = 8, tag = 9)
    private final ValuePropWithIcon value_prop_with_icon;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropWithNumber#ADAPTER", jsonName = "valuePropWithNumber", oneofName = "concrete", schemaIndex = 9, tag = 10)
    private final ValuePropWithNumber value_prop_with_number;

    @WireField(adapter = "rh_server_driven_ui.v1.ValuePropWithPictogram#ADAPTER", jsonName = "valuePropWithPictogram", oneofName = "concrete", schemaIndex = 7, tag = 8)
    private final ValuePropWithPictogram value_prop_with_pictogram;

    @WireField(adapter = "rh_server_driven_ui.v1.VideoPlayer#ADAPTER", jsonName = "videoPlayer", oneofName = "concrete", schemaIndex = 37, tag = 38)
    private final VideoPlayer video_player;

    @WireField(adapter = "rh_server_driven_ui.v1.ZStack#ADAPTER", jsonName = "zStack", oneofName = "concrete", schemaIndex = 6, tag = 7)
    private final ZStack z_stack;

    public UIComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29857newBuilder();
    }

    public final Button getButton() {
        return this.button;
    }

    public final Text getText() {
        return this.text;
    }

    public final VStack getV_stack() {
        return this.v_stack;
    }

    public final HStack getH_stack() {
        return this.h_stack;
    }

    public final Decorator getDecorator() {
        return this.decorator;
    }

    public final Card getCard() {
        return this.card;
    }

    public final ZStack getZ_stack() {
        return this.z_stack;
    }

    public final ValuePropWithPictogram getValue_prop_with_pictogram() {
        return this.value_prop_with_pictogram;
    }

    public final ValuePropWithIcon getValue_prop_with_icon() {
        return this.value_prop_with_icon;
    }

    public final ValuePropWithNumber getValue_prop_with_number() {
        return this.value_prop_with_number;
    }

    public final Image getImage() {
        return this.image;
    }

    public final Lottie getLottie() {
        return this.lottie;
    }

    public final InfoTag getInfo_tag() {
        return this.info_tag;
    }

    public final NumberPog getNumber_pog() {
        return this.number_pog;
    }

    public final TextPog getText_pog() {
        return this.text_pog;
    }

    public final Timeline getTimeline() {
        return this.timeline;
    }

    public final NavigationRow getNavigation_row() {
        return this.navigation_row;
    }

    public final PogWithPictogram getPog_with_pictogram() {
        return this.pog_with_pictogram;
    }

    public final TextButton getText_button() {
        return this.text_button;
    }

    public final IconButton getIcon_button() {
        return this.icon_button;
    }

    public final TextInput getText_input() {
        return this.text_input;
    }

    public final Spacer getSpacer() {
        return this.spacer;
    }

    public final DataRowStacked getData_row_stacked() {
        return this.data_row_stacked;
    }

    public final DataRowCondensed getData_row_condensed() {
        return this.data_row_condensed;
    }

    public final Checkbox getCheckbox() {
        return this.checkbox;
    }

    public final ThemedComponent getThemed_component() {
        return this.themed_component;
    }

    public final ShimmerLoader getShimmer_loader() {
        return this.shimmer_loader;
    }

    public final InfoBanner getInfo_banner() {
        return this.info_banner;
    }

    public final CircularProgress getCircular_progress() {
        return this.circular_progress;
    }

    public final MarginTieredInterestRates getMargin_tiered_interest_rates() {
        return this.margin_tiered_interest_rates;
    }

    public final TableColumnHeader getTable_column_header() {
        return this.table_column_header;
    }

    public final FlagIcon getFlag_icon() {
        return this.flag_icon;
    }

    public final TableInstrumentName getTable_instrument_name() {
        return this.table_instrument_name;
    }

    public final AnimatedAppearance getAnimated_appearance() {
        return this.animated_appearance;
    }

    public final AnimatedRevealText getAnimated_reveal_text() {
        return this.animated_reveal_text;
    }

    public final TickerText getTicker_text() {
        return this.ticker_text;
    }

    public final ChartGroup getChart_group() {
        return this.chart_group;
    }

    public final VideoPlayer getVideo_player() {
        return this.video_player;
    }

    public final ActivityFeedRow getActivity_feed_row() {
        return this.activity_feed_row;
    }

    public final RadioButton getRadio_button() {
        return this.radio_button;
    }

    public final Switch getSwitch() {
        return this.switch;
    }

    public final List getList() {
        return this.list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UIComponent(Button button, Text text, VStack vStack, HStack hStack, Decorator decorator, Card card, ZStack zStack, ValuePropWithPictogram valuePropWithPictogram, ValuePropWithIcon valuePropWithIcon, ValuePropWithNumber valuePropWithNumber, Image image, Lottie lottie, InfoTag infoTag, NumberPog numberPog, TextPog textPog, Timeline timeline, NavigationRow navigationRow, PogWithPictogram pogWithPictogram, TextButton textButton, IconButton iconButton, TextInput textInput, Spacer spacer, DataRowStacked dataRowStacked, DataRowCondensed dataRowCondensed, Checkbox checkbox, ThemedComponent themedComponent, ShimmerLoader shimmerLoader, InfoBanner infoBanner, CircularProgress circularProgress, MarginTieredInterestRates marginTieredInterestRates, TableColumnHeader tableColumnHeader, FlagIcon flagIcon, TableInstrumentName tableInstrumentName, AnimatedAppearance animatedAppearance, AnimatedRevealText animatedRevealText, TickerText tickerText, ChartGroup chartGroup, VideoPlayer videoPlayer, ActivityFeedRow activityFeedRow, RadioButton radioButton, Switch r80, List list, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Button button2 = (i & 1) != 0 ? null : button;
        this(button2, (i & 2) != 0 ? null : text, (i & 4) != 0 ? null : vStack, (i & 8) != 0 ? null : hStack, (i & 16) != 0 ? null : decorator, (i & 32) != 0 ? null : card, (i & 64) != 0 ? null : zStack, (i & 128) != 0 ? null : valuePropWithPictogram, (i & 256) != 0 ? null : valuePropWithIcon, (i & 512) != 0 ? null : valuePropWithNumber, (i & 1024) != 0 ? null : image, (i & 2048) != 0 ? null : lottie, (i & 4096) != 0 ? null : infoTag, (i & 8192) != 0 ? null : numberPog, (i & 16384) != 0 ? null : textPog, (i & 32768) != 0 ? null : timeline, (i & 65536) != 0 ? null : navigationRow, (i & 131072) != 0 ? null : pogWithPictogram, (i & 262144) != 0 ? null : textButton, (i & 524288) != 0 ? null : iconButton, (i & 1048576) != 0 ? null : textInput, (i & 2097152) != 0 ? null : spacer, (i & 4194304) != 0 ? null : dataRowStacked, (i & 8388608) != 0 ? null : dataRowCondensed, (i & 16777216) != 0 ? null : checkbox, (i & 33554432) != 0 ? null : themedComponent, (i & 67108864) != 0 ? null : shimmerLoader, (i & 134217728) != 0 ? null : infoBanner, (i & 268435456) != 0 ? null : circularProgress, (i & 536870912) != 0 ? null : marginTieredInterestRates, (i & 1073741824) != 0 ? null : tableColumnHeader, (i & Integer.MIN_VALUE) != 0 ? null : flagIcon, (i2 & 1) != 0 ? null : tableInstrumentName, (i2 & 2) != 0 ? null : animatedAppearance, (i2 & 4) != 0 ? null : animatedRevealText, (i2 & 8) != 0 ? null : tickerText, (i2 & 16) != 0 ? null : chartGroup, (i2 & 32) != 0 ? null : videoPlayer, (i2 & 64) != 0 ? null : activityFeedRow, (i2 & 128) != 0 ? null : radioButton, (i2 & 256) != 0 ? null : r80, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIComponent(Button button, Text text, VStack vStack, HStack hStack, Decorator decorator, Card card, ZStack zStack, ValuePropWithPictogram valuePropWithPictogram, ValuePropWithIcon valuePropWithIcon, ValuePropWithNumber valuePropWithNumber, Image image, Lottie lottie, InfoTag infoTag, NumberPog numberPog, TextPog textPog, Timeline timeline, NavigationRow navigationRow, PogWithPictogram pogWithPictogram, TextButton textButton, IconButton iconButton, TextInput textInput, Spacer spacer, DataRowStacked dataRowStacked, DataRowCondensed dataRowCondensed, Checkbox checkbox, ThemedComponent themedComponent, ShimmerLoader shimmerLoader, InfoBanner infoBanner, CircularProgress circularProgress, MarginTieredInterestRates marginTieredInterestRates, TableColumnHeader tableColumnHeader, FlagIcon flagIcon, TableInstrumentName tableInstrumentName, AnimatedAppearance animatedAppearance, AnimatedRevealText animatedRevealText, TickerText tickerText, ChartGroup chartGroup, VideoPlayer videoPlayer, ActivityFeedRow activityFeedRow, RadioButton radioButton, Switch r57, List list, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.button = button;
        this.text = text;
        this.v_stack = vStack;
        this.h_stack = hStack;
        this.decorator = decorator;
        this.card = card;
        this.z_stack = zStack;
        this.value_prop_with_pictogram = valuePropWithPictogram;
        this.value_prop_with_icon = valuePropWithIcon;
        this.value_prop_with_number = valuePropWithNumber;
        this.image = image;
        this.lottie = lottie;
        this.info_tag = infoTag;
        this.number_pog = numberPog;
        this.text_pog = textPog;
        this.timeline = timeline;
        this.navigation_row = navigationRow;
        this.pog_with_pictogram = pogWithPictogram;
        this.text_button = textButton;
        this.icon_button = iconButton;
        this.text_input = textInput;
        this.spacer = spacer;
        this.data_row_stacked = dataRowStacked;
        this.data_row_condensed = dataRowCondensed;
        this.checkbox = checkbox;
        this.themed_component = themedComponent;
        this.shimmer_loader = shimmerLoader;
        this.info_banner = infoBanner;
        this.circular_progress = circularProgress;
        this.margin_tiered_interest_rates = marginTieredInterestRates;
        this.table_column_header = tableColumnHeader;
        this.flag_icon = flagIcon;
        this.table_instrument_name = tableInstrumentName;
        this.animated_appearance = animatedAppearance;
        this.animated_reveal_text = animatedRevealText;
        this.ticker_text = tickerText;
        this.chart_group = chartGroup;
        this.video_player = videoPlayer;
        this.activity_feed_row = activityFeedRow;
        this.radio_button = radioButton;
        this.switch = r57;
        this.list = list;
        if (Internal.countNonNull(button, text, vStack, hStack, decorator, card, zStack, valuePropWithPictogram, valuePropWithIcon, valuePropWithNumber, image, lottie, infoTag, numberPog, textPog, timeline, navigationRow, pogWithPictogram, textButton, iconButton, textInput, spacer, dataRowStacked, dataRowCondensed, checkbox, themedComponent, shimmerLoader, infoBanner, circularProgress, marginTieredInterestRates, tableColumnHeader, flagIcon, tableInstrumentName, animatedAppearance, animatedRevealText, tickerText, chartGroup, videoPlayer, activityFeedRow, radioButton, r57, list) > 1) {
            throw new IllegalArgumentException("At most one of button, text, v_stack, h_stack, decorator, card, z_stack, value_prop_with_pictogram, value_prop_with_icon, value_prop_with_number, image, lottie, info_tag, number_pog, text_pog, timeline, navigation_row, pog_with_pictogram, text_button, icon_button, text_input, spacer, data_row_stacked, data_row_condensed, checkbox, themed_component, shimmer_loader, info_banner, circular_progress, margin_tiered_interest_rates, table_column_header, flag_icon, table_instrument_name, animated_appearance, animated_reveal_text, ticker_text, chart_group, video_player, activity_feed_row, radio_button, switch, list may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29857newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UIComponent)) {
            return false;
        }
        UIComponent uIComponent = (UIComponent) other;
        return Intrinsics.areEqual(unknownFields(), uIComponent.unknownFields()) && Intrinsics.areEqual(this.button, uIComponent.button) && Intrinsics.areEqual(this.text, uIComponent.text) && Intrinsics.areEqual(this.v_stack, uIComponent.v_stack) && Intrinsics.areEqual(this.h_stack, uIComponent.h_stack) && Intrinsics.areEqual(this.decorator, uIComponent.decorator) && Intrinsics.areEqual(this.card, uIComponent.card) && Intrinsics.areEqual(this.z_stack, uIComponent.z_stack) && Intrinsics.areEqual(this.value_prop_with_pictogram, uIComponent.value_prop_with_pictogram) && Intrinsics.areEqual(this.value_prop_with_icon, uIComponent.value_prop_with_icon) && Intrinsics.areEqual(this.value_prop_with_number, uIComponent.value_prop_with_number) && Intrinsics.areEqual(this.image, uIComponent.image) && Intrinsics.areEqual(this.lottie, uIComponent.lottie) && Intrinsics.areEqual(this.info_tag, uIComponent.info_tag) && Intrinsics.areEqual(this.number_pog, uIComponent.number_pog) && Intrinsics.areEqual(this.text_pog, uIComponent.text_pog) && Intrinsics.areEqual(this.timeline, uIComponent.timeline) && Intrinsics.areEqual(this.navigation_row, uIComponent.navigation_row) && Intrinsics.areEqual(this.pog_with_pictogram, uIComponent.pog_with_pictogram) && Intrinsics.areEqual(this.text_button, uIComponent.text_button) && Intrinsics.areEqual(this.icon_button, uIComponent.icon_button) && Intrinsics.areEqual(this.text_input, uIComponent.text_input) && Intrinsics.areEqual(this.spacer, uIComponent.spacer) && Intrinsics.areEqual(this.data_row_stacked, uIComponent.data_row_stacked) && Intrinsics.areEqual(this.data_row_condensed, uIComponent.data_row_condensed) && Intrinsics.areEqual(this.checkbox, uIComponent.checkbox) && Intrinsics.areEqual(this.themed_component, uIComponent.themed_component) && Intrinsics.areEqual(this.shimmer_loader, uIComponent.shimmer_loader) && Intrinsics.areEqual(this.info_banner, uIComponent.info_banner) && Intrinsics.areEqual(this.circular_progress, uIComponent.circular_progress) && Intrinsics.areEqual(this.margin_tiered_interest_rates, uIComponent.margin_tiered_interest_rates) && Intrinsics.areEqual(this.table_column_header, uIComponent.table_column_header) && Intrinsics.areEqual(this.flag_icon, uIComponent.flag_icon) && Intrinsics.areEqual(this.table_instrument_name, uIComponent.table_instrument_name) && Intrinsics.areEqual(this.animated_appearance, uIComponent.animated_appearance) && Intrinsics.areEqual(this.animated_reveal_text, uIComponent.animated_reveal_text) && Intrinsics.areEqual(this.ticker_text, uIComponent.ticker_text) && Intrinsics.areEqual(this.chart_group, uIComponent.chart_group) && Intrinsics.areEqual(this.video_player, uIComponent.video_player) && Intrinsics.areEqual(this.activity_feed_row, uIComponent.activity_feed_row) && Intrinsics.areEqual(this.radio_button, uIComponent.radio_button) && Intrinsics.areEqual(this.switch, uIComponent.switch) && Intrinsics.areEqual(this.list, uIComponent.list);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Button button = this.button;
        int iHashCode2 = (iHashCode + (button != null ? button.hashCode() : 0)) * 37;
        Text text = this.text;
        int iHashCode3 = (iHashCode2 + (text != null ? text.hashCode() : 0)) * 37;
        VStack vStack = this.v_stack;
        int iHashCode4 = (iHashCode3 + (vStack != null ? vStack.hashCode() : 0)) * 37;
        HStack hStack = this.h_stack;
        int iHashCode5 = (iHashCode4 + (hStack != null ? hStack.hashCode() : 0)) * 37;
        Decorator decorator = this.decorator;
        int iHashCode6 = (iHashCode5 + (decorator != null ? decorator.hashCode() : 0)) * 37;
        Card card = this.card;
        int iHashCode7 = (iHashCode6 + (card != null ? card.hashCode() : 0)) * 37;
        ZStack zStack = this.z_stack;
        int iHashCode8 = (iHashCode7 + (zStack != null ? zStack.hashCode() : 0)) * 37;
        ValuePropWithPictogram valuePropWithPictogram = this.value_prop_with_pictogram;
        int iHashCode9 = (iHashCode8 + (valuePropWithPictogram != null ? valuePropWithPictogram.hashCode() : 0)) * 37;
        ValuePropWithIcon valuePropWithIcon = this.value_prop_with_icon;
        int iHashCode10 = (iHashCode9 + (valuePropWithIcon != null ? valuePropWithIcon.hashCode() : 0)) * 37;
        ValuePropWithNumber valuePropWithNumber = this.value_prop_with_number;
        int iHashCode11 = (iHashCode10 + (valuePropWithNumber != null ? valuePropWithNumber.hashCode() : 0)) * 37;
        Image image = this.image;
        int iHashCode12 = (iHashCode11 + (image != null ? image.hashCode() : 0)) * 37;
        Lottie lottie = this.lottie;
        int iHashCode13 = (iHashCode12 + (lottie != null ? lottie.hashCode() : 0)) * 37;
        InfoTag infoTag = this.info_tag;
        int iHashCode14 = (iHashCode13 + (infoTag != null ? infoTag.hashCode() : 0)) * 37;
        NumberPog numberPog = this.number_pog;
        int iHashCode15 = (iHashCode14 + (numberPog != null ? numberPog.hashCode() : 0)) * 37;
        TextPog textPog = this.text_pog;
        int iHashCode16 = (iHashCode15 + (textPog != null ? textPog.hashCode() : 0)) * 37;
        Timeline timeline = this.timeline;
        int iHashCode17 = (iHashCode16 + (timeline != null ? timeline.hashCode() : 0)) * 37;
        NavigationRow navigationRow = this.navigation_row;
        int iHashCode18 = (iHashCode17 + (navigationRow != null ? navigationRow.hashCode() : 0)) * 37;
        PogWithPictogram pogWithPictogram = this.pog_with_pictogram;
        int iHashCode19 = (iHashCode18 + (pogWithPictogram != null ? pogWithPictogram.hashCode() : 0)) * 37;
        TextButton textButton = this.text_button;
        int iHashCode20 = (iHashCode19 + (textButton != null ? textButton.hashCode() : 0)) * 37;
        IconButton iconButton = this.icon_button;
        int iHashCode21 = (iHashCode20 + (iconButton != null ? iconButton.hashCode() : 0)) * 37;
        TextInput textInput = this.text_input;
        int iHashCode22 = (iHashCode21 + (textInput != null ? textInput.hashCode() : 0)) * 37;
        Spacer spacer = this.spacer;
        int iHashCode23 = (iHashCode22 + (spacer != null ? spacer.hashCode() : 0)) * 37;
        DataRowStacked dataRowStacked = this.data_row_stacked;
        int iHashCode24 = (iHashCode23 + (dataRowStacked != null ? dataRowStacked.hashCode() : 0)) * 37;
        DataRowCondensed dataRowCondensed = this.data_row_condensed;
        int iHashCode25 = (iHashCode24 + (dataRowCondensed != null ? dataRowCondensed.hashCode() : 0)) * 37;
        Checkbox checkbox = this.checkbox;
        int iHashCode26 = (iHashCode25 + (checkbox != null ? checkbox.hashCode() : 0)) * 37;
        ThemedComponent themedComponent = this.themed_component;
        int iHashCode27 = (iHashCode26 + (themedComponent != null ? themedComponent.hashCode() : 0)) * 37;
        ShimmerLoader shimmerLoader = this.shimmer_loader;
        int iHashCode28 = (iHashCode27 + (shimmerLoader != null ? shimmerLoader.hashCode() : 0)) * 37;
        InfoBanner infoBanner = this.info_banner;
        int iHashCode29 = (iHashCode28 + (infoBanner != null ? infoBanner.hashCode() : 0)) * 37;
        CircularProgress circularProgress = this.circular_progress;
        int iHashCode30 = (iHashCode29 + (circularProgress != null ? circularProgress.hashCode() : 0)) * 37;
        MarginTieredInterestRates marginTieredInterestRates = this.margin_tiered_interest_rates;
        int iHashCode31 = (iHashCode30 + (marginTieredInterestRates != null ? marginTieredInterestRates.hashCode() : 0)) * 37;
        TableColumnHeader tableColumnHeader = this.table_column_header;
        int iHashCode32 = (iHashCode31 + (tableColumnHeader != null ? tableColumnHeader.hashCode() : 0)) * 37;
        FlagIcon flagIcon = this.flag_icon;
        int iHashCode33 = (iHashCode32 + (flagIcon != null ? flagIcon.hashCode() : 0)) * 37;
        TableInstrumentName tableInstrumentName = this.table_instrument_name;
        int iHashCode34 = (iHashCode33 + (tableInstrumentName != null ? tableInstrumentName.hashCode() : 0)) * 37;
        AnimatedAppearance animatedAppearance = this.animated_appearance;
        int iHashCode35 = (iHashCode34 + (animatedAppearance != null ? animatedAppearance.hashCode() : 0)) * 37;
        AnimatedRevealText animatedRevealText = this.animated_reveal_text;
        int iHashCode36 = (iHashCode35 + (animatedRevealText != null ? animatedRevealText.hashCode() : 0)) * 37;
        TickerText tickerText = this.ticker_text;
        int iHashCode37 = (iHashCode36 + (tickerText != null ? tickerText.hashCode() : 0)) * 37;
        ChartGroup chartGroup = this.chart_group;
        int iHashCode38 = (iHashCode37 + (chartGroup != null ? chartGroup.hashCode() : 0)) * 37;
        VideoPlayer videoPlayer = this.video_player;
        int iHashCode39 = (iHashCode38 + (videoPlayer != null ? videoPlayer.hashCode() : 0)) * 37;
        ActivityFeedRow activityFeedRow = this.activity_feed_row;
        int iHashCode40 = (iHashCode39 + (activityFeedRow != null ? activityFeedRow.hashCode() : 0)) * 37;
        RadioButton radioButton = this.radio_button;
        int iHashCode41 = (iHashCode40 + (radioButton != null ? radioButton.hashCode() : 0)) * 37;
        Switch r1 = this.switch;
        int iHashCode42 = (iHashCode41 + (r1 != null ? r1.hashCode() : 0)) * 37;
        List list = this.list;
        int iHashCode43 = iHashCode42 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode43;
        return iHashCode43;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        Text text = this.text;
        if (text != null) {
            arrayList.add("text=" + text);
        }
        VStack vStack = this.v_stack;
        if (vStack != null) {
            arrayList.add("v_stack=" + vStack);
        }
        HStack hStack = this.h_stack;
        if (hStack != null) {
            arrayList.add("h_stack=" + hStack);
        }
        Decorator decorator = this.decorator;
        if (decorator != null) {
            arrayList.add("decorator=" + decorator);
        }
        Card card = this.card;
        if (card != null) {
            arrayList.add("card=" + card);
        }
        ZStack zStack = this.z_stack;
        if (zStack != null) {
            arrayList.add("z_stack=" + zStack);
        }
        ValuePropWithPictogram valuePropWithPictogram = this.value_prop_with_pictogram;
        if (valuePropWithPictogram != null) {
            arrayList.add("value_prop_with_pictogram=" + valuePropWithPictogram);
        }
        ValuePropWithIcon valuePropWithIcon = this.value_prop_with_icon;
        if (valuePropWithIcon != null) {
            arrayList.add("value_prop_with_icon=" + valuePropWithIcon);
        }
        ValuePropWithNumber valuePropWithNumber = this.value_prop_with_number;
        if (valuePropWithNumber != null) {
            arrayList.add("value_prop_with_number=" + valuePropWithNumber);
        }
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        Lottie lottie = this.lottie;
        if (lottie != null) {
            arrayList.add("lottie=" + lottie);
        }
        InfoTag infoTag = this.info_tag;
        if (infoTag != null) {
            arrayList.add("info_tag=" + infoTag);
        }
        NumberPog numberPog = this.number_pog;
        if (numberPog != null) {
            arrayList.add("number_pog=" + numberPog);
        }
        TextPog textPog = this.text_pog;
        if (textPog != null) {
            arrayList.add("text_pog=" + textPog);
        }
        Timeline timeline = this.timeline;
        if (timeline != null) {
            arrayList.add("timeline=" + timeline);
        }
        NavigationRow navigationRow = this.navigation_row;
        if (navigationRow != null) {
            arrayList.add("navigation_row=" + navigationRow);
        }
        PogWithPictogram pogWithPictogram = this.pog_with_pictogram;
        if (pogWithPictogram != null) {
            arrayList.add("pog_with_pictogram=" + pogWithPictogram);
        }
        TextButton textButton = this.text_button;
        if (textButton != null) {
            arrayList.add("text_button=" + textButton);
        }
        IconButton iconButton = this.icon_button;
        if (iconButton != null) {
            arrayList.add("icon_button=" + iconButton);
        }
        TextInput textInput = this.text_input;
        if (textInput != null) {
            arrayList.add("text_input=" + textInput);
        }
        Spacer spacer = this.spacer;
        if (spacer != null) {
            arrayList.add("spacer=" + spacer);
        }
        DataRowStacked dataRowStacked = this.data_row_stacked;
        if (dataRowStacked != null) {
            arrayList.add("data_row_stacked=" + dataRowStacked);
        }
        DataRowCondensed dataRowCondensed = this.data_row_condensed;
        if (dataRowCondensed != null) {
            arrayList.add("data_row_condensed=" + dataRowCondensed);
        }
        Checkbox checkbox = this.checkbox;
        if (checkbox != null) {
            arrayList.add("checkbox=" + checkbox);
        }
        ThemedComponent themedComponent = this.themed_component;
        if (themedComponent != null) {
            arrayList.add("themed_component=" + themedComponent);
        }
        ShimmerLoader shimmerLoader = this.shimmer_loader;
        if (shimmerLoader != null) {
            arrayList.add("shimmer_loader=" + shimmerLoader);
        }
        InfoBanner infoBanner = this.info_banner;
        if (infoBanner != null) {
            arrayList.add("info_banner=" + infoBanner);
        }
        CircularProgress circularProgress = this.circular_progress;
        if (circularProgress != null) {
            arrayList.add("circular_progress=" + circularProgress);
        }
        MarginTieredInterestRates marginTieredInterestRates = this.margin_tiered_interest_rates;
        if (marginTieredInterestRates != null) {
            arrayList.add("margin_tiered_interest_rates=" + marginTieredInterestRates);
        }
        TableColumnHeader tableColumnHeader = this.table_column_header;
        if (tableColumnHeader != null) {
            arrayList.add("table_column_header=" + tableColumnHeader);
        }
        FlagIcon flagIcon = this.flag_icon;
        if (flagIcon != null) {
            arrayList.add("flag_icon=" + flagIcon);
        }
        TableInstrumentName tableInstrumentName = this.table_instrument_name;
        if (tableInstrumentName != null) {
            arrayList.add("table_instrument_name=" + tableInstrumentName);
        }
        AnimatedAppearance animatedAppearance = this.animated_appearance;
        if (animatedAppearance != null) {
            arrayList.add("animated_appearance=" + animatedAppearance);
        }
        AnimatedRevealText animatedRevealText = this.animated_reveal_text;
        if (animatedRevealText != null) {
            arrayList.add("animated_reveal_text=" + animatedRevealText);
        }
        TickerText tickerText = this.ticker_text;
        if (tickerText != null) {
            arrayList.add("ticker_text=" + tickerText);
        }
        ChartGroup chartGroup = this.chart_group;
        if (chartGroup != null) {
            arrayList.add("chart_group=" + chartGroup);
        }
        VideoPlayer videoPlayer = this.video_player;
        if (videoPlayer != null) {
            arrayList.add("video_player=" + videoPlayer);
        }
        ActivityFeedRow activityFeedRow = this.activity_feed_row;
        if (activityFeedRow != null) {
            arrayList.add("activity_feed_row=" + activityFeedRow);
        }
        RadioButton radioButton = this.radio_button;
        if (radioButton != null) {
            arrayList.add("radio_button=" + radioButton);
        }
        Switch r1 = this.switch;
        if (r1 != null) {
            arrayList.add("switch=" + r1);
        }
        List list = this.list;
        if (list != null) {
            arrayList.add("list=" + list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UIComponent{", "}", 0, null, null, 56, null);
    }

    public final UIComponent copy(Button button, Text text, VStack v_stack, HStack h_stack, Decorator decorator, Card card, ZStack z_stack, ValuePropWithPictogram value_prop_with_pictogram, ValuePropWithIcon value_prop_with_icon, ValuePropWithNumber value_prop_with_number, Image image, Lottie lottie, InfoTag info_tag, NumberPog number_pog, TextPog text_pog, Timeline timeline, NavigationRow navigation_row, PogWithPictogram pog_with_pictogram, TextButton text_button, IconButton icon_button, TextInput text_input, Spacer spacer, DataRowStacked data_row_stacked, DataRowCondensed data_row_condensed, Checkbox checkbox, ThemedComponent themed_component, ShimmerLoader shimmer_loader, InfoBanner info_banner, CircularProgress circular_progress, MarginTieredInterestRates margin_tiered_interest_rates, TableColumnHeader table_column_header, FlagIcon flag_icon, TableInstrumentName table_instrument_name, AnimatedAppearance animated_appearance, AnimatedRevealText animated_reveal_text, TickerText ticker_text, ChartGroup chart_group, VideoPlayer video_player, ActivityFeedRow activity_feed_row, RadioButton radio_button, Switch r86, List list, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UIComponent(button, text, v_stack, h_stack, decorator, card, z_stack, value_prop_with_pictogram, value_prop_with_icon, value_prop_with_number, image, lottie, info_tag, number_pog, text_pog, timeline, navigation_row, pog_with_pictogram, text_button, icon_button, text_input, spacer, data_row_stacked, data_row_condensed, checkbox, themed_component, shimmer_loader, info_banner, circular_progress, margin_tiered_interest_rates, table_column_header, flag_icon, table_instrument_name, animated_appearance, animated_reveal_text, ticker_text, chart_group, video_player, activity_feed_row, radio_button, r86, list, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UIComponent.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UIComponent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.UIComponent$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public UIComponent decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Text textDecode = null;
                VStack vStackDecode = null;
                HStack hStackDecode = null;
                Decorator decoratorDecode = null;
                Card cardDecode = null;
                ZStack zStackDecode = null;
                ValuePropWithPictogram valuePropWithPictogramDecode = null;
                ValuePropWithIcon valuePropWithIconDecode = null;
                ValuePropWithNumber valuePropWithNumberDecode = null;
                Image imageDecode = null;
                Lottie lottieDecode = null;
                InfoTag infoTagDecode = null;
                NumberPog numberPogDecode = null;
                TextPog textPogDecode = null;
                Timeline timelineDecode = null;
                NavigationRow navigationRowDecode = null;
                PogWithPictogram pogWithPictogramDecode = null;
                TextButton textButtonDecode = null;
                IconButton iconButtonDecode = null;
                TextInput textInputDecode = null;
                Spacer spacerDecode = null;
                DataRowStacked dataRowStackedDecode = null;
                DataRowCondensed dataRowCondensedDecode = null;
                Checkbox checkboxDecode = null;
                ThemedComponent themedComponentDecode = null;
                ShimmerLoader shimmerLoaderDecode = null;
                InfoBanner infoBannerDecode = null;
                CircularProgress circularProgressDecode = null;
                MarginTieredInterestRates marginTieredInterestRatesDecode = null;
                TableColumnHeader tableColumnHeaderDecode = null;
                FlagIcon flagIconDecode = null;
                TableInstrumentName tableInstrumentNameDecode = null;
                AnimatedAppearance animatedAppearanceDecode = null;
                AnimatedRevealText animatedRevealTextDecode = null;
                TickerText tickerTextDecode = null;
                ChartGroup chartGroupDecode = null;
                VideoPlayer videoPlayerDecode = null;
                ActivityFeedRow activityFeedRowDecode = null;
                RadioButton radioButtonDecode = null;
                Switch switchDecode = null;
                List listDecode = null;
                Button buttonDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    Text text = textDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                buttonDecode = Button.ADAPTER.decode(reader);
                                break;
                            case 2:
                                textDecode = Text.ADAPTER.decode(reader);
                                continue;
                            case 3:
                                vStackDecode = VStack.ADAPTER.decode(reader);
                                break;
                            case 4:
                                hStackDecode = HStack.ADAPTER.decode(reader);
                                break;
                            case 5:
                                decoratorDecode = Decorator.ADAPTER.decode(reader);
                                break;
                            case 6:
                                cardDecode = Card.ADAPTER.decode(reader);
                                break;
                            case 7:
                                zStackDecode = ZStack.ADAPTER.decode(reader);
                                break;
                            case 8:
                                valuePropWithPictogramDecode = ValuePropWithPictogram.ADAPTER.decode(reader);
                                break;
                            case 9:
                                valuePropWithIconDecode = ValuePropWithIcon.ADAPTER.decode(reader);
                                break;
                            case 10:
                                valuePropWithNumberDecode = ValuePropWithNumber.ADAPTER.decode(reader);
                                break;
                            case 11:
                                imageDecode = Image.ADAPTER.decode(reader);
                                break;
                            case 12:
                                lottieDecode = Lottie.ADAPTER.decode(reader);
                                break;
                            case 13:
                                infoTagDecode = InfoTag.ADAPTER.decode(reader);
                                break;
                            case 14:
                                numberPogDecode = NumberPog.ADAPTER.decode(reader);
                                break;
                            case 15:
                                textPogDecode = TextPog.ADAPTER.decode(reader);
                                break;
                            case 16:
                                timelineDecode = Timeline.ADAPTER.decode(reader);
                                break;
                            case 17:
                                navigationRowDecode = NavigationRow.ADAPTER.decode(reader);
                                break;
                            case 18:
                                pogWithPictogramDecode = PogWithPictogram.ADAPTER.decode(reader);
                                break;
                            case 19:
                                textButtonDecode = TextButton.ADAPTER.decode(reader);
                                break;
                            case 20:
                                iconButtonDecode = IconButton.ADAPTER.decode(reader);
                                break;
                            case 21:
                                textInputDecode = TextInput.ADAPTER.decode(reader);
                                break;
                            case 22:
                                spacerDecode = Spacer.ADAPTER.decode(reader);
                                break;
                            case 23:
                                dataRowStackedDecode = DataRowStacked.ADAPTER.decode(reader);
                                break;
                            case 24:
                                dataRowCondensedDecode = DataRowCondensed.ADAPTER.decode(reader);
                                break;
                            case 25:
                                checkboxDecode = Checkbox.ADAPTER.decode(reader);
                                break;
                            case 26:
                                themedComponentDecode = ThemedComponent.ADAPTER.decode(reader);
                                break;
                            case 27:
                                shimmerLoaderDecode = ShimmerLoader.ADAPTER.decode(reader);
                                break;
                            case 28:
                                infoBannerDecode = InfoBanner.ADAPTER.decode(reader);
                                break;
                            case 29:
                                circularProgressDecode = CircularProgress.ADAPTER.decode(reader);
                                break;
                            case 30:
                                marginTieredInterestRatesDecode = MarginTieredInterestRates.ADAPTER.decode(reader);
                                break;
                            case 31:
                                tableColumnHeaderDecode = TableColumnHeader.ADAPTER.decode(reader);
                                break;
                            case 32:
                                flagIconDecode = FlagIcon.ADAPTER.decode(reader);
                                break;
                            case 33:
                                tableInstrumentNameDecode = TableInstrumentName.ADAPTER.decode(reader);
                                break;
                            case 34:
                                animatedAppearanceDecode = AnimatedAppearance.ADAPTER.decode(reader);
                                break;
                            case 35:
                                animatedRevealTextDecode = AnimatedRevealText.ADAPTER.decode(reader);
                                break;
                            case 36:
                                tickerTextDecode = TickerText.ADAPTER.decode(reader);
                                break;
                            case 37:
                                chartGroupDecode = ChartGroup.ADAPTER.decode(reader);
                                break;
                            case 38:
                                videoPlayerDecode = VideoPlayer.ADAPTER.decode(reader);
                                break;
                            case 39:
                                activityFeedRowDecode = ActivityFeedRow.ADAPTER.decode(reader);
                                break;
                            case 40:
                                radioButtonDecode = RadioButton.ADAPTER.decode(reader);
                                break;
                            case 41:
                                switchDecode = Switch.ADAPTER.decode(reader);
                                break;
                            case 42:
                                listDecode = List.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        textDecode = text;
                    } else {
                        return new UIComponent(buttonDecode, text, vStackDecode, hStackDecode, decoratorDecode, cardDecode, zStackDecode, valuePropWithPictogramDecode, valuePropWithIconDecode, valuePropWithNumberDecode, imageDecode, lottieDecode, infoTagDecode, numberPogDecode, textPogDecode, timelineDecode, navigationRowDecode, pogWithPictogramDecode, textButtonDecode, iconButtonDecode, textInputDecode, spacerDecode, dataRowStackedDecode, dataRowCondensedDecode, checkboxDecode, themedComponentDecode, shimmerLoaderDecode, infoBannerDecode, circularProgressDecode, marginTieredInterestRatesDecode, tableColumnHeaderDecode, flagIconDecode, tableInstrumentNameDecode, animatedAppearanceDecode, animatedRevealTextDecode, tickerTextDecode, chartGroupDecode, videoPlayerDecode, activityFeedRowDecode, radioButtonDecode, switchDecode, listDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UIComponent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Button.ADAPTER.encodedSizeWithTag(1, value.getButton()) + Text.ADAPTER.encodedSizeWithTag(2, value.getText()) + VStack.ADAPTER.encodedSizeWithTag(3, value.getV_stack()) + HStack.ADAPTER.encodedSizeWithTag(4, value.getH_stack()) + Decorator.ADAPTER.encodedSizeWithTag(5, value.getDecorator()) + Card.ADAPTER.encodedSizeWithTag(6, value.getCard()) + ZStack.ADAPTER.encodedSizeWithTag(7, value.getZ_stack()) + ValuePropWithPictogram.ADAPTER.encodedSizeWithTag(8, value.getValue_prop_with_pictogram()) + ValuePropWithIcon.ADAPTER.encodedSizeWithTag(9, value.getValue_prop_with_icon()) + ValuePropWithNumber.ADAPTER.encodedSizeWithTag(10, value.getValue_prop_with_number()) + Image.ADAPTER.encodedSizeWithTag(11, value.getImage()) + Lottie.ADAPTER.encodedSizeWithTag(12, value.getLottie()) + InfoTag.ADAPTER.encodedSizeWithTag(13, value.getInfo_tag()) + NumberPog.ADAPTER.encodedSizeWithTag(14, value.getNumber_pog()) + TextPog.ADAPTER.encodedSizeWithTag(15, value.getText_pog()) + Timeline.ADAPTER.encodedSizeWithTag(16, value.getTimeline()) + NavigationRow.ADAPTER.encodedSizeWithTag(17, value.getNavigation_row()) + PogWithPictogram.ADAPTER.encodedSizeWithTag(18, value.getPog_with_pictogram()) + TextButton.ADAPTER.encodedSizeWithTag(19, value.getText_button()) + IconButton.ADAPTER.encodedSizeWithTag(20, value.getIcon_button()) + TextInput.ADAPTER.encodedSizeWithTag(21, value.getText_input()) + Spacer.ADAPTER.encodedSizeWithTag(22, value.getSpacer()) + DataRowStacked.ADAPTER.encodedSizeWithTag(23, value.getData_row_stacked()) + DataRowCondensed.ADAPTER.encodedSizeWithTag(24, value.getData_row_condensed()) + Checkbox.ADAPTER.encodedSizeWithTag(25, value.getCheckbox()) + ThemedComponent.ADAPTER.encodedSizeWithTag(26, value.getThemed_component()) + ShimmerLoader.ADAPTER.encodedSizeWithTag(27, value.getShimmer_loader()) + InfoBanner.ADAPTER.encodedSizeWithTag(28, value.getInfo_banner()) + CircularProgress.ADAPTER.encodedSizeWithTag(29, value.getCircular_progress()) + MarginTieredInterestRates.ADAPTER.encodedSizeWithTag(30, value.getMargin_tiered_interest_rates()) + TableColumnHeader.ADAPTER.encodedSizeWithTag(31, value.getTable_column_header()) + FlagIcon.ADAPTER.encodedSizeWithTag(32, value.getFlag_icon()) + TableInstrumentName.ADAPTER.encodedSizeWithTag(33, value.getTable_instrument_name()) + AnimatedAppearance.ADAPTER.encodedSizeWithTag(34, value.getAnimated_appearance()) + AnimatedRevealText.ADAPTER.encodedSizeWithTag(35, value.getAnimated_reveal_text()) + TickerText.ADAPTER.encodedSizeWithTag(36, value.getTicker_text()) + ChartGroup.ADAPTER.encodedSizeWithTag(37, value.getChart_group()) + VideoPlayer.ADAPTER.encodedSizeWithTag(38, value.getVideo_player()) + ActivityFeedRow.ADAPTER.encodedSizeWithTag(39, value.getActivity_feed_row()) + RadioButton.ADAPTER.encodedSizeWithTag(40, value.getRadio_button()) + Switch.ADAPTER.encodedSizeWithTag(41, value.getSwitch()) + List.ADAPTER.encodedSizeWithTag(42, value.getList());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UIComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
                Text.ADAPTER.encodeWithTag(writer, 2, (int) value.getText());
                VStack.ADAPTER.encodeWithTag(writer, 3, (int) value.getV_stack());
                HStack.ADAPTER.encodeWithTag(writer, 4, (int) value.getH_stack());
                Decorator.ADAPTER.encodeWithTag(writer, 5, (int) value.getDecorator());
                Card.ADAPTER.encodeWithTag(writer, 6, (int) value.getCard());
                ZStack.ADAPTER.encodeWithTag(writer, 7, (int) value.getZ_stack());
                ValuePropWithPictogram.ADAPTER.encodeWithTag(writer, 8, (int) value.getValue_prop_with_pictogram());
                ValuePropWithIcon.ADAPTER.encodeWithTag(writer, 9, (int) value.getValue_prop_with_icon());
                ValuePropWithNumber.ADAPTER.encodeWithTag(writer, 10, (int) value.getValue_prop_with_number());
                Image.ADAPTER.encodeWithTag(writer, 11, (int) value.getImage());
                Lottie.ADAPTER.encodeWithTag(writer, 12, (int) value.getLottie());
                InfoTag.ADAPTER.encodeWithTag(writer, 13, (int) value.getInfo_tag());
                NumberPog.ADAPTER.encodeWithTag(writer, 14, (int) value.getNumber_pog());
                TextPog.ADAPTER.encodeWithTag(writer, 15, (int) value.getText_pog());
                Timeline.ADAPTER.encodeWithTag(writer, 16, (int) value.getTimeline());
                NavigationRow.ADAPTER.encodeWithTag(writer, 17, (int) value.getNavigation_row());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 18, (int) value.getPog_with_pictogram());
                TextButton.ADAPTER.encodeWithTag(writer, 19, (int) value.getText_button());
                IconButton.ADAPTER.encodeWithTag(writer, 20, (int) value.getIcon_button());
                TextInput.ADAPTER.encodeWithTag(writer, 21, (int) value.getText_input());
                Spacer.ADAPTER.encodeWithTag(writer, 22, (int) value.getSpacer());
                DataRowStacked.ADAPTER.encodeWithTag(writer, 23, (int) value.getData_row_stacked());
                DataRowCondensed.ADAPTER.encodeWithTag(writer, 24, (int) value.getData_row_condensed());
                Checkbox.ADAPTER.encodeWithTag(writer, 25, (int) value.getCheckbox());
                ThemedComponent.ADAPTER.encodeWithTag(writer, 26, (int) value.getThemed_component());
                ShimmerLoader.ADAPTER.encodeWithTag(writer, 27, (int) value.getShimmer_loader());
                InfoBanner.ADAPTER.encodeWithTag(writer, 28, (int) value.getInfo_banner());
                CircularProgress.ADAPTER.encodeWithTag(writer, 29, (int) value.getCircular_progress());
                MarginTieredInterestRates.ADAPTER.encodeWithTag(writer, 30, (int) value.getMargin_tiered_interest_rates());
                TableColumnHeader.ADAPTER.encodeWithTag(writer, 31, (int) value.getTable_column_header());
                FlagIcon.ADAPTER.encodeWithTag(writer, 32, (int) value.getFlag_icon());
                TableInstrumentName.ADAPTER.encodeWithTag(writer, 33, (int) value.getTable_instrument_name());
                AnimatedAppearance.ADAPTER.encodeWithTag(writer, 34, (int) value.getAnimated_appearance());
                AnimatedRevealText.ADAPTER.encodeWithTag(writer, 35, (int) value.getAnimated_reveal_text());
                TickerText.ADAPTER.encodeWithTag(writer, 36, (int) value.getTicker_text());
                ChartGroup.ADAPTER.encodeWithTag(writer, 37, (int) value.getChart_group());
                VideoPlayer.ADAPTER.encodeWithTag(writer, 38, (int) value.getVideo_player());
                ActivityFeedRow.ADAPTER.encodeWithTag(writer, 39, (int) value.getActivity_feed_row());
                RadioButton.ADAPTER.encodeWithTag(writer, 40, (int) value.getRadio_button());
                Switch.ADAPTER.encodeWithTag(writer, 41, (int) value.getSwitch());
                List.ADAPTER.encodeWithTag(writer, 42, (int) value.getList());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UIComponent value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                List.ADAPTER.encodeWithTag(writer, 42, (int) value.getList());
                Switch.ADAPTER.encodeWithTag(writer, 41, (int) value.getSwitch());
                RadioButton.ADAPTER.encodeWithTag(writer, 40, (int) value.getRadio_button());
                ActivityFeedRow.ADAPTER.encodeWithTag(writer, 39, (int) value.getActivity_feed_row());
                VideoPlayer.ADAPTER.encodeWithTag(writer, 38, (int) value.getVideo_player());
                ChartGroup.ADAPTER.encodeWithTag(writer, 37, (int) value.getChart_group());
                TickerText.ADAPTER.encodeWithTag(writer, 36, (int) value.getTicker_text());
                AnimatedRevealText.ADAPTER.encodeWithTag(writer, 35, (int) value.getAnimated_reveal_text());
                AnimatedAppearance.ADAPTER.encodeWithTag(writer, 34, (int) value.getAnimated_appearance());
                TableInstrumentName.ADAPTER.encodeWithTag(writer, 33, (int) value.getTable_instrument_name());
                FlagIcon.ADAPTER.encodeWithTag(writer, 32, (int) value.getFlag_icon());
                TableColumnHeader.ADAPTER.encodeWithTag(writer, 31, (int) value.getTable_column_header());
                MarginTieredInterestRates.ADAPTER.encodeWithTag(writer, 30, (int) value.getMargin_tiered_interest_rates());
                CircularProgress.ADAPTER.encodeWithTag(writer, 29, (int) value.getCircular_progress());
                InfoBanner.ADAPTER.encodeWithTag(writer, 28, (int) value.getInfo_banner());
                ShimmerLoader.ADAPTER.encodeWithTag(writer, 27, (int) value.getShimmer_loader());
                ThemedComponent.ADAPTER.encodeWithTag(writer, 26, (int) value.getThemed_component());
                Checkbox.ADAPTER.encodeWithTag(writer, 25, (int) value.getCheckbox());
                DataRowCondensed.ADAPTER.encodeWithTag(writer, 24, (int) value.getData_row_condensed());
                DataRowStacked.ADAPTER.encodeWithTag(writer, 23, (int) value.getData_row_stacked());
                Spacer.ADAPTER.encodeWithTag(writer, 22, (int) value.getSpacer());
                TextInput.ADAPTER.encodeWithTag(writer, 21, (int) value.getText_input());
                IconButton.ADAPTER.encodeWithTag(writer, 20, (int) value.getIcon_button());
                TextButton.ADAPTER.encodeWithTag(writer, 19, (int) value.getText_button());
                PogWithPictogram.ADAPTER.encodeWithTag(writer, 18, (int) value.getPog_with_pictogram());
                NavigationRow.ADAPTER.encodeWithTag(writer, 17, (int) value.getNavigation_row());
                Timeline.ADAPTER.encodeWithTag(writer, 16, (int) value.getTimeline());
                TextPog.ADAPTER.encodeWithTag(writer, 15, (int) value.getText_pog());
                NumberPog.ADAPTER.encodeWithTag(writer, 14, (int) value.getNumber_pog());
                InfoTag.ADAPTER.encodeWithTag(writer, 13, (int) value.getInfo_tag());
                Lottie.ADAPTER.encodeWithTag(writer, 12, (int) value.getLottie());
                Image.ADAPTER.encodeWithTag(writer, 11, (int) value.getImage());
                ValuePropWithNumber.ADAPTER.encodeWithTag(writer, 10, (int) value.getValue_prop_with_number());
                ValuePropWithIcon.ADAPTER.encodeWithTag(writer, 9, (int) value.getValue_prop_with_icon());
                ValuePropWithPictogram.ADAPTER.encodeWithTag(writer, 8, (int) value.getValue_prop_with_pictogram());
                ZStack.ADAPTER.encodeWithTag(writer, 7, (int) value.getZ_stack());
                Card.ADAPTER.encodeWithTag(writer, 6, (int) value.getCard());
                Decorator.ADAPTER.encodeWithTag(writer, 5, (int) value.getDecorator());
                HStack.ADAPTER.encodeWithTag(writer, 4, (int) value.getH_stack());
                VStack.ADAPTER.encodeWithTag(writer, 3, (int) value.getV_stack());
                Text.ADAPTER.encodeWithTag(writer, 2, (int) value.getText());
                Button.ADAPTER.encodeWithTag(writer, 1, (int) value.getButton());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UIComponent redact(UIComponent value) {
                TextPog textPog;
                NavigationRow navigationRow;
                TextButton textButton;
                TextInput textInput;
                DataRowStacked dataRowStacked;
                Checkbox checkbox;
                ShimmerLoader shimmerLoader;
                CircularProgress circularProgress;
                TableColumnHeader tableColumnHeader;
                TableInstrumentName tableInstrumentName;
                AnimatedRevealText animatedRevealText;
                ChartGroup chartGroup;
                ActivityFeedRow activityFeedRow;
                List listRedact;
                Switch r42;
                Intrinsics.checkNotNullParameter(value, "value");
                Button button = value.getButton();
                Button buttonRedact = button != null ? Button.ADAPTER.redact(button) : null;
                Text text = value.getText();
                Text textRedact = text != null ? Text.ADAPTER.redact(text) : null;
                VStack v_stack = value.getV_stack();
                VStack vStackRedact = v_stack != null ? VStack.ADAPTER.redact(v_stack) : null;
                HStack h_stack = value.getH_stack();
                HStack hStackRedact = h_stack != null ? HStack.ADAPTER.redact(h_stack) : null;
                Decorator decorator = value.getDecorator();
                Decorator decoratorRedact = decorator != null ? Decorator.ADAPTER.redact(decorator) : null;
                Card card = value.getCard();
                Card cardRedact = card != null ? Card.ADAPTER.redact(card) : null;
                ZStack z_stack = value.getZ_stack();
                ZStack zStackRedact = z_stack != null ? ZStack.ADAPTER.redact(z_stack) : null;
                ValuePropWithPictogram value_prop_with_pictogram = value.getValue_prop_with_pictogram();
                ValuePropWithPictogram valuePropWithPictogramRedact = value_prop_with_pictogram != null ? ValuePropWithPictogram.ADAPTER.redact(value_prop_with_pictogram) : null;
                ValuePropWithIcon value_prop_with_icon = value.getValue_prop_with_icon();
                ValuePropWithIcon valuePropWithIconRedact = value_prop_with_icon != null ? ValuePropWithIcon.ADAPTER.redact(value_prop_with_icon) : null;
                ValuePropWithNumber value_prop_with_number = value.getValue_prop_with_number();
                ValuePropWithNumber valuePropWithNumberRedact = value_prop_with_number != null ? ValuePropWithNumber.ADAPTER.redact(value_prop_with_number) : null;
                Image image = value.getImage();
                Image imageRedact = image != null ? Image.ADAPTER.redact(image) : null;
                Lottie lottie = value.getLottie();
                Lottie lottieRedact = lottie != null ? Lottie.ADAPTER.redact(lottie) : null;
                InfoTag info_tag = value.getInfo_tag();
                InfoTag infoTagRedact = info_tag != null ? InfoTag.ADAPTER.redact(info_tag) : null;
                NumberPog number_pog = value.getNumber_pog();
                NumberPog numberPogRedact = number_pog != null ? NumberPog.ADAPTER.redact(number_pog) : null;
                TextPog text_pog = value.getText_pog();
                Button button2 = buttonRedact;
                TextPog textPogRedact = text_pog != null ? TextPog.ADAPTER.redact(text_pog) : null;
                Timeline timeline = value.getTimeline();
                TextPog textPog2 = textPogRedact;
                Timeline timelineRedact = timeline != null ? Timeline.ADAPTER.redact(timeline) : null;
                NavigationRow navigation_row = value.getNavigation_row();
                Timeline timeline2 = timelineRedact;
                NavigationRow navigationRowRedact = navigation_row != null ? NavigationRow.ADAPTER.redact(navigation_row) : null;
                PogWithPictogram pog_with_pictogram = value.getPog_with_pictogram();
                NavigationRow navigationRow2 = navigationRowRedact;
                PogWithPictogram pogWithPictogramRedact = pog_with_pictogram != null ? PogWithPictogram.ADAPTER.redact(pog_with_pictogram) : null;
                TextButton text_button = value.getText_button();
                PogWithPictogram pogWithPictogram = pogWithPictogramRedact;
                TextButton textButtonRedact = text_button != null ? TextButton.ADAPTER.redact(text_button) : null;
                IconButton icon_button = value.getIcon_button();
                TextButton textButton2 = textButtonRedact;
                IconButton iconButtonRedact = icon_button != null ? IconButton.ADAPTER.redact(icon_button) : null;
                TextInput text_input = value.getText_input();
                IconButton iconButton = iconButtonRedact;
                TextInput textInputRedact = text_input != null ? TextInput.ADAPTER.redact(text_input) : null;
                Spacer spacer = value.getSpacer();
                TextInput textInput2 = textInputRedact;
                Spacer spacerRedact = spacer != null ? Spacer.ADAPTER.redact(spacer) : null;
                DataRowStacked data_row_stacked = value.getData_row_stacked();
                Spacer spacer2 = spacerRedact;
                DataRowStacked dataRowStackedRedact = data_row_stacked != null ? DataRowStacked.ADAPTER.redact(data_row_stacked) : null;
                DataRowCondensed data_row_condensed = value.getData_row_condensed();
                DataRowStacked dataRowStacked2 = dataRowStackedRedact;
                DataRowCondensed dataRowCondensedRedact = data_row_condensed != null ? DataRowCondensed.ADAPTER.redact(data_row_condensed) : null;
                Checkbox checkbox2 = value.getCheckbox();
                DataRowCondensed dataRowCondensed = dataRowCondensedRedact;
                Checkbox checkboxRedact = checkbox2 != null ? Checkbox.ADAPTER.redact(checkbox2) : null;
                ThemedComponent themed_component = value.getThemed_component();
                Checkbox checkbox3 = checkboxRedact;
                ThemedComponent themedComponentRedact = themed_component != null ? ThemedComponent.ADAPTER.redact(themed_component) : null;
                ShimmerLoader shimmer_loader = value.getShimmer_loader();
                ThemedComponent themedComponent = themedComponentRedact;
                ShimmerLoader shimmerLoaderRedact = shimmer_loader != null ? ShimmerLoader.ADAPTER.redact(shimmer_loader) : null;
                InfoBanner info_banner = value.getInfo_banner();
                ShimmerLoader shimmerLoader2 = shimmerLoaderRedact;
                InfoBanner infoBannerRedact = info_banner != null ? InfoBanner.ADAPTER.redact(info_banner) : null;
                CircularProgress circular_progress = value.getCircular_progress();
                InfoBanner infoBanner = infoBannerRedact;
                CircularProgress circularProgressRedact = circular_progress != null ? CircularProgress.ADAPTER.redact(circular_progress) : null;
                MarginTieredInterestRates margin_tiered_interest_rates = value.getMargin_tiered_interest_rates();
                CircularProgress circularProgress2 = circularProgressRedact;
                MarginTieredInterestRates marginTieredInterestRatesRedact = margin_tiered_interest_rates != null ? MarginTieredInterestRates.ADAPTER.redact(margin_tiered_interest_rates) : null;
                TableColumnHeader table_column_header = value.getTable_column_header();
                MarginTieredInterestRates marginTieredInterestRates = marginTieredInterestRatesRedact;
                TableColumnHeader tableColumnHeaderRedact = table_column_header != null ? TableColumnHeader.ADAPTER.redact(table_column_header) : null;
                FlagIcon flag_icon = value.getFlag_icon();
                TableColumnHeader tableColumnHeader2 = tableColumnHeaderRedact;
                FlagIcon flagIconRedact = flag_icon != null ? FlagIcon.ADAPTER.redact(flag_icon) : null;
                TableInstrumentName table_instrument_name = value.getTable_instrument_name();
                FlagIcon flagIcon = flagIconRedact;
                TableInstrumentName tableInstrumentNameRedact = table_instrument_name != null ? TableInstrumentName.ADAPTER.redact(table_instrument_name) : null;
                AnimatedAppearance animated_appearance = value.getAnimated_appearance();
                TableInstrumentName tableInstrumentName2 = tableInstrumentNameRedact;
                AnimatedAppearance animatedAppearanceRedact = animated_appearance != null ? AnimatedAppearance.ADAPTER.redact(animated_appearance) : null;
                AnimatedRevealText animated_reveal_text = value.getAnimated_reveal_text();
                AnimatedAppearance animatedAppearance = animatedAppearanceRedact;
                AnimatedRevealText animatedRevealTextRedact = animated_reveal_text != null ? AnimatedRevealText.ADAPTER.redact(animated_reveal_text) : null;
                TickerText ticker_text = value.getTicker_text();
                AnimatedRevealText animatedRevealText2 = animatedRevealTextRedact;
                TickerText tickerTextRedact = ticker_text != null ? TickerText.ADAPTER.redact(ticker_text) : null;
                ChartGroup chart_group = value.getChart_group();
                TickerText tickerText = tickerTextRedact;
                ChartGroup chartGroupRedact = chart_group != null ? ChartGroup.ADAPTER.redact(chart_group) : null;
                VideoPlayer video_player = value.getVideo_player();
                ChartGroup chartGroup2 = chartGroupRedact;
                VideoPlayer videoPlayerRedact = video_player != null ? VideoPlayer.ADAPTER.redact(video_player) : null;
                ActivityFeedRow activity_feed_row = value.getActivity_feed_row();
                VideoPlayer videoPlayer = videoPlayerRedact;
                ActivityFeedRow activityFeedRowRedact = activity_feed_row != null ? ActivityFeedRow.ADAPTER.redact(activity_feed_row) : null;
                RadioButton radio_button = value.getRadio_button();
                ActivityFeedRow activityFeedRow2 = activityFeedRowRedact;
                RadioButton radioButtonRedact = radio_button != null ? RadioButton.ADAPTER.redact(radio_button) : null;
                Switch r2 = value.getSwitch();
                RadioButton radioButton = radioButtonRedact;
                Switch switchRedact = r2 != null ? Switch.ADAPTER.redact(r2) : null;
                List list = value.getList();
                if (list != null) {
                    listRedact = List.ADAPTER.redact(list);
                    textPog = textPog2;
                    navigationRow = navigationRow2;
                    textButton = textButton2;
                    textInput = textInput2;
                    dataRowStacked = dataRowStacked2;
                    checkbox = checkbox3;
                    shimmerLoader = shimmerLoader2;
                    circularProgress = circularProgress2;
                    tableColumnHeader = tableColumnHeader2;
                    tableInstrumentName = tableInstrumentName2;
                    animatedRevealText = animatedRevealText2;
                    chartGroup = chartGroup2;
                    activityFeedRow = activityFeedRow2;
                    r42 = switchRedact;
                } else {
                    textPog = textPog2;
                    navigationRow = navigationRow2;
                    textButton = textButton2;
                    textInput = textInput2;
                    dataRowStacked = dataRowStacked2;
                    checkbox = checkbox3;
                    shimmerLoader = shimmerLoader2;
                    circularProgress = circularProgress2;
                    tableColumnHeader = tableColumnHeader2;
                    tableInstrumentName = tableInstrumentName2;
                    animatedRevealText = animatedRevealText2;
                    chartGroup = chartGroup2;
                    activityFeedRow = activityFeedRow2;
                    listRedact = null;
                    r42 = switchRedact;
                }
                return value.copy(button2, textRedact, vStackRedact, hStackRedact, decoratorRedact, cardRedact, zStackRedact, valuePropWithPictogramRedact, valuePropWithIconRedact, valuePropWithNumberRedact, imageRedact, lottieRedact, infoTagRedact, numberPogRedact, textPog, timeline2, navigationRow, pogWithPictogram, textButton, iconButton, textInput, spacer2, dataRowStacked, dataRowCondensed, checkbox, themedComponent, shimmerLoader, infoBanner, circularProgress, marginTieredInterestRates, tableColumnHeader, flagIcon, tableInstrumentName, animatedAppearance, animatedRevealText, tickerText, chartGroup, videoPlayer, activityFeedRow, radioButton, r42, listRedact, ByteString.EMPTY);
            }
        };
    }
}
