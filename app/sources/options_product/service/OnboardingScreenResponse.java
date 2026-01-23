package options_product.service;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSource;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import options_product.service.OnboardingScreenResponse;

/* compiled from: OnboardingScreenResponse.kt */
@Metadata(m3635d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 ·\u00012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004·\u0001¸\u0001B\u008d\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010W\u001a\u00020X¢\u0006\u0004\bY\u0010ZJ\t\u0010®\u0001\u001a\u00020\u0002H\u0017J\u0016\u0010¯\u0001\u001a\u00020\u00042\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u0001H\u0096\u0002J\n\u0010²\u0001\u001a\u00030³\u0001H\u0016J\n\u0010´\u0001\u001a\u00030µ\u0001H\u0016J\u008d\u0004\u0010¶\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001022\n\b\u0002\u00103\u001a\u0004\u0018\u0001042\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010J2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010R2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V2\b\b\u0002\u0010W\u001a\u00020XR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010[R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010[R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010[R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0018\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0018\u0010#\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0018\u0010%\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0018\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u001a\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010+\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010/\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u00101\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u00103\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u00105\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001a\u00109\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010;\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001a\u0010?\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001a\u0010A\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001a\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010G\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010I\u001a\u0004\u0018\u00010J8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001R\u001a\u0010K\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010M\u001a\u0004\u0018\u00010N8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010O\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010Q\u001a\u0004\u0018\u00010R8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010S\u001a\u0004\u0018\u00010T8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001R\u001a\u0010U\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\n\n\u0000\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006¹\u0001"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponse;", "Lcom/squareup/wire/Message;", "", "is_checkpoint", "", "should_live_in_backstack", "should_clear_backstack", "upgrade_progress", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "start", "Loptions_product/service/StartResponseMetadata;", "splash_l0", "Loptions_product/service/SplashL0ResponseMetadata;", "splash_l2", "Loptions_product/service/SplashL2ResponseMetadata;", "splash_retirement", "Loptions_product/service/SplashRetirementResponseMetadata;", "question_option_experience", "Loptions_product/service/QuestionOptionExperienceResponseMetadata;", "question_understand_spread", "Loptions_product/service/QuestionUnderstandSpreadResponseMetadata;", "question_investment_advice", "Loptions_product/service/QuestionInvestmentAdviceResponseMetadata;", "question_financial_regulator", "Loptions_product/service/QuestionFinancialRegulatorResponseMetadata;", QuestionnaireContexts.SUITABILITY, "Loptions_product/service/SuitabilityResponseMetadata;", "investment_profile", "Loptions_product/service/InvestmentProfileResponseMetadata;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Loptions_product/service/DisclosureResponseMetadata;", "approved_trades", "Loptions_product/service/ApprovedTradesResponseMetadata;", "success", "Loptions_product/service/SuccessResponseMetadata;", "failure", "Loptions_product/service/FailureResponseMetadata;", "education_spread", "Loptions_product/service/EducationSpreadResponseMetadata;", "education_l3_strategies", "Loptions_product/service/EducationL3StrategiesResponseMetadata;", "ready_l3_upgrade", "Loptions_product/service/ReadyL3UpgradeResponseMetadata;", "upsell_alert", "Loptions_product/service/UpsellAlertResponseMetadata;", "upsell_trade_on_expiration", "Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;", "upsell_all_set", "Loptions_product/service/UpsellAllSetResponseMetadata;", "end", "Loptions_product/service/EndResponseMetadata;", "knowledge_test_questionnaire", "Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadata;", "experience_test_questionnaire", "Loptions_product/service/ExperienceTestQuestionnaireResponseMetadata;", "investor_profile", "Loptions_product/service/InvestorProfileV2ResponseMetadata;", "review_investor_profile", "Loptions_product/service/ReviewInvestorProfileV2ResponseMetadata;", "education_home", "Loptions_product/service/UKEducationHomeResponseMetadata;", "education_strategy", "Loptions_product/service/UKEducationStrategyResponseMetadata;", "education_risks", "Loptions_product/service/UKEducationRisksResponseMetadata;", "education_professional_trader", "Loptions_product/service/UKEducationProfessionalTraderResponseMetadata;", "uk_l3_education_home", "Loptions_product/service/UKL3EducationHomeResponseMetadata;", "uk_l3_education_spread_benefits", "Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadata;", "rhsg_home", "Loptions_product/service/RHSGHomeResponseMetadata;", "rhsg_complete_car_questionnaire", "Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadata;", "professional_trader", "Loptions_product/service/ProfessionalTraderResponseMetadata;", "rhsg_l2_approved_trades", "Loptions_product/service/RHSGL2ApprovedTradesResponseMetadata;", "rhsg_l3_approved_trades", "Loptions_product/service/RHSGL3ApprovedTradesResponseMetadata;", "ja_pending_application", "Loptions_product/service/JAPendingApplicationResponseMetadata;", "knowledge_check_needed", "Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "onboarding_progress", "Loptions_product/service/OnboardingProgress;", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLoptions_product/service/OnboardingScreenResponse$UpgradeProgress;Loptions_product/service/StartResponseMetadata;Loptions_product/service/SplashL0ResponseMetadata;Loptions_product/service/SplashL2ResponseMetadata;Loptions_product/service/SplashRetirementResponseMetadata;Loptions_product/service/QuestionOptionExperienceResponseMetadata;Loptions_product/service/QuestionUnderstandSpreadResponseMetadata;Loptions_product/service/QuestionInvestmentAdviceResponseMetadata;Loptions_product/service/QuestionFinancialRegulatorResponseMetadata;Loptions_product/service/SuitabilityResponseMetadata;Loptions_product/service/InvestmentProfileResponseMetadata;Loptions_product/service/DisclosureResponseMetadata;Loptions_product/service/ApprovedTradesResponseMetadata;Loptions_product/service/SuccessResponseMetadata;Loptions_product/service/FailureResponseMetadata;Loptions_product/service/EducationSpreadResponseMetadata;Loptions_product/service/EducationL3StrategiesResponseMetadata;Loptions_product/service/ReadyL3UpgradeResponseMetadata;Loptions_product/service/UpsellAlertResponseMetadata;Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;Loptions_product/service/UpsellAllSetResponseMetadata;Loptions_product/service/EndResponseMetadata;Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadata;Loptions_product/service/ExperienceTestQuestionnaireResponseMetadata;Loptions_product/service/InvestorProfileV2ResponseMetadata;Loptions_product/service/ReviewInvestorProfileV2ResponseMetadata;Loptions_product/service/UKEducationHomeResponseMetadata;Loptions_product/service/UKEducationStrategyResponseMetadata;Loptions_product/service/UKEducationRisksResponseMetadata;Loptions_product/service/UKEducationProfessionalTraderResponseMetadata;Loptions_product/service/UKL3EducationHomeResponseMetadata;Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadata;Loptions_product/service/RHSGHomeResponseMetadata;Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadata;Loptions_product/service/ProfessionalTraderResponseMetadata;Loptions_product/service/RHSGL2ApprovedTradesResponseMetadata;Loptions_product/service/RHSGL3ApprovedTradesResponseMetadata;Loptions_product/service/JAPendingApplicationResponseMetadata;Loptions_product/service/KnowledgeCheckNeededResponseMetadata;Loptions_product/service/OnboardingProgress;Lokio/ByteString;)V", "()Z", "getShould_live_in_backstack", "getShould_clear_backstack", "getUpgrade_progress", "()Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "getStart", "()Loptions_product/service/StartResponseMetadata;", "getSplash_l0", "()Loptions_product/service/SplashL0ResponseMetadata;", "getSplash_l2", "()Loptions_product/service/SplashL2ResponseMetadata;", "getSplash_retirement", "()Loptions_product/service/SplashRetirementResponseMetadata;", "getQuestion_option_experience", "()Loptions_product/service/QuestionOptionExperienceResponseMetadata;", "getQuestion_understand_spread", "()Loptions_product/service/QuestionUnderstandSpreadResponseMetadata;", "getQuestion_investment_advice", "()Loptions_product/service/QuestionInvestmentAdviceResponseMetadata;", "getQuestion_financial_regulator", "()Loptions_product/service/QuestionFinancialRegulatorResponseMetadata;", "getSuitability", "()Loptions_product/service/SuitabilityResponseMetadata;", "getInvestment_profile", "()Loptions_product/service/InvestmentProfileResponseMetadata;", "getDisclosure", "()Loptions_product/service/DisclosureResponseMetadata;", "getApproved_trades", "()Loptions_product/service/ApprovedTradesResponseMetadata;", "getSuccess", "()Loptions_product/service/SuccessResponseMetadata;", "getFailure", "()Loptions_product/service/FailureResponseMetadata;", "getEducation_spread", "()Loptions_product/service/EducationSpreadResponseMetadata;", "getEducation_l3_strategies", "()Loptions_product/service/EducationL3StrategiesResponseMetadata;", "getReady_l3_upgrade", "()Loptions_product/service/ReadyL3UpgradeResponseMetadata;", "getUpsell_alert", "()Loptions_product/service/UpsellAlertResponseMetadata;", "getUpsell_trade_on_expiration", "()Loptions_product/service/UpsellTradeOnExpirationResponseMetadata;", "getUpsell_all_set", "()Loptions_product/service/UpsellAllSetResponseMetadata;", "getEnd", "()Loptions_product/service/EndResponseMetadata;", "getKnowledge_test_questionnaire", "()Loptions_product/service/KnowledgeTestQuestionnaireResponseMetadata;", "getExperience_test_questionnaire", "()Loptions_product/service/ExperienceTestQuestionnaireResponseMetadata;", "getInvestor_profile", "()Loptions_product/service/InvestorProfileV2ResponseMetadata;", "getReview_investor_profile", "()Loptions_product/service/ReviewInvestorProfileV2ResponseMetadata;", "getEducation_home", "()Loptions_product/service/UKEducationHomeResponseMetadata;", "getEducation_strategy", "()Loptions_product/service/UKEducationStrategyResponseMetadata;", "getEducation_risks", "()Loptions_product/service/UKEducationRisksResponseMetadata;", "getEducation_professional_trader", "()Loptions_product/service/UKEducationProfessionalTraderResponseMetadata;", "getUk_l3_education_home", "()Loptions_product/service/UKL3EducationHomeResponseMetadata;", "getUk_l3_education_spread_benefits", "()Loptions_product/service/UKL3EducationSpreadBenefitsResponseMetadata;", "getRhsg_home", "()Loptions_product/service/RHSGHomeResponseMetadata;", "getRhsg_complete_car_questionnaire", "()Loptions_product/service/RHSGCompleteCARQuestionnaireResponseMetadata;", "getProfessional_trader", "()Loptions_product/service/ProfessionalTraderResponseMetadata;", "getRhsg_l2_approved_trades", "()Loptions_product/service/RHSGL2ApprovedTradesResponseMetadata;", "getRhsg_l3_approved_trades", "()Loptions_product/service/RHSGL3ApprovedTradesResponseMetadata;", "getJa_pending_application", "()Loptions_product/service/JAPendingApplicationResponseMetadata;", "getKnowledge_check_needed", "()Loptions_product/service/KnowledgeCheckNeededResponseMetadata;", "getOnboarding_progress", "()Loptions_product/service/OnboardingProgress;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "UpgradeProgress", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OnboardingScreenResponse extends Message {

    @JvmField
    public static final ProtoAdapter<OnboardingScreenResponse> ADAPTER;

    @WireField(adapter = "options_product.service.ApprovedTradesResponseMetadata#ADAPTER", jsonName = "approvedTrades", oneofName = "response_metadata", schemaIndex = 15, tag = 15)
    private final ApprovedTradesResponseMetadata approved_trades;

    @WireField(adapter = "options_product.service.DisclosureResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 14, tag = 14)
    private final DisclosureResponseMetadata disclosure;

    @WireField(adapter = "options_product.service.UKEducationHomeResponseMetadata#ADAPTER", jsonName = EducationSource.EDUCATION_SOURCE_EDUCATION_HOME, oneofName = "response_metadata", schemaIndex = 29, tag = 30)
    private final UKEducationHomeResponseMetadata education_home;

    @WireField(adapter = "options_product.service.EducationL3StrategiesResponseMetadata#ADAPTER", jsonName = "educationL3Strategies", oneofName = "response_metadata", schemaIndex = 19, tag = 19)
    private final EducationL3StrategiesResponseMetadata education_l3_strategies;

    @WireField(adapter = "options_product.service.UKEducationProfessionalTraderResponseMetadata#ADAPTER", jsonName = "educationProfessionalTrader", oneofName = "response_metadata", schemaIndex = 32, tag = 33)
    private final UKEducationProfessionalTraderResponseMetadata education_professional_trader;

    @WireField(adapter = "options_product.service.UKEducationRisksResponseMetadata#ADAPTER", jsonName = "educationRisks", oneofName = "response_metadata", schemaIndex = 31, tag = 32)
    private final UKEducationRisksResponseMetadata education_risks;

    @WireField(adapter = "options_product.service.EducationSpreadResponseMetadata#ADAPTER", jsonName = "educationSpread", oneofName = "response_metadata", schemaIndex = 18, tag = 18)
    private final EducationSpreadResponseMetadata education_spread;

    @WireField(adapter = "options_product.service.UKEducationStrategyResponseMetadata#ADAPTER", jsonName = "educationStrategy", oneofName = "response_metadata", schemaIndex = 30, tag = 31)
    private final UKEducationStrategyResponseMetadata education_strategy;

    @WireField(adapter = "options_product.service.EndResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 24, tag = 24)
    private final EndResponseMetadata end;

    @WireField(adapter = "options_product.service.ExperienceTestQuestionnaireResponseMetadata#ADAPTER", jsonName = "experienceTestQuestionnaire", oneofName = "response_metadata", schemaIndex = 26, tag = 27)
    private final ExperienceTestQuestionnaireResponseMetadata experience_test_questionnaire;

    @WireField(adapter = "options_product.service.FailureResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 17, tag = 17)
    private final FailureResponseMetadata failure;

    @WireField(adapter = "options_product.service.InvestmentProfileResponseMetadata#ADAPTER", jsonName = "investmentProfile", oneofName = "response_metadata", schemaIndex = 13, tag = 13)
    private final InvestmentProfileResponseMetadata investment_profile;

    @WireField(adapter = "options_product.service.InvestorProfileV2ResponseMetadata#ADAPTER", jsonName = "investorProfile", oneofName = "response_metadata", schemaIndex = 27, tag = 28)
    private final InvestorProfileV2ResponseMetadata investor_profile;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isCheckpoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_checkpoint;

    @WireField(adapter = "options_product.service.JAPendingApplicationResponseMetadata#ADAPTER", jsonName = "jaPendingApplication", oneofName = "response_metadata", schemaIndex = 40, tag = 42)
    private final JAPendingApplicationResponseMetadata ja_pending_application;

    @WireField(adapter = "options_product.service.KnowledgeCheckNeededResponseMetadata#ADAPTER", jsonName = "knowledgeCheckNeeded", oneofName = "response_metadata", schemaIndex = 41, tag = 43)
    private final KnowledgeCheckNeededResponseMetadata knowledge_check_needed;

    @WireField(adapter = "options_product.service.KnowledgeTestQuestionnaireResponseMetadata#ADAPTER", jsonName = "knowledgeTestQuestionnaire", oneofName = "response_metadata", schemaIndex = 25, tag = 26)
    private final KnowledgeTestQuestionnaireResponseMetadata knowledge_test_questionnaire;

    @WireField(adapter = "options_product.service.OnboardingProgress#ADAPTER", jsonName = "onboardingProgress", schemaIndex = 42, tag = 36)
    private final OnboardingProgress onboarding_progress;

    @WireField(adapter = "options_product.service.ProfessionalTraderResponseMetadata#ADAPTER", jsonName = "professionalTrader", oneofName = "response_metadata", schemaIndex = 37, tag = 39)
    private final ProfessionalTraderResponseMetadata professional_trader;

    @WireField(adapter = "options_product.service.QuestionFinancialRegulatorResponseMetadata#ADAPTER", jsonName = "questionFinancialRegulator", oneofName = "response_metadata", schemaIndex = 11, tag = 11)
    private final QuestionFinancialRegulatorResponseMetadata question_financial_regulator;

    @WireField(adapter = "options_product.service.QuestionInvestmentAdviceResponseMetadata#ADAPTER", jsonName = "questionInvestmentAdvice", oneofName = "response_metadata", schemaIndex = 10, tag = 10)
    private final QuestionInvestmentAdviceResponseMetadata question_investment_advice;

    @WireField(adapter = "options_product.service.QuestionOptionExperienceResponseMetadata#ADAPTER", jsonName = "questionOptionExperience", oneofName = "response_metadata", schemaIndex = 8, tag = 8)
    private final QuestionOptionExperienceResponseMetadata question_option_experience;

    @WireField(adapter = "options_product.service.QuestionUnderstandSpreadResponseMetadata#ADAPTER", jsonName = "questionUnderstandSpread", oneofName = "response_metadata", schemaIndex = 9, tag = 9)
    private final QuestionUnderstandSpreadResponseMetadata question_understand_spread;

    @WireField(adapter = "options_product.service.ReadyL3UpgradeResponseMetadata#ADAPTER", jsonName = "readyL3Upgrade", oneofName = "response_metadata", schemaIndex = 20, tag = 20)
    private final ReadyL3UpgradeResponseMetadata ready_l3_upgrade;

    @WireField(adapter = "options_product.service.ReviewInvestorProfileV2ResponseMetadata#ADAPTER", jsonName = "reviewInvestorProfile", oneofName = "response_metadata", schemaIndex = 28, tag = 29)
    private final ReviewInvestorProfileV2ResponseMetadata review_investor_profile;

    @WireField(adapter = "options_product.service.RHSGCompleteCARQuestionnaireResponseMetadata#ADAPTER", jsonName = "rhsgCompleteCarQuestionnaire", oneofName = "response_metadata", schemaIndex = 36, tag = 38)
    private final RHSGCompleteCARQuestionnaireResponseMetadata rhsg_complete_car_questionnaire;

    @WireField(adapter = "options_product.service.RHSGHomeResponseMetadata#ADAPTER", jsonName = "rhsgHome", oneofName = "response_metadata", schemaIndex = 35, tag = 37)
    private final RHSGHomeResponseMetadata rhsg_home;

    @WireField(adapter = "options_product.service.RHSGL2ApprovedTradesResponseMetadata#ADAPTER", jsonName = "rhsgL2ApprovedTrades", oneofName = "response_metadata", schemaIndex = 38, tag = 40)
    private final RHSGL2ApprovedTradesResponseMetadata rhsg_l2_approved_trades;

    @WireField(adapter = "options_product.service.RHSGL3ApprovedTradesResponseMetadata#ADAPTER", jsonName = "rhsgL3ApprovedTrades", oneofName = "response_metadata", schemaIndex = 39, tag = 41)
    private final RHSGL3ApprovedTradesResponseMetadata rhsg_l3_approved_trades;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldClearBackstack", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean should_clear_backstack;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldLiveInBackstack", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean should_live_in_backstack;

    @WireField(adapter = "options_product.service.SplashL0ResponseMetadata#ADAPTER", jsonName = "splashL0", oneofName = "response_metadata", schemaIndex = 5, tag = 5)
    private final SplashL0ResponseMetadata splash_l0;

    @WireField(adapter = "options_product.service.SplashL2ResponseMetadata#ADAPTER", jsonName = "splashL2", oneofName = "response_metadata", schemaIndex = 6, tag = 6)
    private final SplashL2ResponseMetadata splash_l2;

    @WireField(adapter = "options_product.service.SplashRetirementResponseMetadata#ADAPTER", jsonName = "splashRetirement", oneofName = "response_metadata", schemaIndex = 7, tag = 7)
    private final SplashRetirementResponseMetadata splash_retirement;

    @WireField(adapter = "options_product.service.StartResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 4, tag = 4)
    private final StartResponseMetadata start;

    @WireField(adapter = "options_product.service.SuccessResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 16, tag = 16)
    private final SuccessResponseMetadata success;

    @WireField(adapter = "options_product.service.SuitabilityResponseMetadata#ADAPTER", oneofName = "response_metadata", schemaIndex = 12, tag = 12)
    private final SuitabilityResponseMetadata suitability;

    @WireField(adapter = "options_product.service.UKL3EducationHomeResponseMetadata#ADAPTER", jsonName = "ukL3EducationHome", oneofName = "response_metadata", schemaIndex = 33, tag = 34)
    private final UKL3EducationHomeResponseMetadata uk_l3_education_home;

    @WireField(adapter = "options_product.service.UKL3EducationSpreadBenefitsResponseMetadata#ADAPTER", jsonName = "ukL3EducationSpreadBenefits", oneofName = "response_metadata", schemaIndex = 34, tag = 35)
    private final UKL3EducationSpreadBenefitsResponseMetadata uk_l3_education_spread_benefits;

    @WireField(adapter = "options_product.service.OnboardingScreenResponse$UpgradeProgress#ADAPTER", jsonName = "upgradeProgress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 25)
    private final UpgradeProgress upgrade_progress;

    @WireField(adapter = "options_product.service.UpsellAlertResponseMetadata#ADAPTER", jsonName = "upsellAlert", oneofName = "response_metadata", schemaIndex = 21, tag = 21)
    private final UpsellAlertResponseMetadata upsell_alert;

    @WireField(adapter = "options_product.service.UpsellAllSetResponseMetadata#ADAPTER", jsonName = "upsellAllSet", oneofName = "response_metadata", schemaIndex = 23, tag = 23)
    private final UpsellAllSetResponseMetadata upsell_all_set;

    @WireField(adapter = "options_product.service.UpsellTradeOnExpirationResponseMetadata#ADAPTER", jsonName = "upsellTradeOnExpiration", oneofName = "response_metadata", schemaIndex = 22, tag = 22)
    private final UpsellTradeOnExpirationResponseMetadata upsell_trade_on_expiration;

    public OnboardingScreenResponse() {
        this(false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29521newBuilder();
    }

    /* renamed from: is_checkpoint, reason: from getter */
    public final boolean getIs_checkpoint() {
        return this.is_checkpoint;
    }

    public final boolean getShould_live_in_backstack() {
        return this.should_live_in_backstack;
    }

    public final boolean getShould_clear_backstack() {
        return this.should_clear_backstack;
    }

    public final UpgradeProgress getUpgrade_progress() {
        return this.upgrade_progress;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OnboardingScreenResponse(boolean z, boolean z2, boolean z3, UpgradeProgress upgradeProgress, StartResponseMetadata startResponseMetadata, SplashL0ResponseMetadata splashL0ResponseMetadata, SplashL2ResponseMetadata splashL2ResponseMetadata, SplashRetirementResponseMetadata splashRetirementResponseMetadata, QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata, QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadata, QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadata, QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadata, SuitabilityResponseMetadata suitabilityResponseMetadata, InvestmentProfileResponseMetadata investmentProfileResponseMetadata, DisclosureResponseMetadata disclosureResponseMetadata, ApprovedTradesResponseMetadata approvedTradesResponseMetadata, SuccessResponseMetadata successResponseMetadata, FailureResponseMetadata failureResponseMetadata, EducationSpreadResponseMetadata educationSpreadResponseMetadata, EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadata, ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadata, UpsellAlertResponseMetadata upsellAlertResponseMetadata, UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadata, UpsellAllSetResponseMetadata upsellAllSetResponseMetadata, EndResponseMetadata endResponseMetadata, KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadata, ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadata, InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadata, ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadata, UKEducationHomeResponseMetadata uKEducationHomeResponseMetadata, UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadata, UKEducationRisksResponseMetadata uKEducationRisksResponseMetadata, UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadata, UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadata, UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadata, RHSGHomeResponseMetadata rHSGHomeResponseMetadata, RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadata, ProfessionalTraderResponseMetadata professionalTraderResponseMetadata, RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadata, RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadata, JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata, KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata, OnboardingProgress onboardingProgress, ByteString byteString, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4 = (i & 1) != 0 ? false : z;
        this(z4, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED : upgradeProgress, (i & 16) != 0 ? null : startResponseMetadata, (i & 32) != 0 ? null : splashL0ResponseMetadata, (i & 64) != 0 ? null : splashL2ResponseMetadata, (i & 128) != 0 ? null : splashRetirementResponseMetadata, (i & 256) != 0 ? null : questionOptionExperienceResponseMetadata, (i & 512) != 0 ? null : questionUnderstandSpreadResponseMetadata, (i & 1024) != 0 ? null : questionInvestmentAdviceResponseMetadata, (i & 2048) != 0 ? null : questionFinancialRegulatorResponseMetadata, (i & 4096) != 0 ? null : suitabilityResponseMetadata, (i & 8192) != 0 ? null : investmentProfileResponseMetadata, (i & 16384) != 0 ? null : disclosureResponseMetadata, (i & 32768) != 0 ? null : approvedTradesResponseMetadata, (i & 65536) != 0 ? null : successResponseMetadata, (i & 131072) != 0 ? null : failureResponseMetadata, (i & 262144) != 0 ? null : educationSpreadResponseMetadata, (i & 524288) != 0 ? null : educationL3StrategiesResponseMetadata, (i & 1048576) != 0 ? null : readyL3UpgradeResponseMetadata, (i & 2097152) != 0 ? null : upsellAlertResponseMetadata, (i & 4194304) != 0 ? null : upsellTradeOnExpirationResponseMetadata, (i & 8388608) != 0 ? null : upsellAllSetResponseMetadata, (i & 16777216) != 0 ? null : endResponseMetadata, (i & 33554432) != 0 ? null : knowledgeTestQuestionnaireResponseMetadata, (i & 67108864) != 0 ? null : experienceTestQuestionnaireResponseMetadata, (i & 134217728) != 0 ? null : investorProfileV2ResponseMetadata, (i & 268435456) != 0 ? null : reviewInvestorProfileV2ResponseMetadata, (i & 536870912) != 0 ? null : uKEducationHomeResponseMetadata, (i & 1073741824) != 0 ? null : uKEducationStrategyResponseMetadata, (i & Integer.MIN_VALUE) != 0 ? null : uKEducationRisksResponseMetadata, (i2 & 1) != 0 ? null : uKEducationProfessionalTraderResponseMetadata, (i2 & 2) != 0 ? null : uKL3EducationHomeResponseMetadata, (i2 & 4) != 0 ? null : uKL3EducationSpreadBenefitsResponseMetadata, (i2 & 8) != 0 ? null : rHSGHomeResponseMetadata, (i2 & 16) != 0 ? null : rHSGCompleteCARQuestionnaireResponseMetadata, (i2 & 32) != 0 ? null : professionalTraderResponseMetadata, (i2 & 64) != 0 ? null : rHSGL2ApprovedTradesResponseMetadata, (i2 & 128) != 0 ? null : rHSGL3ApprovedTradesResponseMetadata, (i2 & 256) != 0 ? null : jAPendingApplicationResponseMetadata, (i2 & 512) != 0 ? null : knowledgeCheckNeededResponseMetadata, (i2 & 1024) != 0 ? null : onboardingProgress, (i2 & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final StartResponseMetadata getStart() {
        return this.start;
    }

    public final SplashL0ResponseMetadata getSplash_l0() {
        return this.splash_l0;
    }

    public final SplashL2ResponseMetadata getSplash_l2() {
        return this.splash_l2;
    }

    public final SplashRetirementResponseMetadata getSplash_retirement() {
        return this.splash_retirement;
    }

    public final QuestionOptionExperienceResponseMetadata getQuestion_option_experience() {
        return this.question_option_experience;
    }

    public final QuestionUnderstandSpreadResponseMetadata getQuestion_understand_spread() {
        return this.question_understand_spread;
    }

    public final QuestionInvestmentAdviceResponseMetadata getQuestion_investment_advice() {
        return this.question_investment_advice;
    }

    public final QuestionFinancialRegulatorResponseMetadata getQuestion_financial_regulator() {
        return this.question_financial_regulator;
    }

    public final SuitabilityResponseMetadata getSuitability() {
        return this.suitability;
    }

    public final InvestmentProfileResponseMetadata getInvestment_profile() {
        return this.investment_profile;
    }

    public final DisclosureResponseMetadata getDisclosure() {
        return this.disclosure;
    }

    public final ApprovedTradesResponseMetadata getApproved_trades() {
        return this.approved_trades;
    }

    public final SuccessResponseMetadata getSuccess() {
        return this.success;
    }

    public final FailureResponseMetadata getFailure() {
        return this.failure;
    }

    public final EducationSpreadResponseMetadata getEducation_spread() {
        return this.education_spread;
    }

    public final EducationL3StrategiesResponseMetadata getEducation_l3_strategies() {
        return this.education_l3_strategies;
    }

    public final ReadyL3UpgradeResponseMetadata getReady_l3_upgrade() {
        return this.ready_l3_upgrade;
    }

    public final UpsellAlertResponseMetadata getUpsell_alert() {
        return this.upsell_alert;
    }

    public final UpsellTradeOnExpirationResponseMetadata getUpsell_trade_on_expiration() {
        return this.upsell_trade_on_expiration;
    }

    public final UpsellAllSetResponseMetadata getUpsell_all_set() {
        return this.upsell_all_set;
    }

    public final EndResponseMetadata getEnd() {
        return this.end;
    }

    public final KnowledgeTestQuestionnaireResponseMetadata getKnowledge_test_questionnaire() {
        return this.knowledge_test_questionnaire;
    }

    public final ExperienceTestQuestionnaireResponseMetadata getExperience_test_questionnaire() {
        return this.experience_test_questionnaire;
    }

    public final InvestorProfileV2ResponseMetadata getInvestor_profile() {
        return this.investor_profile;
    }

    public final ReviewInvestorProfileV2ResponseMetadata getReview_investor_profile() {
        return this.review_investor_profile;
    }

    public final UKEducationHomeResponseMetadata getEducation_home() {
        return this.education_home;
    }

    public final UKEducationStrategyResponseMetadata getEducation_strategy() {
        return this.education_strategy;
    }

    public final UKEducationRisksResponseMetadata getEducation_risks() {
        return this.education_risks;
    }

    public final UKEducationProfessionalTraderResponseMetadata getEducation_professional_trader() {
        return this.education_professional_trader;
    }

    public final UKL3EducationHomeResponseMetadata getUk_l3_education_home() {
        return this.uk_l3_education_home;
    }

    public final UKL3EducationSpreadBenefitsResponseMetadata getUk_l3_education_spread_benefits() {
        return this.uk_l3_education_spread_benefits;
    }

    public final RHSGHomeResponseMetadata getRhsg_home() {
        return this.rhsg_home;
    }

    public final RHSGCompleteCARQuestionnaireResponseMetadata getRhsg_complete_car_questionnaire() {
        return this.rhsg_complete_car_questionnaire;
    }

    public final ProfessionalTraderResponseMetadata getProfessional_trader() {
        return this.professional_trader;
    }

    public final RHSGL2ApprovedTradesResponseMetadata getRhsg_l2_approved_trades() {
        return this.rhsg_l2_approved_trades;
    }

    public final RHSGL3ApprovedTradesResponseMetadata getRhsg_l3_approved_trades() {
        return this.rhsg_l3_approved_trades;
    }

    public final JAPendingApplicationResponseMetadata getJa_pending_application() {
        return this.ja_pending_application;
    }

    public final KnowledgeCheckNeededResponseMetadata getKnowledge_check_needed() {
        return this.knowledge_check_needed;
    }

    public final OnboardingProgress getOnboarding_progress() {
        return this.onboarding_progress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingScreenResponse(boolean z, boolean z2, boolean z3, UpgradeProgress upgrade_progress, StartResponseMetadata startResponseMetadata, SplashL0ResponseMetadata splashL0ResponseMetadata, SplashL2ResponseMetadata splashL2ResponseMetadata, SplashRetirementResponseMetadata splashRetirementResponseMetadata, QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata, QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadata, QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadata, QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadata, SuitabilityResponseMetadata suitabilityResponseMetadata, InvestmentProfileResponseMetadata investmentProfileResponseMetadata, DisclosureResponseMetadata disclosureResponseMetadata, ApprovedTradesResponseMetadata approvedTradesResponseMetadata, SuccessResponseMetadata successResponseMetadata, FailureResponseMetadata failureResponseMetadata, EducationSpreadResponseMetadata educationSpreadResponseMetadata, EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadata, ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadata, UpsellAlertResponseMetadata upsellAlertResponseMetadata, UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadata, UpsellAllSetResponseMetadata upsellAllSetResponseMetadata, EndResponseMetadata endResponseMetadata, KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadata, ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadata, InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadata, ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadata, UKEducationHomeResponseMetadata uKEducationHomeResponseMetadata, UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadata, UKEducationRisksResponseMetadata uKEducationRisksResponseMetadata, UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadata, UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadata, UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadata, RHSGHomeResponseMetadata rHSGHomeResponseMetadata, RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadata, ProfessionalTraderResponseMetadata professionalTraderResponseMetadata, RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadata, RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadata, JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata, KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata, OnboardingProgress onboardingProgress, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(upgrade_progress, "upgrade_progress");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_checkpoint = z;
        this.should_live_in_backstack = z2;
        this.should_clear_backstack = z3;
        this.upgrade_progress = upgrade_progress;
        this.start = startResponseMetadata;
        this.splash_l0 = splashL0ResponseMetadata;
        this.splash_l2 = splashL2ResponseMetadata;
        this.splash_retirement = splashRetirementResponseMetadata;
        this.question_option_experience = questionOptionExperienceResponseMetadata;
        this.question_understand_spread = questionUnderstandSpreadResponseMetadata;
        this.question_investment_advice = questionInvestmentAdviceResponseMetadata;
        this.question_financial_regulator = questionFinancialRegulatorResponseMetadata;
        this.suitability = suitabilityResponseMetadata;
        this.investment_profile = investmentProfileResponseMetadata;
        this.disclosure = disclosureResponseMetadata;
        this.approved_trades = approvedTradesResponseMetadata;
        this.success = successResponseMetadata;
        this.failure = failureResponseMetadata;
        this.education_spread = educationSpreadResponseMetadata;
        this.education_l3_strategies = educationL3StrategiesResponseMetadata;
        this.ready_l3_upgrade = readyL3UpgradeResponseMetadata;
        this.upsell_alert = upsellAlertResponseMetadata;
        this.upsell_trade_on_expiration = upsellTradeOnExpirationResponseMetadata;
        this.upsell_all_set = upsellAllSetResponseMetadata;
        this.end = endResponseMetadata;
        this.knowledge_test_questionnaire = knowledgeTestQuestionnaireResponseMetadata;
        this.experience_test_questionnaire = experienceTestQuestionnaireResponseMetadata;
        this.investor_profile = investorProfileV2ResponseMetadata;
        this.review_investor_profile = reviewInvestorProfileV2ResponseMetadata;
        this.education_home = uKEducationHomeResponseMetadata;
        this.education_strategy = uKEducationStrategyResponseMetadata;
        this.education_risks = uKEducationRisksResponseMetadata;
        this.education_professional_trader = uKEducationProfessionalTraderResponseMetadata;
        this.uk_l3_education_home = uKL3EducationHomeResponseMetadata;
        this.uk_l3_education_spread_benefits = uKL3EducationSpreadBenefitsResponseMetadata;
        this.rhsg_home = rHSGHomeResponseMetadata;
        this.rhsg_complete_car_questionnaire = rHSGCompleteCARQuestionnaireResponseMetadata;
        this.professional_trader = professionalTraderResponseMetadata;
        this.rhsg_l2_approved_trades = rHSGL2ApprovedTradesResponseMetadata;
        this.rhsg_l3_approved_trades = rHSGL3ApprovedTradesResponseMetadata;
        this.ja_pending_application = jAPendingApplicationResponseMetadata;
        this.knowledge_check_needed = knowledgeCheckNeededResponseMetadata;
        this.onboarding_progress = onboardingProgress;
        if (Internal.countNonNull(startResponseMetadata, splashL0ResponseMetadata, splashL2ResponseMetadata, splashRetirementResponseMetadata, questionOptionExperienceResponseMetadata, questionUnderstandSpreadResponseMetadata, questionInvestmentAdviceResponseMetadata, questionFinancialRegulatorResponseMetadata, suitabilityResponseMetadata, investmentProfileResponseMetadata, disclosureResponseMetadata, approvedTradesResponseMetadata, successResponseMetadata, failureResponseMetadata, educationSpreadResponseMetadata, educationL3StrategiesResponseMetadata, readyL3UpgradeResponseMetadata, upsellAlertResponseMetadata, upsellTradeOnExpirationResponseMetadata, upsellAllSetResponseMetadata, endResponseMetadata, knowledgeTestQuestionnaireResponseMetadata, experienceTestQuestionnaireResponseMetadata, investorProfileV2ResponseMetadata, reviewInvestorProfileV2ResponseMetadata, uKEducationHomeResponseMetadata, uKEducationStrategyResponseMetadata, uKEducationRisksResponseMetadata, uKEducationProfessionalTraderResponseMetadata, uKL3EducationHomeResponseMetadata, uKL3EducationSpreadBenefitsResponseMetadata, rHSGHomeResponseMetadata, rHSGCompleteCARQuestionnaireResponseMetadata, professionalTraderResponseMetadata, rHSGL2ApprovedTradesResponseMetadata, rHSGL3ApprovedTradesResponseMetadata, jAPendingApplicationResponseMetadata, knowledgeCheckNeededResponseMetadata) > 1) {
            throw new IllegalArgumentException("At most one of start, splash_l0, splash_l2, splash_retirement, question_option_experience, question_understand_spread, question_investment_advice, question_financial_regulator, suitability, investment_profile, disclosure, approved_trades, success, failure, education_spread, education_l3_strategies, ready_l3_upgrade, upsell_alert, upsell_trade_on_expiration, upsell_all_set, end, knowledge_test_questionnaire, experience_test_questionnaire, investor_profile, review_investor_profile, education_home, education_strategy, education_risks, education_professional_trader, uk_l3_education_home, uk_l3_education_spread_benefits, rhsg_home, rhsg_complete_car_questionnaire, professional_trader, rhsg_l2_approved_trades, rhsg_l3_approved_trades, ja_pending_application, knowledge_check_needed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29521newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OnboardingScreenResponse)) {
            return false;
        }
        OnboardingScreenResponse onboardingScreenResponse = (OnboardingScreenResponse) other;
        return Intrinsics.areEqual(unknownFields(), onboardingScreenResponse.unknownFields()) && this.is_checkpoint == onboardingScreenResponse.is_checkpoint && this.should_live_in_backstack == onboardingScreenResponse.should_live_in_backstack && this.should_clear_backstack == onboardingScreenResponse.should_clear_backstack && this.upgrade_progress == onboardingScreenResponse.upgrade_progress && Intrinsics.areEqual(this.start, onboardingScreenResponse.start) && Intrinsics.areEqual(this.splash_l0, onboardingScreenResponse.splash_l0) && Intrinsics.areEqual(this.splash_l2, onboardingScreenResponse.splash_l2) && Intrinsics.areEqual(this.splash_retirement, onboardingScreenResponse.splash_retirement) && Intrinsics.areEqual(this.question_option_experience, onboardingScreenResponse.question_option_experience) && Intrinsics.areEqual(this.question_understand_spread, onboardingScreenResponse.question_understand_spread) && Intrinsics.areEqual(this.question_investment_advice, onboardingScreenResponse.question_investment_advice) && Intrinsics.areEqual(this.question_financial_regulator, onboardingScreenResponse.question_financial_regulator) && Intrinsics.areEqual(this.suitability, onboardingScreenResponse.suitability) && Intrinsics.areEqual(this.investment_profile, onboardingScreenResponse.investment_profile) && Intrinsics.areEqual(this.disclosure, onboardingScreenResponse.disclosure) && Intrinsics.areEqual(this.approved_trades, onboardingScreenResponse.approved_trades) && Intrinsics.areEqual(this.success, onboardingScreenResponse.success) && Intrinsics.areEqual(this.failure, onboardingScreenResponse.failure) && Intrinsics.areEqual(this.education_spread, onboardingScreenResponse.education_spread) && Intrinsics.areEqual(this.education_l3_strategies, onboardingScreenResponse.education_l3_strategies) && Intrinsics.areEqual(this.ready_l3_upgrade, onboardingScreenResponse.ready_l3_upgrade) && Intrinsics.areEqual(this.upsell_alert, onboardingScreenResponse.upsell_alert) && Intrinsics.areEqual(this.upsell_trade_on_expiration, onboardingScreenResponse.upsell_trade_on_expiration) && Intrinsics.areEqual(this.upsell_all_set, onboardingScreenResponse.upsell_all_set) && Intrinsics.areEqual(this.end, onboardingScreenResponse.end) && Intrinsics.areEqual(this.knowledge_test_questionnaire, onboardingScreenResponse.knowledge_test_questionnaire) && Intrinsics.areEqual(this.experience_test_questionnaire, onboardingScreenResponse.experience_test_questionnaire) && Intrinsics.areEqual(this.investor_profile, onboardingScreenResponse.investor_profile) && Intrinsics.areEqual(this.review_investor_profile, onboardingScreenResponse.review_investor_profile) && Intrinsics.areEqual(this.education_home, onboardingScreenResponse.education_home) && Intrinsics.areEqual(this.education_strategy, onboardingScreenResponse.education_strategy) && Intrinsics.areEqual(this.education_risks, onboardingScreenResponse.education_risks) && Intrinsics.areEqual(this.education_professional_trader, onboardingScreenResponse.education_professional_trader) && Intrinsics.areEqual(this.uk_l3_education_home, onboardingScreenResponse.uk_l3_education_home) && Intrinsics.areEqual(this.uk_l3_education_spread_benefits, onboardingScreenResponse.uk_l3_education_spread_benefits) && Intrinsics.areEqual(this.rhsg_home, onboardingScreenResponse.rhsg_home) && Intrinsics.areEqual(this.rhsg_complete_car_questionnaire, onboardingScreenResponse.rhsg_complete_car_questionnaire) && Intrinsics.areEqual(this.professional_trader, onboardingScreenResponse.professional_trader) && Intrinsics.areEqual(this.rhsg_l2_approved_trades, onboardingScreenResponse.rhsg_l2_approved_trades) && Intrinsics.areEqual(this.rhsg_l3_approved_trades, onboardingScreenResponse.rhsg_l3_approved_trades) && Intrinsics.areEqual(this.ja_pending_application, onboardingScreenResponse.ja_pending_application) && Intrinsics.areEqual(this.knowledge_check_needed, onboardingScreenResponse.knowledge_check_needed) && Intrinsics.areEqual(this.onboarding_progress, onboardingScreenResponse.onboarding_progress);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_checkpoint)) * 37) + Boolean.hashCode(this.should_live_in_backstack)) * 37) + Boolean.hashCode(this.should_clear_backstack)) * 37) + this.upgrade_progress.hashCode()) * 37;
        StartResponseMetadata startResponseMetadata = this.start;
        int iHashCode2 = (iHashCode + (startResponseMetadata != null ? startResponseMetadata.hashCode() : 0)) * 37;
        SplashL0ResponseMetadata splashL0ResponseMetadata = this.splash_l0;
        int iHashCode3 = (iHashCode2 + (splashL0ResponseMetadata != null ? splashL0ResponseMetadata.hashCode() : 0)) * 37;
        SplashL2ResponseMetadata splashL2ResponseMetadata = this.splash_l2;
        int iHashCode4 = (iHashCode3 + (splashL2ResponseMetadata != null ? splashL2ResponseMetadata.hashCode() : 0)) * 37;
        SplashRetirementResponseMetadata splashRetirementResponseMetadata = this.splash_retirement;
        int iHashCode5 = (iHashCode4 + (splashRetirementResponseMetadata != null ? splashRetirementResponseMetadata.hashCode() : 0)) * 37;
        QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata = this.question_option_experience;
        int iHashCode6 = (iHashCode5 + (questionOptionExperienceResponseMetadata != null ? questionOptionExperienceResponseMetadata.hashCode() : 0)) * 37;
        QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadata = this.question_understand_spread;
        int iHashCode7 = (iHashCode6 + (questionUnderstandSpreadResponseMetadata != null ? questionUnderstandSpreadResponseMetadata.hashCode() : 0)) * 37;
        QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadata = this.question_investment_advice;
        int iHashCode8 = (iHashCode7 + (questionInvestmentAdviceResponseMetadata != null ? questionInvestmentAdviceResponseMetadata.hashCode() : 0)) * 37;
        QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadata = this.question_financial_regulator;
        int iHashCode9 = (iHashCode8 + (questionFinancialRegulatorResponseMetadata != null ? questionFinancialRegulatorResponseMetadata.hashCode() : 0)) * 37;
        SuitabilityResponseMetadata suitabilityResponseMetadata = this.suitability;
        int iHashCode10 = (iHashCode9 + (suitabilityResponseMetadata != null ? suitabilityResponseMetadata.hashCode() : 0)) * 37;
        InvestmentProfileResponseMetadata investmentProfileResponseMetadata = this.investment_profile;
        int iHashCode11 = (iHashCode10 + (investmentProfileResponseMetadata != null ? investmentProfileResponseMetadata.hashCode() : 0)) * 37;
        DisclosureResponseMetadata disclosureResponseMetadata = this.disclosure;
        int iHashCode12 = (iHashCode11 + (disclosureResponseMetadata != null ? disclosureResponseMetadata.hashCode() : 0)) * 37;
        ApprovedTradesResponseMetadata approvedTradesResponseMetadata = this.approved_trades;
        int iHashCode13 = (iHashCode12 + (approvedTradesResponseMetadata != null ? approvedTradesResponseMetadata.hashCode() : 0)) * 37;
        SuccessResponseMetadata successResponseMetadata = this.success;
        int iHashCode14 = (iHashCode13 + (successResponseMetadata != null ? successResponseMetadata.hashCode() : 0)) * 37;
        FailureResponseMetadata failureResponseMetadata = this.failure;
        int iHashCode15 = (iHashCode14 + (failureResponseMetadata != null ? failureResponseMetadata.hashCode() : 0)) * 37;
        EducationSpreadResponseMetadata educationSpreadResponseMetadata = this.education_spread;
        int iHashCode16 = (iHashCode15 + (educationSpreadResponseMetadata != null ? educationSpreadResponseMetadata.hashCode() : 0)) * 37;
        EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadata = this.education_l3_strategies;
        int iHashCode17 = (iHashCode16 + (educationL3StrategiesResponseMetadata != null ? educationL3StrategiesResponseMetadata.hashCode() : 0)) * 37;
        ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadata = this.ready_l3_upgrade;
        int iHashCode18 = (iHashCode17 + (readyL3UpgradeResponseMetadata != null ? readyL3UpgradeResponseMetadata.hashCode() : 0)) * 37;
        UpsellAlertResponseMetadata upsellAlertResponseMetadata = this.upsell_alert;
        int iHashCode19 = (iHashCode18 + (upsellAlertResponseMetadata != null ? upsellAlertResponseMetadata.hashCode() : 0)) * 37;
        UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadata = this.upsell_trade_on_expiration;
        int iHashCode20 = (iHashCode19 + (upsellTradeOnExpirationResponseMetadata != null ? upsellTradeOnExpirationResponseMetadata.hashCode() : 0)) * 37;
        UpsellAllSetResponseMetadata upsellAllSetResponseMetadata = this.upsell_all_set;
        int iHashCode21 = (iHashCode20 + (upsellAllSetResponseMetadata != null ? upsellAllSetResponseMetadata.hashCode() : 0)) * 37;
        EndResponseMetadata endResponseMetadata = this.end;
        int iHashCode22 = (iHashCode21 + (endResponseMetadata != null ? endResponseMetadata.hashCode() : 0)) * 37;
        KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadata = this.knowledge_test_questionnaire;
        int iHashCode23 = (iHashCode22 + (knowledgeTestQuestionnaireResponseMetadata != null ? knowledgeTestQuestionnaireResponseMetadata.hashCode() : 0)) * 37;
        ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadata = this.experience_test_questionnaire;
        int iHashCode24 = (iHashCode23 + (experienceTestQuestionnaireResponseMetadata != null ? experienceTestQuestionnaireResponseMetadata.hashCode() : 0)) * 37;
        InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadata = this.investor_profile;
        int iHashCode25 = (iHashCode24 + (investorProfileV2ResponseMetadata != null ? investorProfileV2ResponseMetadata.hashCode() : 0)) * 37;
        ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadata = this.review_investor_profile;
        int iHashCode26 = (iHashCode25 + (reviewInvestorProfileV2ResponseMetadata != null ? reviewInvestorProfileV2ResponseMetadata.hashCode() : 0)) * 37;
        UKEducationHomeResponseMetadata uKEducationHomeResponseMetadata = this.education_home;
        int iHashCode27 = (iHashCode26 + (uKEducationHomeResponseMetadata != null ? uKEducationHomeResponseMetadata.hashCode() : 0)) * 37;
        UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadata = this.education_strategy;
        int iHashCode28 = (iHashCode27 + (uKEducationStrategyResponseMetadata != null ? uKEducationStrategyResponseMetadata.hashCode() : 0)) * 37;
        UKEducationRisksResponseMetadata uKEducationRisksResponseMetadata = this.education_risks;
        int iHashCode29 = (iHashCode28 + (uKEducationRisksResponseMetadata != null ? uKEducationRisksResponseMetadata.hashCode() : 0)) * 37;
        UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadata = this.education_professional_trader;
        int iHashCode30 = (iHashCode29 + (uKEducationProfessionalTraderResponseMetadata != null ? uKEducationProfessionalTraderResponseMetadata.hashCode() : 0)) * 37;
        UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadata = this.uk_l3_education_home;
        int iHashCode31 = (iHashCode30 + (uKL3EducationHomeResponseMetadata != null ? uKL3EducationHomeResponseMetadata.hashCode() : 0)) * 37;
        UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadata = this.uk_l3_education_spread_benefits;
        int iHashCode32 = (iHashCode31 + (uKL3EducationSpreadBenefitsResponseMetadata != null ? uKL3EducationSpreadBenefitsResponseMetadata.hashCode() : 0)) * 37;
        RHSGHomeResponseMetadata rHSGHomeResponseMetadata = this.rhsg_home;
        int iHashCode33 = (iHashCode32 + (rHSGHomeResponseMetadata != null ? rHSGHomeResponseMetadata.hashCode() : 0)) * 37;
        RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadata = this.rhsg_complete_car_questionnaire;
        int iHashCode34 = (iHashCode33 + (rHSGCompleteCARQuestionnaireResponseMetadata != null ? rHSGCompleteCARQuestionnaireResponseMetadata.hashCode() : 0)) * 37;
        ProfessionalTraderResponseMetadata professionalTraderResponseMetadata = this.professional_trader;
        int iHashCode35 = (iHashCode34 + (professionalTraderResponseMetadata != null ? professionalTraderResponseMetadata.hashCode() : 0)) * 37;
        RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadata = this.rhsg_l2_approved_trades;
        int iHashCode36 = (iHashCode35 + (rHSGL2ApprovedTradesResponseMetadata != null ? rHSGL2ApprovedTradesResponseMetadata.hashCode() : 0)) * 37;
        RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadata = this.rhsg_l3_approved_trades;
        int iHashCode37 = (iHashCode36 + (rHSGL3ApprovedTradesResponseMetadata != null ? rHSGL3ApprovedTradesResponseMetadata.hashCode() : 0)) * 37;
        JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata = this.ja_pending_application;
        int iHashCode38 = (iHashCode37 + (jAPendingApplicationResponseMetadata != null ? jAPendingApplicationResponseMetadata.hashCode() : 0)) * 37;
        KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata = this.knowledge_check_needed;
        int iHashCode39 = (iHashCode38 + (knowledgeCheckNeededResponseMetadata != null ? knowledgeCheckNeededResponseMetadata.hashCode() : 0)) * 37;
        OnboardingProgress onboardingProgress = this.onboarding_progress;
        int iHashCode40 = iHashCode39 + (onboardingProgress != null ? onboardingProgress.hashCode() : 0);
        this.hashCode = iHashCode40;
        return iHashCode40;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_checkpoint=" + this.is_checkpoint);
        arrayList.add("should_live_in_backstack=" + this.should_live_in_backstack);
        arrayList.add("should_clear_backstack=" + this.should_clear_backstack);
        arrayList.add("upgrade_progress=" + this.upgrade_progress);
        StartResponseMetadata startResponseMetadata = this.start;
        if (startResponseMetadata != null) {
            arrayList.add("start=" + startResponseMetadata);
        }
        SplashL0ResponseMetadata splashL0ResponseMetadata = this.splash_l0;
        if (splashL0ResponseMetadata != null) {
            arrayList.add("splash_l0=" + splashL0ResponseMetadata);
        }
        SplashL2ResponseMetadata splashL2ResponseMetadata = this.splash_l2;
        if (splashL2ResponseMetadata != null) {
            arrayList.add("splash_l2=" + splashL2ResponseMetadata);
        }
        SplashRetirementResponseMetadata splashRetirementResponseMetadata = this.splash_retirement;
        if (splashRetirementResponseMetadata != null) {
            arrayList.add("splash_retirement=" + splashRetirementResponseMetadata);
        }
        QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadata = this.question_option_experience;
        if (questionOptionExperienceResponseMetadata != null) {
            arrayList.add("question_option_experience=" + questionOptionExperienceResponseMetadata);
        }
        QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadata = this.question_understand_spread;
        if (questionUnderstandSpreadResponseMetadata != null) {
            arrayList.add("question_understand_spread=" + questionUnderstandSpreadResponseMetadata);
        }
        QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadata = this.question_investment_advice;
        if (questionInvestmentAdviceResponseMetadata != null) {
            arrayList.add("question_investment_advice=" + questionInvestmentAdviceResponseMetadata);
        }
        QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadata = this.question_financial_regulator;
        if (questionFinancialRegulatorResponseMetadata != null) {
            arrayList.add("question_financial_regulator=" + questionFinancialRegulatorResponseMetadata);
        }
        SuitabilityResponseMetadata suitabilityResponseMetadata = this.suitability;
        if (suitabilityResponseMetadata != null) {
            arrayList.add("suitability=" + suitabilityResponseMetadata);
        }
        InvestmentProfileResponseMetadata investmentProfileResponseMetadata = this.investment_profile;
        if (investmentProfileResponseMetadata != null) {
            arrayList.add("investment_profile=" + investmentProfileResponseMetadata);
        }
        DisclosureResponseMetadata disclosureResponseMetadata = this.disclosure;
        if (disclosureResponseMetadata != null) {
            arrayList.add("disclosure=" + disclosureResponseMetadata);
        }
        ApprovedTradesResponseMetadata approvedTradesResponseMetadata = this.approved_trades;
        if (approvedTradesResponseMetadata != null) {
            arrayList.add("approved_trades=" + approvedTradesResponseMetadata);
        }
        SuccessResponseMetadata successResponseMetadata = this.success;
        if (successResponseMetadata != null) {
            arrayList.add("success=" + successResponseMetadata);
        }
        FailureResponseMetadata failureResponseMetadata = this.failure;
        if (failureResponseMetadata != null) {
            arrayList.add("failure=" + failureResponseMetadata);
        }
        EducationSpreadResponseMetadata educationSpreadResponseMetadata = this.education_spread;
        if (educationSpreadResponseMetadata != null) {
            arrayList.add("education_spread=" + educationSpreadResponseMetadata);
        }
        EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadata = this.education_l3_strategies;
        if (educationL3StrategiesResponseMetadata != null) {
            arrayList.add("education_l3_strategies=" + educationL3StrategiesResponseMetadata);
        }
        ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadata = this.ready_l3_upgrade;
        if (readyL3UpgradeResponseMetadata != null) {
            arrayList.add("ready_l3_upgrade=" + readyL3UpgradeResponseMetadata);
        }
        UpsellAlertResponseMetadata upsellAlertResponseMetadata = this.upsell_alert;
        if (upsellAlertResponseMetadata != null) {
            arrayList.add("upsell_alert=" + upsellAlertResponseMetadata);
        }
        UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadata = this.upsell_trade_on_expiration;
        if (upsellTradeOnExpirationResponseMetadata != null) {
            arrayList.add("upsell_trade_on_expiration=" + upsellTradeOnExpirationResponseMetadata);
        }
        UpsellAllSetResponseMetadata upsellAllSetResponseMetadata = this.upsell_all_set;
        if (upsellAllSetResponseMetadata != null) {
            arrayList.add("upsell_all_set=" + upsellAllSetResponseMetadata);
        }
        EndResponseMetadata endResponseMetadata = this.end;
        if (endResponseMetadata != null) {
            arrayList.add("end=" + endResponseMetadata);
        }
        KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadata = this.knowledge_test_questionnaire;
        if (knowledgeTestQuestionnaireResponseMetadata != null) {
            arrayList.add("knowledge_test_questionnaire=" + knowledgeTestQuestionnaireResponseMetadata);
        }
        ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadata = this.experience_test_questionnaire;
        if (experienceTestQuestionnaireResponseMetadata != null) {
            arrayList.add("experience_test_questionnaire=" + experienceTestQuestionnaireResponseMetadata);
        }
        InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadata = this.investor_profile;
        if (investorProfileV2ResponseMetadata != null) {
            arrayList.add("investor_profile=" + investorProfileV2ResponseMetadata);
        }
        ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadata = this.review_investor_profile;
        if (reviewInvestorProfileV2ResponseMetadata != null) {
            arrayList.add("review_investor_profile=" + reviewInvestorProfileV2ResponseMetadata);
        }
        UKEducationHomeResponseMetadata uKEducationHomeResponseMetadata = this.education_home;
        if (uKEducationHomeResponseMetadata != null) {
            arrayList.add("education_home=" + uKEducationHomeResponseMetadata);
        }
        UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadata = this.education_strategy;
        if (uKEducationStrategyResponseMetadata != null) {
            arrayList.add("education_strategy=" + uKEducationStrategyResponseMetadata);
        }
        UKEducationRisksResponseMetadata uKEducationRisksResponseMetadata = this.education_risks;
        if (uKEducationRisksResponseMetadata != null) {
            arrayList.add("education_risks=" + uKEducationRisksResponseMetadata);
        }
        UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadata = this.education_professional_trader;
        if (uKEducationProfessionalTraderResponseMetadata != null) {
            arrayList.add("education_professional_trader=" + uKEducationProfessionalTraderResponseMetadata);
        }
        UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadata = this.uk_l3_education_home;
        if (uKL3EducationHomeResponseMetadata != null) {
            arrayList.add("uk_l3_education_home=" + uKL3EducationHomeResponseMetadata);
        }
        UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadata = this.uk_l3_education_spread_benefits;
        if (uKL3EducationSpreadBenefitsResponseMetadata != null) {
            arrayList.add("uk_l3_education_spread_benefits=" + uKL3EducationSpreadBenefitsResponseMetadata);
        }
        RHSGHomeResponseMetadata rHSGHomeResponseMetadata = this.rhsg_home;
        if (rHSGHomeResponseMetadata != null) {
            arrayList.add("rhsg_home=" + rHSGHomeResponseMetadata);
        }
        RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadata = this.rhsg_complete_car_questionnaire;
        if (rHSGCompleteCARQuestionnaireResponseMetadata != null) {
            arrayList.add("rhsg_complete_car_questionnaire=" + rHSGCompleteCARQuestionnaireResponseMetadata);
        }
        ProfessionalTraderResponseMetadata professionalTraderResponseMetadata = this.professional_trader;
        if (professionalTraderResponseMetadata != null) {
            arrayList.add("professional_trader=" + professionalTraderResponseMetadata);
        }
        RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadata = this.rhsg_l2_approved_trades;
        if (rHSGL2ApprovedTradesResponseMetadata != null) {
            arrayList.add("rhsg_l2_approved_trades=" + rHSGL2ApprovedTradesResponseMetadata);
        }
        RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadata = this.rhsg_l3_approved_trades;
        if (rHSGL3ApprovedTradesResponseMetadata != null) {
            arrayList.add("rhsg_l3_approved_trades=" + rHSGL3ApprovedTradesResponseMetadata);
        }
        JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadata = this.ja_pending_application;
        if (jAPendingApplicationResponseMetadata != null) {
            arrayList.add("ja_pending_application=" + jAPendingApplicationResponseMetadata);
        }
        KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadata = this.knowledge_check_needed;
        if (knowledgeCheckNeededResponseMetadata != null) {
            arrayList.add("knowledge_check_needed=" + knowledgeCheckNeededResponseMetadata);
        }
        OnboardingProgress onboardingProgress = this.onboarding_progress;
        if (onboardingProgress != null) {
            arrayList.add("onboarding_progress=" + onboardingProgress);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OnboardingScreenResponse{", "}", 0, null, null, 56, null);
    }

    public final OnboardingScreenResponse copy(boolean is_checkpoint, boolean should_live_in_backstack, boolean should_clear_backstack, UpgradeProgress upgrade_progress, StartResponseMetadata start, SplashL0ResponseMetadata splash_l0, SplashL2ResponseMetadata splash_l2, SplashRetirementResponseMetadata splash_retirement, QuestionOptionExperienceResponseMetadata question_option_experience, QuestionUnderstandSpreadResponseMetadata question_understand_spread, QuestionInvestmentAdviceResponseMetadata question_investment_advice, QuestionFinancialRegulatorResponseMetadata question_financial_regulator, SuitabilityResponseMetadata suitability, InvestmentProfileResponseMetadata investment_profile, DisclosureResponseMetadata disclosure, ApprovedTradesResponseMetadata approved_trades, SuccessResponseMetadata success, FailureResponseMetadata failure, EducationSpreadResponseMetadata education_spread, EducationL3StrategiesResponseMetadata education_l3_strategies, ReadyL3UpgradeResponseMetadata ready_l3_upgrade, UpsellAlertResponseMetadata upsell_alert, UpsellTradeOnExpirationResponseMetadata upsell_trade_on_expiration, UpsellAllSetResponseMetadata upsell_all_set, EndResponseMetadata end, KnowledgeTestQuestionnaireResponseMetadata knowledge_test_questionnaire, ExperienceTestQuestionnaireResponseMetadata experience_test_questionnaire, InvestorProfileV2ResponseMetadata investor_profile, ReviewInvestorProfileV2ResponseMetadata review_investor_profile, UKEducationHomeResponseMetadata education_home, UKEducationStrategyResponseMetadata education_strategy, UKEducationRisksResponseMetadata education_risks, UKEducationProfessionalTraderResponseMetadata education_professional_trader, UKL3EducationHomeResponseMetadata uk_l3_education_home, UKL3EducationSpreadBenefitsResponseMetadata uk_l3_education_spread_benefits, RHSGHomeResponseMetadata rhsg_home, RHSGCompleteCARQuestionnaireResponseMetadata rhsg_complete_car_questionnaire, ProfessionalTraderResponseMetadata professional_trader, RHSGL2ApprovedTradesResponseMetadata rhsg_l2_approved_trades, RHSGL3ApprovedTradesResponseMetadata rhsg_l3_approved_trades, JAPendingApplicationResponseMetadata ja_pending_application, KnowledgeCheckNeededResponseMetadata knowledge_check_needed, OnboardingProgress onboarding_progress, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(upgrade_progress, "upgrade_progress");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OnboardingScreenResponse(is_checkpoint, should_live_in_backstack, should_clear_backstack, upgrade_progress, start, splash_l0, splash_l2, splash_retirement, question_option_experience, question_understand_spread, question_investment_advice, question_financial_regulator, suitability, investment_profile, disclosure, approved_trades, success, failure, education_spread, education_l3_strategies, ready_l3_upgrade, upsell_alert, upsell_trade_on_expiration, upsell_all_set, end, knowledge_test_questionnaire, experience_test_questionnaire, investor_profile, review_investor_profile, education_home, education_strategy, education_risks, education_professional_trader, uk_l3_education_home, uk_l3_education_spread_benefits, rhsg_home, rhsg_complete_car_questionnaire, professional_trader, rhsg_l2_approved_trades, rhsg_l3_approved_trades, ja_pending_application, knowledge_check_needed, onboarding_progress, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingScreenResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OnboardingScreenResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.OnboardingScreenResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OnboardingScreenResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_checkpoint()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_checkpoint()));
                }
                if (value.getShould_live_in_backstack()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getShould_live_in_backstack()));
                }
                if (value.getShould_clear_backstack()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getShould_clear_backstack()));
                }
                if (value.getUpgrade_progress() != OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED) {
                    size += OnboardingScreenResponse.UpgradeProgress.ADAPTER.encodedSizeWithTag(25, value.getUpgrade_progress());
                }
                return size + StartResponseMetadata.ADAPTER.encodedSizeWithTag(4, value.getStart()) + SplashL0ResponseMetadata.ADAPTER.encodedSizeWithTag(5, value.getSplash_l0()) + SplashL2ResponseMetadata.ADAPTER.encodedSizeWithTag(6, value.getSplash_l2()) + SplashRetirementResponseMetadata.ADAPTER.encodedSizeWithTag(7, value.getSplash_retirement()) + QuestionOptionExperienceResponseMetadata.ADAPTER.encodedSizeWithTag(8, value.getQuestion_option_experience()) + QuestionUnderstandSpreadResponseMetadata.ADAPTER.encodedSizeWithTag(9, value.getQuestion_understand_spread()) + QuestionInvestmentAdviceResponseMetadata.ADAPTER.encodedSizeWithTag(10, value.getQuestion_investment_advice()) + QuestionFinancialRegulatorResponseMetadata.ADAPTER.encodedSizeWithTag(11, value.getQuestion_financial_regulator()) + SuitabilityResponseMetadata.ADAPTER.encodedSizeWithTag(12, value.getSuitability()) + InvestmentProfileResponseMetadata.ADAPTER.encodedSizeWithTag(13, value.getInvestment_profile()) + DisclosureResponseMetadata.ADAPTER.encodedSizeWithTag(14, value.getDisclosure()) + ApprovedTradesResponseMetadata.ADAPTER.encodedSizeWithTag(15, value.getApproved_trades()) + SuccessResponseMetadata.ADAPTER.encodedSizeWithTag(16, value.getSuccess()) + FailureResponseMetadata.ADAPTER.encodedSizeWithTag(17, value.getFailure()) + EducationSpreadResponseMetadata.ADAPTER.encodedSizeWithTag(18, value.getEducation_spread()) + EducationL3StrategiesResponseMetadata.ADAPTER.encodedSizeWithTag(19, value.getEducation_l3_strategies()) + ReadyL3UpgradeResponseMetadata.ADAPTER.encodedSizeWithTag(20, value.getReady_l3_upgrade()) + UpsellAlertResponseMetadata.ADAPTER.encodedSizeWithTag(21, value.getUpsell_alert()) + UpsellTradeOnExpirationResponseMetadata.ADAPTER.encodedSizeWithTag(22, value.getUpsell_trade_on_expiration()) + UpsellAllSetResponseMetadata.ADAPTER.encodedSizeWithTag(23, value.getUpsell_all_set()) + EndResponseMetadata.ADAPTER.encodedSizeWithTag(24, value.getEnd()) + KnowledgeTestQuestionnaireResponseMetadata.ADAPTER.encodedSizeWithTag(26, value.getKnowledge_test_questionnaire()) + ExperienceTestQuestionnaireResponseMetadata.ADAPTER.encodedSizeWithTag(27, value.getExperience_test_questionnaire()) + InvestorProfileV2ResponseMetadata.ADAPTER.encodedSizeWithTag(28, value.getInvestor_profile()) + ReviewInvestorProfileV2ResponseMetadata.ADAPTER.encodedSizeWithTag(29, value.getReview_investor_profile()) + UKEducationHomeResponseMetadata.ADAPTER.encodedSizeWithTag(30, value.getEducation_home()) + UKEducationStrategyResponseMetadata.ADAPTER.encodedSizeWithTag(31, value.getEducation_strategy()) + UKEducationRisksResponseMetadata.ADAPTER.encodedSizeWithTag(32, value.getEducation_risks()) + UKEducationProfessionalTraderResponseMetadata.ADAPTER.encodedSizeWithTag(33, value.getEducation_professional_trader()) + UKL3EducationHomeResponseMetadata.ADAPTER.encodedSizeWithTag(34, value.getUk_l3_education_home()) + UKL3EducationSpreadBenefitsResponseMetadata.ADAPTER.encodedSizeWithTag(35, value.getUk_l3_education_spread_benefits()) + RHSGHomeResponseMetadata.ADAPTER.encodedSizeWithTag(37, value.getRhsg_home()) + RHSGCompleteCARQuestionnaireResponseMetadata.ADAPTER.encodedSizeWithTag(38, value.getRhsg_complete_car_questionnaire()) + ProfessionalTraderResponseMetadata.ADAPTER.encodedSizeWithTag(39, value.getProfessional_trader()) + RHSGL2ApprovedTradesResponseMetadata.ADAPTER.encodedSizeWithTag(40, value.getRhsg_l2_approved_trades()) + RHSGL3ApprovedTradesResponseMetadata.ADAPTER.encodedSizeWithTag(41, value.getRhsg_l3_approved_trades()) + JAPendingApplicationResponseMetadata.ADAPTER.encodedSizeWithTag(42, value.getJa_pending_application()) + KnowledgeCheckNeededResponseMetadata.ADAPTER.encodedSizeWithTag(43, value.getKnowledge_check_needed()) + OnboardingProgress.ADAPTER.encodedSizeWithTag(36, value.getOnboarding_progress());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OnboardingScreenResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_checkpoint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checkpoint()));
                }
                if (value.getShould_live_in_backstack()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShould_live_in_backstack()));
                }
                if (value.getShould_clear_backstack()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_clear_backstack()));
                }
                if (value.getUpgrade_progress() != OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED) {
                    OnboardingScreenResponse.UpgradeProgress.ADAPTER.encodeWithTag(writer, 25, (int) value.getUpgrade_progress());
                }
                OnboardingProgress.ADAPTER.encodeWithTag(writer, 36, (int) value.getOnboarding_progress());
                StartResponseMetadata.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart());
                SplashL0ResponseMetadata.ADAPTER.encodeWithTag(writer, 5, (int) value.getSplash_l0());
                SplashL2ResponseMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getSplash_l2());
                SplashRetirementResponseMetadata.ADAPTER.encodeWithTag(writer, 7, (int) value.getSplash_retirement());
                QuestionOptionExperienceResponseMetadata.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuestion_option_experience());
                QuestionUnderstandSpreadResponseMetadata.ADAPTER.encodeWithTag(writer, 9, (int) value.getQuestion_understand_spread());
                QuestionInvestmentAdviceResponseMetadata.ADAPTER.encodeWithTag(writer, 10, (int) value.getQuestion_investment_advice());
                QuestionFinancialRegulatorResponseMetadata.ADAPTER.encodeWithTag(writer, 11, (int) value.getQuestion_financial_regulator());
                SuitabilityResponseMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getSuitability());
                InvestmentProfileResponseMetadata.ADAPTER.encodeWithTag(writer, 13, (int) value.getInvestment_profile());
                DisclosureResponseMetadata.ADAPTER.encodeWithTag(writer, 14, (int) value.getDisclosure());
                ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 15, (int) value.getApproved_trades());
                SuccessResponseMetadata.ADAPTER.encodeWithTag(writer, 16, (int) value.getSuccess());
                FailureResponseMetadata.ADAPTER.encodeWithTag(writer, 17, (int) value.getFailure());
                EducationSpreadResponseMetadata.ADAPTER.encodeWithTag(writer, 18, (int) value.getEducation_spread());
                EducationL3StrategiesResponseMetadata.ADAPTER.encodeWithTag(writer, 19, (int) value.getEducation_l3_strategies());
                ReadyL3UpgradeResponseMetadata.ADAPTER.encodeWithTag(writer, 20, (int) value.getReady_l3_upgrade());
                UpsellAlertResponseMetadata.ADAPTER.encodeWithTag(writer, 21, (int) value.getUpsell_alert());
                UpsellTradeOnExpirationResponseMetadata.ADAPTER.encodeWithTag(writer, 22, (int) value.getUpsell_trade_on_expiration());
                UpsellAllSetResponseMetadata.ADAPTER.encodeWithTag(writer, 23, (int) value.getUpsell_all_set());
                EndResponseMetadata.ADAPTER.encodeWithTag(writer, 24, (int) value.getEnd());
                KnowledgeTestQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 26, (int) value.getKnowledge_test_questionnaire());
                ExperienceTestQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 27, (int) value.getExperience_test_questionnaire());
                InvestorProfileV2ResponseMetadata.ADAPTER.encodeWithTag(writer, 28, (int) value.getInvestor_profile());
                ReviewInvestorProfileV2ResponseMetadata.ADAPTER.encodeWithTag(writer, 29, (int) value.getReview_investor_profile());
                UKEducationHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 30, (int) value.getEducation_home());
                UKEducationStrategyResponseMetadata.ADAPTER.encodeWithTag(writer, 31, (int) value.getEducation_strategy());
                UKEducationRisksResponseMetadata.ADAPTER.encodeWithTag(writer, 32, (int) value.getEducation_risks());
                UKEducationProfessionalTraderResponseMetadata.ADAPTER.encodeWithTag(writer, 33, (int) value.getEducation_professional_trader());
                UKL3EducationHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 34, (int) value.getUk_l3_education_home());
                UKL3EducationSpreadBenefitsResponseMetadata.ADAPTER.encodeWithTag(writer, 35, (int) value.getUk_l3_education_spread_benefits());
                RHSGHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 37, (int) value.getRhsg_home());
                RHSGCompleteCARQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 38, (int) value.getRhsg_complete_car_questionnaire());
                ProfessionalTraderResponseMetadata.ADAPTER.encodeWithTag(writer, 39, (int) value.getProfessional_trader());
                RHSGL2ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 40, (int) value.getRhsg_l2_approved_trades());
                RHSGL3ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 41, (int) value.getRhsg_l3_approved_trades());
                JAPendingApplicationResponseMetadata.ADAPTER.encodeWithTag(writer, 42, (int) value.getJa_pending_application());
                KnowledgeCheckNeededResponseMetadata.ADAPTER.encodeWithTag(writer, 43, (int) value.getKnowledge_check_needed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OnboardingScreenResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                KnowledgeCheckNeededResponseMetadata.ADAPTER.encodeWithTag(writer, 43, (int) value.getKnowledge_check_needed());
                JAPendingApplicationResponseMetadata.ADAPTER.encodeWithTag(writer, 42, (int) value.getJa_pending_application());
                RHSGL3ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 41, (int) value.getRhsg_l3_approved_trades());
                RHSGL2ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 40, (int) value.getRhsg_l2_approved_trades());
                ProfessionalTraderResponseMetadata.ADAPTER.encodeWithTag(writer, 39, (int) value.getProfessional_trader());
                RHSGCompleteCARQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 38, (int) value.getRhsg_complete_car_questionnaire());
                RHSGHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 37, (int) value.getRhsg_home());
                UKL3EducationSpreadBenefitsResponseMetadata.ADAPTER.encodeWithTag(writer, 35, (int) value.getUk_l3_education_spread_benefits());
                UKL3EducationHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 34, (int) value.getUk_l3_education_home());
                UKEducationProfessionalTraderResponseMetadata.ADAPTER.encodeWithTag(writer, 33, (int) value.getEducation_professional_trader());
                UKEducationRisksResponseMetadata.ADAPTER.encodeWithTag(writer, 32, (int) value.getEducation_risks());
                UKEducationStrategyResponseMetadata.ADAPTER.encodeWithTag(writer, 31, (int) value.getEducation_strategy());
                UKEducationHomeResponseMetadata.ADAPTER.encodeWithTag(writer, 30, (int) value.getEducation_home());
                ReviewInvestorProfileV2ResponseMetadata.ADAPTER.encodeWithTag(writer, 29, (int) value.getReview_investor_profile());
                InvestorProfileV2ResponseMetadata.ADAPTER.encodeWithTag(writer, 28, (int) value.getInvestor_profile());
                ExperienceTestQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 27, (int) value.getExperience_test_questionnaire());
                KnowledgeTestQuestionnaireResponseMetadata.ADAPTER.encodeWithTag(writer, 26, (int) value.getKnowledge_test_questionnaire());
                EndResponseMetadata.ADAPTER.encodeWithTag(writer, 24, (int) value.getEnd());
                UpsellAllSetResponseMetadata.ADAPTER.encodeWithTag(writer, 23, (int) value.getUpsell_all_set());
                UpsellTradeOnExpirationResponseMetadata.ADAPTER.encodeWithTag(writer, 22, (int) value.getUpsell_trade_on_expiration());
                UpsellAlertResponseMetadata.ADAPTER.encodeWithTag(writer, 21, (int) value.getUpsell_alert());
                ReadyL3UpgradeResponseMetadata.ADAPTER.encodeWithTag(writer, 20, (int) value.getReady_l3_upgrade());
                EducationL3StrategiesResponseMetadata.ADAPTER.encodeWithTag(writer, 19, (int) value.getEducation_l3_strategies());
                EducationSpreadResponseMetadata.ADAPTER.encodeWithTag(writer, 18, (int) value.getEducation_spread());
                FailureResponseMetadata.ADAPTER.encodeWithTag(writer, 17, (int) value.getFailure());
                SuccessResponseMetadata.ADAPTER.encodeWithTag(writer, 16, (int) value.getSuccess());
                ApprovedTradesResponseMetadata.ADAPTER.encodeWithTag(writer, 15, (int) value.getApproved_trades());
                DisclosureResponseMetadata.ADAPTER.encodeWithTag(writer, 14, (int) value.getDisclosure());
                InvestmentProfileResponseMetadata.ADAPTER.encodeWithTag(writer, 13, (int) value.getInvestment_profile());
                SuitabilityResponseMetadata.ADAPTER.encodeWithTag(writer, 12, (int) value.getSuitability());
                QuestionFinancialRegulatorResponseMetadata.ADAPTER.encodeWithTag(writer, 11, (int) value.getQuestion_financial_regulator());
                QuestionInvestmentAdviceResponseMetadata.ADAPTER.encodeWithTag(writer, 10, (int) value.getQuestion_investment_advice());
                QuestionUnderstandSpreadResponseMetadata.ADAPTER.encodeWithTag(writer, 9, (int) value.getQuestion_understand_spread());
                QuestionOptionExperienceResponseMetadata.ADAPTER.encodeWithTag(writer, 8, (int) value.getQuestion_option_experience());
                SplashRetirementResponseMetadata.ADAPTER.encodeWithTag(writer, 7, (int) value.getSplash_retirement());
                SplashL2ResponseMetadata.ADAPTER.encodeWithTag(writer, 6, (int) value.getSplash_l2());
                SplashL0ResponseMetadata.ADAPTER.encodeWithTag(writer, 5, (int) value.getSplash_l0());
                StartResponseMetadata.ADAPTER.encodeWithTag(writer, 4, (int) value.getStart());
                OnboardingProgress.ADAPTER.encodeWithTag(writer, 36, (int) value.getOnboarding_progress());
                if (value.getUpgrade_progress() != OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED) {
                    OnboardingScreenResponse.UpgradeProgress.ADAPTER.encodeWithTag(writer, 25, (int) value.getUpgrade_progress());
                }
                if (value.getShould_clear_backstack()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getShould_clear_backstack()));
                }
                if (value.getShould_live_in_backstack()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getShould_live_in_backstack()));
                }
                if (value.getIs_checkpoint()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_checkpoint()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenResponse decode(ProtoReader reader) throws IOException {
                StartResponseMetadata startResponseMetadata;
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(reader, "reader");
                OnboardingScreenResponse.UpgradeProgress upgradeProgress = OnboardingScreenResponse.UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                StartResponseMetadata startResponseMetadataDecode = null;
                OnboardingScreenResponse.UpgradeProgress upgradeProgressDecode = upgradeProgress;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                SplashL0ResponseMetadata splashL0ResponseMetadataDecode = null;
                SplashL2ResponseMetadata splashL2ResponseMetadataDecode = null;
                SplashRetirementResponseMetadata splashRetirementResponseMetadataDecode = null;
                QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadataDecode = null;
                QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadataDecode = null;
                QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadataDecode = null;
                QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadataDecode = null;
                SuitabilityResponseMetadata suitabilityResponseMetadataDecode = null;
                InvestmentProfileResponseMetadata investmentProfileResponseMetadataDecode = null;
                DisclosureResponseMetadata disclosureResponseMetadataDecode = null;
                ApprovedTradesResponseMetadata approvedTradesResponseMetadataDecode = null;
                SuccessResponseMetadata successResponseMetadataDecode = null;
                FailureResponseMetadata failureResponseMetadataDecode = null;
                EducationSpreadResponseMetadata educationSpreadResponseMetadataDecode = null;
                EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadataDecode = null;
                ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadataDecode = null;
                UpsellAlertResponseMetadata upsellAlertResponseMetadataDecode = null;
                UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadataDecode = null;
                UpsellAllSetResponseMetadata upsellAllSetResponseMetadataDecode = null;
                EndResponseMetadata endResponseMetadataDecode = null;
                KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadataDecode = null;
                ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadataDecode = null;
                InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadataDecode = null;
                ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadataDecode = null;
                UKEducationHomeResponseMetadata uKEducationHomeResponseMetadataDecode = null;
                UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadataDecode = null;
                UKEducationRisksResponseMetadata uKEducationRisksResponseMetadataDecode = null;
                UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadataDecode = null;
                UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadataDecode = null;
                UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadataDecode = null;
                RHSGHomeResponseMetadata rHSGHomeResponseMetadataDecode = null;
                RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadataDecode = null;
                ProfessionalTraderResponseMetadata professionalTraderResponseMetadataDecode = null;
                RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadataDecode = null;
                RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadataDecode = null;
                JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadataDecode = null;
                KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadataDecode = null;
                OnboardingProgress onboardingProgressDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 2:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 3:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                continue;
                            case 4:
                                startResponseMetadataDecode = StartResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 5:
                                splashL0ResponseMetadataDecode = SplashL0ResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 6:
                                splashL2ResponseMetadataDecode = SplashL2ResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 7:
                                splashRetirementResponseMetadataDecode = SplashRetirementResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 8:
                                questionOptionExperienceResponseMetadataDecode = QuestionOptionExperienceResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 9:
                                questionUnderstandSpreadResponseMetadataDecode = QuestionUnderstandSpreadResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 10:
                                questionInvestmentAdviceResponseMetadataDecode = QuestionInvestmentAdviceResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 11:
                                questionFinancialRegulatorResponseMetadataDecode = QuestionFinancialRegulatorResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 12:
                                suitabilityResponseMetadataDecode = SuitabilityResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 13:
                                investmentProfileResponseMetadataDecode = InvestmentProfileResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 14:
                                disclosureResponseMetadataDecode = DisclosureResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 15:
                                approvedTradesResponseMetadataDecode = ApprovedTradesResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 16:
                                successResponseMetadataDecode = SuccessResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 17:
                                failureResponseMetadataDecode = FailureResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 18:
                                educationSpreadResponseMetadataDecode = EducationSpreadResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 19:
                                educationL3StrategiesResponseMetadataDecode = EducationL3StrategiesResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 20:
                                readyL3UpgradeResponseMetadataDecode = ReadyL3UpgradeResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 21:
                                upsellAlertResponseMetadataDecode = UpsellAlertResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 22:
                                upsellTradeOnExpirationResponseMetadataDecode = UpsellTradeOnExpirationResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 23:
                                upsellAllSetResponseMetadataDecode = UpsellAllSetResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 24:
                                endResponseMetadataDecode = EndResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 25:
                                try {
                                    upgradeProgressDecode = OnboardingScreenResponse.UpgradeProgress.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    startResponseMetadata = startResponseMetadataDecode;
                                    z = zBooleanValue;
                                    z2 = zBooleanValue2;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 26:
                                knowledgeTestQuestionnaireResponseMetadataDecode = KnowledgeTestQuestionnaireResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 27:
                                experienceTestQuestionnaireResponseMetadataDecode = ExperienceTestQuestionnaireResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 28:
                                investorProfileV2ResponseMetadataDecode = InvestorProfileV2ResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 29:
                                reviewInvestorProfileV2ResponseMetadataDecode = ReviewInvestorProfileV2ResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 30:
                                uKEducationHomeResponseMetadataDecode = UKEducationHomeResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 31:
                                uKEducationStrategyResponseMetadataDecode = UKEducationStrategyResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 32:
                                uKEducationRisksResponseMetadataDecode = UKEducationRisksResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 33:
                                uKEducationProfessionalTraderResponseMetadataDecode = UKEducationProfessionalTraderResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 34:
                                uKL3EducationHomeResponseMetadataDecode = UKL3EducationHomeResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 35:
                                uKL3EducationSpreadBenefitsResponseMetadataDecode = UKL3EducationSpreadBenefitsResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 36:
                                onboardingProgressDecode = OnboardingProgress.ADAPTER.decode(reader);
                                continue;
                            case 37:
                                rHSGHomeResponseMetadataDecode = RHSGHomeResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 38:
                                rHSGCompleteCARQuestionnaireResponseMetadataDecode = RHSGCompleteCARQuestionnaireResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 39:
                                professionalTraderResponseMetadataDecode = ProfessionalTraderResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 40:
                                rHSGL2ApprovedTradesResponseMetadataDecode = RHSGL2ApprovedTradesResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 41:
                                rHSGL3ApprovedTradesResponseMetadataDecode = RHSGL3ApprovedTradesResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 42:
                                jAPendingApplicationResponseMetadataDecode = JAPendingApplicationResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            case 43:
                                knowledgeCheckNeededResponseMetadataDecode = KnowledgeCheckNeededResponseMetadata.ADAPTER.decode(reader);
                                continue;
                            default:
                                reader.readUnknownField(iNextTag);
                                startResponseMetadata = startResponseMetadataDecode;
                                z = zBooleanValue;
                                z2 = zBooleanValue2;
                                break;
                        }
                        startResponseMetadataDecode = startResponseMetadata;
                        zBooleanValue = z;
                        zBooleanValue2 = z2;
                    } else {
                        return new OnboardingScreenResponse(zBooleanValue, zBooleanValue2, zBooleanValue3, upgradeProgressDecode, startResponseMetadataDecode, splashL0ResponseMetadataDecode, splashL2ResponseMetadataDecode, splashRetirementResponseMetadataDecode, questionOptionExperienceResponseMetadataDecode, questionUnderstandSpreadResponseMetadataDecode, questionInvestmentAdviceResponseMetadataDecode, questionFinancialRegulatorResponseMetadataDecode, suitabilityResponseMetadataDecode, investmentProfileResponseMetadataDecode, disclosureResponseMetadataDecode, approvedTradesResponseMetadataDecode, successResponseMetadataDecode, failureResponseMetadataDecode, educationSpreadResponseMetadataDecode, educationL3StrategiesResponseMetadataDecode, readyL3UpgradeResponseMetadataDecode, upsellAlertResponseMetadataDecode, upsellTradeOnExpirationResponseMetadataDecode, upsellAllSetResponseMetadataDecode, endResponseMetadataDecode, knowledgeTestQuestionnaireResponseMetadataDecode, experienceTestQuestionnaireResponseMetadataDecode, investorProfileV2ResponseMetadataDecode, reviewInvestorProfileV2ResponseMetadataDecode, uKEducationHomeResponseMetadataDecode, uKEducationStrategyResponseMetadataDecode, uKEducationRisksResponseMetadataDecode, uKEducationProfessionalTraderResponseMetadataDecode, uKL3EducationHomeResponseMetadataDecode, uKL3EducationSpreadBenefitsResponseMetadataDecode, rHSGHomeResponseMetadataDecode, rHSGCompleteCARQuestionnaireResponseMetadataDecode, professionalTraderResponseMetadataDecode, rHSGL2ApprovedTradesResponseMetadataDecode, rHSGL3ApprovedTradesResponseMetadataDecode, jAPendingApplicationResponseMetadataDecode, knowledgeCheckNeededResponseMetadataDecode, onboardingProgressDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OnboardingScreenResponse redact(OnboardingScreenResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StartResponseMetadata start = value.getStart();
                StartResponseMetadata startResponseMetadataRedact = start != null ? StartResponseMetadata.ADAPTER.redact(start) : null;
                SplashL0ResponseMetadata splash_l0 = value.getSplash_l0();
                SplashL0ResponseMetadata splashL0ResponseMetadataRedact = splash_l0 != null ? SplashL0ResponseMetadata.ADAPTER.redact(splash_l0) : null;
                SplashL2ResponseMetadata splash_l2 = value.getSplash_l2();
                SplashL2ResponseMetadata splashL2ResponseMetadataRedact = splash_l2 != null ? SplashL2ResponseMetadata.ADAPTER.redact(splash_l2) : null;
                SplashRetirementResponseMetadata splash_retirement = value.getSplash_retirement();
                SplashRetirementResponseMetadata splashRetirementResponseMetadataRedact = splash_retirement != null ? SplashRetirementResponseMetadata.ADAPTER.redact(splash_retirement) : null;
                QuestionOptionExperienceResponseMetadata question_option_experience = value.getQuestion_option_experience();
                QuestionOptionExperienceResponseMetadata questionOptionExperienceResponseMetadataRedact = question_option_experience != null ? QuestionOptionExperienceResponseMetadata.ADAPTER.redact(question_option_experience) : null;
                QuestionUnderstandSpreadResponseMetadata question_understand_spread = value.getQuestion_understand_spread();
                QuestionUnderstandSpreadResponseMetadata questionUnderstandSpreadResponseMetadataRedact = question_understand_spread != null ? QuestionUnderstandSpreadResponseMetadata.ADAPTER.redact(question_understand_spread) : null;
                QuestionInvestmentAdviceResponseMetadata question_investment_advice = value.getQuestion_investment_advice();
                QuestionInvestmentAdviceResponseMetadata questionInvestmentAdviceResponseMetadataRedact = question_investment_advice != null ? QuestionInvestmentAdviceResponseMetadata.ADAPTER.redact(question_investment_advice) : null;
                QuestionFinancialRegulatorResponseMetadata question_financial_regulator = value.getQuestion_financial_regulator();
                QuestionFinancialRegulatorResponseMetadata questionFinancialRegulatorResponseMetadataRedact = question_financial_regulator != null ? QuestionFinancialRegulatorResponseMetadata.ADAPTER.redact(question_financial_regulator) : null;
                SuitabilityResponseMetadata suitability = value.getSuitability();
                SuitabilityResponseMetadata suitabilityResponseMetadataRedact = suitability != null ? SuitabilityResponseMetadata.ADAPTER.redact(suitability) : null;
                InvestmentProfileResponseMetadata investment_profile = value.getInvestment_profile();
                InvestmentProfileResponseMetadata investmentProfileResponseMetadataRedact = investment_profile != null ? InvestmentProfileResponseMetadata.ADAPTER.redact(investment_profile) : null;
                DisclosureResponseMetadata disclosure = value.getDisclosure();
                DisclosureResponseMetadata disclosureResponseMetadataRedact = disclosure != null ? DisclosureResponseMetadata.ADAPTER.redact(disclosure) : null;
                ApprovedTradesResponseMetadata approved_trades = value.getApproved_trades();
                ApprovedTradesResponseMetadata approvedTradesResponseMetadataRedact = approved_trades != null ? ApprovedTradesResponseMetadata.ADAPTER.redact(approved_trades) : null;
                SuccessResponseMetadata success = value.getSuccess();
                SuccessResponseMetadata successResponseMetadataRedact = success != null ? SuccessResponseMetadata.ADAPTER.redact(success) : null;
                FailureResponseMetadata failure = value.getFailure();
                FailureResponseMetadata failureResponseMetadataRedact = failure != null ? FailureResponseMetadata.ADAPTER.redact(failure) : null;
                EducationSpreadResponseMetadata education_spread = value.getEducation_spread();
                EducationSpreadResponseMetadata educationSpreadResponseMetadataRedact = education_spread != null ? EducationSpreadResponseMetadata.ADAPTER.redact(education_spread) : null;
                EducationL3StrategiesResponseMetadata education_l3_strategies = value.getEducation_l3_strategies();
                EducationL3StrategiesResponseMetadata educationL3StrategiesResponseMetadataRedact = education_l3_strategies != null ? EducationL3StrategiesResponseMetadata.ADAPTER.redact(education_l3_strategies) : null;
                ReadyL3UpgradeResponseMetadata ready_l3_upgrade = value.getReady_l3_upgrade();
                ReadyL3UpgradeResponseMetadata readyL3UpgradeResponseMetadataRedact = ready_l3_upgrade != null ? ReadyL3UpgradeResponseMetadata.ADAPTER.redact(ready_l3_upgrade) : null;
                UpsellAlertResponseMetadata upsell_alert = value.getUpsell_alert();
                UpsellAlertResponseMetadata upsellAlertResponseMetadataRedact = upsell_alert != null ? UpsellAlertResponseMetadata.ADAPTER.redact(upsell_alert) : null;
                UpsellTradeOnExpirationResponseMetadata upsell_trade_on_expiration = value.getUpsell_trade_on_expiration();
                UpsellTradeOnExpirationResponseMetadata upsellTradeOnExpirationResponseMetadataRedact = upsell_trade_on_expiration != null ? UpsellTradeOnExpirationResponseMetadata.ADAPTER.redact(upsell_trade_on_expiration) : null;
                UpsellAllSetResponseMetadata upsell_all_set = value.getUpsell_all_set();
                UpsellAllSetResponseMetadata upsellAllSetResponseMetadataRedact = upsell_all_set != null ? UpsellAllSetResponseMetadata.ADAPTER.redact(upsell_all_set) : null;
                EndResponseMetadata end = value.getEnd();
                EndResponseMetadata endResponseMetadataRedact = end != null ? EndResponseMetadata.ADAPTER.redact(end) : null;
                KnowledgeTestQuestionnaireResponseMetadata knowledge_test_questionnaire = value.getKnowledge_test_questionnaire();
                KnowledgeTestQuestionnaireResponseMetadata knowledgeTestQuestionnaireResponseMetadataRedact = knowledge_test_questionnaire != null ? KnowledgeTestQuestionnaireResponseMetadata.ADAPTER.redact(knowledge_test_questionnaire) : null;
                ExperienceTestQuestionnaireResponseMetadata experience_test_questionnaire = value.getExperience_test_questionnaire();
                ExperienceTestQuestionnaireResponseMetadata experienceTestQuestionnaireResponseMetadataRedact = experience_test_questionnaire != null ? ExperienceTestQuestionnaireResponseMetadata.ADAPTER.redact(experience_test_questionnaire) : null;
                InvestorProfileV2ResponseMetadata investor_profile = value.getInvestor_profile();
                InvestorProfileV2ResponseMetadata investorProfileV2ResponseMetadataRedact = investor_profile != null ? InvestorProfileV2ResponseMetadata.ADAPTER.redact(investor_profile) : null;
                ReviewInvestorProfileV2ResponseMetadata review_investor_profile = value.getReview_investor_profile();
                ReviewInvestorProfileV2ResponseMetadata reviewInvestorProfileV2ResponseMetadataRedact = review_investor_profile != null ? ReviewInvestorProfileV2ResponseMetadata.ADAPTER.redact(review_investor_profile) : null;
                UKEducationHomeResponseMetadata education_home = value.getEducation_home();
                UKEducationHomeResponseMetadata uKEducationHomeResponseMetadataRedact = education_home != null ? UKEducationHomeResponseMetadata.ADAPTER.redact(education_home) : null;
                UKEducationStrategyResponseMetadata education_strategy = value.getEducation_strategy();
                UKEducationStrategyResponseMetadata uKEducationStrategyResponseMetadataRedact = education_strategy != null ? UKEducationStrategyResponseMetadata.ADAPTER.redact(education_strategy) : null;
                UKEducationRisksResponseMetadata education_risks = value.getEducation_risks();
                UKEducationRisksResponseMetadata uKEducationRisksResponseMetadataRedact = education_risks != null ? UKEducationRisksResponseMetadata.ADAPTER.redact(education_risks) : null;
                UKEducationProfessionalTraderResponseMetadata education_professional_trader = value.getEducation_professional_trader();
                UKEducationProfessionalTraderResponseMetadata uKEducationProfessionalTraderResponseMetadataRedact = education_professional_trader != null ? UKEducationProfessionalTraderResponseMetadata.ADAPTER.redact(education_professional_trader) : null;
                UKL3EducationHomeResponseMetadata uk_l3_education_home = value.getUk_l3_education_home();
                UKL3EducationHomeResponseMetadata uKL3EducationHomeResponseMetadataRedact = uk_l3_education_home != null ? UKL3EducationHomeResponseMetadata.ADAPTER.redact(uk_l3_education_home) : null;
                UKL3EducationSpreadBenefitsResponseMetadata uk_l3_education_spread_benefits = value.getUk_l3_education_spread_benefits();
                UKL3EducationSpreadBenefitsResponseMetadata uKL3EducationSpreadBenefitsResponseMetadataRedact = uk_l3_education_spread_benefits != null ? UKL3EducationSpreadBenefitsResponseMetadata.ADAPTER.redact(uk_l3_education_spread_benefits) : null;
                RHSGHomeResponseMetadata rhsg_home = value.getRhsg_home();
                RHSGHomeResponseMetadata rHSGHomeResponseMetadataRedact = rhsg_home != null ? RHSGHomeResponseMetadata.ADAPTER.redact(rhsg_home) : null;
                RHSGCompleteCARQuestionnaireResponseMetadata rhsg_complete_car_questionnaire = value.getRhsg_complete_car_questionnaire();
                RHSGCompleteCARQuestionnaireResponseMetadata rHSGCompleteCARQuestionnaireResponseMetadataRedact = rhsg_complete_car_questionnaire != null ? RHSGCompleteCARQuestionnaireResponseMetadata.ADAPTER.redact(rhsg_complete_car_questionnaire) : null;
                ProfessionalTraderResponseMetadata professional_trader = value.getProfessional_trader();
                ProfessionalTraderResponseMetadata professionalTraderResponseMetadataRedact = professional_trader != null ? ProfessionalTraderResponseMetadata.ADAPTER.redact(professional_trader) : null;
                RHSGL2ApprovedTradesResponseMetadata rhsg_l2_approved_trades = value.getRhsg_l2_approved_trades();
                RHSGL2ApprovedTradesResponseMetadata rHSGL2ApprovedTradesResponseMetadataRedact = rhsg_l2_approved_trades != null ? RHSGL2ApprovedTradesResponseMetadata.ADAPTER.redact(rhsg_l2_approved_trades) : null;
                RHSGL3ApprovedTradesResponseMetadata rhsg_l3_approved_trades = value.getRhsg_l3_approved_trades();
                RHSGL3ApprovedTradesResponseMetadata rHSGL3ApprovedTradesResponseMetadataRedact = rhsg_l3_approved_trades != null ? RHSGL3ApprovedTradesResponseMetadata.ADAPTER.redact(rhsg_l3_approved_trades) : null;
                JAPendingApplicationResponseMetadata ja_pending_application = value.getJa_pending_application();
                JAPendingApplicationResponseMetadata jAPendingApplicationResponseMetadataRedact = ja_pending_application != null ? JAPendingApplicationResponseMetadata.ADAPTER.redact(ja_pending_application) : null;
                KnowledgeCheckNeededResponseMetadata knowledge_check_needed = value.getKnowledge_check_needed();
                KnowledgeCheckNeededResponseMetadata knowledgeCheckNeededResponseMetadataRedact = knowledge_check_needed != null ? KnowledgeCheckNeededResponseMetadata.ADAPTER.redact(knowledge_check_needed) : null;
                OnboardingProgress onboarding_progress = value.getOnboarding_progress();
                return value.copy((15 & 1) != 0 ? value.is_checkpoint : false, (15 & 2) != 0 ? value.should_live_in_backstack : false, (15 & 4) != 0 ? value.should_clear_backstack : false, (15 & 8) != 0 ? value.upgrade_progress : null, (15 & 16) != 0 ? value.start : startResponseMetadataRedact, (15 & 32) != 0 ? value.splash_l0 : splashL0ResponseMetadataRedact, (15 & 64) != 0 ? value.splash_l2 : splashL2ResponseMetadataRedact, (15 & 128) != 0 ? value.splash_retirement : splashRetirementResponseMetadataRedact, (15 & 256) != 0 ? value.question_option_experience : questionOptionExperienceResponseMetadataRedact, (15 & 512) != 0 ? value.question_understand_spread : questionUnderstandSpreadResponseMetadataRedact, (15 & 1024) != 0 ? value.question_investment_advice : questionInvestmentAdviceResponseMetadataRedact, (15 & 2048) != 0 ? value.question_financial_regulator : questionFinancialRegulatorResponseMetadataRedact, (15 & 4096) != 0 ? value.suitability : suitabilityResponseMetadataRedact, (15 & 8192) != 0 ? value.investment_profile : investmentProfileResponseMetadataRedact, (15 & 16384) != 0 ? value.disclosure : disclosureResponseMetadataRedact, (15 & 32768) != 0 ? value.approved_trades : approvedTradesResponseMetadataRedact, (15 & 65536) != 0 ? value.success : successResponseMetadataRedact, (15 & 131072) != 0 ? value.failure : failureResponseMetadataRedact, (15 & 262144) != 0 ? value.education_spread : educationSpreadResponseMetadataRedact, (15 & 524288) != 0 ? value.education_l3_strategies : educationL3StrategiesResponseMetadataRedact, (15 & 1048576) != 0 ? value.ready_l3_upgrade : readyL3UpgradeResponseMetadataRedact, (15 & 2097152) != 0 ? value.upsell_alert : upsellAlertResponseMetadataRedact, (15 & 4194304) != 0 ? value.upsell_trade_on_expiration : upsellTradeOnExpirationResponseMetadataRedact, (15 & 8388608) != 0 ? value.upsell_all_set : upsellAllSetResponseMetadataRedact, (15 & 16777216) != 0 ? value.end : endResponseMetadataRedact, (15 & 33554432) != 0 ? value.knowledge_test_questionnaire : knowledgeTestQuestionnaireResponseMetadataRedact, (15 & 67108864) != 0 ? value.experience_test_questionnaire : experienceTestQuestionnaireResponseMetadataRedact, (15 & 134217728) != 0 ? value.investor_profile : investorProfileV2ResponseMetadataRedact, (15 & 268435456) != 0 ? value.review_investor_profile : reviewInvestorProfileV2ResponseMetadataRedact, (15 & 536870912) != 0 ? value.education_home : uKEducationHomeResponseMetadataRedact, (15 & 1073741824) != 0 ? value.education_strategy : uKEducationStrategyResponseMetadataRedact, (15 & Integer.MIN_VALUE) != 0 ? value.education_risks : uKEducationRisksResponseMetadataRedact, (0 & 1) != 0 ? value.education_professional_trader : uKEducationProfessionalTraderResponseMetadataRedact, (0 & 2) != 0 ? value.uk_l3_education_home : uKL3EducationHomeResponseMetadataRedact, (0 & 4) != 0 ? value.uk_l3_education_spread_benefits : uKL3EducationSpreadBenefitsResponseMetadataRedact, (0 & 8) != 0 ? value.rhsg_home : rHSGHomeResponseMetadataRedact, (0 & 16) != 0 ? value.rhsg_complete_car_questionnaire : rHSGCompleteCARQuestionnaireResponseMetadataRedact, (0 & 32) != 0 ? value.professional_trader : professionalTraderResponseMetadataRedact, (0 & 64) != 0 ? value.rhsg_l2_approved_trades : rHSGL2ApprovedTradesResponseMetadataRedact, (0 & 128) != 0 ? value.rhsg_l3_approved_trades : rHSGL3ApprovedTradesResponseMetadataRedact, (0 & 256) != 0 ? value.ja_pending_application : jAPendingApplicationResponseMetadataRedact, (0 & 512) != 0 ? value.knowledge_check_needed : knowledgeCheckNeededResponseMetadataRedact, (0 & 1024) != 0 ? value.onboarding_progress : onboarding_progress != null ? OnboardingProgress.ADAPTER.redact(onboarding_progress) : null, (0 & 2048) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnboardingScreenResponse.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UPGRADE_PROGRESS_UNSPECIFIED", "IN_PROGRESS", "SUCCESS", "FAILURE", "ALREADY_HAS_OPTIONS_ACCESS", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class UpgradeProgress implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UpgradeProgress[] $VALUES;

        @JvmField
        public static final ProtoAdapter<UpgradeProgress> ADAPTER;
        public static final UpgradeProgress ALREADY_HAS_OPTIONS_ACCESS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final UpgradeProgress FAILURE;
        public static final UpgradeProgress IN_PROGRESS;
        public static final UpgradeProgress SUCCESS;
        public static final UpgradeProgress UPGRADE_PROGRESS_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ UpgradeProgress[] $values() {
            return new UpgradeProgress[]{UPGRADE_PROGRESS_UNSPECIFIED, IN_PROGRESS, SUCCESS, FAILURE, ALREADY_HAS_OPTIONS_ACCESS};
        }

        @JvmStatic
        public static final UpgradeProgress fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<UpgradeProgress> getEntries() {
            return $ENTRIES;
        }

        private UpgradeProgress(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final UpgradeProgress upgradeProgress = new UpgradeProgress("UPGRADE_PROGRESS_UNSPECIFIED", 0, 0);
            UPGRADE_PROGRESS_UNSPECIFIED = upgradeProgress;
            IN_PROGRESS = new UpgradeProgress("IN_PROGRESS", 1, 1);
            SUCCESS = new UpgradeProgress("SUCCESS", 2, 2);
            FAILURE = new UpgradeProgress("FAILURE", 3, 3);
            ALREADY_HAS_OPTIONS_ACCESS = new UpgradeProgress("ALREADY_HAS_OPTIONS_ACCESS", 4, 4);
            UpgradeProgress[] upgradeProgressArr$values = $values();
            $VALUES = upgradeProgressArr$values;
            $ENTRIES = EnumEntries2.enumEntries(upgradeProgressArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpgradeProgress.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<UpgradeProgress>(orCreateKotlinClass, syntax, upgradeProgress) { // from class: options_product.service.OnboardingScreenResponse$UpgradeProgress$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OnboardingScreenResponse.UpgradeProgress fromValue(int value) {
                    return OnboardingScreenResponse.UpgradeProgress.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OnboardingScreenResponse.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Loptions_product/service/OnboardingScreenResponse$UpgradeProgress$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Loptions_product/service/OnboardingScreenResponse$UpgradeProgress;", "fromValue", "value", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final UpgradeProgress fromValue(int value) {
                if (value == 0) {
                    return UpgradeProgress.UPGRADE_PROGRESS_UNSPECIFIED;
                }
                if (value == 1) {
                    return UpgradeProgress.IN_PROGRESS;
                }
                if (value == 2) {
                    return UpgradeProgress.SUCCESS;
                }
                if (value == 3) {
                    return UpgradeProgress.FAILURE;
                }
                if (value != 4) {
                    return null;
                }
                return UpgradeProgress.ALREADY_HAS_OPTIONS_ACCESS;
            }
        }

        public static UpgradeProgress valueOf(String str) {
            return (UpgradeProgress) Enum.valueOf(UpgradeProgress.class, str);
        }

        public static UpgradeProgress[] values() {
            return (UpgradeProgress[]) $VALUES.clone();
        }
    }
}
