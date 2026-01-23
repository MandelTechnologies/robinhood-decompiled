package com.twilio.conversations.extensions;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.http.ContentEncoding;
import com.twilio.conversations.Attributes;
import com.twilio.conversations.CallbackListener;
import com.twilio.conversations.CancellationToken;
import com.twilio.conversations.Conversation;
import com.twilio.conversations.ConversationListener;
import com.twilio.conversations.ConversationsClient;
import com.twilio.conversations.ConversationsClientListener;
import com.twilio.conversations.DetailedDeliveryReceipt;
import com.twilio.conversations.Media;
import com.twilio.conversations.Message;
import com.twilio.conversations.Participant;
import com.twilio.conversations.StatusListener;
import com.twilio.conversations.User;
import com.twilio.conversations.content.ContentData;
import com.twilio.conversations.content.ContentTemplate;
import com.twilio.conversations.extensions.ChannelType;
import com.twilio.util.ErrorInfo;
import com.twilio.util.TwilioException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferred3;

/* compiled from: ConversationsExtensions.kt */
@Metadata(m3635d1 = {"\u0000¶\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b\u001a2\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0016\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018\u001a\u0012\u0010\u0019\u001a\u00020\u0014*\u00020\u001aH\u0086@¢\u0006\u0002\u0010\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0016\u001a,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0086@¢\u0006\u0002\u0010#\u001a,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u00020\u00012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0086@¢\u0006\u0002\u0010#\u001a\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0!*\u00020\u0001H\u0086@¢\u0006\u0002\u0010(\u001a\u0012\u0010)\u001a\u00020\u000e*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u0012\u0010+\u001a\u00020\u000e*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u001c\u0010,\u001a\u00020\u000e*\u00020\u00142\b\b\u0002\u0010\n\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018\u001a\u0012\u0010-\u001a\u00020\u000e*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u0014\u0010.\u001a\u0004\u0018\u00010/*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u001a\u00100\u001a\u00020\u000e*\u00020\u00142\u0006\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u00103\u001a\u001a\u00100\u001a\u00020\u000e*\u0002042\u0006\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u00105\u001a\u001a\u00100\u001a\u00020\u000e*\u0002062\u0006\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u00107\u001a\u0012\u00108\u001a\u000209*\u000206H\u0086@¢\u0006\u0002\u0010:\u001a\u0012\u0010;\u001a\u00020\u000e*\u000206H\u0086@¢\u0006\u0002\u0010:\u001a\u001a\u00100\u001a\u00020\u000e*\u0002092\u0006\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u0010A\u001a\u001c\u0010B\u001a\u00020\u000e*\u0002092\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0086@¢\u0006\u0002\u0010C\u001a \u0010D\u001a\b\u0012\u0004\u0012\u0002040E*\u00020\u00142\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010H\u001a(\u0010I\u001a\b\u0012\u0004\u0012\u0002040E*\u00020\u00142\u0006\u0010J\u001a\u00020/2\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010K\u001a(\u0010L\u001a\b\u0012\u0004\u0012\u0002040E*\u00020\u00142\u0006\u0010J\u001a\u00020/2\u0006\u0010F\u001a\u00020GH\u0086@¢\u0006\u0002\u0010K\u001a\u001a\u0010M\u001a\u000204*\u00020\u00142\u0006\u0010J\u001a\u00020/H\u0086@¢\u0006\u0002\u0010N\u001a)\u0010O\u001a\u00020P*\u00020\u00142\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000e0R¢\u0006\u0002\bTH\u0086\bø\u0001\u0000\u001a+\u0010U\u001a\u000204*\u00020\u00142\u0017\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000e0R¢\u0006\u0002\bTH\u0086H¢\u0006\u0002\u0010V\u001a\u001a\u0010W\u001a\u00020/*\u00020\u00142\u0006\u0010X\u001a\u00020/H\u0086@¢\u0006\u0002\u0010N\u001a\u001a\u0010Y\u001a\u00020/*\u00020\u00142\u0006\u0010X\u001a\u00020/H\u0086@¢\u0006\u0002\u0010N\u001a\u0012\u0010Z\u001a\u00020/*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u0014\u0010[\u001a\u0004\u0018\u00010/*\u00020\u0014H\u0086@¢\u0006\u0002\u0010*\u001a\u001a\u0010\\\u001a\u00020\u000e*\u0002042\u0006\u0010]\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010^\u001a\u0018\u0010_\u001a\b\u0012\u0004\u0012\u00020`0!*\u000204H\u0086@¢\u0006\u0002\u0010a\u001a,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u0002042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0086@¢\u0006\u0002\u0010b\u001a,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u0002042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050!H\u0086@¢\u0006\u0002\u0010b\u001a\u001e\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001f*\u000204H\u0086@¢\u0006\u0002\u0010a\u001a\u0012\u0010d\u001a\u00020e*\u000204H\u0086@¢\u0006\u0002\u0010a\u001a$\u0010f\u001a\u00020\u000e*\u00020\u00142\u0006\u0010g\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u0010h\u001a,\u0010i\u001a\u00020\u000e*\u00020\u00142\u0006\u0010j\u001a\u00020\u00052\u0006\u0010k\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u000202H\u0086@¢\u0006\u0002\u0010l\u001a\u001a\u0010m\u001a\u00020\u000e*\u00020\u00142\u0006\u0010g\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010n\u001a\u001a\u0010o\u001a\u00020\u000e*\u00020\u00142\u0006\u0010p\u001a\u000206H\u0086@¢\u0006\u0002\u0010q\u001a\u0012\u0010r\u001a\u000204*\u00020sH\u0086@¢\u0006\u0002\u0010t\u001a\u0012\u0010u\u001a\u000204*\u00020PH\u0086@¢\u0006\u0002\u0010v\u001a\u0012\u0010w\u001a\u00020\u0005*\u00020\"H\u0086@¢\u0006\u0002\u0010x\u001aÂ\u0005\u0010y\u001a\u00020z*\u00020\u00012#\b\u0006\u0010{\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2;\b\u0006\u0010\u007f\u001a5\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0015\u0012\u00130\u0081\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010\u0083\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2$\b\u0006\u0010\u0084\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2&\b\u0006\u0010\u0085\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0R2=\b\u0006\u0010\u0088\u0001\u001a6\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0015\u0012\u00130\u008a\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012%\b\u0006\u0010\u008b\u0001\u001a\u001e\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u008c\u0001\u001a\u001e\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u008d\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u000b¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u008e\u0001\u0012\u0004\u0012\u00020\u000e0R2R\b\u0006\u0010\u008f\u0001\u001aK\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0092\u0001\u0012\u0014\u0012\u00120/¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0093\u0001\u0012\u0004\u0012\u00020\u000e0\u0090\u00012%\b\u0006\u0010\u0094\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u0095\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u000e0R2\u0010\b\u0006\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u00012&\b\u0006\u0010\u0098\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0R2&\b\u0006\u0010\u0099\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u009a\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u009b\u0001\u0012\u0004\u0012\u00020\u000e0R2\u0010\b\u0006\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u00012\u0010\b\u0006\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u0001H\u0086\bø\u0001\u0000\u001a¿\u0005\u0010\u009e\u0001\u001a\u00020z2#\b\u0006\u0010{\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2;\b\u0006\u0010\u007f\u001a5\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0015\u0012\u00130\u0081\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010\u0083\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2$\b\u0006\u0010\u0084\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0R2&\b\u0006\u0010\u0085\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0R2=\b\u0006\u0010\u0088\u0001\u001a6\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0015\u0012\u00130\u008a\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012%\b\u0006\u0010\u008b\u0001\u001a\u001e\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u008c\u0001\u001a\u001e\u0012\u0014\u0012\u001209¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0089\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u008d\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u000b¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u008e\u0001\u0012\u0004\u0012\u00020\u000e0R2R\b\u0006\u0010\u008f\u0001\u001aK\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0092\u0001\u0012\u0014\u0012\u00120/¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0093\u0001\u0012\u0004\u0012\u00020\u000e0\u0090\u00012%\b\u0006\u0010\u0094\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u000e0R2%\b\u0006\u0010\u0095\u0001\u001a\u001e\u0012\u0014\u0012\u00120\u0005¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0091\u0001\u0012\u0004\u0012\u00020\u000e0R2\u0010\b\u0006\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u00012&\b\u0006\u0010\u0098\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0R2&\b\u0006\u0010\u0099\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u009a\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u009b\u0001\u0012\u0004\u0012\u00020\u000e0R2\u0010\b\u0006\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u00012\u0010\b\u0006\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u0001H\u0086\bø\u0001\u0000\u001aÆ\u0003\u0010y\u001a\u00030\u009f\u0001*\u00020\u00142%\b\u0006\u0010 \u0001\u001a\u001e\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\u000e0R2=\b\u0006\u0010¢\u0001\u001a6\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0015\u0012\u00130£\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012%\b\u0006\u0010¤\u0001\u001a\u001e\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\u000e0R2$\b\u0006\u0010¥\u0001\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0R2<\b\u0006\u0010¦\u0001\u001a5\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0015\u0012\u00130§\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010¨\u0001\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0R2:\b\u0006\u0010©\u0001\u001a3\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0\u0080\u00012:\b\u0006\u0010ª\u0001\u001a3\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010«\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0RH\u0086\bø\u0001\u0000\u001aÃ\u0003\u0010¬\u0001\u001a\u00030\u009f\u00012%\b\u0006\u0010 \u0001\u001a\u001e\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\u000e0R2=\b\u0006\u0010¢\u0001\u001a6\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0015\u0012\u00130£\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012%\b\u0006\u0010¤\u0001\u001a\u001e\u0012\u0014\u0012\u001204¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(¡\u0001\u0012\u0004\u0012\u00020\u000e0R2$\b\u0006\u0010¥\u0001\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0R2<\b\u0006\u0010¦\u0001\u001a5\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0015\u0012\u00130§\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0082\u0001\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010¨\u0001\u001a\u001d\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0R2:\b\u0006\u0010©\u0001\u001a3\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0\u0080\u00012:\b\u0006\u0010ª\u0001\u001a3\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0013\u0012\u001106¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(p\u0012\u0004\u0012\u00020\u000e0\u0080\u00012$\b\u0006\u0010«\u0001\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b|\u0012\b\b}\u0012\u0004\b\b(~\u0012\u0004\u0012\u00020\u000e0RH\u0086\bø\u0001\u0000\u001al\u0010\u00ad\u0001\u001a\n\u0012\u0005\u0012\u0003H¯\u00010®\u0001\"\u0005\b\u0000\u0010¯\u00012&\b\u0006\u0010°\u0001\u001a\u001f\u0012\u0015\u0012\u0013H¯\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(±\u0001\u0012\u0004\u0012\u00020\u000e0R2&\b\u0006\u0010\u0085\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0RH\u0086\bø\u0001\u0000\u001aH\u0010²\u0001\u001a\u00030³\u00012\u0010\b\u0006\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0097\u00012&\b\u0006\u0010\u0085\u0001\u001a\u001f\u0012\u0015\u0012\u00130\u0086\u0001¢\u0006\r\b|\u0012\t\b}\u0012\u0005\b\b(\u0087\u0001\u0012\u0004\u0012\u00020\u000e0RH\u0086\bø\u0001\u0000\"\u001c\u0010<\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020=0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0015\u0010>\u001a\u00020=*\u0002068F¢\u0006\u0006\u001a\u0004\b?\u0010@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006´\u0001"}, m3636d2 = {"createConversationsClient", "Lcom/twilio/conversations/ConversationsClient;", "context", "Landroid/content/Context;", "token", "", "properties", "Lcom/twilio/conversations/ConversationsClient$Properties;", "(Landroid/content/Context;Ljava/lang/String;Lcom/twilio/conversations/ConversationsClient$Properties;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAndSyncConversationsClient", "synchronizationStatus", "Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;", "(Landroid/content/Context;Ljava/lang/String;Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;Lcom/twilio/conversations/ConversationsClient$Properties;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForSynchronization", "", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerFCMToken", "Lcom/twilio/conversations/ConversationsClient$FCMToken;", "(Lcom/twilio/conversations/ConversationsClient;Lcom/twilio/conversations/ConversationsClient$FCMToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createConversation", "Lcom/twilio/conversations/Conversation;", "friendlyName", "(Lcom/twilio/conversations/ConversationsClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/twilio/conversations/Conversation$SynchronizationStatus;", "(Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Conversation$SynchronizationStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "build", "Lcom/twilio/conversations/ConversationsClient$ConversationBuilder;", "(Lcom/twilio/conversations/ConversationsClient$ConversationBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversation", "sidOrUniqueName", "getTemporaryContentUrlsForMedia", "", "media", "", "Lcom/twilio/conversations/Media;", "(Lcom/twilio/conversations/ConversationsClient;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrlsForMediaSids", "mediaSids", "getContentTemplates", "Lcom/twilio/conversations/content/ContentTemplate;", "(Lcom/twilio/conversations/ConversationsClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", "(Lcom/twilio/conversations/Conversation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "join", "joinAndSync", "leave", "getUnreadMessagesCount", "", "setAttributes", "attributes", "Lcom/twilio/conversations/Attributes;", "(Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/twilio/conversations/Message;", "(Lcom/twilio/conversations/Message;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/twilio/conversations/Participant;", "(Lcom/twilio/conversations/Participant;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAndSubscribeUser", "Lcom/twilio/conversations/User;", "(Lcom/twilio/conversations/Participant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remove", "channelTypes", "Lcom/twilio/conversations/extensions/ChannelType;", "channelType", "getChannelType", "(Lcom/twilio/conversations/Participant;)Lcom/twilio/conversations/extensions/ChannelType;", "(Lcom/twilio/conversations/User;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFriendlyName", "(Lcom/twilio/conversations/User;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMessages", "", "count", "", "(Lcom/twilio/conversations/Conversation;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesBefore", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Lcom/twilio/conversations/Conversation;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessagesAfter", "getMessageByIndex", "(Lcom/twilio/conversations/Conversation;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareMessage", "Lcom/twilio/conversations/Conversation$UnsentMessage;", "block", "Lkotlin/Function1;", "Lcom/twilio/conversations/extensions/MessageBuilder;", "Lkotlin/ExtensionFunctionType;", "sendMessage", "(Lcom/twilio/conversations/Conversation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLastReadMessageIndex", "lastReadMessageIndex", "advanceLastReadMessageIndex", "setAllMessagesRead", "setAllMessagesUnread", "updateMessageBody", CarResultComposable2.BODY, "(Lcom/twilio/conversations/Message;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDetailedDeliveryReceiptList", "Lcom/twilio/conversations/DetailedDeliveryReceipt;", "(Lcom/twilio/conversations/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/twilio/conversations/Message;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrlsForAttachedMedia", "getContentData", "Lcom/twilio/conversations/content/ContentData;", "addParticipantByIdentity", ContentEncoding.IDENTITY, "(Lcom/twilio/conversations/Conversation;Ljava/lang/String;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addParticipantByAddress", PlaceTypes.ADDRESS, "proxyAddress", "(Lcom/twilio/conversations/Conversation;Ljava/lang/String;Ljava/lang/String;Lcom/twilio/conversations/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeParticipantByIdentity", "(Lcom/twilio/conversations/Conversation;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeParticipant", "participant", "(Lcom/twilio/conversations/Conversation;Lcom/twilio/conversations/Participant;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildAndSend", "Lcom/twilio/conversations/Conversation$MessageBuilder;", "(Lcom/twilio/conversations/Conversation$MessageBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "(Lcom/twilio/conversations/Conversation$UnsentMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTemporaryContentUrl", "(Lcom/twilio/conversations/Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addListener", "Lcom/twilio/conversations/ConversationsClientListener;", "onConversationAdded", "Lkotlin/ParameterName;", "name", "conversation", "onConversationUpdated", "Lkotlin/Function2;", "Lcom/twilio/conversations/Conversation$UpdateReason;", "reason", "onConversationDeleted", "onConversationSynchronizationChange", "onError", "Lcom/twilio/util/ErrorInfo;", "errorInfo", "onUserUpdated", "user", "Lcom/twilio/conversations/User$UpdateReason;", "onUserSubscribed", "onUserUnsubscribed", "onClientSynchronization", "status", "onNewMessageNotification", "Lkotlin/Function3;", "conversationSid", "messageSid", "messageIndex", "onAddedToConversationNotification", "onRemovedFromConversationNotification", "onNotificationSubscribed", "Lkotlin/Function0;", "onNotificationFailed", "onConnectionStateChange", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "state", "onTokenExpired", "onTokenAboutToExpire", "ConversationsClientListener", "Lcom/twilio/conversations/ConversationListener;", "onMessageAdded", "message", "onMessageUpdated", "Lcom/twilio/conversations/Message$UpdateReason;", "onMessageDeleted", "onParticipantAdded", "onParticipantUpdated", "Lcom/twilio/conversations/Participant$UpdateReason;", "onParticipantDeleted", "onTypingStarted", "onTypingEnded", "onSynchronizationChanged", "ConversationListener", "CallbackListener", "Lcom/twilio/conversations/CallbackListener;", "T", "onSuccess", "result", "StatusListener", "Lcom/twilio/conversations/StatusListener;", "convo-android_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ConversationsExtensionsKt {
    private static final Map<String, ChannelType> channelTypes;

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.extensions.ConversationsExtensionsKt", m3645f = "ConversationsExtensions.kt", m3646l = {61, 62}, m3647m = "createAndSyncConversationsClient")
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$createAndSyncConversationsClient$1 */
    static final class C434111 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C434111(Continuation<? super C434111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsExtensionsKt.createAndSyncConversationsClient(null, null, null, null, this);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.extensions.ConversationsExtensionsKt", m3645f = "ConversationsExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "joinAndSync")
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$joinAndSync$1 */
    static final class C434151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434151(Continuation<? super C434151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsExtensionsKt.joinAndSync(null, null, this);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.extensions.ConversationsExtensionsKt", m3645f = "ConversationsExtensions.kt", m3646l = {80}, m3647m = "waitForSynchronization")
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$waitForSynchronization$1 */
    static final class C434161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434161(Continuation<? super C434161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsExtensionsKt.waitForSynchronization((ConversationsClient) null, (ConversationsClient.SynchronizationStatus) null, this);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.conversations.extensions.ConversationsExtensionsKt", m3645f = "ConversationsExtensions.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "waitForSynchronization")
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$waitForSynchronization$2 */
    static final class C434172 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C434172(Continuation<? super C434172> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationsExtensionsKt.waitForSynchronization((Conversation) null, (Conversation.SynchronizationStatus) null, this);
        }
    }

    public static /* synthetic */ Object createConversationsClient$default(Context context, String str, ConversationsClient.Properties properties, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            properties = ConversationsClient.Properties.newBuilder().createProperties();
        }
        return createConversationsClient(context, str, properties, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object createAndSyncConversationsClient(Context context, String str, ConversationsClient.SynchronizationStatus synchronizationStatus, ConversationsClient.Properties properties, Continuation<? super ConversationsClient> continuation) {
        C434111 c434111;
        if (continuation instanceof C434111) {
            c434111 = (C434111) continuation;
            int i = c434111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434111.label = i - Integer.MIN_VALUE;
            } else {
                c434111 = new C434111(continuation);
            }
        }
        Object objCreateConversationsClient = c434111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateConversationsClient);
            c434111.L$0 = synchronizationStatus;
            c434111.label = 1;
            objCreateConversationsClient = createConversationsClient(context, str, properties, c434111);
            if (objCreateConversationsClient != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConversationsClient conversationsClient = (ConversationsClient) c434111.L$0;
            ResultKt.throwOnFailure(objCreateConversationsClient);
            return conversationsClient;
        }
        synchronizationStatus = (ConversationsClient.SynchronizationStatus) c434111.L$0;
        ResultKt.throwOnFailure(objCreateConversationsClient);
        ConversationsClient conversationsClient2 = (ConversationsClient) objCreateConversationsClient;
        c434111.L$0 = conversationsClient2;
        c434111.label = 2;
        return waitForSynchronization(conversationsClient2, synchronizationStatus, c434111) == coroutine_suspended ? coroutine_suspended : conversationsClient2;
    }

    public static /* synthetic */ Object createAndSyncConversationsClient$default(Context context, String str, ConversationsClient.SynchronizationStatus synchronizationStatus, ConversationsClient.Properties properties, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            synchronizationStatus = ConversationsClient.SynchronizationStatus.COMPLETED;
        }
        if ((i & 8) != 0) {
            properties = ConversationsClient.Properties.newBuilder().createProperties();
        }
        return createAndSyncConversationsClient(context, str, synchronizationStatus, properties, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForSynchronization(ConversationsClient conversationsClient, final ConversationsClient.SynchronizationStatus synchronizationStatus, Continuation<? super Unit> continuation) throws Throwable {
        C434161 c434161;
        ConversationsClientListener conversationsClientListener;
        if (continuation instanceof C434161) {
            c434161 = (C434161) continuation;
            int i = c434161.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434161.label = i - Integer.MIN_VALUE;
            } else {
                c434161 = new C434161(continuation);
            }
        }
        Object obj = c434161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434161.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConversationsClientListener conversationsClientListener2 = (ConversationsClientListener) c434161.L$1;
            ConversationsClient conversationsClient2 = (ConversationsClient) c434161.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                conversationsClientListener = conversationsClientListener2;
                conversationsClient = conversationsClient2;
                conversationsClient.removeListener(conversationsClientListener);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                conversationsClientListener = conversationsClientListener2;
                conversationsClient = conversationsClient2;
                conversationsClient.removeListener(conversationsClientListener);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        conversationsClientListener = new ConversationsClientListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$waitForSynchronization$$inlined$addListener$default$1
            @Override // com.twilio.conversations.ConversationsClientListener
            public void onAddedToConversationNotification(String conversationSid) {
                Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onConnectionStateChange(ConversationsClient.ConnectionState state) {
                Intrinsics.checkNotNullParameter(state, "state");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onConversationAdded(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onConversationDeleted(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onConversationSynchronizationChange(Conversation conversation) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onConversationUpdated(Conversation conversation, Conversation.UpdateReason reason) {
                Intrinsics.checkNotNullParameter(conversation, "conversation");
                Intrinsics.checkNotNullParameter(reason, "reason");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onNewMessageNotification(String conversationSid, String messageSid, long messageIndex) {
                Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
                Intrinsics.checkNotNullParameter(messageSid, "messageSid");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onNotificationFailed(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onNotificationSubscribed() {
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onRemovedFromConversationNotification(String conversationSid) {
                Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onTokenAboutToExpire() {
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onTokenExpired() {
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onUserSubscribed(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onUserUnsubscribed(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onUserUpdated(User user, User.UpdateReason reason) {
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(reason, "reason");
            }

            @Override // com.twilio.conversations.ConversationsClientListener
            public void onClientSynchronization(ConversationsClient.SynchronizationStatus status) {
                Intrinsics.checkNotNullParameter(status, "status");
                if (status == synchronizationStatus) {
                    completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE);
                }
            }
        };
        conversationsClient.addListener(conversationsClientListener);
        try {
            c434161.L$0 = conversationsClient;
            c434161.L$1 = conversationsClientListener;
            c434161.label = 1;
            if (completableDeferredCompletableDeferred$default.await(c434161) == coroutine_suspended) {
                return coroutine_suspended;
            }
            conversationsClient.removeListener(conversationsClientListener);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            conversationsClient.removeListener(conversationsClientListener);
            throw th;
        }
    }

    static /* synthetic */ Object waitForSynchronization$default(ConversationsClient conversationsClient, ConversationsClient.SynchronizationStatus synchronizationStatus, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            synchronizationStatus = ConversationsClient.SynchronizationStatus.COMPLETED;
        }
        return waitForSynchronization(conversationsClient, synchronizationStatus, (Continuation<? super Unit>) continuation);
    }

    public static /* synthetic */ Object createConversation$default(ConversationsClient conversationsClient, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return createConversation(conversationsClient, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitForSynchronization(Conversation conversation, final Conversation.SynchronizationStatus synchronizationStatus, Continuation<? super Unit> continuation) throws Throwable {
        C434172 c434172;
        ConversationListener conversationListener;
        if (continuation instanceof C434172) {
            c434172 = (C434172) continuation;
            int i = c434172.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434172.label = i - Integer.MIN_VALUE;
            } else {
                c434172 = new C434172(continuation);
            }
        }
        Object obj = c434172.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434172.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConversationListener conversationListener2 = (ConversationListener) c434172.L$1;
            Conversation conversation2 = (Conversation) c434172.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                conversationListener = conversationListener2;
                conversation = conversation2;
                conversation.removeListener(conversationListener);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                conversationListener = conversationListener2;
                conversation = conversation2;
                conversation.removeListener(conversationListener);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        final CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferred3.CompletableDeferred$default(null, 1, null);
        conversationListener = new ConversationListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$waitForSynchronization$$inlined$addListener$default$2
            @Override // com.twilio.conversations.ConversationListener
            public void onMessageAdded(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onMessageDeleted(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onMessageUpdated(Message message, Message.UpdateReason reason) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(reason, "reason");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onParticipantAdded(Participant participant) {
                Intrinsics.checkNotNullParameter(participant, "participant");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onParticipantDeleted(Participant participant) {
                Intrinsics.checkNotNullParameter(participant, "participant");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onParticipantUpdated(Participant participant, Participant.UpdateReason reason) {
                Intrinsics.checkNotNullParameter(participant, "participant");
                Intrinsics.checkNotNullParameter(reason, "reason");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onTypingEnded(Conversation conversation3, Participant participant) {
                Intrinsics.checkNotNullParameter(conversation3, "conversation");
                Intrinsics.checkNotNullParameter(participant, "participant");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onTypingStarted(Conversation conversation3, Participant participant) {
                Intrinsics.checkNotNullParameter(conversation3, "conversation");
                Intrinsics.checkNotNullParameter(participant, "participant");
            }

            @Override // com.twilio.conversations.ConversationListener
            public void onSynchronizationChanged(Conversation conversation3) {
                Intrinsics.checkNotNullParameter(conversation3, "conversation");
                synchronized (completableDeferredCompletableDeferred$default) {
                    try {
                        if (completableDeferredCompletableDeferred$default.isCompleted()) {
                            return;
                        }
                        if (conversation3.getSynchronizationStatus() == Conversation.SynchronizationStatus.FAILED) {
                            completableDeferredCompletableDeferred$default.completeExceptionally(new TwilioException(new ErrorInfo(ErrorInfo.INSTANCE.getCONVERSATION_NOT_SYNCHRONIZED(), "Conversation synchronization failed: " + conversation3.getSid() + '}'), null, 2, null));
                        } else if (conversation3.getSynchronizationStatus().isAtLeast(synchronizationStatus)) {
                            completableDeferredCompletableDeferred$default.complete(Unit.INSTANCE);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        conversation.addListener(conversationListener);
        try {
            c434172.L$0 = conversation;
            c434172.L$1 = conversationListener;
            c434172.label = 1;
            if (completableDeferredCompletableDeferred$default.await(c434172) == coroutine_suspended) {
                return coroutine_suspended;
            }
            conversation.removeListener(conversationListener);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            conversation.removeListener(conversationListener);
            throw th;
        }
    }

    public static /* synthetic */ Object waitForSynchronization$default(Conversation conversation, Conversation.SynchronizationStatus synchronizationStatus, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            synchronizationStatus = Conversation.SynchronizationStatus.ALL;
        }
        return waitForSynchronization(conversation, synchronizationStatus, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (waitForSynchronization(r5, r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object joinAndSync(Conversation conversation, Conversation.SynchronizationStatus synchronizationStatus, Continuation<? super Unit> continuation) {
        C434151 c434151;
        if (continuation instanceof C434151) {
            c434151 = (C434151) continuation;
            int i = c434151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c434151.label = i - Integer.MIN_VALUE;
            } else {
                c434151 = new C434151(continuation);
            }
        }
        Object obj = c434151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c434151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c434151.L$0 = conversation;
            c434151.L$1 = synchronizationStatus;
            c434151.label = 1;
            if (join(conversation, c434151) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        synchronizationStatus = (Conversation.SynchronizationStatus) c434151.L$1;
        conversation = (Conversation) c434151.L$0;
        ResultKt.throwOnFailure(obj);
        c434151.L$0 = null;
        c434151.L$1 = null;
        c434151.label = 2;
    }

    public static /* synthetic */ Object joinAndSync$default(Conversation conversation, Conversation.SynchronizationStatus synchronizationStatus, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            synchronizationStatus = Conversation.SynchronizationStatus.ALL;
        }
        return joinAndSync(conversation, synchronizationStatus, continuation);
    }

    static {
        List listListOf = CollectionsKt.listOf((Object[]) new ChannelType[]{ChannelType.Unset.INSTANCE, ChannelType.Chat.INSTANCE, ChannelType.Sms.INSTANCE, ChannelType.Whatsapp.INSTANCE});
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((ChannelType) obj).getValue(), obj);
        }
        channelTypes = linkedHashMap;
    }

    public static final ChannelType getChannelType(Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "<this>");
        ChannelType channelType = channelTypes.get(participant.getChannel());
        if (channelType != null) {
            return channelType;
        }
        String channel = participant.getChannel();
        Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
        return new ChannelType.Other(channel);
    }

    public static final Conversation.UnsentMessage prepareMessage(Conversation conversation, Function1<? super MessageBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Conversation.MessageBuilder messageBuilderPrepareMessage = conversation.prepareMessage();
        Intrinsics.checkNotNullExpressionValue(messageBuilderPrepareMessage, "prepareMessage(...)");
        MessageBuilder messageBuilder = new MessageBuilder(messageBuilderPrepareMessage);
        block.invoke(messageBuilder);
        return messageBuilder.build();
    }

    public static final Object sendMessage(Conversation conversation, Function1<? super MessageBuilder, Unit> function1, Continuation<? super Message> continuation) {
        Conversation.MessageBuilder messageBuilderPrepareMessage = conversation.prepareMessage();
        Intrinsics.checkNotNullExpressionValue(messageBuilderPrepareMessage, "prepareMessage(...)");
        MessageBuilder messageBuilder = new MessageBuilder(messageBuilderPrepareMessage);
        function1.invoke(messageBuilder);
        return send(messageBuilder.build(), continuation);
    }

    private static final Object sendMessage$$forInline(Conversation conversation, Function1<? super MessageBuilder, Unit> function1, Continuation<? super Message> continuation) {
        Conversation.MessageBuilder messageBuilderPrepareMessage = conversation.prepareMessage();
        Intrinsics.checkNotNullExpressionValue(messageBuilderPrepareMessage, "prepareMessage(...)");
        MessageBuilder messageBuilder = new MessageBuilder(messageBuilderPrepareMessage);
        function1.invoke(messageBuilder);
        Conversation.UnsentMessage unsentMessageBuild = messageBuilder.build();
        InlineMarker.mark(0);
        Object objSend = send(unsentMessageBuild, continuation);
        InlineMarker.mark(1);
        return objSend;
    }

    public static /* synthetic */ Object addParticipantByIdentity$default(Conversation conversation, String str, Attributes attributes, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            attributes = Attributes.DEFAULT;
        }
        return addParticipantByIdentity(conversation, str, attributes, continuation);
    }

    public static /* synthetic */ Object addParticipantByAddress$default(Conversation conversation, String str, String str2, Attributes attributes, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            attributes = Attributes.DEFAULT;
        }
        return addParticipantByAddress(conversation, str, str2, attributes, continuation);
    }

    public static /* synthetic */ ConversationsClientListener addListener$default(ConversationsClient conversationsClient, Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15, Function1 function16, Function1 function17, Function3 function3, Function1 function18, Function1 function19, Function0 function0, Function1 function110, Function1 function111, Function0 function02, Function0 function03, int i, Object obj) {
        Function1 onConversationAdded = (i & 1) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function1;
        Function2 onConversationUpdated = (i & 2) != 0 ? new Function2<Conversation, Conversation.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation conversation, Conversation.UpdateReason updateReason) {
                Intrinsics.checkNotNullParameter(conversation, "<unused var>");
                Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation, Conversation.UpdateReason updateReason) {
                invoke2(conversation, updateReason);
                return Unit.INSTANCE;
            }
        } : function2;
        Function1 onConversationDeleted = (i & 4) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function12;
        Function1 onConversationSynchronizationChange = (i & 8) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function13;
        Function1 onError = (i & 16) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function14;
        Function2 onUserUpdated = (i & 32) != 0 ? new Function2<User, User.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User user, User.UpdateReason updateReason) {
                Intrinsics.checkNotNullParameter(user, "<unused var>");
                Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(User user, User.UpdateReason updateReason) {
                invoke2(user, updateReason);
                return Unit.INSTANCE;
            }
        } : function22;
        Function1 onUserSubscribed = (i & 64) != 0 ? new Function1<User, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(User user) {
                invoke2(user);
                return Unit.INSTANCE;
            }
        } : function15;
        Function1 onUserUnsubscribed = (i & 128) != 0 ? new Function1<User, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.8
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(User user) {
                invoke2(user);
                return Unit.INSTANCE;
            }
        } : function16;
        Function1 onClientSynchronization = (i & 256) != 0 ? new Function1<ConversationsClient.SynchronizationStatus, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.9
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ConversationsClient.SynchronizationStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConversationsClient.SynchronizationStatus synchronizationStatus) {
                invoke2(synchronizationStatus);
                return Unit.INSTANCE;
            }
        } : function17;
        Function3 onNewMessageNotification = (i & 512) != 0 ? new Function3<String, String, Long, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.10
            public final void invoke(String str, String str2, long j) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(str2, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Long l) {
                invoke(str, str2, l.longValue());
                return Unit.INSTANCE;
            }
        } : function3;
        Function1 onAddedToConversationNotification = (i & 1024) != 0 ? new Function1<String, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.11
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function18;
        Function1 onRemovedFromConversationNotification = (i & 2048) != 0 ? new Function1<String, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.12
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function19;
        Function0 onNotificationSubscribed = (i & 4096) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.13
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function1 onNotificationFailed = (i & 8192) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.14
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function110;
        Function1 onConnectionStateChange = (i & 16384) != 0 ? new Function1<ConversationsClient.ConnectionState, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.15
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ConversationsClient.ConnectionState it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConversationsClient.ConnectionState connectionState) {
                invoke2(connectionState);
                return Unit.INSTANCE;
            }
        } : function111;
        Function0 function04 = (i & 32768) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.16
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        Function0 function05 = (i & 65536) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.17
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03;
        Function0 onTokenExpired = function04;
        Intrinsics.checkNotNullParameter(conversationsClient, "<this>");
        Intrinsics.checkNotNullParameter(onConversationAdded, "onConversationAdded");
        Intrinsics.checkNotNullParameter(onConversationUpdated, "onConversationUpdated");
        Intrinsics.checkNotNullParameter(onConversationDeleted, "onConversationDeleted");
        Intrinsics.checkNotNullParameter(onConversationSynchronizationChange, "onConversationSynchronizationChange");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onUserUpdated, "onUserUpdated");
        Intrinsics.checkNotNullParameter(onUserSubscribed, "onUserSubscribed");
        Intrinsics.checkNotNullParameter(onUserUnsubscribed, "onUserUnsubscribed");
        Intrinsics.checkNotNullParameter(onClientSynchronization, "onClientSynchronization");
        Intrinsics.checkNotNullParameter(onNewMessageNotification, "onNewMessageNotification");
        Intrinsics.checkNotNullParameter(onAddedToConversationNotification, "onAddedToConversationNotification");
        Intrinsics.checkNotNullParameter(onRemovedFromConversationNotification, "onRemovedFromConversationNotification");
        Intrinsics.checkNotNullParameter(onNotificationSubscribed, "onNotificationSubscribed");
        Function1 function112 = onConversationAdded;
        Intrinsics.checkNotNullParameter(onNotificationFailed, "onNotificationFailed");
        Intrinsics.checkNotNullParameter(onConnectionStateChange, "onConnectionStateChange");
        Intrinsics.checkNotNullParameter(onTokenExpired, "onTokenExpired");
        Function0 onTokenAboutToExpire = function05;
        Intrinsics.checkNotNullParameter(onTokenAboutToExpire, "onTokenAboutToExpire");
        C4337318 c4337318 = new C4337318(function112, onConversationUpdated, onConversationDeleted, onConversationSynchronizationChange, onError, onUserUpdated, onUserSubscribed, onUserUnsubscribed, onClientSynchronization, onNewMessageNotification, onAddedToConversationNotification, onRemovedFromConversationNotification, onNotificationSubscribed, onNotificationFailed, onConnectionStateChange, onTokenExpired, onTokenAboutToExpire);
        conversationsClient.addListener(c4337318);
        return c4337318;
    }

    public static /* synthetic */ ConversationsClientListener ConversationsClientListener$default(Function1 function1, Function2 function2, Function1 function12, Function1 function13, Function1 function14, Function2 function22, Function1 function15, Function1 function16, Function1 function17, Function3 function3, Function1 function18, Function1 function19, Function0 function0, Function1 function110, Function1 function111, Function0 function02, Function0 function03, int i, Object obj) {
        Function1 onConversationAdded = (i & 1) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function1;
        Function2 onConversationUpdated = (i & 2) != 0 ? new Function2<Conversation, Conversation.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation conversation, Conversation.UpdateReason updateReason) {
                Intrinsics.checkNotNullParameter(conversation, "<unused var>");
                Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation, Conversation.UpdateReason updateReason) {
                invoke2(conversation, updateReason);
                return Unit.INSTANCE;
            }
        } : function2;
        Function1 onConversationDeleted = (i & 4) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function12;
        Function1 onConversationSynchronizationChange = (i & 8) != 0 ? new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Conversation it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                invoke2(conversation);
                return Unit.INSTANCE;
            }
        } : function13;
        Function1 onError = (i & 16) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.5
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function14;
        Function2 onUserUpdated = (i & 32) != 0 ? new Function2<User, User.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.6
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User user, User.UpdateReason updateReason) {
                Intrinsics.checkNotNullParameter(user, "<unused var>");
                Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(User user, User.UpdateReason updateReason) {
                invoke2(user, updateReason);
                return Unit.INSTANCE;
            }
        } : function22;
        Function1 onUserSubscribed = (i & 64) != 0 ? new Function1<User, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.7
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(User user) {
                invoke2(user);
                return Unit.INSTANCE;
            }
        } : function15;
        Function1 onUserUnsubscribed = (i & 128) != 0 ? new Function1<User, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.8
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(User user) {
                invoke2(user);
                return Unit.INSTANCE;
            }
        } : function16;
        Function1 onClientSynchronization = (i & 256) != 0 ? new Function1<ConversationsClient.SynchronizationStatus, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.9
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ConversationsClient.SynchronizationStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConversationsClient.SynchronizationStatus synchronizationStatus) {
                invoke2(synchronizationStatus);
                return Unit.INSTANCE;
            }
        } : function17;
        Function3 onNewMessageNotification = (i & 512) != 0 ? new Function3<String, String, Long, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.10
            public final void invoke(String str, String str2, long j) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(str2, "<unused var>");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Long l) {
                invoke(str, str2, l.longValue());
                return Unit.INSTANCE;
            }
        } : function3;
        Function1 onAddedToConversationNotification = (i & 1024) != 0 ? new Function1<String, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.11
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function18;
        Function1 onRemovedFromConversationNotification = (i & 2048) != 0 ? new Function1<String, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.12
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function19;
        Function0 onNotificationSubscribed = (i & 4096) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.13
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        Function1 onNotificationFailed = (i & 8192) != 0 ? new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.14
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ErrorInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                invoke2(errorInfo);
                return Unit.INSTANCE;
            }
        } : function110;
        Function1 onConnectionStateChange = (i & 16384) != 0 ? new Function1<ConversationsClient.ConnectionState, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.15
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ConversationsClient.ConnectionState it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ConversationsClient.ConnectionState connectionState) {
                invoke2(connectionState);
                return Unit.INSTANCE;
            }
        } : function111;
        Function0 function04 = (i & 32768) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.16
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02;
        Function0 function05 = (i & 65536) != 0 ? new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationsClientListener.17
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function03;
        Function0 onTokenExpired = function04;
        Intrinsics.checkNotNullParameter(onConversationAdded, "onConversationAdded");
        Intrinsics.checkNotNullParameter(onConversationUpdated, "onConversationUpdated");
        Intrinsics.checkNotNullParameter(onConversationDeleted, "onConversationDeleted");
        Intrinsics.checkNotNullParameter(onConversationSynchronizationChange, "onConversationSynchronizationChange");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onUserUpdated, "onUserUpdated");
        Intrinsics.checkNotNullParameter(onUserSubscribed, "onUserSubscribed");
        Intrinsics.checkNotNullParameter(onUserUnsubscribed, "onUserUnsubscribed");
        Intrinsics.checkNotNullParameter(onClientSynchronization, "onClientSynchronization");
        Intrinsics.checkNotNullParameter(onNewMessageNotification, "onNewMessageNotification");
        Intrinsics.checkNotNullParameter(onAddedToConversationNotification, "onAddedToConversationNotification");
        Intrinsics.checkNotNullParameter(onRemovedFromConversationNotification, "onRemovedFromConversationNotification");
        Intrinsics.checkNotNullParameter(onNotificationSubscribed, "onNotificationSubscribed");
        Intrinsics.checkNotNullParameter(onNotificationFailed, "onNotificationFailed");
        Intrinsics.checkNotNullParameter(onConnectionStateChange, "onConnectionStateChange");
        Function1 function112 = onConversationAdded;
        Intrinsics.checkNotNullParameter(onTokenExpired, "onTokenExpired");
        Function0 onTokenAboutToExpire = function05;
        Intrinsics.checkNotNullParameter(onTokenAboutToExpire, "onTokenAboutToExpire");
        return new C4337318(function112, onConversationUpdated, onConversationDeleted, onConversationSynchronizationChange, onError, onUserUpdated, onUserSubscribed, onUserUnsubscribed, onClientSynchronization, onNewMessageNotification, onAddedToConversationNotification, onRemovedFromConversationNotification, onNotificationSubscribed, onNotificationFailed, onConnectionStateChange, onTokenExpired, onTokenAboutToExpire);
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000U\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0003H\u0016¨\u0006&"}, m3636d2 = {"com/twilio/conversations/extensions/ConversationsExtensionsKt$ConversationsClientListener$18", "Lcom/twilio/conversations/ConversationsClientListener;", "onConversationAdded", "", "conversation", "Lcom/twilio/conversations/Conversation;", "onConversationUpdated", "reason", "Lcom/twilio/conversations/Conversation$UpdateReason;", "onConversationDeleted", "onConversationSynchronizationChange", "onError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "onUserUpdated", "user", "Lcom/twilio/conversations/User;", "Lcom/twilio/conversations/User$UpdateReason;", "onUserSubscribed", "onUserUnsubscribed", "onClientSynchronization", "status", "Lcom/twilio/conversations/ConversationsClient$SynchronizationStatus;", "onNewMessageNotification", "conversationSid", "", "messageSid", "messageIndex", "", "onAddedToConversationNotification", "onRemovedFromConversationNotification", "onNotificationSubscribed", "onNotificationFailed", "onConnectionStateChange", "state", "Lcom/twilio/conversations/ConversationsClient$ConnectionState;", "onTokenExpired", "onTokenAboutToExpire", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$ConversationsClientListener$18 */
    public static final class C4337318 implements ConversationsClientListener {
        final /* synthetic */ Function1<String, Unit> $onAddedToConversationNotification;
        final /* synthetic */ Function1<ConversationsClient.SynchronizationStatus, Unit> $onClientSynchronization;
        final /* synthetic */ Function1<ConversationsClient.ConnectionState, Unit> $onConnectionStateChange;
        final /* synthetic */ Function1<Conversation, Unit> $onConversationAdded;
        final /* synthetic */ Function1<Conversation, Unit> $onConversationDeleted;
        final /* synthetic */ Function1<Conversation, Unit> $onConversationSynchronizationChange;
        final /* synthetic */ Function2<Conversation, Conversation.UpdateReason, Unit> $onConversationUpdated;
        final /* synthetic */ Function1<ErrorInfo, Unit> $onError;
        final /* synthetic */ Function3<String, String, Long, Unit> $onNewMessageNotification;
        final /* synthetic */ Function1<ErrorInfo, Unit> $onNotificationFailed;
        final /* synthetic */ Function0<Unit> $onNotificationSubscribed;
        final /* synthetic */ Function1<String, Unit> $onRemovedFromConversationNotification;
        final /* synthetic */ Function0<Unit> $onTokenAboutToExpire;
        final /* synthetic */ Function0<Unit> $onTokenExpired;
        final /* synthetic */ Function1<User, Unit> $onUserSubscribed;
        final /* synthetic */ Function1<User, Unit> $onUserUnsubscribed;
        final /* synthetic */ Function2<User, User.UpdateReason, Unit> $onUserUpdated;

        /* JADX WARN: Multi-variable type inference failed */
        public C4337318(Function1<? super Conversation, Unit> function1, Function2<? super Conversation, ? super Conversation.UpdateReason, Unit> function2, Function1<? super Conversation, Unit> function12, Function1<? super Conversation, Unit> function13, Function1<? super ErrorInfo, Unit> function14, Function2<? super User, ? super User.UpdateReason, Unit> function22, Function1<? super User, Unit> function15, Function1<? super User, Unit> function16, Function1<? super ConversationsClient.SynchronizationStatus, Unit> function17, Function3<? super String, ? super String, ? super Long, Unit> function3, Function1<? super String, Unit> function18, Function1<? super String, Unit> function19, Function0<Unit> function0, Function1<? super ErrorInfo, Unit> function110, Function1<? super ConversationsClient.ConnectionState, Unit> function111, Function0<Unit> function02, Function0<Unit> function03) {
            this.$onConversationAdded = function1;
            this.$onConversationUpdated = function2;
            this.$onConversationDeleted = function12;
            this.$onConversationSynchronizationChange = function13;
            this.$onError = function14;
            this.$onUserUpdated = function22;
            this.$onUserSubscribed = function15;
            this.$onUserUnsubscribed = function16;
            this.$onClientSynchronization = function17;
            this.$onNewMessageNotification = function3;
            this.$onAddedToConversationNotification = function18;
            this.$onRemovedFromConversationNotification = function19;
            this.$onNotificationSubscribed = function0;
            this.$onNotificationFailed = function110;
            this.$onConnectionStateChange = function111;
            this.$onTokenExpired = function02;
            this.$onTokenAboutToExpire = function03;
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onConversationAdded(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.$onConversationAdded.invoke(conversation);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onConversationUpdated(Conversation conversation, Conversation.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.$onConversationUpdated.invoke(conversation, reason);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onConversationDeleted(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.$onConversationDeleted.invoke(conversation);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onConversationSynchronizationChange(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.$onConversationSynchronizationChange.invoke(conversation);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onError(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.$onError.invoke(errorInfo);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onUserUpdated(User user, User.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.$onUserUpdated.invoke(user, reason);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onUserSubscribed(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            this.$onUserSubscribed.invoke(user);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onUserUnsubscribed(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            this.$onUserUnsubscribed.invoke(user);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onClientSynchronization(ConversationsClient.SynchronizationStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.$onClientSynchronization.invoke(status);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onNewMessageNotification(String conversationSid, String messageSid, long messageIndex) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            Intrinsics.checkNotNullParameter(messageSid, "messageSid");
            this.$onNewMessageNotification.invoke(conversationSid, messageSid, Long.valueOf(messageIndex));
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onAddedToConversationNotification(String conversationSid) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            this.$onAddedToConversationNotification.invoke(conversationSid);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onRemovedFromConversationNotification(String conversationSid) {
            Intrinsics.checkNotNullParameter(conversationSid, "conversationSid");
            this.$onRemovedFromConversationNotification.invoke(conversationSid);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onNotificationSubscribed() {
            this.$onNotificationSubscribed.invoke();
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onNotificationFailed(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.$onNotificationFailed.invoke(errorInfo);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onConnectionStateChange(ConversationsClient.ConnectionState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.$onConnectionStateChange.invoke(state);
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onTokenExpired() {
            this.$onTokenExpired.invoke();
        }

        @Override // com.twilio.conversations.ConversationsClientListener
        public void onTokenAboutToExpire() {
            this.$onTokenAboutToExpire.invoke();
        }
    }

    public static final ConversationsClientListener ConversationsClientListener(Function1<? super Conversation, Unit> onConversationAdded, Function2<? super Conversation, ? super Conversation.UpdateReason, Unit> onConversationUpdated, Function1<? super Conversation, Unit> onConversationDeleted, Function1<? super Conversation, Unit> onConversationSynchronizationChange, Function1<? super ErrorInfo, Unit> onError, Function2<? super User, ? super User.UpdateReason, Unit> onUserUpdated, Function1<? super User, Unit> onUserSubscribed, Function1<? super User, Unit> onUserUnsubscribed, Function1<? super ConversationsClient.SynchronizationStatus, Unit> onClientSynchronization, Function3<? super String, ? super String, ? super Long, Unit> onNewMessageNotification, Function1<? super String, Unit> onAddedToConversationNotification, Function1<? super String, Unit> onRemovedFromConversationNotification, Function0<Unit> onNotificationSubscribed, Function1<? super ErrorInfo, Unit> onNotificationFailed, Function1<? super ConversationsClient.ConnectionState, Unit> onConnectionStateChange, Function0<Unit> onTokenExpired, Function0<Unit> onTokenAboutToExpire) {
        Intrinsics.checkNotNullParameter(onConversationAdded, "onConversationAdded");
        Intrinsics.checkNotNullParameter(onConversationUpdated, "onConversationUpdated");
        Intrinsics.checkNotNullParameter(onConversationDeleted, "onConversationDeleted");
        Intrinsics.checkNotNullParameter(onConversationSynchronizationChange, "onConversationSynchronizationChange");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onUserUpdated, "onUserUpdated");
        Intrinsics.checkNotNullParameter(onUserSubscribed, "onUserSubscribed");
        Intrinsics.checkNotNullParameter(onUserUnsubscribed, "onUserUnsubscribed");
        Intrinsics.checkNotNullParameter(onClientSynchronization, "onClientSynchronization");
        Intrinsics.checkNotNullParameter(onNewMessageNotification, "onNewMessageNotification");
        Intrinsics.checkNotNullParameter(onAddedToConversationNotification, "onAddedToConversationNotification");
        Intrinsics.checkNotNullParameter(onRemovedFromConversationNotification, "onRemovedFromConversationNotification");
        Intrinsics.checkNotNullParameter(onNotificationSubscribed, "onNotificationSubscribed");
        Intrinsics.checkNotNullParameter(onNotificationFailed, "onNotificationFailed");
        Intrinsics.checkNotNullParameter(onConnectionStateChange, "onConnectionStateChange");
        Intrinsics.checkNotNullParameter(onTokenExpired, "onTokenExpired");
        Intrinsics.checkNotNullParameter(onTokenAboutToExpire, "onTokenAboutToExpire");
        return new C4337318(onConversationAdded, onConversationUpdated, onConversationDeleted, onConversationSynchronizationChange, onError, onUserUpdated, onUserSubscribed, onUserUnsubscribed, onClientSynchronization, onNewMessageNotification, onAddedToConversationNotification, onRemovedFromConversationNotification, onNotificationSubscribed, onNotificationFailed, onConnectionStateChange, onTokenExpired, onTokenAboutToExpire);
    }

    public static final ConversationsClientListener addListener(ConversationsClient conversationsClient, Function1<? super Conversation, Unit> onConversationAdded, Function2<? super Conversation, ? super Conversation.UpdateReason, Unit> onConversationUpdated, Function1<? super Conversation, Unit> onConversationDeleted, Function1<? super Conversation, Unit> onConversationSynchronizationChange, Function1<? super ErrorInfo, Unit> onError, Function2<? super User, ? super User.UpdateReason, Unit> onUserUpdated, Function1<? super User, Unit> onUserSubscribed, Function1<? super User, Unit> onUserUnsubscribed, Function1<? super ConversationsClient.SynchronizationStatus, Unit> onClientSynchronization, Function3<? super String, ? super String, ? super Long, Unit> onNewMessageNotification, Function1<? super String, Unit> onAddedToConversationNotification, Function1<? super String, Unit> onRemovedFromConversationNotification, Function0<Unit> onNotificationSubscribed, Function1<? super ErrorInfo, Unit> onNotificationFailed, Function1<? super ConversationsClient.ConnectionState, Unit> onConnectionStateChange, Function0<Unit> onTokenExpired, Function0<Unit> onTokenAboutToExpire) {
        Intrinsics.checkNotNullParameter(conversationsClient, "<this>");
        Intrinsics.checkNotNullParameter(onConversationAdded, "onConversationAdded");
        Intrinsics.checkNotNullParameter(onConversationUpdated, "onConversationUpdated");
        Intrinsics.checkNotNullParameter(onConversationDeleted, "onConversationDeleted");
        Intrinsics.checkNotNullParameter(onConversationSynchronizationChange, "onConversationSynchronizationChange");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onUserUpdated, "onUserUpdated");
        Intrinsics.checkNotNullParameter(onUserSubscribed, "onUserSubscribed");
        Intrinsics.checkNotNullParameter(onUserUnsubscribed, "onUserUnsubscribed");
        Intrinsics.checkNotNullParameter(onClientSynchronization, "onClientSynchronization");
        Intrinsics.checkNotNullParameter(onNewMessageNotification, "onNewMessageNotification");
        Intrinsics.checkNotNullParameter(onAddedToConversationNotification, "onAddedToConversationNotification");
        Intrinsics.checkNotNullParameter(onRemovedFromConversationNotification, "onRemovedFromConversationNotification");
        Intrinsics.checkNotNullParameter(onNotificationSubscribed, "onNotificationSubscribed");
        Intrinsics.checkNotNullParameter(onNotificationFailed, "onNotificationFailed");
        Intrinsics.checkNotNullParameter(onConnectionStateChange, "onConnectionStateChange");
        Intrinsics.checkNotNullParameter(onTokenExpired, "onTokenExpired");
        Intrinsics.checkNotNullParameter(onTokenAboutToExpire, "onTokenAboutToExpire");
        C4337318 c4337318 = new C4337318(onConversationAdded, onConversationUpdated, onConversationDeleted, onConversationSynchronizationChange, onError, onUserUpdated, onUserSubscribed, onUserUnsubscribed, onClientSynchronization, onNewMessageNotification, onAddedToConversationNotification, onRemovedFromConversationNotification, onNotificationSubscribed, onNotificationFailed, onConnectionStateChange, onTokenExpired, onTokenAboutToExpire);
        conversationsClient.addListener(c4337318);
        return c4337318;
    }

    public static /* synthetic */ ConversationListener addListener$default(Conversation conversation, Function1 onMessageAdded, Function2 onMessageUpdated, Function1 onMessageDeleted, Function1 onParticipantAdded, Function2 onParticipantUpdated, Function1 onParticipantDeleted, Function2 onTypingStarted, Function2 onTypingEnded, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            onMessageAdded = new Function1<Message, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.18
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                    invoke2(message);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onMessageUpdated = new Function2<Message, Message.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.19
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message message, Message.UpdateReason updateReason) {
                    Intrinsics.checkNotNullParameter(message, "<unused var>");
                    Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Message message, Message.UpdateReason updateReason) {
                    invoke2(message, updateReason);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            onMessageDeleted = new Function1<Message, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.20
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                    invoke2(message);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            onParticipantAdded = new Function1<Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.21
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant) {
                    invoke2(participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            onParticipantUpdated = new Function2<Participant, Participant.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.22
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant participant, Participant.UpdateReason updateReason) {
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                    Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant, Participant.UpdateReason updateReason) {
                    invoke2(participant, updateReason);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 32) != 0) {
            onParticipantDeleted = new Function1<Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.23
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant) {
                    invoke2(participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 64) != 0) {
            onTypingStarted = new Function2<Conversation, Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.24
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation conversation2, Participant participant) {
                    Intrinsics.checkNotNullParameter(conversation2, "<unused var>");
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation2, Participant participant) {
                    invoke2(conversation2, participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 128) != 0) {
            onTypingEnded = new Function2<Conversation, Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.25
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation conversation2, Participant participant) {
                    Intrinsics.checkNotNullParameter(conversation2, "<unused var>");
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation2, Participant participant) {
                    invoke2(conversation2, participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 256) != 0) {
            function1 = new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.addListener.26
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation2) {
                    invoke2(conversation2);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 onSynchronizationChanged = function1;
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        Intrinsics.checkNotNullParameter(onMessageAdded, "onMessageAdded");
        Intrinsics.checkNotNullParameter(onMessageUpdated, "onMessageUpdated");
        Intrinsics.checkNotNullParameter(onMessageDeleted, "onMessageDeleted");
        Intrinsics.checkNotNullParameter(onParticipantAdded, "onParticipantAdded");
        Intrinsics.checkNotNullParameter(onParticipantUpdated, "onParticipantUpdated");
        Intrinsics.checkNotNullParameter(onParticipantDeleted, "onParticipantDeleted");
        Intrinsics.checkNotNullParameter(onTypingStarted, "onTypingStarted");
        Intrinsics.checkNotNullParameter(onTypingEnded, "onTypingEnded");
        Intrinsics.checkNotNullParameter(onSynchronizationChanged, "onSynchronizationChanged");
        Function2 function2 = onTypingEnded;
        Function1 function12 = onParticipantDeleted;
        Function2 function22 = onTypingStarted;
        Function2 function23 = onParticipantUpdated;
        Function1 function13 = onMessageDeleted;
        Function1 function14 = onMessageAdded;
        C4335510 c4335510 = new C4335510(function14, onMessageUpdated, function13, onParticipantAdded, function23, function12, function22, function2, onSynchronizationChanged);
        conversation.addListener(c4335510);
        return c4335510;
    }

    public static /* synthetic */ ConversationListener ConversationListener$default(Function1 onMessageAdded, Function2 onMessageUpdated, Function1 onMessageDeleted, Function1 onParticipantAdded, Function2 onParticipantUpdated, Function1 onParticipantDeleted, Function2 onTypingStarted, Function2 onTypingEnded, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            onMessageAdded = new Function1<Message, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                    invoke2(message);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onMessageUpdated = new Function2<Message, Message.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message message, Message.UpdateReason updateReason) {
                    Intrinsics.checkNotNullParameter(message, "<unused var>");
                    Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Message message, Message.UpdateReason updateReason) {
                    invoke2(message, updateReason);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            onMessageDeleted = new Function1<Message, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Message it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Message message) {
                    invoke2(message);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            onParticipantAdded = new Function1<Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant) {
                    invoke2(participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 16) != 0) {
            onParticipantUpdated = new Function2<Participant, Participant.UpdateReason, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant participant, Participant.UpdateReason updateReason) {
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                    Intrinsics.checkNotNullParameter(updateReason, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant, Participant.UpdateReason updateReason) {
                    invoke2(participant, updateReason);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 32) != 0) {
            onParticipantDeleted = new Function1<Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Participant it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Participant participant) {
                    invoke2(participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 64) != 0) {
            onTypingStarted = new Function2<Conversation, Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.7
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation conversation, Participant participant) {
                    Intrinsics.checkNotNullParameter(conversation, "<unused var>");
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation, Participant participant) {
                    invoke2(conversation, participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 128) != 0) {
            onTypingEnded = new Function2<Conversation, Participant, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.8
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation conversation, Participant participant) {
                    Intrinsics.checkNotNullParameter(conversation, "<unused var>");
                    Intrinsics.checkNotNullParameter(participant, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation, Participant participant) {
                    invoke2(conversation, participant);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 256) != 0) {
            function1 = new Function1<Conversation, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.ConversationListener.9
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Conversation it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Conversation conversation) {
                    invoke2(conversation);
                    return Unit.INSTANCE;
                }
            };
        }
        Function1 onSynchronizationChanged = function1;
        Intrinsics.checkNotNullParameter(onMessageAdded, "onMessageAdded");
        Intrinsics.checkNotNullParameter(onMessageUpdated, "onMessageUpdated");
        Intrinsics.checkNotNullParameter(onMessageDeleted, "onMessageDeleted");
        Intrinsics.checkNotNullParameter(onParticipantAdded, "onParticipantAdded");
        Intrinsics.checkNotNullParameter(onParticipantUpdated, "onParticipantUpdated");
        Intrinsics.checkNotNullParameter(onParticipantDeleted, "onParticipantDeleted");
        Intrinsics.checkNotNullParameter(onTypingStarted, "onTypingStarted");
        Intrinsics.checkNotNullParameter(onTypingEnded, "onTypingEnded");
        Intrinsics.checkNotNullParameter(onSynchronizationChanged, "onSynchronizationChanged");
        Function2 function2 = onTypingEnded;
        Function1 function12 = onParticipantDeleted;
        Function2 function22 = onTypingStarted;
        Function2 function23 = onParticipantUpdated;
        Function1 function13 = onMessageDeleted;
        return new C4335510(onMessageAdded, onMessageUpdated, function13, onParticipantAdded, function23, function12, function22, function2, onSynchronizationChanged);
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0015"}, m3636d2 = {"com/twilio/conversations/extensions/ConversationsExtensionsKt$ConversationListener$10", "Lcom/twilio/conversations/ConversationListener;", "onMessageAdded", "", "message", "Lcom/twilio/conversations/Message;", "onMessageUpdated", "reason", "Lcom/twilio/conversations/Message$UpdateReason;", "onMessageDeleted", "onParticipantAdded", "participant", "Lcom/twilio/conversations/Participant;", "onParticipantUpdated", "Lcom/twilio/conversations/Participant$UpdateReason;", "onParticipantDeleted", "onTypingStarted", "conversation", "Lcom/twilio/conversations/Conversation;", "onTypingEnded", "onSynchronizationChanged", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$ConversationListener$10 */
    public static final class C4335510 implements ConversationListener {
        final /* synthetic */ Function1<Message, Unit> $onMessageAdded;
        final /* synthetic */ Function1<Message, Unit> $onMessageDeleted;
        final /* synthetic */ Function2<Message, Message.UpdateReason, Unit> $onMessageUpdated;
        final /* synthetic */ Function1<Participant, Unit> $onParticipantAdded;
        final /* synthetic */ Function1<Participant, Unit> $onParticipantDeleted;
        final /* synthetic */ Function2<Participant, Participant.UpdateReason, Unit> $onParticipantUpdated;
        final /* synthetic */ Function1<Conversation, Unit> $onSynchronizationChanged;
        final /* synthetic */ Function2<Conversation, Participant, Unit> $onTypingEnded;
        final /* synthetic */ Function2<Conversation, Participant, Unit> $onTypingStarted;

        /* JADX WARN: Multi-variable type inference failed */
        public C4335510(Function1<? super Message, Unit> function1, Function2<? super Message, ? super Message.UpdateReason, Unit> function2, Function1<? super Message, Unit> function12, Function1<? super Participant, Unit> function13, Function2<? super Participant, ? super Participant.UpdateReason, Unit> function22, Function1<? super Participant, Unit> function14, Function2<? super Conversation, ? super Participant, Unit> function23, Function2<? super Conversation, ? super Participant, Unit> function24, Function1<? super Conversation, Unit> function15) {
            this.$onMessageAdded = function1;
            this.$onMessageUpdated = function2;
            this.$onMessageDeleted = function12;
            this.$onParticipantAdded = function13;
            this.$onParticipantUpdated = function22;
            this.$onParticipantDeleted = function14;
            this.$onTypingStarted = function23;
            this.$onTypingEnded = function24;
            this.$onSynchronizationChanged = function15;
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageAdded(Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.$onMessageAdded.invoke(message);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageUpdated(Message message, Message.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.$onMessageUpdated.invoke(message, reason);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onMessageDeleted(Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.$onMessageDeleted.invoke(message);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantAdded(Participant participant) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.$onParticipantAdded.invoke(participant);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantUpdated(Participant participant, Participant.UpdateReason reason) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.$onParticipantUpdated.invoke(participant, reason);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onParticipantDeleted(Participant participant) {
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.$onParticipantDeleted.invoke(participant);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onTypingStarted(Conversation conversation, Participant participant) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.$onTypingStarted.invoke(conversation, participant);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onTypingEnded(Conversation conversation, Participant participant) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            Intrinsics.checkNotNullParameter(participant, "participant");
            this.$onTypingEnded.invoke(conversation, participant);
        }

        @Override // com.twilio.conversations.ConversationListener
        public void onSynchronizationChanged(Conversation conversation) {
            Intrinsics.checkNotNullParameter(conversation, "conversation");
            this.$onSynchronizationChanged.invoke(conversation);
        }
    }

    public static final ConversationListener ConversationListener(Function1<? super Message, Unit> onMessageAdded, Function2<? super Message, ? super Message.UpdateReason, Unit> onMessageUpdated, Function1<? super Message, Unit> onMessageDeleted, Function1<? super Participant, Unit> onParticipantAdded, Function2<? super Participant, ? super Participant.UpdateReason, Unit> onParticipantUpdated, Function1<? super Participant, Unit> onParticipantDeleted, Function2<? super Conversation, ? super Participant, Unit> onTypingStarted, Function2<? super Conversation, ? super Participant, Unit> onTypingEnded, Function1<? super Conversation, Unit> onSynchronizationChanged) {
        Intrinsics.checkNotNullParameter(onMessageAdded, "onMessageAdded");
        Intrinsics.checkNotNullParameter(onMessageUpdated, "onMessageUpdated");
        Intrinsics.checkNotNullParameter(onMessageDeleted, "onMessageDeleted");
        Intrinsics.checkNotNullParameter(onParticipantAdded, "onParticipantAdded");
        Intrinsics.checkNotNullParameter(onParticipantUpdated, "onParticipantUpdated");
        Intrinsics.checkNotNullParameter(onParticipantDeleted, "onParticipantDeleted");
        Intrinsics.checkNotNullParameter(onTypingStarted, "onTypingStarted");
        Intrinsics.checkNotNullParameter(onTypingEnded, "onTypingEnded");
        Intrinsics.checkNotNullParameter(onSynchronizationChanged, "onSynchronizationChanged");
        return new C4335510(onMessageAdded, onMessageUpdated, onMessageDeleted, onParticipantAdded, onParticipantUpdated, onParticipantDeleted, onTypingStarted, onTypingEnded, onSynchronizationChanged);
    }

    public static final ConversationListener addListener(Conversation conversation, Function1<? super Message, Unit> onMessageAdded, Function2<? super Message, ? super Message.UpdateReason, Unit> onMessageUpdated, Function1<? super Message, Unit> onMessageDeleted, Function1<? super Participant, Unit> onParticipantAdded, Function2<? super Participant, ? super Participant.UpdateReason, Unit> onParticipantUpdated, Function1<? super Participant, Unit> onParticipantDeleted, Function2<? super Conversation, ? super Participant, Unit> onTypingStarted, Function2<? super Conversation, ? super Participant, Unit> onTypingEnded, Function1<? super Conversation, Unit> onSynchronizationChanged) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        Intrinsics.checkNotNullParameter(onMessageAdded, "onMessageAdded");
        Intrinsics.checkNotNullParameter(onMessageUpdated, "onMessageUpdated");
        Intrinsics.checkNotNullParameter(onMessageDeleted, "onMessageDeleted");
        Intrinsics.checkNotNullParameter(onParticipantAdded, "onParticipantAdded");
        Intrinsics.checkNotNullParameter(onParticipantUpdated, "onParticipantUpdated");
        Intrinsics.checkNotNullParameter(onParticipantDeleted, "onParticipantDeleted");
        Intrinsics.checkNotNullParameter(onTypingStarted, "onTypingStarted");
        Intrinsics.checkNotNullParameter(onTypingEnded, "onTypingEnded");
        Intrinsics.checkNotNullParameter(onSynchronizationChanged, "onSynchronizationChanged");
        C4335510 c4335510 = new C4335510(onMessageAdded, onMessageUpdated, onMessageDeleted, onParticipantAdded, onParticipantUpdated, onParticipantDeleted, onTypingStarted, onTypingEnded, onSynchronizationChanged);
        conversation.addListener(c4335510);
        return c4335510;
    }

    public static /* synthetic */ CallbackListener CallbackListener$default(Function1 onSuccess, Function1 onError, int i, Object obj) {
        if ((i & 1) != 0) {
            onSuccess = new Function1() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.CallbackListener.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27190invoke(Object obj2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    m27190invoke(obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onError = new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.CallbackListener.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ErrorInfo it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                    invoke2(errorInfo);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return new C433533(onSuccess, onError);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m3636d2 = {"com/twilio/conversations/extensions/ConversationsExtensionsKt$CallbackListener$3", "Lcom/twilio/conversations/CallbackListener;", "onSuccess", "", "result", "(Ljava/lang/Object;)V", "onError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$CallbackListener$3 */
    public static final class C433533<T> implements CallbackListener<T> {
        final /* synthetic */ Function1<ErrorInfo, Unit> $onError;
        final /* synthetic */ Function1<T, Unit> $onSuccess;

        /* JADX WARN: Multi-variable type inference failed */
        public C433533(Function1<? super T, Unit> function1, Function1<? super ErrorInfo, Unit> function12) {
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @Override // com.twilio.conversations.CallbackListener
        public void onSuccess(T result) {
            this.$onSuccess.invoke(result);
        }

        @Override // com.twilio.conversations.CallbackListener
        public void onError(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.$onError.invoke(errorInfo);
        }
    }

    public static final <T> CallbackListener<T> CallbackListener(Function1<? super T, Unit> onSuccess, Function1<? super ErrorInfo, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return new C433533(onSuccess, onError);
    }

    public static /* synthetic */ StatusListener StatusListener$default(Function0 onSuccess, Function1 onError, int i, Object obj) {
        if ((i & 1) != 0) {
            onSuccess = new Function0<Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.StatusListener.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onError = new Function1<ErrorInfo, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt.StatusListener.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ErrorInfo it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ErrorInfo errorInfo) {
                    invoke2(errorInfo);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return new C433843(onSuccess, onError);
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m3636d2 = {"com/twilio/conversations/extensions/ConversationsExtensionsKt$StatusListener$3", "Lcom/twilio/conversations/StatusListener;", "onSuccess", "", "onError", "errorInfo", "Lcom/twilio/util/ErrorInfo;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE)
    /* renamed from: com.twilio.conversations.extensions.ConversationsExtensionsKt$StatusListener$3 */
    public static final class C433843 implements StatusListener {
        final /* synthetic */ Function1<ErrorInfo, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;

        /* JADX WARN: Multi-variable type inference failed */
        public C433843(Function0<Unit> function0, Function1<? super ErrorInfo, Unit> function1) {
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // com.twilio.conversations.StatusListener
        public void onSuccess() {
            this.$onSuccess.invoke();
        }

        @Override // com.twilio.conversations.StatusListener
        public void onError(ErrorInfo errorInfo) {
            Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
            this.$onError.invoke(errorInfo);
        }
    }

    public static final StatusListener StatusListener(Function0<Unit> onSuccess, Function1<? super ErrorInfo, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return new C433843(onSuccess, onError);
    }

    public static final Object createConversationsClient(Context context, String str, ConversationsClient.Properties properties, Continuation<? super ConversationsClient> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ConversationsClient.create(context, str, properties, new CallbackListener<ConversationsClient>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$createConversationsClient$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(ConversationsClient result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<ConversationsClient> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object registerFCMToken(ConversationsClient conversationsClient, ConversationsClient.FCMToken fCMToken, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversationsClient.registerFCMToken(fCMToken, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$registerFCMToken$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                synchronized (cancellableContinuation) {
                    if (cancellableContinuation.isActive()) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
                    }
                }
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                synchronized (cancellableContinuation) {
                    if (cancellableContinuation.isActive()) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object createConversation(ConversationsClient conversationsClient, String str, Continuation<? super Conversation> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversationsClient.createConversation(str, new CallbackListener<Conversation>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$createConversation$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Conversation result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Conversation> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object build(ConversationsClient.ConversationBuilder conversationBuilder, Continuation<? super Conversation> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversationBuilder.build(new CallbackListener<Conversation>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$build$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Conversation result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Conversation> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getConversation(ConversationsClient conversationsClient, String str, Continuation<? super Conversation> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversationsClient.getConversation(str, new CallbackListener<Conversation>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getConversation$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Conversation result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Conversation> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrlsForMedia(ConversationsClient conversationsClient, List<? extends Media> list, Continuation<? super Map<String, String>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrlsForMedia = conversationsClient.getTemporaryContentUrlsForMedia(list, new CallbackListener<Map<String, String>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMedia$lambda$10$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Map<String, String> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(temporaryContentUrlsForMedia, "getTemporaryContentUrlsForMedia(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMedia$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrlsForMedia.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrlsForMediaSids(ConversationsClient conversationsClient, List<String> list, Continuation<? super Map<String, String>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrlsForMediaSids = conversationsClient.getTemporaryContentUrlsForMediaSids(list, new CallbackListener<Map<String, String>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMediaSids$lambda$13$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Map<String, String> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(temporaryContentUrlsForMediaSids, "getTemporaryContentUrlsForMediaSids(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMediaSids$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrlsForMediaSids.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getContentTemplates(ConversationsClient conversationsClient, Continuation<? super List<ContentTemplate>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken contentTemplates = conversationsClient.getContentTemplates(new CallbackListener<List<ContentTemplate>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getContentTemplates$lambda$16$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(List<ContentTemplate> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(contentTemplates, "getContentTemplates(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getContentTemplates$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                contentTemplates.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object destroy(Conversation conversation, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.destroy(new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$destroy$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object join(Conversation conversation, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.join(new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$join$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object leave(Conversation conversation, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.leave(new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$leave$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object getUnreadMessagesCount(Conversation conversation, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.getUnreadMessagesCount(new CallbackListener<Long>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getUnreadMessagesCount$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Long count) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(count));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object setAttributes(Conversation conversation, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.setAttributes(attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAttributes$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object setAttributes(Message message, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        message.setAttributes(attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAttributes$4$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object setAttributes(Participant participant, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        participant.setAttributes(attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAttributes$6$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object getAndSubscribeUser(Participant participant, Continuation<? super User> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        participant.getAndSubscribeUser(new CallbackListener<User>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getAndSubscribeUser$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(user));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<User> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object remove(Participant participant, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        participant.remove(new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$remove$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object setAttributes(User user, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        user.setAttributes(attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAttributes$8$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object setFriendlyName(User user, String str, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        user.setFriendlyName(str, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setFriendlyName$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object getLastMessages(Conversation conversation, int i, Continuation<? super List<Message>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.getLastMessages(i, new CallbackListener<List<Message>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getLastMessages$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(List<Message> messageList) {
                Intrinsics.checkNotNullParameter(messageList, "messageList");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(messageList));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<List<Message>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getMessagesBefore(Conversation conversation, long j, int i, Continuation<? super List<Message>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.getMessagesBefore(j, i, new CallbackListener<List<Message>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getMessagesBefore$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(List<Message> messageList) {
                Intrinsics.checkNotNullParameter(messageList, "messageList");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(messageList));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<List<Message>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getMessagesAfter(Conversation conversation, long j, int i, Continuation<? super List<Message>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.getMessagesAfter(j, i, new CallbackListener<List<Message>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getMessagesAfter$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(List<Message> messageList) {
                Intrinsics.checkNotNullParameter(messageList, "messageList");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(messageList));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<List<Message>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getMessageByIndex(Conversation conversation, long j, Continuation<? super Message> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.getMessageByIndex(j, new CallbackListener<Message>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getMessageByIndex$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Message message) {
                Intrinsics.checkNotNullParameter(message, "message");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(message));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Message> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object setLastReadMessageIndex(Conversation conversation, long j, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.setLastReadMessageIndex(j, new CallbackListener<Long>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setLastReadMessageIndex$2$1
            @Override // com.twilio.conversations.CallbackListener
            public /* bridge */ /* synthetic */ void onSuccess(Long l) {
                onSuccess(l.longValue());
            }

            public void onSuccess(long unreadMessagesCount) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Long.valueOf(unreadMessagesCount)));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object advanceLastReadMessageIndex(Conversation conversation, long j, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.advanceLastReadMessageIndex(j, new CallbackListener<Long>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$advanceLastReadMessageIndex$2$1
            @Override // com.twilio.conversations.CallbackListener
            public /* bridge */ /* synthetic */ void onSuccess(Long l) {
                onSuccess(l.longValue());
            }

            public void onSuccess(long unreadMessagesCount) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Long.valueOf(unreadMessagesCount)));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object setAllMessagesRead(Conversation conversation, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.setAllMessagesRead(new CallbackListener<Long>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAllMessagesRead$2$1
            @Override // com.twilio.conversations.CallbackListener
            public /* bridge */ /* synthetic */ void onSuccess(Long l) {
                onSuccess(l.longValue());
            }

            public void onSuccess(long unreadMessagesCount) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Long.valueOf(unreadMessagesCount)));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object setAllMessagesUnread(Conversation conversation, Continuation<? super Long> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.setAllMessagesUnread(new CallbackListener<Long>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$setAllMessagesUnread$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Long unreadMessagesCount) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(unreadMessagesCount));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Long> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object updateMessageBody(Message message, String str, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        message.updateBody(str, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$updateMessageBody$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object getDetailedDeliveryReceiptList(Message message, Continuation<? super List<? extends DetailedDeliveryReceipt>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        message.getDetailedDeliveryReceiptList(new CallbackListener<List<? extends DetailedDeliveryReceipt>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getDetailedDeliveryReceiptList$2$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(List<? extends DetailedDeliveryReceipt> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<List<? extends DetailedDeliveryReceipt>> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrlsForMedia(Message message, List<? extends Media> list, Continuation<? super Map<String, String>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrlsForMedia = message.getTemporaryContentUrlsForMedia(list, new CallbackListener<Map<String, String>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMedia$lambda$41$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Map<String, String> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(temporaryContentUrlsForMedia, "getTemporaryContentUrlsForMedia(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMedia$4$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrlsForMedia.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrlsForMediaSids(Message message, List<String> list, Continuation<? super Map<String, String>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrlsForMediaSids = message.getTemporaryContentUrlsForMediaSids(list, new CallbackListener<Map<String, String>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMediaSids$lambda$44$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Map<String, String> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(temporaryContentUrlsForMediaSids, "getTemporaryContentUrlsForMediaSids(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForMediaSids$4$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrlsForMediaSids.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrlsForAttachedMedia(Message message, Continuation<? super Map<String, String>> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrlsForAttachedMedia = message.getTemporaryContentUrlsForAttachedMedia(new CallbackListener<Map<String, String>>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForAttachedMedia$lambda$47$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Map<String, String> result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Intrinsics.checkNotNullExpressionValue(temporaryContentUrlsForAttachedMedia, "getTemporaryContentUrlsForAttachedMedia(...)");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrlsForAttachedMedia$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrlsForAttachedMedia.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getContentData(Message message, Continuation<? super ContentData> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken contentData = message.getContentData(new CallbackListener<ContentData>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getContentData$lambda$50$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(ContentData result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getContentData$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                contentData.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object addParticipantByIdentity(Conversation conversation, String str, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.addParticipantByIdentity(str, attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$addParticipantByIdentity$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object addParticipantByAddress(Conversation conversation, String str, String str2, Attributes attributes, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.addParticipantByAddress(str, str2, attributes, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$addParticipantByAddress$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object removeParticipantByIdentity(Conversation conversation, String str, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.removeParticipantByIdentity(str, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$removeParticipantByIdentity$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object removeParticipant(Conversation conversation, Participant participant, Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        conversation.removeParticipant(participant, new StatusListener() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$removeParticipant$2$1
            @Override // com.twilio.conversations.StatusListener
            public void onSuccess() {
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(Unit.INSTANCE));
            }

            @Override // com.twilio.conversations.StatusListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static final Object buildAndSend(Conversation.MessageBuilder messageBuilder, Continuation<? super Message> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken cancellationTokenBuildAndSend = messageBuilder.buildAndSend(new CallbackListener<Message>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$buildAndSend$lambda$57$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Message result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$buildAndSend$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationTokenBuildAndSend.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object send(Conversation.UnsentMessage unsentMessage, Continuation<? super Message> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken cancellationTokenSend = unsentMessage.send(new CallbackListener<Message>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$send$lambda$60$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(Message result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$send$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                cancellationTokenSend.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final Object getTemporaryContentUrl(Media media, Continuation<? super String> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellationToken temporaryContentUrl = media.getTemporaryContentUrl(new CallbackListener<String>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrl$lambda$63$$inlined$CallbackListener$1
            @Override // com.twilio.conversations.CallbackListener
            public void onSuccess(String result) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(result));
            }

            @Override // com.twilio.conversations.CallbackListener
            public void onError(ErrorInfo errorInfo) {
                Intrinsics.checkNotNullParameter(errorInfo, "errorInfo");
                CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new TwilioException(errorInfo, null, 2, null))));
            }
        });
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.twilio.conversations.extensions.ConversationsExtensionsKt$getTemporaryContentUrl$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                temporaryContentUrl.cancel();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
