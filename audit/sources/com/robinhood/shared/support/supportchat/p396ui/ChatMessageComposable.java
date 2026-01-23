package com.robinhood.shared.support.supportchat.p396ui;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.CustomAccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import coil.compose.SingletonAsyncImage;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.p306v2.ActionCtaStyle;
import com.robinhood.models.api.p306v2.ActionMessageStyle;
import com.robinhood.models.p355ui.p356v2.SelectionMenuRowModel;
import com.robinhood.models.p355ui.p356v2.ThemedUrl;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.chat.common.api.ParticipantType;
import com.robinhood.shared.support.supportchat.C40042R;
import com.robinhood.shared.support.supportchat.extensions.SupportChatActions;
import com.robinhood.shared.support.supportchat.p396ui.ChatMessageComposable;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatAction;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage;
import com.robinhood.shared.support.supportchat.p396ui.models.UiChatMessage2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChatMessageComposable.kt */
@Metadata(m3635d1 = {"\u0000è\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0014\u001ar\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0016\u001az\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001c2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001c2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010!\u001a\u0084\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010'\u001a\u0015\u0010(\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020)H\u0003¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020,H\u0003¢\u0006\u0002\u0010-\u001a\u0015\u0010.\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020/H\u0003¢\u0006\u0002\u00100\u001a1\u00101\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00103\u001a1\u00104\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00103\u001a1\u00105\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u0002022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u00103\u001a\u0015\u00106\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u000207H\u0003¢\u0006\u0002\u00108\u001a\r\u00109\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010:\u001a\u001f\u0010;\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020<2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010=\u001a!\u0010>\u001a\u00020\u00012\b\u0010?\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010A\u001a(\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020CH\u0002\u001a\u0011\u0010I\u001a\u00020J*\u00020\nH\u0003¢\u0006\u0002\u0010K\u001a\u0013\u0010L\u001a\u0004\u0018\u00010$*\u00020\nH\u0003¢\u0006\u0002\u0010M\u001a\u0011\u0010N\u001a\u00020<*\u00020\nH\u0003¢\u0006\u0002\u0010O\u001a+\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q*\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010S\u001a\u001e\u0010T\u001a\u0004\u0018\u00010E*\u00020E2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH\u0002\u001a\u0014\u0010b\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020\u0019H\u0002\"\u001e\u0010U\u001a\u00020V*\u00020\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\" \u0010[\u001a\u00020\\*\u0004\u0018\u00010]8@X\u0081\u0004¢\u0006\f\u0012\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u000e\u0010d\u001a\u00020eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010f\u001a\u00020eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010g\u001a\u00020eX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010h\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010i\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010j\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010k\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010l\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010m\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010n\u001a\u00020eX\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010o\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bp\u0010q\"\u0011\u0010r\u001a\u00020&¢\u0006\b\n\u0000\u001a\u0004\bs\u0010q\"\u000e\u0010t\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010u\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006v²\u0006\f\u0010w\u001a\u0004\u0018\u00010xX\u008a\u0084\u0002²\u0006\n\u0010y\u001a\u00020zX\u008a\u0084\u0002²\u0006\f\u0010w\u001a\u0004\u0018\u00010xX\u008a\u0084\u0002²\u0006\n\u0010y\u001a\u00020zX\u008a\u0084\u0002"}, m3636d2 = {"ChatMessageComposable", "", "inquiryId", "Ljava/util/UUID;", "message", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;", "senderType", "Lcom/robinhood/shared/models/chat/common/api/ParticipantType;", "onClickMessageBubble", "Lkotlin/Function1;", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;", "onClickAction", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatAction;", "modifier", "Landroidx/compose/ui/Modifier;", "onClickUserSelectionRow", "Lcom/robinhood/models/ui/v2/SelectionMenuRowModel;", "Lkotlin/ParameterName;", "name", "row", "(Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage;Lcom/robinhood/shared/models/chat/common/api/ParticipantType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "UserMessage", "(Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AgentMessage", "fromChatbot", "", "(Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SystemMessage", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Metadata;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Metadata;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SystemPlain", "SystemDisclaimer", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Metadata$Disclaimer;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Metadata$Disclaimer;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Bubble", "bubbleBorder", "Landroidx/compose/foundation/BorderStroke;", "bubbleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "(Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Text", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Text;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Text;Landroidx/compose/runtime/Composer;I)V", "SuggestedResponseText", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SuggestedResponseText;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$SuggestedResponseText;Landroidx/compose/runtime/Composer;I)V", "Markdown", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Markdown;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Markdown;Landroidx/compose/runtime/Composer;I)V", "Action", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Action;", "(Ljava/util/UUID;Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Action;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ActionRegular", "ActionCardMultiSelect", "Link", "Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Link;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular$Link;Landroidx/compose/runtime/Composer;I)V", "TypingIndicator", "(Landroidx/compose/runtime/Composer;I)V", "ChatbotThinkingIndicator", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MetadataText", "metadata", "Lcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata;", "(Lcom/robinhood/shared/support/supportchat/ui/models/MessageMetadata;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildUrlLoggerForMessage", "Landroidx/compose/ui/platform/UriHandler;", "eventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "uriHandler", "getAgentMessageEndPadding", "Landroidx/compose/ui/unit/Dp;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Landroidx/compose/runtime/Composer;I)F", "toBubbleBorder", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "toDescriptionText", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "toCustomA11yActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "(Lcom/robinhood/shared/support/supportchat/ui/models/UiChatMessage$Regular;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "generateMessageEventDescriptor", "eventType", "Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "getEventType$annotations", "(Lcom/robinhood/shared/models/chat/common/api/ParticipantType;)V", "getEventType", "(Lcom/robinhood/shared/models/chat/common/api/ParticipantType;)Lcom/robinhood/rosetta/eventlogging/CXIssue$ChatMessageSender;", "bentoButtonStyle", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "Lcom/robinhood/models/api/v2/ActionCtaStyle;", "getBentoButtonStyle$annotations", "(Lcom/robinhood/models/api/v2/ActionCtaStyle;)V", "getBentoButtonStyle", "(Lcom/robinhood/models/api/v2/ActionCtaStyle;)Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "transform", "isEndOfMessageBlock", "MessageOuterSidePaddingLarge", "", "MessageOuterSidePaddingNormal", "MessageOuterSidePaddingSmall", "MessageBubbleRadius", "MessageBubbleVerticalPadding", "AgentAvatarSize", "DisclaimerBoxRadius", "DisclaimerBoxBorderWidth", "SelectionMessageBubbleRadius", "ActionMessageButtonSpacing", "UserMessageBubbleShape", "getUserMessageBubbleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "UserSelectionMessageBubbleShape", "getUserSelectionMessageBubbleShape", "AgentMessageBubbleShape", "PrecedingMessageBubbleShape", "lib-support-chat_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "state", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatMessageComposable {
    private static final int ActionMessageButtonSpacing = 12;
    private static final int AgentAvatarSize = 32;
    private static final RoundedCornerShape AgentMessageBubbleShape;
    private static final int DisclaimerBoxBorderWidth = 1;
    private static final int DisclaimerBoxRadius = 12;
    private static final int MessageBubbleRadius = 20;
    private static final int MessageBubbleVerticalPadding = 12;
    public static final int MessageOuterSidePaddingLarge = 38;
    public static final int MessageOuterSidePaddingNormal = 32;
    public static final int MessageOuterSidePaddingSmall = 8;
    private static final RoundedCornerShape PrecedingMessageBubbleShape;
    private static final int SelectionMessageBubbleRadius = 12;
    private static final RoundedCornerShape UserMessageBubbleShape;
    private static final RoundedCornerShape UserSelectionMessageBubbleShape;

    /* compiled from: ChatMessageComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ParticipantType.values().length];
            try {
                iArr[ParticipantType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ParticipantType.CHATBOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ParticipantType.AGENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ParticipantType.SYSTEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActionMessageStyle.values().length];
            try {
                iArr2[ActionMessageStyle.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ActionMessageStyle.CARD_MULTI_SELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ActionMessageStyle.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ActionCtaStyle.values().length];
            try {
                iArr3[ActionCtaStyle.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ActionCtaStyle.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Action$lambda$24(UUID uuid, UiChatMessage.Regular.Action action, Function1 function1, int i, Composer composer, int i2) {
        Action(uuid, action, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionCardMultiSelect$lambda$26(UUID uuid, UiChatMessage.Regular.Action action, Function1 function1, int i, Composer composer, int i2) {
        ActionCardMultiSelect(uuid, action, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionRegular$lambda$25(UUID uuid, UiChatMessage.Regular.Action action, Function1 function1, int i, Composer composer, int i2) {
        ActionRegular(uuid, action, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentMessage$lambda$15(UUID uuid, UiChatMessage.Regular regular, boolean z, Function1 function1, Function1 function12, Modifier modifier, Function1 function13, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        AgentMessage(uuid, regular, z, function1, function12, modifier, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Bubble$lambda$20(UUID uuid, UiChatMessage.Regular regular, BorderStroke borderStroke, RoundedCornerShape roundedCornerShape, Function1 function1, Function1 function12, Modifier modifier, Function1 function13, int i, int i2, Composer composer, int i3) {
        Bubble(uuid, regular, borderStroke, roundedCornerShape, function1, function12, modifier, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatMessageComposable$lambda$0(UUID uuid, UiChatMessage uiChatMessage, ParticipantType participantType, Function1 function1, Function1 function12, Modifier modifier, Function1 function13, int i, int i2, Composer composer, int i3) {
        ChatMessageComposable(uuid, uiChatMessage, participantType, function1, function12, modifier, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatbotThinkingIndicator$lambda$40(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChatbotThinkingIndicator(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Link$lambda$29(UiChatMessage.Regular.Link link, int i, Composer composer, int i2) {
        Link(link, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Markdown$lambda$23(UiChatMessage.Regular.Markdown markdown, int i, Composer composer, int i2) {
        Markdown(markdown, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MetadataText$lambda$41(UiChatMessage2 uiChatMessage2, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        MetadataText(uiChatMessage2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuggestedResponseText$lambda$22(UiChatMessage.Regular.SuggestedResponseText suggestedResponseText, int i, Composer composer, int i2) {
        SuggestedResponseText(suggestedResponseText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SystemDisclaimer$lambda$19(UiChatMessage.Metadata.Disclaimer disclaimer, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SystemDisclaimer(disclaimer, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SystemMessage$lambda$16(UiChatMessage.Metadata metadata, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SystemMessage(metadata, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SystemPlain$lambda$17(UiChatMessage.Metadata metadata, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SystemPlain(metadata, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SystemPlain$lambda$18(UiChatMessage.Metadata metadata, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SystemPlain(metadata, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Text$lambda$21(UiChatMessage.Regular.Text text, int i, Composer composer, int i2) {
        Text(text, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TypingIndicator$lambda$34(int i, Composer composer, int i2) {
        TypingIndicator(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserMessage$lambda$5(UUID uuid, UiChatMessage.Regular regular, Function1 function1, Function1 function12, Modifier modifier, Function1 function13, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        UserMessage(uuid, regular, function1, function12, modifier, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBentoButtonStyle$annotations(ActionCtaStyle actionCtaStyle) {
    }

    public static /* synthetic */ void getEventType$annotations(ParticipantType participantType) {
    }

    private static final LottieComposition ChatbotThinkingIndicator$lambda$35(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChatbotThinkingIndicator$lambda$36(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition TypingIndicator$lambda$30(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float TypingIndicator$lambda$31(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* compiled from: ChatMessageComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$ActionCardMultiSelect$1 */
    static final class C400481 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ UiChatMessage.Regular.Action $message;
        final /* synthetic */ Function1<UiChatAction, Unit> $onClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        C400481(UiChatMessage.Regular.Action action, UUID uuid, Function1<? super UiChatAction, Unit> function1) {
            this.$message = action;
            this.$inquiryId = uuid;
            this.$onClickAction = function1;
        }

        public final void invoke(Composer composer, int i) {
            AnnotatedString annotatedString;
            int i2;
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo;
            Composer composer2 = composer;
            int i3 = 2;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(253557083, i, -1, "com.robinhood.shared.support.supportchat.ui.ActionCardMultiSelect.<anonymous> (ChatMessageComposable.kt:703)");
            }
            boolean z = false;
            float f = 12;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(f)), "MessageAction");
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
            UiChatMessage.Regular.Action action = this.$message;
            UUID uuid = this.$inquiryId;
            final Function1<UiChatAction, Unit> function1 = this.$onClickAction;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-638249557);
            Iterator<T> it = action.getActions().iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final UiChatAction uiChatAction = (UiChatAction) next;
                Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, ChatMessageComposable7.MessageActionButton.indexedTestTag(i4));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag2, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 0.0f, i3, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), SupportChatActions.toEventDescriptor(uiChatAction, uuid, action.getSid())), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                boolean z2 = (!uiChatAction.isEnabled() || uiChatAction.isLoading()) ? z : true;
                int i7 = i4;
                boolean zIsLoading = uiChatAction.isLoading();
                AnnotatedString annotatedString2 = new AnnotatedString(uiChatAction.getText(), null, i3, null);
                RichText subtext = uiChatAction.getSubtext();
                composer2.startReplaceGroup(-638213736);
                if (subtext == null) {
                    i2 = i6;
                    annotatedString = annotatedString2;
                    annotatedStringM15956toAnnotatedStringiJQMabo = null;
                } else {
                    annotatedString = annotatedString2;
                    i2 = i6;
                    annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(subtext, 0L, composer2, 0, 1);
                }
                composer2.endReplaceGroup();
                ServerToBentoAssetMapper2 icon = uiChatAction.getIcon();
                BentoBaseRowState.Start.Icon icon2 = icon != null ? new BentoBaseRowState.Start.Icon(icon, null, null, 6, null) : null;
                BentoBaseRowState.Meta.Icon icon3 = (!uiChatAction.getIsSelected() || uiChatAction.isLoading()) ? null : new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.CHECKMARK_24, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(function1) | composer2.changed(uiChatAction);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$ActionCardMultiSelect$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatMessageComposable.C400481.invoke$lambda$5$lambda$3$lambda$2$lambda$1(function1, uiChatAction);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Function1<UiChatAction, Unit> function12 = function1;
                int i8 = i3;
                boolean z3 = z;
                UiChatMessage.Regular.Action action2 = action;
                UUID uuid2 = uuid;
                Composer composer3 = composer2;
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierFillMaxWidth$default, icon2, annotatedString, annotatedStringM15956toAnnotatedStringiJQMabo, null, icon3, null, false, true, true, z2, zIsLoading, 0L, (Function0) objRememberedValue, composer3, (BentoBaseRowState.Start.Icon.$stable << 3) | 918552576 | (BentoBaseRowState.Meta.Icon.$stable << 15), 0, 4176);
                composer2 = composer3;
                composer2.startReplaceGroup(-638185436);
                if (i7 != action2.getActions().size() - 1) {
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 5);
                    composer2 = composer;
                }
                composer2.endReplaceGroup();
                i4 = i5;
                i3 = i8;
                z = z3;
                action = action2;
                uuid = uuid2;
                function1 = function12;
            }
            composer2.endReplaceGroup();
            RichText footer = action.getFooter();
            composer2.startReplaceGroup(-638177448);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo2 = footer != null ? RichTexts2.m15956toAnnotatedStringiJQMabo(footer, 0L, composer2, 0, 1) : null;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-638175956);
            if (annotatedStringM15956toAnnotatedStringiJQMabo2 != null) {
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo2, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i9).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, bentoTheme2.getTypography(composer2, i9).getTextS(), composer, 0, 0, 8122);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$3$lambda$2$lambda$1(Function1 function1, UiChatAction uiChatAction) {
            function1.invoke(uiChatAction);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatMessageComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$ActionRegular$1 */
    static final class C400491 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ UiChatMessage.Regular.Action $message;
        final /* synthetic */ Function1<UiChatAction, Unit> $onClickAction;

        /* JADX WARN: Multi-variable type inference failed */
        C400491(UiChatMessage.Regular.Action action, UUID uuid, Function1<? super UiChatAction, Unit> function1) {
            this.$message = action;
            this.$inquiryId = uuid;
            this.$onClickAction = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v32, types: [com.robinhood.compose.bento.theme.BentoTheme] */
        /* JADX WARN: Type inference failed for: r4v13, types: [com.robinhood.compose.bento.component.BentoButtons$Icon$Size16] */
        /* JADX WARN: Type inference failed for: r9v17, types: [com.robinhood.compose.bento.component.BentoButtons$Icon$Size16] */
        public final void invoke(Composer composer, int i) {
            UiChatMessage.Regular.Action action;
            int i2;
            UUID uuid;
            Composer composer2;
            char c;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1989421572, i, -1, "com.robinhood.shared.support.supportchat.ui.ActionRegular.<anonymous> (ChatMessageComposable.kt:614)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            float f = 12;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(f)), "MessageAction");
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f));
            UiChatMessage.Regular.Action action2 = this.$message;
            UUID uuid2 = this.$inquiryId;
            Function1<UiChatAction, Unit> function1 = this.$onClickAction;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 2.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            Function1<UiChatAction, Unit> function12 = function1;
            BentoMarkdownText2.BentoMarkdownText(action2.getBody(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, 0, 30);
            composer.endNode();
            ThemedUrl imgUrl = action2.getImgUrl();
            composer.startReplaceGroup(-1531818584);
            if (imgUrl == null) {
                i2 = 0;
                action = action2;
                uuid = uuid2;
                composer2 = composer;
            } else {
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                action = action2;
                i2 = 0;
                uuid = uuid2;
                composer2 = composer;
                SingletonAsyncImage.m9119AsyncImagegl8XCv8(bentoTheme.getColors(composer, i3).getIsDay() ? imgUrl.getLight() : imgUrl.getDark(), null, Row5.weight$default(row6, TestTag3.testTag(companion, "MessageActionImage"), 1.0f, false, 2, null), null, null, companion2.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, composer2, 1769520, 0, 3992);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.startReplaceGroup(77407470);
            Iterator it = action.getActions().iterator();
            int i4 = i2;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final UiChatAction uiChatAction = (UiChatAction) next;
                BentoButtons.Type bentoButtonStyle = ChatMessageComposable.getBentoButtonStyle(uiChatAction.getButtonStyle());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(TestTag3.testTag(Modifier.INSTANCE, ChatMessageComposable7.MessageActionButton.indexedTestTag(i4)), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), SupportChatActions.toEventDescriptor(uiChatAction, uuid, action.getSid())), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                boolean zIsLoading = uiChatAction.isLoading();
                boolean zIsEnabled = uiChatAction.isEnabled();
                String text = uiChatAction.getText();
                ServerToBentoAssetMapper2 icon = uiChatAction.getIcon();
                if (icon != null) {
                    c = 2;
                    size16 = new BentoButtons.Icon.Size16(icon, null, 2, null);
                } else {
                    c = 2;
                }
                composer2.startReplaceGroup(-1633490746);
                final Function1<UiChatAction, Unit> function13 = function12;
                boolean zChanged = composer2.changed(function13) | composer2.changed(uiChatAction);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$ActionRegular$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatMessageComposable.C400491.invoke$lambda$8$lambda$6$lambda$5$lambda$4(function13, uiChatAction);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                function12 = function13;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierFillMaxWidth$default, size16, bentoButtonStyle, zIsEnabled, zIsLoading, null, null, null, null, false, null, composer, BentoButtons.Icon.Size16.$stable << 9, 0, 8064);
                composer2 = composer;
                i4 = i5;
            }
            composer2.endReplaceGroup();
            RichText footer = action.getFooter();
            composer2.startReplaceGroup(77445665);
            AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = footer != null ? RichTexts2.m15956toAnnotatedStringiJQMabo(footer, 0L, composer2, 0, 1) : null;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(77447157);
            if (annotatedStringM15956toAnnotatedStringiJQMabo != null) {
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                ?? r2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoText2.m20748BentoTextQnj7Zds(annotatedStringM15956toAnnotatedStringiJQMabo, null, Color.m6701boximpl(r2.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, r2.getTypography(composer2, i6).getTextS(), composer, 0, 0, 8122);
                Unit unit2 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$6$lambda$5$lambda$4(Function1 function1, UiChatAction uiChatAction) {
            function1.invoke(uiChatAction);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatMessageComposable(final UUID inquiryId, final UiChatMessage message, final ParticipantType senderType, final Function1<? super UiChatMessage.Regular, Unit> onClickMessageBubble, final Function1<? super UiChatAction, Unit> onClickAction, Modifier modifier, final Function1<? super SelectionMenuRowModel, Unit> onClickUserSelectionRow, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(senderType, "senderType");
        Intrinsics.checkNotNullParameter(onClickMessageBubble, "onClickMessageBubble");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        Intrinsics.checkNotNullParameter(onClickUserSelectionRow, "onClickUserSelectionRow");
        Composer composerStartRestartGroup = composer.startRestartGroup(406705079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(inquiryId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(message) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(senderType.ordinal()) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickMessageBubble) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickAction) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClickUserSelectionRow) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(406705079, i3, -1, "com.robinhood.shared.support.supportchat.ui.ChatMessageComposable (ChatMessageComposable.kt:102)");
                }
                if (!(message instanceof UiChatMessage.Regular)) {
                    composerStartRestartGroup.startReplaceGroup(48688695);
                    int i5 = WhenMappings.$EnumSwitchMapping$0[senderType.ordinal()];
                    if (i5 == 1) {
                        composer2 = composerStartRestartGroup;
                        Modifier modifier5 = modifier4;
                        composer2.startReplaceGroup(48733304);
                        int i6 = i3 >> 3;
                        UserMessage(inquiryId, (UiChatMessage.Regular) message, onClickMessageBubble, onClickAction, modifier5, onClickUserSelectionRow, composer2, (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752), 0);
                        modifier3 = modifier5;
                        composer2.endReplaceGroup();
                    } else if (i5 == 2 || i5 == 3) {
                        composerStartRestartGroup.startReplaceGroup(49172078);
                        modifier3 = modifier4;
                        AgentMessage(inquiryId, (UiChatMessage.Regular) message, senderType == ParticipantType.CHATBOT, onClickMessageBubble, onClickAction, modifier3, onClickUserSelectionRow, composerStartRestartGroup, i3 & 4193294, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        if (i5 != 4) {
                            composerStartRestartGroup.startReplaceGroup(1571027);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(49621082);
                        composerStartRestartGroup.endReplaceGroup();
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Received " + Reflection.getOrCreateKotlinClass(message.getClass()).getSimpleName() + " but the participant type was SYSTEM"), false, null, 6, null);
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier4;
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    if (message instanceof UiChatMessage.Metadata) {
                        composer2.startReplaceGroup(49949775);
                        SystemMessage((UiChatMessage.Metadata) message, modifier3, composer2, (i3 >> 12) & 112, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(message instanceof UiChatMessage.Unknown)) {
                            composer2.startReplaceGroup(1569169);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(50106697);
                        composer2.endReplaceGroup();
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier6 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatMessageComposable.ChatMessageComposable$lambda$0(inquiryId, message, senderType, onClickMessageBubble, onClickAction, modifier6, onClickUserSelectionRow, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((i2 & 64) == 0) {
        }
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(message instanceof UiChatMessage.Regular)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    static {
        float f = 20;
        float f2 = 0;
        UserMessageBubbleShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f));
        float f3 = 12;
        UserSelectionMessageBubbleShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f3));
        AgentMessageBubbleShape = RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f2));
        PrecedingMessageBubbleShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void UserMessage(final UUID uuid, final UiChatMessage.Regular regular, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, Modifier modifier, final Function1<? super SelectionMenuRowModel, Unit> function13, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        UUID uuid2;
        int i3;
        Function1<? super UiChatMessage.Regular, Unit> function14;
        Function1<? super UiChatAction, Unit> function15;
        Modifier modifier2;
        final String descriptionText;
        boolean z;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        Modifier modifier3;
        UiChatMessage2 uiChatMessage2;
        int i4;
        int i5;
        UiChatMessage2.SendStatus sendStatus;
        UiChatMessage2 uiChatMessage22;
        int i6;
        int i7;
        int i8;
        int i9;
        UiChatMessage2 uiChatMessage23;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-212546505);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            uuid2 = uuid;
        } else {
            uuid2 = uuid;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(regular) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function14) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function15 = function12;
        } else {
            function15 = function12;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function15) ? 2048 : 1024;
            }
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i2 & 32) != 0) {
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-212546505, i3, -1, "com.robinhood.shared.support.supportchat.ui.UserMessage (ChatMessageComposable.kt:156)");
                    }
                    UiChatMessage2 metadata = regular.getMetadata();
                    descriptionText = toDescriptionText(regular, composerStartRestartGroup, (i3 >> 3) & 14);
                    z = regular instanceof UiChatMessage.Regular.SelectionMessage;
                    RoundedCornerShape roundedCornerShape = !z ? UserSelectionMessageBubbleShape : UserMessageBubbleShape;
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(z ? 38 : 32);
                    Modifier modifierTestTag = TestTag3.testTag(modifier5, "MessageUser");
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(descriptionText);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChatMessageComposable.UserMessage$lambda$2$lambda$1(descriptionText, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue, 1, null), fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal end = companion.getEnd();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), end, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    int i11 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Arrangement.Horizontal end2 = arrangement.getEnd();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(end2, centerVertically, composerStartRestartGroup, 54);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    final Row6 row6 = Row6.INSTANCE;
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(1628871666);
                        int i12 = i11 << 6;
                        Bubble(uuid2, (UiChatMessage.Regular.SelectionMessage) regular, toBubbleBorder(regular, composerStartRestartGroup, 0), roundedCornerShape, function14, function15, row6.weight(companion3, 1.0f, false), function13, composerStartRestartGroup, (i11 & 14) | (57344 & i12) | (458752 & i12) | (i12 & 29360128), 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                        i5 = 0;
                        modifier3 = modifier5;
                        uiChatMessage2 = metadata;
                        i4 = 2;
                    } else {
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(1629375912);
                        modifier3 = modifier5;
                        final RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                        uiChatMessage2 = metadata;
                        i4 = 2;
                        i5 = 0;
                        MessageBubbleThemeOverlay.UserMessageBubbleThemeOverlay(ComposableLambda3.rememberComposableLambda(301221461, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$UserMessage$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i13) {
                                if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(301221461, i13, -1, "com.robinhood.shared.support.supportchat.ui.UserMessage.<anonymous>.<anonymous>.<anonymous> (ChatMessageComposable.kt:189)");
                                }
                                Modifier modifierWeight = row6.weight(Modifier.INSTANCE, 1.0f, false);
                                ChatMessageComposable.Bubble(uuid, regular, ChatMessageComposable.toBubbleBorder(regular, composer3, 0), roundedCornerShape2, function1, function12, modifierWeight, function13, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    sendStatus = !(uiChatMessage2 instanceof UiChatMessage2.SendStatus) ? (UiChatMessage2.SendStatus) uiChatMessage2 : null;
                    if (!(sendStatus instanceof UiChatMessage2.SendStatus.Failed)) {
                        composer2.startReplaceGroup(1630104970);
                        uiChatMessage22 = uiChatMessage2;
                        Composer composer3 = composer2;
                        i6 = i4;
                        i7 = i5;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ALERT_24), null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion3, "FailureIcon"), PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_fail_icon_start_spacing, composer2, i5), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                        composer2 = composer3;
                        composer2.endReplaceGroup();
                    } else {
                        uiChatMessage22 = uiChatMessage2;
                        i6 = i4;
                        i7 = i5;
                        if ((sendStatus instanceof UiChatMessage2.SendStatus.Sending) || (sendStatus instanceof UiChatMessage2.SendStatus.Resending)) {
                            composer2.startReplaceGroup(1630711051);
                            if (sendStatus.isProgressBarVisible()) {
                                i8 = i6;
                                uiChatMessage23 = uiChatMessage22;
                                i9 = i7;
                                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion3, "SendingProgressBar"), PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_resend_spinner_start_spacing, composer2, i7), 0.0f, 0.0f, 0.0f, 14, null), BentoProgressIndicator3.f5153XS, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU(), composer2, 48, 0);
                            } else {
                                i8 = i6;
                                i9 = i7;
                                uiChatMessage23 = uiChatMessage22;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            MetadataText(uiChatMessage23, null, composer2, i9, i8);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        } else {
                            composer2.startReplaceGroup(1631284675);
                            composer2.endReplaceGroup();
                        }
                    }
                    i8 = i6;
                    i9 = i7;
                    uiChatMessage23 = uiChatMessage22;
                    composer2.endNode();
                    MetadataText(uiChatMessage23, null, composer2, i9, i8);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatMessageComposable.UserMessage$lambda$5(uuid, regular, function1, function12, modifier4, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            if ((74899 & i3) == 74898) {
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                UiChatMessage2 metadata2 = regular.getMetadata();
                descriptionText = toDescriptionText(regular, composerStartRestartGroup, (i3 >> 3) & 14);
                z = regular instanceof UiChatMessage.Regular.SelectionMessage;
                if (!z) {
                }
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(z ? 38 : 32);
                Modifier modifierTestTag2 = TestTag3.testTag(modifier5, "MessageUser");
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(descriptionText);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChatMessageComposable.UserMessage$lambda$2$lambda$1(descriptionText, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue, 1, null), fM7995constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null);
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Horizontal end3 = companion4.getEnd();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), end3, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    int i112 = i3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                        Arrangement.Horizontal end22 = arrangement2.getEnd();
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(end22, centerVertically2, composerStartRestartGroup, 54);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            final Row5 row62 = Row6.INSTANCE;
                            if (!z) {
                            }
                            if (!(uiChatMessage2 instanceof UiChatMessage2.SendStatus)) {
                            }
                            if (!(sendStatus instanceof UiChatMessage2.SendStatus.Failed)) {
                            }
                            i8 = i6;
                            i9 = i7;
                            uiChatMessage23 = uiChatMessage22;
                            composer2.endNode();
                            MetadataText(uiChatMessage23, null, composer2, i9, i8);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserMessage$lambda$2$lambda$1(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AgentMessage(final UUID uuid, final UiChatMessage.Regular regular, final boolean z, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, Modifier modifier, final Function1<? super SelectionMenuRowModel, Unit> function13, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        final UUID uuid2;
        int i3;
        final Function1<? super UiChatMessage.Regular, Unit> function14;
        Modifier modifier2;
        Function1<? super SelectionMenuRowModel, Unit> function15;
        Modifier modifier3;
        int i4;
        final String descriptionText;
        final List<CustomAccessibilityAction> customA11yActions;
        boolean zChanged;
        RoundedCornerShape roundedCornerShape;
        Object objRememberedValue;
        Composer.Companion companion;
        final Measurer2 measurer2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        Object objRememberedValue4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        final int i5;
        boolean zChanged2;
        Object objRememberedValue6;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1852574129);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            uuid2 = uuid;
        } else {
            uuid2 = uuid;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(regular) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((i2 & 64) != 0) {
                if ((i & 1572864) == 0) {
                    function15 = function13;
                    i3 |= composerStartRestartGroup.changedInstance(function15) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                } else {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1852574129, i3, -1, "com.robinhood.shared.support.supportchat.ui.AgentMessage (ChatMessageComposable.kt:246)");
                    }
                    i4 = (i3 >> 3) & 14;
                    descriptionText = toDescriptionText(regular, composerStartRestartGroup, i4);
                    customA11yActions = toCustomA11yActions(regular, function12, composerStartRestartGroup, ((i3 >> 9) & 112) | i4);
                    final boolean z2 = regular instanceof UiChatMessage.Regular.SelectionMenu;
                    RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = !z2 ? RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12)) : AgentMessageBubbleShape;
                    int i7 = i3;
                    UiChatMessage.Regular.TypingIndicator typingIndicator = !(regular instanceof UiChatMessage.Regular.TypingIndicator) ? (UiChatMessage.Regular.TypingIndicator) regular : null;
                    String thinkingMessage = typingIndicator == null ? typingIndicator.getThinkingMessage() : null;
                    boolean z3 = thinkingMessage == null;
                    if (z || !z3) {
                        composerStartRestartGroup.startReplaceGroup(-292754545);
                        Modifier modifierTestTag = TestTag3.testTag(modifier3, "MessageAgent");
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChanged = composerStartRestartGroup.changed(descriptionText) | composerStartRestartGroup.changedInstance(customA11yActions);
                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue9, 1, null), 0.0f, 0.0f, getAgentMessageEndPadding(regular, composerStartRestartGroup, i4), 0.0f, 11, null), 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(-1003410150);
                            composerStartRestartGroup.startReplaceGroup(212064437);
                            composerStartRestartGroup.endReplaceGroup();
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new Measurer2(density);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            measurer2 = (Measurer2) objRememberedValue;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new ConstraintLayoutScope();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotState = (SnapshotState) objRememberedValue3;
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            snapshotState2 = (SnapshotState) objRememberedValue5;
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                            i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                            zChanged2 = zChangedInstance2 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$2
                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                    }

                                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                    /* renamed from: measure-3p2s80s */
                                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        snapshotState2.getValue();
                                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                        snapshotState.getValue();
                                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                        final Measurer2 measurer22 = measurer2;
                                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                measurer22.performLayout(placementScope, list, linkedHashMap);
                                            }
                                        }, 4, null);
                                    }
                                };
                                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                snapshotState3 = snapshotState;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            } else {
                                constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                                snapshotState3 = snapshotState;
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                        constraintSetForInlineDsl2.setKnownDirty(true);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            final Function0 function0 = (Function0) objRememberedValue7;
                            zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            final Function1<? super SelectionMenuRowModel, Unit> function16 = function15;
                            final RoundedCornerShape roundedCornerShape2 = roundedCornerShape;
                            composer2 = composerStartRestartGroup;
                            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer3, int i8) throws Resources.NotFoundException {
                                    Integer numValueOf;
                                    int i9;
                                    int i10;
                                    Composer composer4 = composer3;
                                    if ((i8 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState2.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                                        constraintLayoutScope.reset();
                                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                                        composer4.startReplaceGroup(-1051200517);
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        composer4.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component1);
                                        Object objRememberedValue10 = composer4.rememberedValue();
                                        if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue10 = new ChatMessageComposable2(constraintLayoutBaseScope4Component1);
                                            composer4.updateRememberedValue(objRememberedValue10);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                                        Alignment.Companion companion3 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        UiChatMessage.Regular regular2 = regular;
                                        UiChatMessage.Regular.Action action = regular2 instanceof UiChatMessage.Regular.Action ? (UiChatMessage.Regular.Action) regular2 : null;
                                        MessageBubbleThemeOverlay.AgentMessageBubbleThemeOverlay(action != null ? action.getStyle() : null, z2, ComposableLambda3.rememberComposableLambda(781888662, true, new ChatMessageComposable3(regular, uuid2, roundedCornerShape2, function14, function12, function16), composer4, 54), composer4, 384, 0);
                                        composer4.endNode();
                                        if (regular.getShowAvatar()) {
                                            int i11 = ChatMessageComposable.WhenMappings.$EnumSwitchMapping$0[regular.getSenderType().ordinal()];
                                            if (i11 == 1) {
                                                numValueOf = null;
                                            } else if (i11 == 2) {
                                                numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_robinhood);
                                            } else if (i11 != 3) {
                                                if (i11 != 4) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                numValueOf = null;
                                            } else {
                                                numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_agent);
                                            }
                                        }
                                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(32));
                                        composer4.startReplaceGroup(-1633490746);
                                        boolean zChanged4 = composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(numValueOf);
                                        Object objRememberedValue11 = composer4.rememberedValue();
                                        if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue11 = new ChatMessageComposable4(constraintLayoutBaseScope4Component2, numValueOf);
                                            composer4.updateRememberedValue(objRememberedValue11);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(constraintLayoutScope2.constrainAs(modifierM5169size3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11), 0.0f, 1, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default);
                                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                        composer4.startReplaceGroup(-606399651);
                                        if (numValueOf == null) {
                                            i9 = helpersHashCode;
                                            i10 = 5004770;
                                        } else {
                                            i9 = helpersHashCode;
                                            i10 = 5004770;
                                            BentoPogKt.m20684BentoPictogramPogRhg8lNc(numValueOf.intValue(), boxScopeInstance.align(TestTag3.testTag(companion2, "Avatar"), companion3.getCenter()), false, null, null, null, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                            composer4 = composer3;
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        composer4.startReplaceGroup(i10);
                                        boolean zChanged5 = composer4.changed(constraintLayoutBaseScope4Component2);
                                        Object objRememberedValue12 = composer4.rememberedValue();
                                        if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new ChatMessageComposable5(constraintLayoutBaseScope4Component2);
                                            composer4.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer4.endReplaceGroup();
                                        ChatMessageComposable.MetadataText(regular.getMetadata(), constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), composer4, 0, 0);
                                        composer4.endReplaceGroup();
                                        if (constraintLayoutScope.getHelpersHashCode() != i9) {
                                            EffectsKt.SideEffect(function0, composer4, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        } else {
                            roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                        }
                        objRememberedValue9 = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChatMessageComposable.AgentMessage$lambda$7$lambda$6(descriptionText, customA11yActions, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics$default(modifierTestTag, false, (Function1) objRememberedValue9, 1, null), 0.0f, 0.0f, getAgentMessageEndPadding(regular, composerStartRestartGroup, i4), 0.0f, 11, null), 0.0f, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        measurer2 = (Measurer2) objRememberedValue;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue2;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue5;
                        boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(measurer2);
                        i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged2 = zChangedInstance22 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState2.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState3 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue6;
                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                            }
                            final Function0 function02 = (Function0) objRememberedValue7;
                            zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                final Function1 function162 = function15;
                                final RoundedCornerShape roundedCornerShape22 = roundedCornerShape;
                                composer2 = composerStartRestartGroup;
                                LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$AgentMessage$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer3, int i8) throws Resources.NotFoundException {
                                        Integer numValueOf;
                                        int i9;
                                        int i10;
                                        Composer composer4 = composer3;
                                        if ((i8 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                            }
                                            snapshotState2.setValue(Unit.INSTANCE);
                                            int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                            constraintLayoutScope2.reset();
                                            ConstraintLayoutScope constraintLayoutScope22 = constraintLayoutScope2;
                                            composer4.startReplaceGroup(-1051200517);
                                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope22.createRefs();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            composer4.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component1);
                                            Object objRememberedValue10 = composer4.rememberedValue();
                                            if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue10 = new ChatMessageComposable2(constraintLayoutBaseScope4Component1);
                                                composer4.updateRememberedValue(objRememberedValue10);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs = constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                                            Alignment.Companion companion3 = Alignment.INSTANCE;
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierConstrainAs);
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            UiChatMessage.Regular regular2 = regular;
                                            UiChatMessage.Regular.Action action = regular2 instanceof UiChatMessage.Regular.Action ? (UiChatMessage.Regular.Action) regular2 : null;
                                            MessageBubbleThemeOverlay.AgentMessageBubbleThemeOverlay(action != null ? action.getStyle() : null, z2, ComposableLambda3.rememberComposableLambda(781888662, true, new ChatMessageComposable3(regular, uuid2, roundedCornerShape22, function14, function12, function162), composer4, 54), composer4, 384, 0);
                                            composer4.endNode();
                                            if (regular.getShowAvatar()) {
                                                int i11 = ChatMessageComposable.WhenMappings.$EnumSwitchMapping$0[regular.getSenderType().ordinal()];
                                                if (i11 == 1) {
                                                    numValueOf = null;
                                                } else if (i11 == 2) {
                                                    numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_robinhood);
                                                } else if (i11 != 3) {
                                                    if (i11 != 4) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = Integer.valueOf(C20690R.drawable.pict_mono_rds_agent);
                                                }
                                            }
                                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(32));
                                            composer4.startReplaceGroup(-1633490746);
                                            boolean zChanged4 = composer4.changed(constraintLayoutBaseScope4Component2) | composer4.changed(numValueOf);
                                            Object objRememberedValue11 = composer4.rememberedValue();
                                            if (zChanged4 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue11 = new ChatMessageComposable4(constraintLayoutBaseScope4Component2, numValueOf);
                                                composer4.updateRememberedValue(objRememberedValue11);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(constraintLayoutScope22.constrainAs(modifierM5169size3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11), 0.0f, 1, null);
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierFillMaxSize$default);
                                            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.createNode(constructor2);
                                            } else {
                                                composer4.useNode();
                                            }
                                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                            composer4.startReplaceGroup(-606399651);
                                            if (numValueOf == null) {
                                                i9 = helpersHashCode;
                                                i10 = 5004770;
                                            } else {
                                                i9 = helpersHashCode;
                                                i10 = 5004770;
                                                BentoPogKt.m20684BentoPictogramPogRhg8lNc(numValueOf.intValue(), boxScopeInstance.align(TestTag3.testTag(companion2, "Avatar"), companion3.getCenter()), false, null, null, null, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                                composer4 = composer3;
                                            }
                                            composer4.endReplaceGroup();
                                            composer4.endNode();
                                            composer4.startReplaceGroup(i10);
                                            boolean zChanged5 = composer4.changed(constraintLayoutBaseScope4Component2);
                                            Object objRememberedValue12 = composer4.rememberedValue();
                                            if (zChanged5 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue12 = new ChatMessageComposable5(constraintLayoutBaseScope4Component2);
                                                composer4.updateRememberedValue(objRememberedValue12);
                                            }
                                            composer4.endReplaceGroup();
                                            ChatMessageComposable.MetadataText(regular.getMetadata(), constraintLayoutScope22.constrainAs(companion2, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue12), composer4, 0, 0);
                                            composer4.endReplaceGroup();
                                            if (constraintLayoutScope2.getHelpersHashCode() != i9) {
                                                EffectsKt.SideEffect(function02, composer4, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), measurePolicy2, composer2, 48, 0);
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                            }
                        }
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-292982705);
                        ChatbotThinkingIndicator(thinkingMessage, modifier3, composerStartRestartGroup, (i7 >> 12) & 112, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatMessageComposable.AgentMessage$lambda$15(uuid, regular, z, function1, function12, modifier4, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function15 = function13;
            if ((599187 & i3) == 599186) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                i4 = (i3 >> 3) & 14;
                descriptionText = toDescriptionText(regular, composerStartRestartGroup, i4);
                customA11yActions = toCustomA11yActions(regular, function12, composerStartRestartGroup, ((i3 >> 9) & 112) | i4);
                final boolean z22 = regular instanceof UiChatMessage.Regular.SelectionMenu;
                if (!z22) {
                }
                int i72 = i3;
                if (!(regular instanceof UiChatMessage.Regular.TypingIndicator)) {
                }
                if (typingIndicator == null) {
                }
                if (thinkingMessage == null) {
                }
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-292754545);
                    Modifier modifierTestTag2 = TestTag3.testTag(modifier3, "MessageAgent");
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(descriptionText) | composerStartRestartGroup.changedInstance(customA11yActions);
                    Object objRememberedValue92 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                    objRememberedValue92 = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChatMessageComposable.AgentMessage$lambda$7$lambda$6(descriptionText, customA11yActions, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue92);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(SemanticsModifier6.semantics$default(modifierTestTag2, false, (Function1) objRememberedValue92, 1, null), 0.0f, 0.0f, getAgentMessageEndPadding(regular, composerStartRestartGroup, i4), 0.0f, 11, null), 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1003410150);
                    composerStartRestartGroup.startReplaceGroup(212064437);
                    composerStartRestartGroup.endReplaceGroup();
                    Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    measurer2 = (Measurer2) objRememberedValue;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final ConstraintLayoutScope constraintLayoutScope22 = (ConstraintLayoutScope) objRememberedValue2;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue3;
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue5;
                    boolean zChangedInstance222 = composerStartRestartGroup.changedInstance(measurer2);
                    i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    zChanged2 = zChangedInstance222 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        function15 = function13;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AgentMessage$lambda$7$lambda$6(String str, List list, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        SemanticsPropertiesKt.setCustomActions(semantics, list);
        return Unit.INSTANCE;
    }

    private static final void SystemMessage(final UiChatMessage.Metadata metadata, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(497507378);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(metadata) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(497507378, i3, -1, "com.robinhood.shared.support.supportchat.ui.SystemMessage (ChatMessageComposable.kt:345)");
            }
            if ((metadata instanceof UiChatMessage.Metadata.SystemInfo) || (metadata instanceof UiChatMessage.Metadata.SystemUploadReceipt) || (metadata instanceof UiChatMessage.Metadata.Timestamp)) {
                composerStartRestartGroup.startReplaceGroup(-689546058);
                SystemPlain(metadata, modifier, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(metadata instanceof UiChatMessage.Metadata.Disclaimer)) {
                    composerStartRestartGroup.startReplaceGroup(1363224689);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-689375279);
                SystemDisclaimer((UiChatMessage.Metadata.Disclaimer) metadata, modifier, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.SystemMessage$lambda$16(metadata, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SystemPlain(final UiChatMessage.Metadata metadata, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String displayText;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-389962865);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(metadata) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-389962865, i3, -1, "com.robinhood.shared.support.supportchat.ui.SystemPlain (ChatMessageComposable.kt:370)");
                }
                if (!(metadata instanceof UiChatMessage.Metadata.SystemInfo)) {
                    displayText = ((UiChatMessage.Metadata.SystemInfo) metadata).getBody();
                } else if (metadata instanceof UiChatMessage.Metadata.SystemUploadReceipt) {
                    displayText = ((UiChatMessage.Metadata.SystemUploadReceipt) metadata).getBody();
                } else if (metadata instanceof UiChatMessage.Metadata.Timestamp) {
                    displayText = ((UiChatMessage.Metadata.Timestamp) metadata).getDisplayText();
                } else {
                    if (!(metadata instanceof UiChatMessage.Metadata.Disclaimer)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    displayText = null;
                }
                if (displayText != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChatMessageComposable.SystemPlain$lambda$17(metadata, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier4, "MessageSystem"), 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                String str = displayText;
                modifier3 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str, modifierFillMaxWidth$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatMessageComposable.SystemPlain$lambda$18(metadata, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!(metadata instanceof UiChatMessage.Metadata.SystemInfo)) {
            }
            if (displayText != null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SystemDisclaimer(final UiChatMessage.Metadata.Disclaimer disclaimer, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1010633616);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(disclaimer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1010633616, i3, -1, "com.robinhood.shared.support.supportchat.ui.SystemDisclaimer (ChatMessageComposable.kt:393)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier4, "MessageDisclaimer"), 0.0f, 1, null);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                modifier3 = modifier4;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierFillMaxWidth$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(8697547, true, new C400521(disclaimer), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatMessageComposable.SystemDisclaimer$lambda$19(disclaimer, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(TestTag3.testTag(modifier4, "MessageDisclaimer"), 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12));
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            modifier3 = modifier4;
            SurfaceKt.m5967SurfaceT9BRK9s(modifierFillMaxWidth$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, 0.0f, 0.0f, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU()), ComposableLambda3.rememberComposableLambda(8697547, true, new C400521(disclaimer), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 56);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ChatMessageComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$SystemDisclaimer$1 */
    static final class C400521 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UiChatMessage.Metadata.Disclaimer $message;

        C400521(UiChatMessage.Metadata.Disclaimer disclaimer) {
            this.$message = disclaimer;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(8697547, i, -1, "com.robinhood.shared.support.supportchat.ui.SystemDisclaimer.<anonymous> (ChatMessageComposable.kt:405)");
            }
            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
            RichText body = this.$message.getBody();
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(uriHandler);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$SystemDisclaimer$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ChatMessageComposable.C400521.invoke$lambda$1$lambda$0(uriHandler, (Uri) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoRichText.m15948BentoRichText0sCZWFg(body, modifierFillMaxWidth$default, textStyleM7655copyp1EtxEg$default, jM21426getFg20d7_KjU, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composer, 0, 496);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UriHandler uriHandler, Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String string2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            uriHandler.openUri(string2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Bubble(final UUID uuid, final UiChatMessage.Regular regular, final BorderStroke borderStroke, final RoundedCornerShape roundedCornerShape, final Function1<? super UiChatMessage.Regular, Unit> function1, final Function1<? super UiChatAction, Unit> function12, Modifier modifier, final Function1<? super SelectionMenuRowModel, Unit> function13, Composer composer, final int i, final int i2) {
        UUID uuid2;
        int i3;
        UiChatMessage.Regular regular2;
        BorderStroke borderStroke2;
        RoundedCornerShape roundedCornerShape2;
        Function1<? super UiChatMessage.Regular, Unit> function14;
        Function1<? super UiChatAction, Unit> function15;
        int i4;
        final Modifier modifier2;
        Function1<? super SelectionMenuRowModel, Unit> function16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2086713702);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            uuid2 = uuid;
        } else {
            uuid2 = uuid;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(uuid2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            regular2 = regular;
        } else {
            regular2 = regular;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(regular2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                borderStroke2 = borderStroke;
                i3 |= composerStartRestartGroup.changed(borderStroke2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
                roundedCornerShape2 = roundedCornerShape;
            } else {
                roundedCornerShape2 = roundedCornerShape;
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(roundedCornerShape2) ? 2048 : 1024;
                }
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
                function14 = function1;
            } else {
                function14 = function1;
                if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                }
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
                function15 = function12;
            } else {
                function15 = function12;
                if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function15) ? 131072 : 65536;
                }
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((i2 & 128) == 0) {
                    if ((i & 12582912) == 0) {
                        function16 = function13;
                        i3 |= composerStartRestartGroup.changedInstance(function16) ? 8388608 : 4194304;
                    }
                    if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2086713702, i3, -1, "com.robinhood.shared.support.supportchat.ui.Bubble (ChatMessageComposable.kt:436)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, null, null, 6, null), null, 47, null), ComposableLambda3.rememberComposableLambda(-1673208047, true, new C400501(uuid2, regular2, roundedCornerShape2, modifier3, function14, borderStroke2, function15, function16), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChatMessageComposable.Bubble$lambda$20(uuid, regular, borderStroke, roundedCornerShape, function1, function12, modifier2, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                function16 = function13;
                if ((4793491 & i3) == 4793490) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, null, null, 6, null), null, 47, null), ComposableLambda3.rememberComposableLambda(-1673208047, true, new C400501(uuid2, regular2, roundedCornerShape2, modifier3, function14, borderStroke2, function15, function16), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 128) == 0) {
            }
            function16 = function13;
            if ((4793491 & i3) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        borderStroke2 = borderStroke;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 128) == 0) {
        }
        function16 = function13;
        if ((4793491 & i3) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ChatMessageComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$Bubble$1 */
    static final class C400501 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BorderStroke $bubbleBorder;
        final /* synthetic */ RoundedCornerShape $bubbleShape;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ UiChatMessage.Regular $message;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<UiChatAction, Unit> $onClickAction;
        final /* synthetic */ Function1<UiChatMessage.Regular, Unit> $onClickMessageBubble;
        final /* synthetic */ Function1<SelectionMenuRowModel, Unit> $onClickUserSelectionRow;

        /* JADX WARN: Multi-variable type inference failed */
        C400501(UUID uuid, UiChatMessage.Regular regular, RoundedCornerShape roundedCornerShape, Modifier modifier, Function1<? super UiChatMessage.Regular, Unit> function1, BorderStroke borderStroke, Function1<? super UiChatAction, Unit> function12, Function1<? super SelectionMenuRowModel, Unit> function13) {
            this.$inquiryId = uuid;
            this.$message = regular;
            this.$bubbleShape = roundedCornerShape;
            this.$modifier = modifier;
            this.$onClickMessageBubble = function1;
            this.$bubbleBorder = borderStroke;
            this.$onClickAction = function12;
            this.$onClickUserSelectionRow = function13;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673208047, i, -1, "com.robinhood.shared.support.supportchat.ui.Bubble.<anonymous> (ChatMessageComposable.kt:444)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptorGenerateMessageEventDescriptor = ChatMessageComposable.generateMessageEventDescriptor((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), this.$inquiryId, this.$message);
            UiChatMessage.Regular regular = this.$message;
            RoundedCornerShape roundedCornerShapeTransform = ((regular instanceof UiChatMessage.Regular.SelectionMenu) || (regular instanceof UiChatMessage.Regular.SelectionMessage)) ? this.$bubbleShape : ChatMessageComposable.transform(this.$bubbleShape, regular.isEndOfMessageBlock());
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(this.$modifier, "Bubble"), userInteractionEventDescriptorGenerateMessageEventDescriptor, userInteractionEventDescriptorGenerateMessageEventDescriptor != null, false, false, userInteractionEventDescriptorGenerateMessageEventDescriptor != null, false, null, 108, null);
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onClickMessageBubble) | composer.changed(this.$message);
            final Function1<UiChatMessage.Regular, Unit> function1 = this.$onClickMessageBubble;
            final UiChatMessage.Regular regular2 = this.$message;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$Bubble$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatMessageComposable.C400501.invoke$lambda$1$lambda$0(function1, regular2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BorderStroke borderStroke = this.$bubbleBorder;
            final UiChatMessage.Regular regular3 = this.$message;
            final UUID uuid = this.$inquiryId;
            final Function1<UiChatAction, Unit> function12 = this.$onClickAction;
            final Function1<SelectionMenuRowModel, Unit> function13 = this.$onClickUserSelectionRow;
            SurfaceKt.m5969Surfaceo_FOJdg((Function0) objRememberedValue, modifierAutoLogEvents$default, true, roundedCornerShapeTransform, jM21371getBg0d7_KjU, 0L, 0.0f, 0.0f, borderStroke, null, ComposableLambda3.rememberComposableLambda(412145126, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt.Bubble.1.2
                public final void invoke(Composer composer2, int i2) throws Resources.NotFoundException {
                    Composer composer3;
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(412145126, i2, -1, "com.robinhood.shared.support.supportchat.ui.Bubble.<anonymous>.<anonymous> (ChatMessageComposable.kt:473)");
                    }
                    Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
                    UiChatMessage.Regular regular4 = regular3;
                    UUID uuid2 = uuid;
                    Function1<UiChatAction, Unit> function14 = function12;
                    Function1<SelectionMenuRowModel, Unit> function15 = function13;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierWrapContentSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (regular4 instanceof UiChatMessage.Regular.MediaYouTube) {
                        composer2.startReplaceGroup(-1556389341);
                        composer3 = composer2;
                        YoutubeMessageBubble.YouTubeMessageBubble((UiChatMessage.Regular.MediaYouTube) regular4, uuid2, null, composer3, 0, 4);
                        composer3.endReplaceGroup();
                    } else {
                        composer3 = composer2;
                        if (regular4 instanceof UiChatMessage.Regular.Text) {
                            composer3.startReplaceGroup(-1556383482);
                            ChatMessageComposable.Text((UiChatMessage.Regular.Text) regular4, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.SuggestedResponseText) {
                            composer3.startReplaceGroup(-1556378921);
                            ChatMessageComposable.SuggestedResponseText((UiChatMessage.Regular.SuggestedResponseText) regular4, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.Action) {
                            composer3.startReplaceGroup(-1556374226);
                            ChatMessageComposable.Action(uuid2, (UiChatMessage.Regular.Action) regular4, function14, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.Link) {
                            composer3.startReplaceGroup(-1556367002);
                            ChatMessageComposable.Link((UiChatMessage.Regular.Link) regular4, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.Markdown) {
                            composer3.startReplaceGroup(-1556362870);
                            ChatMessageComposable.Markdown((UiChatMessage.Regular.Markdown) regular4, composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.TypingIndicator) {
                            composer3.startReplaceGroup(-1556358447);
                            ChatMessageComposable.TypingIndicator(composer3, 0);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.Image) {
                            composer3.startReplaceGroup(-1556355410);
                            ImageContent5.ImageContent((UiChatMessage.Regular.Image) regular4, null, composer3, 0, 2);
                            composer3.endReplaceGroup();
                        } else if (regular4 instanceof UiChatMessage.Regular.SelectionMenu) {
                            composer3.startReplaceGroup(-1556350829);
                            SelectionMenuView6.SelectionMenuView((UiChatMessage.Regular.SelectionMenu) regular4, null, function15, composer3, 0, 2);
                            composer3 = composer3;
                            composer3.endReplaceGroup();
                        } else {
                            if (!(regular4 instanceof UiChatMessage.Regular.SelectionMessage)) {
                                composer3.startReplaceGroup(-1556390370);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-1556344074);
                            SelectionMessageView4.SelectionMessageView((UiChatMessage.Regular.SelectionMessage) regular4, null, composer3, 0, 2);
                            composer3.endReplaceGroup();
                        }
                    }
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54), composer, 384, 6, 736);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, UiChatMessage.Regular regular) {
            function1.invoke(regular);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Text(final UiChatMessage.Regular.Text text, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1007627822);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1007627822, i2, -1, "com.robinhood.shared.support.supportchat.ui.Text (ChatMessageComposable.kt:525)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(text.getBody(), TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12)), "MessageText"), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.Text$lambda$21(text, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SuggestedResponseText(final UiChatMessage.Regular.SuggestedResponseText suggestedResponseText, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-444350404);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(suggestedResponseText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-444350404, i2, -1, "com.robinhood.shared.support.supportchat.ui.SuggestedResponseText (ChatMessageComposable.kt:540)");
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(suggestedResponseText.getSuggestedResponse().getText(), TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12)), "MessageSuggestedResponseText"), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.SuggestedResponseText$lambda$22(suggestedResponseText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Markdown(final UiChatMessage.Regular.Markdown markdown, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1358404754);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(markdown) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1358404754, i2, -1, "com.robinhood.shared.support.supportchat.ui.Markdown (ChatMessageComposable.kt:555)");
            }
            CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides(buildUrlLoggerForMessage(markdown, (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler()))), ComposableLambda3.rememberComposableLambda(1867798190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt.Markdown.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1867798190, i3, -1, "com.robinhood.shared.support.supportchat.ui.Markdown.<anonymous> (ChatMessageComposable.kt:564)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12)), "MessageMarkdown");
                    UiChatMessage.Regular.Markdown markdown2 = markdown;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoMarkdownText2.BentoMarkdownText(markdown2.getBody(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.Markdown$lambda$23(markdown, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Action(final UUID uuid, final UiChatMessage.Regular.Action action, final Function1<? super UiChatAction, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-783415688);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783415688, i2, -1, "com.robinhood.shared.support.supportchat.ui.Action (ChatMessageComposable.kt:584)");
            }
            if (action.getStyle() == ActionMessageStyle.CARD_MULTI_SELECT) {
                composerStartRestartGroup.startReplaceGroup(115734477);
                ActionCardMultiSelect(uuid, action, function1, composerStartRestartGroup, i2 & 1022);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(115895925);
                ActionRegular(uuid, action, function1, composerStartRestartGroup, i2 & 1022);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.Action$lambda$24(uuid, action, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ActionRegular(final UUID uuid, final UiChatMessage.Regular.Action action, final Function1<? super UiChatAction, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-307853628);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307853628, i2, -1, "com.robinhood.shared.support.supportchat.ui.ActionRegular (ChatMessageComposable.kt:605)");
            }
            CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides(buildUrlLoggerForMessage(action, (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler()))), ComposableLambda3.rememberComposableLambda(1989421572, true, new C400491(action, uuid, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.ActionRegular$lambda$25(uuid, action, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ActionCardMultiSelect(final UUID uuid, final UiChatMessage.Regular.Action action, final Function1<? super UiChatAction, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(526816795);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uuid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(action) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(526816795, i2, -1, "com.robinhood.shared.support.supportchat.ui.ActionCardMultiSelect (ChatMessageComposable.kt:694)");
            }
            CompositionLocal3.CompositionLocalProvider(CompositionLocalsKt.getLocalUriHandler().provides(buildUrlLoggerForMessage(action, (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler()))), ComposableLambda3.rememberComposableLambda(253557083, true, new C400481(action, uuid, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.ActionCardMultiSelect$lambda$26(uuid, action, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Link(final UiChatMessage.Regular.Link link, Composer composer, final int i) {
        int i2;
        Tuples2 tuples2M3642to;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-437501426);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(link) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-437501426, i2, -1, "com.robinhood.shared.support.supportchat.ui.Link (ChatMessageComposable.kt:778)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12)), "MessageLink");
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = Row5.weight$default(Row6.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(link.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 24576, 0, 16366);
            String description = link.getDescription();
            String urlText = link.getUrlText();
            if (description == null) {
                tuples2M3642to = Tuples4.m3642to(urlText, 1);
            } else {
                tuples2M3642to = Tuples4.m3642to(description, 4);
            }
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw((String) tuples2M3642to.component1(), TestTag3.testTag(companion, "MessageLinkSubtitle"), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, ((Number) tuples2M3642to.component2()).intValue(), 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composer2, 12582912, 0, 7548);
            composer2.endNode();
            ImageKt.Image(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_caret_right_16dp, composer2, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composer2, i3).m21427getFg30d7_KjU(), 0, 2, null), composer2, 48, 60);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.Link$lambda$29(link, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TypingIndicator(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1821625942);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821625942, i, -1, "com.robinhood.shared.support.supportchat.ui.TypingIndicator (ChatMessageComposable.kt:819)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C40042R.raw.lottie_chat_typing_indicator_day)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(TypingIndicator$lambda$30(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(TestTag3.testTag(Modifier.INSTANCE, "MessageTypingIndicator"), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), C2002Dp.m7995constructorimpl(12));
            LottieComposition lottieCompositionTypingIndicator$lambda$30 = TypingIndicator$lambda$30(lottieCompositionResultRememberLottieComposition);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(ChatMessageComposable.TypingIndicator$lambda$31(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            LottieAnimation2.LottieAnimation(lottieCompositionTypingIndicator$lambda$30, (Function0) objRememberedValue, modifierM5143paddingVpY3zN4, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 0, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatMessageComposable.TypingIndicator$lambda$34(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ChatbotThinkingIndicator(String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1209477952);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1209477952, i4, -1, "com.robinhood.shared.support.supportchat.ui.ChatbotThinkingIndicator (ChatMessageComposable.kt:845)");
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C40042R.raw.lottie_chat_typing_indicator_day)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                Modifier modifier4 = modifier3;
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(ChatbotThinkingIndicator$lambda$35(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(TestTag3.testTag(companion3, "MessageTypingIndicator"), C2002Dp.m7995constructorimpl(32));
                LottieComposition lottieCompositionChatbotThinkingIndicator$lambda$35 = ChatbotThinkingIndicator$lambda$35(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ChatMessageComposable.ChatbotThinkingIndicator$lambda$36(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionChatbotThinkingIndicator$lambda$35, (Function0) objRememberedValue, modifierM5169size3ABfNKs, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 0, 0, 65528);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                str2 = str;
                BentoText2.m20747BentoText38GnDrw(str2, row6.align(companion3, companion.getCenterVertically()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16376);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatMessageComposable.ChatbotThinkingIndicator$lambda$40(str2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C40042R.raw.lottie_chat_typing_indicator_day)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifier42 = modifier3;
            lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(ChatbotThinkingIndicator$lambda$35(lottieCompositionResultRememberLottieComposition2), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion4.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier42);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(TestTag3.testTag(companion32, "MessageTypingIndicator"), C2002Dp.m7995constructorimpl(32));
                LottieComposition lottieCompositionChatbotThinkingIndicator$lambda$352 = ChatbotThinkingIndicator$lambda$35(lottieCompositionResultRememberLottieComposition2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(ChatMessageComposable.ChatbotThinkingIndicator$lambda$36(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LottieAnimation2.LottieAnimation(lottieCompositionChatbotThinkingIndicator$lambda$352, (Function0) objRememberedValue, modifierM5169size3ABfNKs2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 0, 0, 65528);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    str2 = str;
                    BentoText2.m20747BentoText38GnDrw(str2, row62.align(companion32, companion4.getCenterVertically()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i4 & 14, 0, 16376);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MetadataText(final UiChatMessage2 uiChatMessage2, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        StringResource displayText;
        CharSequence text;
        String string2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1313506403);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(uiChatMessage2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1313506403, i3, -1, "com.robinhood.shared.support.supportchat.ui.MetadataText (ChatMessageComposable.kt:879)");
                }
                displayText = uiChatMessage2 == null ? uiChatMessage2.getDisplayText() : null;
                composerStartRestartGroup.startReplaceGroup(440736772);
                if (displayText != null) {
                    text = null;
                } else {
                    Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    text = displayText.getText(resources);
                }
                composerStartRestartGroup.endReplaceGroup();
                string2 = text != null ? text.toString() : null;
                if (string2 == null) {
                    Modifier modifierTestTag = TestTag3.testTag(modifier4, "Metadata");
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.RETRY, null, null, null, 59, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    String str = string2;
                    modifier3 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str, modifierAutoLogEvents$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8184);
                } else {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatMessageComposable.MetadataText$lambda$41(uiChatMessage2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (uiChatMessage2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(440736772);
            if (displayText != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (text != null) {
            }
            if (string2 == null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final UriHandler buildUrlLoggerForMessage(final UiChatMessage.Regular regular, final UserInteractionEventDescriptor userInteractionEventDescriptor, final EventLogger eventLogger, final UriHandler uriHandler) {
        return new UriHandler() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt.buildUrlLoggerForMessage.1
            @Override // androidx.compose.p011ui.platform.UriHandler
            public void openUri(String uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Screen screen = userInteractionEventDescriptor.getScreen();
                Component component = new Component(Component.ComponentType.ROW, "MARKDOWN_LINK", null, 4, null);
                UserInteractionEventData.Action action = UserInteractionEventData.Action.OPEN_URL;
                com.robinhood.rosetta.eventlogging.Context context = userInteractionEventDescriptor.getContext();
                if (context == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String sid = regular.getSid();
                if (sid == null) {
                    sid = "";
                }
                EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component, null, com.robinhood.rosetta.eventlogging.Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(null, null, null, null, null, null, null, null, uri, 0, null, null, null, null, ChatMessageComposable.getEventType(regular.getSenderType()), sid, "Exact text unavailable", 0, null, false, null, false, null, 8273663, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
                uriHandler.openUri(uri);
            }
        };
    }

    private static final float getAgentMessageEndPadding(UiChatMessage.Regular regular, Composer composer, int i) {
        float fM7995constructorimpl;
        composer.startReplaceGroup(1769356886);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1769356886, i, -1, "com.robinhood.shared.support.supportchat.ui.getAgentMessageEndPadding (ChatMessageComposable.kt:933)");
        }
        if (regular instanceof UiChatMessage.Regular.Action) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[((UiChatMessage.Regular.Action) regular).getStyle().ordinal()];
            if (i2 == 1 || i2 == 2) {
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(8);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fM7995constructorimpl = C2002Dp.m7995constructorimpl(32);
            }
        } else if ((regular instanceof UiChatMessage.Regular.SelectionMessage) || (regular instanceof UiChatMessage.Regular.SelectionMenu)) {
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
        } else {
            if (!(regular instanceof UiChatMessage.Regular.Image) && !(regular instanceof UiChatMessage.Regular.Link) && !(regular instanceof UiChatMessage.Regular.Text) && !(regular instanceof UiChatMessage.Regular.Markdown) && !(regular instanceof UiChatMessage.Regular.SuggestedResponseText) && !(regular instanceof UiChatMessage.Regular.TypingIndicator) && !(regular instanceof UiChatMessage.Regular.MediaYouTube)) {
                throw new NoWhenBranchMatchedException();
            }
            fM7995constructorimpl = C2002Dp.m7995constructorimpl(32);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return fM7995constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BorderStroke toBubbleBorder(UiChatMessage.Regular regular, Composer composer, int i) {
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U;
        composer.startReplaceGroup(836233203);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(836233203, i, -1, "com.robinhood.shared.support.supportchat.ui.toBubbleBorder (ChatMessageComposable.kt:967)");
        }
        if ((regular instanceof UiChatMessage.Regular.Image) || (regular instanceof UiChatMessage.Regular.MediaYouTube)) {
            composer.startReplaceGroup(1413240762);
            borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_image_border_size, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU());
            composer.endReplaceGroup();
        } else {
            borderStrokeM4886BorderStrokecXLIe8U = null;
            if (regular instanceof UiChatMessage.Regular.Action) {
                composer.startReplaceGroup(1413474533);
                ActionMessageStyle style = ((UiChatMessage.Regular.Action) regular).getStyle();
                if (style == ActionMessageStyle.CARD || style == ActionMessageStyle.CARD_MULTI_SELECT) {
                    borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(C40042R.dimen.chat_message_action_card_border_size, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU());
                } else if (style != ActionMessageStyle.DEFAULT) {
                    throw new NoWhenBranchMatchedException();
                }
                composer.endReplaceGroup();
            } else {
                if (!(regular instanceof UiChatMessage.Regular.Link) && !(regular instanceof UiChatMessage.Regular.Text) && !(regular instanceof UiChatMessage.Regular.Markdown) && !(regular instanceof UiChatMessage.Regular.SuggestedResponseText) && !(regular instanceof UiChatMessage.Regular.TypingIndicator) && !(regular instanceof UiChatMessage.Regular.SelectionMenu) && !(regular instanceof UiChatMessage.Regular.SelectionMessage)) {
                    composer.startReplaceGroup(461227820);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1414281834);
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return borderStrokeM4886BorderStrokecXLIe8U;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[PHI: r5
      0x0033: PHI (r5v53 java.lang.Object) = (r5v43 java.lang.Object), (r5v58 java.lang.Object) binds: [B:18:0x0050, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final String toDescriptionText(UiChatMessage.Regular regular, Composer composer, int i) throws Resources.NotFoundException {
        Object objStringResource;
        Object displayText;
        String strStringResource;
        composer.startReplaceGroup(638383195);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(638383195, i, -1, "com.robinhood.shared.support.supportchat.ui.toDescriptionText (ChatMessageComposable.kt:1007)");
        }
        Object objStringResource2 = "";
        if (regular instanceof UiChatMessage.Regular.MediaYouTube) {
            composer.startReplaceGroup(-41233884);
            composer.endReplaceGroup();
            UiChatMessage2 metadata = ((UiChatMessage.Regular.MediaYouTube) regular).getMetadata();
            if (metadata != null && (displayText = metadata.getDisplayText()) != null) {
                objStringResource2 = displayText;
            }
        } else if (regular instanceof UiChatMessage.Regular.SelectionMenu) {
            composer.startReplaceGroup(-41148572);
            composer.endReplaceGroup();
            UiChatMessage2 metadata2 = ((UiChatMessage.Regular.SelectionMenu) regular).getMetadata();
            if (metadata2 != null && (displayText = metadata2.getDisplayText()) != null) {
            }
        } else if (regular instanceof UiChatMessage.Regular.SelectionMessage) {
            composer.startReplaceGroup(-694060960);
            composer.endReplaceGroup();
            objStringResource2 = ((UiChatMessage.Regular.SelectionMessage) regular).getTitle();
        } else if (regular instanceof UiChatMessage.Regular.Text) {
            composer.startReplaceGroup(-694059201);
            composer.endReplaceGroup();
            objStringResource2 = ((UiChatMessage.Regular.Text) regular).getBody();
        } else if (regular instanceof UiChatMessage.Regular.Markdown) {
            composer.startReplaceGroup(-694057345);
            composer.endReplaceGroup();
            objStringResource2 = ((UiChatMessage.Regular.Markdown) regular).getBody();
        } else if (regular instanceof UiChatMessage.Regular.SuggestedResponseText) {
            composer.startReplaceGroup(-694054497);
            composer.endReplaceGroup();
            objStringResource2 = ((UiChatMessage.Regular.SuggestedResponseText) regular).getSuggestedResponse().getText();
        } else if (regular instanceof UiChatMessage.Regular.Action) {
            composer.startReplaceGroup(-694052705);
            composer.endReplaceGroup();
            objStringResource2 = ((UiChatMessage.Regular.Action) regular).getBody();
        } else if (regular instanceof UiChatMessage.Regular.Link) {
            composer.startReplaceGroup(-40743185);
            UiChatMessage.Regular.Link link = (UiChatMessage.Regular.Link) regular;
            if (link.getDescription() == null) {
                objStringResource = link.getTitle();
            } else {
                objStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_link_message_with_description_template, new Object[]{link.getTitle(), link.getDescription()}, composer, 0);
            }
            objStringResource2 = objStringResource;
            composer.endReplaceGroup();
        } else if (regular instanceof UiChatMessage.Regular.Image) {
            composer.startReplaceGroup(-694040840);
            objStringResource2 = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_message_send_image, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(regular instanceof UiChatMessage.Regular.TypingIndicator)) {
                composer.startReplaceGroup(-694067888);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-694037204);
            objStringResource2 = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_typing, composer, 0);
            composer.endReplaceGroup();
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[regular.getSenderType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-694032629);
            strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_user_message_template, new Object[]{objStringResource2}, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-694028914);
            strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_chatbot_message_template, new Object[]{objStringResource2}, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3 && i2 != 4) {
                composer.startReplaceGroup(-694034208);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-694023860);
            strStringResource = StringResources_androidKt.stringResource(C40042R.string.support_chat_a11y_agent_message_template, new Object[]{objStringResource2}, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    private static final List<CustomAccessibilityAction> toCustomA11yActions(UiChatMessage.Regular regular, final Function1<? super UiChatAction, Unit> function1, Composer composer, int i) {
        composer.startReplaceGroup(1958073624);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1958073624, i, -1, "com.robinhood.shared.support.supportchat.ui.toCustomA11yActions (ChatMessageComposable.kt:1044)");
        }
        if (regular instanceof UiChatMessage.Regular.Action) {
            List<UiChatAction> actions = ((UiChatMessage.Regular.Action) regular).getActions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(actions, 10));
            for (final UiChatAction uiChatAction : actions) {
                String text = uiChatAction.getText();
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32) | composer.changed(uiChatAction);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.support.supportchat.ui.ChatMessageComposableKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(ChatMessageComposable.toCustomA11yActions$lambda$44$lambda$43$lambda$42(function1, uiChatAction));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                arrayList.add(new CustomAccessibilityAction(text, (Function0) objRememberedValue));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return arrayList;
        }
        List<CustomAccessibilityAction> listEmptyList = CollectionsKt.emptyList();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listEmptyList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toCustomA11yActions$lambda$44$lambda$43$lambda$42(Function1 function1, UiChatAction uiChatAction) {
        function1.invoke(uiChatAction);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor generateMessageEventDescriptor(UserInteractionEventDescriptor userInteractionEventDescriptor, UUID uuid, UiChatMessage.Regular regular) {
        if ((regular instanceof UiChatMessage.Regular.SelectionMenu) || (regular instanceof UiChatMessage.Regular.SelectionMessage) || (regular instanceof UiChatMessage.Regular.Action) || (regular instanceof UiChatMessage.Regular.Image) || (regular instanceof UiChatMessage.Regular.Markdown) || (regular instanceof UiChatMessage.Regular.Text) || (regular instanceof UiChatMessage.Regular.SuggestedResponseText) || (regular instanceof UiChatMessage.Regular.TypingIndicator) || (regular instanceof UiChatMessage.Regular.MediaYouTube)) {
            return null;
        }
        if (!(regular instanceof UiChatMessage.Regular.Link)) {
            throw new NoWhenBranchMatchedException();
        }
        UserInteractionEventData.Action action = UserInteractionEventData.Action.OPEN_URL;
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        UiChatMessage.Regular.Link link = (UiChatMessage.Regular.Link) regular;
        return UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, null, null, null, link.getUrl().getUrl(), 0, null, null, null, null, getEventType(link.getSenderType()), link.getSid(), link.getTitle(), 0, null, false, null, false, null, 8273662, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), null, null, 51, null));
    }

    public static final CXIssue.ChatMessageSender getEventType(ParticipantType participantType) {
        Intrinsics.checkNotNullParameter(participantType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[participantType.ordinal()];
        if (i == 1) {
            return CXIssue.ChatMessageSender.USER;
        }
        if (i == 2) {
            return CXIssue.ChatMessageSender.CHATBOT;
        }
        if (i == 3) {
            return CXIssue.ChatMessageSender.AGENT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return CXIssue.ChatMessageSender.SYSTEM;
    }

    public static final BentoButtons.Type getBentoButtonStyle(ActionCtaStyle actionCtaStyle) {
        int i = actionCtaStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$2[actionCtaStyle.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return BentoButtons.Type.Primary;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return BentoButtons.Type.Secondary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundedCornerShape transform(RoundedCornerShape roundedCornerShape, boolean z) {
        return z ? roundedCornerShape : PrecedingMessageBubbleShape;
    }

    public static final RoundedCornerShape getUserMessageBubbleShape() {
        return UserMessageBubbleShape;
    }

    public static final RoundedCornerShape getUserSelectionMessageBubbleShape() {
        return UserSelectionMessageBubbleShape;
    }
}
