package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.Bundle2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R$dimen;
import com.stripe.android.R$id;
import com.stripe.android.R$string;
import com.stripe.android.R$styleable;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.databinding.StripeCardMultilineWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.Interfaces3;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardMultilineWidget.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0096\u0001\b\u0007\u0018\u0000 ó\u00012\u00020\u00012\u00020\u0002:\u0002ó\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u0019\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u000f2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b*\u0010)J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b+\u0010)J\u0019\u0010,\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b,\u0010)J\u001b\u0010/\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0-¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000fH\u0014¢\u0006\u0004\b1\u0010\u0015J\u000f\u00102\u001a\u00020\u000fH\u0014¢\u0006\u0004\b2\u0010\u0015J\u0019\u00104\u001a\u00020\u000f2\b\u0010'\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\t¢\u0006\u0004\b>\u0010\u000eJ\u000f\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020?H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bF\u0010\u0011J\u0019\u0010H\u001a\u00020\u000f2\b\u0010G\u001a\u0004\u0018\u00010:H\u0007¢\u0006\u0004\bH\u0010=J\u0017\u0010J\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010:¢\u0006\u0004\bJ\u0010=J\u0019\u0010K\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\bK\u0010%J\u0015\u0010L\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bL\u0010\u0011J\u0019\u0010N\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bN\u0010=J\u0019\u0010P\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\bP\u0010=J\u0019\u0010S\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u00020\u000f2\b\u0010U\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bV\u0010TJ\u0019\u0010X\u001a\u00020\u000f2\b\u0010W\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bX\u0010TJ\u0019\u0010Z\u001a\u00020\u000f2\b\u0010Y\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bZ\u0010TJ\u000f\u0010[\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010\u000eJ\u0017\u0010]\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020\tH\u0016¢\u0006\u0004\b]\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010^R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010c\u001a\u00020b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010h\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010m\u001a\u00020l8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001a\u0010r\u001a\u00020q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010w\u001a\u00020v8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR\u001a\u0010{\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0006X\u0087\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0086\u0001\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R \u0010\u008b\u0001\u001a\u00030\u0084\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u0086\u0001\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010^R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001b\u0010\u009b\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009a\u0001R&\u0010\u009c\u0001\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010^\u001a\u0005\b\u009d\u0001\u0010\u000e\"\u0005\b\u009e\u0001\u0010\u0011R1\u0010¤\u0001\u001a\u00020\t2\u0007\u0010\u009f\u0001\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0006\b \u0001\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010\u000e\"\u0005\b£\u0001\u0010\u0011R,\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R5\u0010\u00ad\u0001\u001a\u0004\u0018\u00010:2\t\u0010¬\u0001\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u00ad\u0001\u0010\u009a\u0001\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0005\b°\u0001\u0010=R6\u0010±\u0001\u001a\u00020\t2\u0007\u0010¬\u0001\u001a\u00020\t8\u0000@@X\u0081\u000e¢\u0006\u001c\n\u0005\b±\u0001\u0010^\u0012\u0005\b´\u0001\u0010\u0015\u001a\u0005\b²\u0001\u0010\u000e\"\u0005\b³\u0001\u0010\u0011R6\u0010¹\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bµ\u0001\u0010¡\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0005\b¸\u0001\u0010%R\u0018\u0010º\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bº\u0001\u0010^R2\u0010¿\u0001\u001a\u00020&2\u0007\u0010\u009f\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\b»\u0001\u0010¡\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0005\b¾\u0001\u0010)R2\u0010Ã\u0001\u001a\u00020&2\u0007\u0010\u009f\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bÀ\u0001\u0010¡\u0001\u001a\u0006\bÁ\u0001\u0010½\u0001\"\u0005\bÂ\u0001\u0010)R2\u0010Ç\u0001\u001a\u00020&2\u0007\u0010\u009f\u0001\u001a\u00020&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bÄ\u0001\u0010¡\u0001\u001a\u0006\bÅ\u0001\u0010½\u0001\"\u0005\bÆ\u0001\u0010)R6\u0010Ë\u0001\u001a\u0004\u0018\u00010&2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010&8@@@X\u0080\u008e\u0002¢\u0006\u0017\n\u0006\bÈ\u0001\u0010¡\u0001\u001a\u0006\bÉ\u0001\u0010½\u0001\"\u0005\bÊ\u0001\u0010)R\u001a\u0010Ï\u0001\u001a\u0005\u0018\u00010Ì\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001R\u001e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u001e0Ð\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001f\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Õ\u00010Ô\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0013\u0010\u001b\u001a\u00020\u001a8F¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u001a\u0010Þ\u0001\u001a\u0005\u0018\u00010Û\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001R\u001a\u0010â\u0001\u001a\u0005\u0018\u00010ß\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u0017\u0010æ\u0001\u001a\u0005\u0018\u00010ã\u00018F¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001R\u0017\u0010ê\u0001\u001a\u0005\u0018\u00010ç\u00018F¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u001a\u0010î\u0001\u001a\u0005\u0018\u00010ë\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u001a\u0010ò\u0001\u001a\u0005\u0018\u00010ï\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001¨\u0006ô\u0001"}, m3636d2 = {"Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "shouldShowPostalCode", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "isPostalRequired", "()Z", "", "adjustViewForPostalCodeAttribute", "(Z)V", "checkAttributeSet", "(Landroid/util/AttributeSet;)V", "flipToCvcIconIfNotFinished", "()V", "initDeleteEmptyListeners", "initFocusChangeListeners", "initTextInputLayoutErrorHandlers", "updateBrandUi", "Lcom/stripe/android/model/CardBrand;", "brand", "updateCvc", "(Lcom/stripe/android/model/CardBrand;)V", "Lcom/stripe/android/view/StripeEditText;", "editText", "iconResourceId", "updateEndIcon", "(Lcom/stripe/android/view/StripeEditText;I)V", "resId", "setExpirationDatePlaceholderRes", "(Ljava/lang/Integer;)V", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "listener", "setCardNumberErrorListener", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "setExpirationDateErrorListener", "setCvcErrorListener", "setPostalCodeErrorListener", "", "preferredNetworks", "setPreferredNetworks", "(Ljava/util/List;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/stripe/android/view/CardInputListener;", "setCardInputListener", "(Lcom/stripe/android/view/CardInputListener;)V", "Lcom/stripe/android/view/CardValidCallback;", "callback", "setCardValidCallback", "(Lcom/stripe/android/view/CardValidCallback;)V", "", "cardHint", "setCardHint", "(Ljava/lang/String;)V", "validateAllFields", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "hasWindowFocus", "onWindowFocusChanged", "cvcPlaceholderText", "setCvcPlaceholderText", "cvcLabel", "setCvcLabel", "setCvcIcon", "setShouldShowPostalCode", "cardNumber", "setCardNumber", "cvcCode", "setCvcCode", "Landroid/text/TextWatcher;", "cardNumberTextWatcher", "setCardNumberTextWatcher", "(Landroid/text/TextWatcher;)V", "expiryDateTextWatcher", "setExpiryDateTextWatcher", "cvcNumberTextWatcher", "setCvcNumberTextWatcher", "postalCodeTextWatcher", "setPostalCodeTextWatcher", "isEnabled", "enabled", "setEnabled", "Z", "Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;", "viewBinding", "Lcom/stripe/android/databinding/StripeCardMultilineWidgetBinding;", "Lcom/stripe/android/view/CardNumberEditText;", "cardNumberEditText", "Lcom/stripe/android/view/CardNumberEditText;", "getCardNumberEditText", "()Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/CardBrandView;", "cardBrandView", "Lcom/stripe/android/view/CardBrandView;", "getCardBrandView$payments_core_release", "()Lcom/stripe/android/view/CardBrandView;", "Lcom/stripe/android/view/ExpiryDateEditText;", "expiryDateEditText", "Lcom/stripe/android/view/ExpiryDateEditText;", "getExpiryDateEditText", "()Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/CvcEditText;", "cvcEditText", "Lcom/stripe/android/view/CvcEditText;", "getCvcEditText", "()Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeEditText", "Lcom/stripe/android/view/PostalCodeEditText;", "getPostalCodeEditText$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText;", "secondRowLayout", "Landroid/widget/LinearLayout;", "getSecondRowLayout", "()Landroid/widget/LinearLayout;", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "cardNumberTextInputLayout", "Lcom/stripe/android/view/CardNumberTextInputLayout;", "getCardNumberTextInputLayout", "()Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "expiryTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getExpiryTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "cvcInputLayout", "getCvcInputLayout", "postalInputLayout", "getPostalInputLayout$payments_core_release", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "lifecycleDelegate", "Lcom/stripe/android/view/LifecycleOwnerDelegate;", "textInputLayouts", "Ljava/util/List;", "cardInputListener", "Lcom/stripe/android/view/CardInputListener;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "com/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1", "cardValidTextWatcher", "Lcom/stripe/android/view/CardMultilineWidget$cardValidTextWatcher$1;", "customCvcLabel", "Ljava/lang/String;", "customCvcPlaceholderText", "postalCodeRequired", "getPostalCodeRequired", "setPostalCodeRequired", "<set-?>", "usZipCodeRequired$delegate", "Lkotlin/properties/ReadWriteProperty;", "getUsZipCodeRequired", "setUsZipCodeRequired", "usZipCodeRequired", "Landroidx/lifecycle/ViewModelStoreOwner;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "value", "onBehalfOf", "getOnBehalfOf", "()Ljava/lang/String;", "setOnBehalfOf", "shouldShowErrorIcon", "getShouldShowErrorIcon$payments_core_release", "setShouldShowErrorIcon$payments_core_release", "getShouldShowErrorIcon$payments_core_release$annotations", "expirationDatePlaceholderRes$delegate", "getExpirationDatePlaceholderRes$payments_core_release", "()Ljava/lang/Integer;", "setExpirationDatePlaceholderRes$payments_core_release", "expirationDatePlaceholderRes", "showCvcIconInCvcField", "cardNumberErrorListener$delegate", "getCardNumberErrorListener$payments_core_release", "()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "setCardNumberErrorListener$payments_core_release", "cardNumberErrorListener", "expirationDateErrorListener$delegate", "getExpirationDateErrorListener$payments_core_release", "setExpirationDateErrorListener$payments_core_release", "expirationDateErrorListener", "cvcErrorListener$delegate", "getCvcErrorListener$payments_core_release", "setCvcErrorListener$payments_core_release", "cvcErrorListener", "postalCodeErrorListener$delegate", "getPostalCodeErrorListener$payments_core_release", "setPostalCodeErrorListener$payments_core_release", "postalCodeErrorListener", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getExpirationDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "expirationDate", "", "getAllFields", "()Ljava/util/Collection;", "allFields", "", "Lcom/stripe/android/view/CardValidCallback$Fields;", "getInvalidFields$payments_core_release", "()Ljava/util/Set;", "invalidFields", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getPaymentMethodCard", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "paymentMethodCard", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getPaymentMethodBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "paymentMethodBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "getPaymentMethodBillingDetailsBuilder", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "paymentMethodBillingDetailsBuilder", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "validatedCardNumber", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardMultilineWidget extends LinearLayout {
    private final CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final CardNumberEditText cardNumberEditText;

    /* renamed from: cardNumberErrorListener$delegate, reason: from kotlin metadata */
    private final Interfaces3 cardNumberErrorListener;
    private final CardNumberTextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardMultilineWidget2 cardValidTextWatcher;
    private String customCvcLabel;
    private String customCvcPlaceholderText;
    private final CvcEditText cvcEditText;

    /* renamed from: cvcErrorListener$delegate, reason: from kotlin metadata */
    private final Interfaces3 cvcErrorListener;
    private final TextInputLayout cvcInputLayout;

    /* renamed from: expirationDateErrorListener$delegate, reason: from kotlin metadata */
    private final Interfaces3 expirationDateErrorListener;

    /* renamed from: expirationDatePlaceholderRes$delegate, reason: from kotlin metadata */
    private final Interfaces3 expirationDatePlaceholderRes;
    private final ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryTextInputLayout;
    private boolean isEnabled;
    private final LifecycleOwnerDelegate lifecycleDelegate;
    private String onBehalfOf;
    private final PostalCodeEditText postalCodeEditText;

    /* renamed from: postalCodeErrorListener$delegate, reason: from kotlin metadata */
    private final Interfaces3 postalCodeErrorListener;
    private boolean postalCodeRequired;
    private final TextInputLayout postalInputLayout;
    private final LinearLayout secondRowLayout;
    private boolean shouldShowErrorIcon;
    private boolean shouldShowPostalCode;
    private boolean showCvcIconInCvcField;
    private final List<TextInputLayout> textInputLayouts;

    /* renamed from: usZipCodeRequired$delegate, reason: from kotlin metadata */
    private final Interfaces3 usZipCodeRequired;
    private final StripeCardMultilineWidgetBinding viewBinding;
    private ViewModelStoreOwner viewModelStoreOwner;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDatePlaceholderRes", "getExpirationDatePlaceholderRes$payments_core_release()Ljava/lang/Integer;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cardNumberErrorListener", "getCardNumberErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "expirationDateErrorListener", "getExpirationDateErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "cvcErrorListener", "getCvcErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CardMultilineWidget.class, "postalCodeErrorListener", "getPostalCodeErrorListener$payments_core_release()Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardMultilineWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    public /* synthetic */ CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? true : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1] */
    @JvmOverloads
    public CardMultilineWidget(Context context, AttributeSet attributeSet, int i, boolean z) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shouldShowPostalCode = z;
        StripeCardMultilineWidgetBinding stripeCardMultilineWidgetBindingInflate = StripeCardMultilineWidgetBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeCardMultilineWidgetBindingInflate, "inflate(...)");
        this.viewBinding = stripeCardMultilineWidgetBindingInflate;
        CardNumberEditText etCardNumber = stripeCardMultilineWidgetBindingInflate.etCardNumber;
        Intrinsics.checkNotNullExpressionValue(etCardNumber, "etCardNumber");
        this.cardNumberEditText = etCardNumber;
        CardBrandView cardBrandView = stripeCardMultilineWidgetBindingInflate.cardBrandView;
        Intrinsics.checkNotNullExpressionValue(cardBrandView, "cardBrandView");
        this.cardBrandView = cardBrandView;
        ExpiryDateEditText etExpiry = stripeCardMultilineWidgetBindingInflate.etExpiry;
        Intrinsics.checkNotNullExpressionValue(etExpiry, "etExpiry");
        this.expiryDateEditText = etExpiry;
        CvcEditText etCvc = stripeCardMultilineWidgetBindingInflate.etCvc;
        Intrinsics.checkNotNullExpressionValue(etCvc, "etCvc");
        this.cvcEditText = etCvc;
        PostalCodeEditText etPostalCode = stripeCardMultilineWidgetBindingInflate.etPostalCode;
        Intrinsics.checkNotNullExpressionValue(etPostalCode, "etPostalCode");
        this.postalCodeEditText = etPostalCode;
        LinearLayout secondRowLayout = stripeCardMultilineWidgetBindingInflate.secondRowLayout;
        Intrinsics.checkNotNullExpressionValue(secondRowLayout, "secondRowLayout");
        this.secondRowLayout = secondRowLayout;
        CardNumberTextInputLayout tlCardNumber = stripeCardMultilineWidgetBindingInflate.tlCardNumber;
        Intrinsics.checkNotNullExpressionValue(tlCardNumber, "tlCardNumber");
        this.cardNumberTextInputLayout = tlCardNumber;
        TextInputLayout tlExpiry = stripeCardMultilineWidgetBindingInflate.tlExpiry;
        Intrinsics.checkNotNullExpressionValue(tlExpiry, "tlExpiry");
        this.expiryTextInputLayout = tlExpiry;
        TextInputLayout tlCvc = stripeCardMultilineWidgetBindingInflate.tlCvc;
        Intrinsics.checkNotNullExpressionValue(tlCvc, "tlCvc");
        this.cvcInputLayout = tlCvc;
        TextInputLayout tlPostalCode = stripeCardMultilineWidgetBindingInflate.tlPostalCode;
        Intrinsics.checkNotNullExpressionValue(tlPostalCode, "tlPostalCode");
        this.postalInputLayout = tlPostalCode;
        this.lifecycleDelegate = new LifecycleOwnerDelegate();
        List<TextInputLayout> listListOf = CollectionsKt.listOf((Object[]) new TextInputLayout[]{tlCardNumber, tlExpiry, tlCvc, tlPostalCode});
        this.textInputLayouts = listListOf;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$cardValidTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                CardValidCallback cardValidCallback = this.this$0.cardValidCallback;
                if (cardValidCallback != null) {
                    cardValidCallback.onInputChanged(this.this$0.getInvalidFields$payments_core_release().isEmpty(), this.this$0.getInvalidFields$payments_core_release());
                }
            }
        };
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.usZipCodeRequired = new ObservableProperty<Boolean>(bool) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.getClass();
                if (zBooleanValue) {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.f6427US);
                } else {
                    this.getPostalCodeEditText().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
            }
        };
        final Integer numValueOf = Integer.valueOf(R$string.stripe_expiry_date_hint);
        this.expirationDatePlaceholderRes = new ObservableProperty<Integer>(numValueOf) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Integer oldValue, Integer newValue) throws Resources.NotFoundException {
                String string2;
                Intrinsics.checkNotNullParameter(property, "property");
                Integer num = newValue;
                TextInputLayout expiryTextInputLayout = this.getExpiryTextInputLayout();
                if (num != null) {
                    string2 = this.getResources().getString(num.intValue());
                } else {
                    string2 = null;
                }
                if (string2 == null) {
                    string2 = "";
                }
                expiryTextInputLayout.setPlaceholderText(string2);
            }
        };
        final ErrorListener errorListener = new ErrorListener(tlCardNumber);
        this.cardNumberErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$3
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCardNumberEditText().setErrorMessageListener(newValue);
            }
        };
        final ErrorListener errorListener2 = new ErrorListener(tlExpiry);
        this.expirationDateErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener2) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$4
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getExpiryDateEditText().setErrorMessageListener(newValue);
            }
        };
        final ErrorListener errorListener3 = new ErrorListener(tlCvc);
        this.cvcErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener3) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$5
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getCvcEditText().setErrorMessageListener(newValue);
            }
        };
        final ErrorListener errorListener4 = new ErrorListener(tlPostalCode);
        this.postalCodeErrorListener = new ObservableProperty<StripeEditText.ErrorMessageListener>(errorListener4) { // from class: com.stripe.android.view.CardMultilineWidget$special$$inlined$observable$6
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, StripeEditText.ErrorMessageListener oldValue, StripeEditText.ErrorMessageListener newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                this.getPostalCodeEditText().setErrorMessageListener(newValue);
            }
        };
        setOrientation(1);
        Iterator<T> it = listListOf.iterator();
        while (true) {
            ColorStateList hintTextColors = null;
            if (!it.hasNext()) {
                break;
            }
            TextInputLayout textInputLayout = (TextInputLayout) it.next();
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                hintTextColors = editText.getHintTextColors();
            }
            textInputLayout.setPlaceholderTextColor(hintTextColors);
        }
        checkAttributeSet(attributeSet);
        initTextInputLayoutErrorHandlers();
        initFocusChangeListeners();
        initDeleteEmptyListeners();
        this.cardBrandView.setTintColorInt$payments_core_release(this.cardNumberEditText.getHintTextColors().getDefaultColor());
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.2
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
                CardMultilineWidget.this.getExpiryDateEditText().requestFocus();
                CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
                if (cardInputListener != null) {
                    cardInputListener.onCardComplete();
                }
            }
        });
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) throws Resources.NotFoundException {
                invoke2(cardBrand);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand brand) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(brand, "brand");
                CardMultilineWidget.this.getCardBrandView().setBrand(brand);
                CardMultilineWidget.this.updateBrandUi();
            }
        });
        this.cardNumberEditText.setImplicitCardBrandChangeCallback$payments_core_release(new Function1<CardBrand, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CardBrand cardBrand) throws Resources.NotFoundException {
                invoke2(cardBrand);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CardBrand brand) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(brand, "brand");
                CardMultilineWidget.this.updateCvc(brand);
            }
        });
        this.cardNumberEditText.setPossibleCardBrandsCallback$payments_core_release(new Function1<List<? extends CardBrand>, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CardBrand> list) throws Resources.NotFoundException {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends CardBrand> brands) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(brands, "brands");
                CardBrand brand = CardMultilineWidget.this.getCardBrandView().getBrand();
                CardMultilineWidget.this.getCardBrandView().setPossibleBrands(brands);
                if (!brands.contains(brand)) {
                    CardMultilineWidget.this.getCardBrandView().setBrand(CardBrand.Unknown);
                }
                CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) brands);
                if (cardBrand == null) {
                    cardBrand = CardBrand.Unknown;
                }
                CardMultilineWidget.this.updateCvc(cardBrand);
            }
        });
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new Function0<Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.6
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
                CardMultilineWidget.this.getCvcEditText().requestFocus();
                CardInputListener cardInputListener = CardMultilineWidget.this.cardInputListener;
                if (cardInputListener != null) {
                    cardInputListener.onExpirationComplete();
                }
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda0
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) throws Resources.NotFoundException {
                CardMultilineWidget._init_$lambda$17(this.f$0, str);
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda1
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String str) {
                CardMultilineWidget._init_$lambda$18(this.f$0, str);
            }
        });
        adjustViewForPostalCodeAttribute(this.shouldShowPostalCode);
        CardNumberEditText.updateLengthFilter$payments_core_release$default(this.cardNumberEditText, 0, 1, null);
        updateBrandUi();
        Iterator<T> it2 = getAllFields().iterator();
        while (it2.hasNext()) {
            ((StripeEditText) it2.next()).addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardMultilineWidget$_init_$lambda$20$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) throws Resources.NotFoundException {
                    this.this$0.setShouldShowErrorIcon$payments_core_release(false);
                }
            });
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new Function1<Boolean, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool2) {
                invoke(bool2.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z2) {
                CardMultilineWidget.this.getCardNumberTextInputLayout().setLoading$payments_core_release(z2);
            }
        });
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.isEnabled = true;
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.stripe_card_form_view_text_input_layout_padding_horizontal);
        this.cardBrandView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                CardMultilineWidget._init_$lambda$21(dimensionPixelSize, this, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        });
    }

    public final CardNumberEditText getCardNumberEditText() {
        return this.cardNumberEditText;
    }

    /* renamed from: getCardBrandView$payments_core_release, reason: from getter */
    public final CardBrandView getCardBrandView() {
        return this.cardBrandView;
    }

    public final ExpiryDateEditText getExpiryDateEditText() {
        return this.expiryDateEditText;
    }

    public final CvcEditText getCvcEditText() {
        return this.cvcEditText;
    }

    /* renamed from: getPostalCodeEditText$payments_core_release, reason: from getter */
    public final PostalCodeEditText getPostalCodeEditText() {
        return this.postalCodeEditText;
    }

    public final LinearLayout getSecondRowLayout() {
        return this.secondRowLayout;
    }

    public final CardNumberTextInputLayout getCardNumberTextInputLayout() {
        return this.cardNumberTextInputLayout;
    }

    public final TextInputLayout getExpiryTextInputLayout() {
        return this.expiryTextInputLayout;
    }

    public final TextInputLayout getCvcInputLayout() {
        return this.cvcInputLayout;
    }

    /* renamed from: getPostalInputLayout$payments_core_release, reason: from getter */
    public final TextInputLayout getPostalInputLayout() {
        return this.postalInputLayout;
    }

    public final Set<CardValidCallback.Fields> getInvalidFields$payments_core_release() {
        String postalCode$payments_core_release;
        CardValidCallback.Fields fields = CardValidCallback.Fields.Number;
        CardValidCallback.Fields fields2 = null;
        if (getValidatedCardNumber$payments_core_release() != null) {
            fields = null;
        }
        CardValidCallback.Fields fields3 = CardValidCallback.Fields.Expiry;
        if (getExpirationDate() != null) {
            fields3 = null;
        }
        CardValidCallback.Fields fields4 = CardValidCallback.Fields.Cvc;
        if (this.cvcEditText.getCvc$payments_core_release() != null) {
            fields4 = null;
        }
        CardValidCallback.Fields fields5 = CardValidCallback.Fields.Postal;
        if (isPostalRequired() && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release))) {
            fields2 = fields5;
        }
        return CollectionsKt.toSet(CollectionsKt.listOfNotNull((Object[]) new CardValidCallback.Fields[]{fields, fields3, fields4, fields2}));
    }

    public final /* synthetic */ CardBrand getBrand() {
        return this.cardBrandView.getBrand();
    }

    public final boolean getPostalCodeRequired() {
        return this.postalCodeRequired;
    }

    public final void setPostalCodeRequired(boolean z) {
        this.postalCodeRequired = z;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setUsZipCodeRequired(boolean z) {
        this.usZipCodeRequired.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final boolean isPostalRequired() {
        return (this.postalCodeRequired || getUsZipCodeRequired()) && this.shouldShowPostalCode;
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number = cardParams.getNumber();
        String cvc = cardParams.getCvc();
        int expMonth = cardParams.getExpMonth();
        int expYear = cardParams.getExpYear();
        return new PaymentMethodCreateParams.Card(number, Integer.valueOf(expMonth), Integer.valueOf(expYear), cvc, null, cardParams.getAttribution(), this.cardBrandView.paymentMethodCreateParamsNetworks(), 16, null);
    }

    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard != null) {
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, paymentMethodCard, getPaymentMethodBillingDetails(), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
        }
        return null;
    }

    public final PaymentMethod.BillingDetails getPaymentMethodBillingDetails() {
        PaymentMethod.BillingDetails.Builder paymentMethodBillingDetailsBuilder = getPaymentMethodBillingDetailsBuilder();
        if (paymentMethodBillingDetailsBuilder != null) {
            return paymentMethodBillingDetailsBuilder.build();
        }
        return null;
    }

    public final PaymentMethod.BillingDetails.Builder getPaymentMethodBillingDetailsBuilder() {
        if (this.shouldShowPostalCode && validateAllFields()) {
            return new PaymentMethod.BillingDetails.Builder().setAddress(new Address.Builder().setPostalCode(this.postalCodeEditText.getPostalCode$payments_core_release()).build());
        }
        return null;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final void setOnBehalfOf(final String str) {
        if (Intrinsics.areEqual(this.onBehalfOf, str)) {
            return;
        }
        if (isAttachedToWindow()) {
            CardWidgetViewModel6.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2<LifecycleOwner, CardWidgetViewModel, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget$onBehalfOf$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner, CardWidgetViewModel cardWidgetViewModel) {
                    invoke2(lifecycleOwner, cardWidgetViewModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
                    Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    viewModel.setOnBehalfOf(str);
                }
            });
        }
        this.onBehalfOf = str;
    }

    public CardParams getCardParams() throws Resources.NotFoundException {
        String str = null;
        if (!validateAllFields()) {
            setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        setShouldShowErrorIcon$payments_core_release(false);
        ExpirationDate.Validated validatedDate = this.expiryDateEditText.getValidatedDate();
        if (validatedDate == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Editable text = this.cvcEditText.getText();
        String string2 = text != null ? text.toString() : null;
        Editable text2 = this.postalCodeEditText.getText();
        String string3 = text2 != null ? text2.toString() : null;
        if (!this.shouldShowPostalCode) {
            string3 = null;
        }
        CardBrand brand = getBrand();
        Set of = SetsKt.setOf("CardMultilineView");
        CardNumber.Validated validatedCardNumber$payments_core_release = getValidatedCardNumber$payments_core_release();
        String value = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.getValue() : null;
        if (value == null) {
            value = "";
        }
        String str2 = value;
        int month = validatedDate.getMonth();
        int year = validatedDate.getYear();
        Address.Builder builder = new Address.Builder();
        if (string3 != null && !StringsKt.isBlank(string3)) {
            str = string3;
        }
        return new CardParams(brand, of, str2, month, year, string2, null, builder.setPostalCode(str).build(), null, this.cardBrandView.cardParamsNetworks(), null, 1344, null);
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return this.cardNumberEditText.getValidatedCardNumber$payments_core_release();
    }

    private final ExpirationDate.Validated getExpirationDate() {
        return this.expiryDateEditText.getValidatedDate();
    }

    private final Collection<StripeEditText> getAllFields() {
        return SetsKt.setOf((Object[]) new StripeEditText[]{this.cardNumberEditText, this.expiryDateEditText, this.cvcEditText, this.postalCodeEditText});
    }

    /* renamed from: getShouldShowErrorIcon$payments_core_release, reason: from getter */
    public final boolean getShouldShowErrorIcon() {
        return this.shouldShowErrorIcon;
    }

    public final void setShouldShowErrorIcon$payments_core_release(boolean z) throws Resources.NotFoundException {
        boolean z2 = this.shouldShowErrorIcon != z;
        this.shouldShowErrorIcon = z;
        if (z2) {
            updateBrandUi();
        }
    }

    public final Integer getExpirationDatePlaceholderRes$payments_core_release() {
        return (Integer) this.expirationDatePlaceholderRes.getValue(this, $$delegatedProperties[1]);
    }

    public final void setExpirationDatePlaceholderRes$payments_core_release(Integer num) {
        this.expirationDatePlaceholderRes.setValue(this, $$delegatedProperties[1], num);
    }

    public final void setExpirationDatePlaceholderRes(Integer resId) {
        setExpirationDatePlaceholderRes$payments_core_release(resId);
    }

    public final StripeEditText.ErrorMessageListener getCardNumberErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cardNumberErrorListener.getValue(this, $$delegatedProperties[2]);
    }

    public final void setCardNumberErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cardNumberErrorListener.setValue(this, $$delegatedProperties[2], errorMessageListener);
    }

    public final void setCardNumberErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCardNumberErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getExpirationDateErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.expirationDateErrorListener.getValue(this, $$delegatedProperties[3]);
    }

    public final void setExpirationDateErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.expirationDateErrorListener.setValue(this, $$delegatedProperties[3], errorMessageListener);
    }

    public final void setExpirationDateErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setExpirationDateErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getCvcErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.cvcErrorListener.getValue(this, $$delegatedProperties[4]);
    }

    public final void setCvcErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        Intrinsics.checkNotNullParameter(errorMessageListener, "<set-?>");
        this.cvcErrorListener.setValue(this, $$delegatedProperties[4], errorMessageListener);
    }

    public final void setCvcErrorListener(StripeEditText.ErrorMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setCvcErrorListener$payments_core_release(listener);
    }

    public final StripeEditText.ErrorMessageListener getPostalCodeErrorListener$payments_core_release() {
        return (StripeEditText.ErrorMessageListener) this.postalCodeErrorListener.getValue(this, $$delegatedProperties[5]);
    }

    public final void setPostalCodeErrorListener$payments_core_release(StripeEditText.ErrorMessageListener errorMessageListener) {
        this.postalCodeErrorListener.setValue(this, $$delegatedProperties[5], errorMessageListener);
    }

    public final void setPostalCodeErrorListener(StripeEditText.ErrorMessageListener listener) {
        setPostalCodeErrorListener$payments_core_release(listener);
    }

    public final void setPreferredNetworks(List<? extends CardBrand> preferredNetworks) {
        Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
        this.cardBrandView.setMerchantPreferredNetworks(preferredNetworks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$17(CardMultilineWidget this$0, String text) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(text, "text");
        CardBrand implicitCardBrandForCbc = this$0.cardNumberEditText.getImplicitCardBrandForCbc();
        if (implicitCardBrandForCbc == CardBrand.Unknown) {
            implicitCardBrandForCbc = null;
        }
        if (implicitCardBrandForCbc == null) {
            implicitCardBrandForCbc = this$0.cardNumberEditText.getCardBrand();
        }
        if (implicitCardBrandForCbc.isMaxCvc(text)) {
            this$0.updateBrandUi();
            if (this$0.shouldShowPostalCode) {
                this$0.postalCodeEditText.requestFocus();
            }
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onCvcComplete();
            }
        } else if (!this$0.showCvcIconInCvcField) {
            this$0.flipToCvcIconIfNotFinished();
        }
        this$0.cvcEditText.setShouldShowError(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$18(CardMultilineWidget this$0, String it) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.isPostalRequired() && this$0.postalCodeEditText.hasValidPostal$payments_core_release() && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onPostalCodeComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$21(int i, CardMultilineWidget this$0, View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int width = view.getWidth() + i;
        CardNumberEditText cardNumberEditText = this$0.cardNumberEditText;
        cardNumberEditText.setPadding(cardNumberEditText.getPaddingLeft(), cardNumberEditText.getPaddingTop(), width, cardNumberEditText.getPaddingBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.cvcEditText.setHint((CharSequence) null);
        this.lifecycleDelegate.initLifecycle(this);
        CardWidgetViewModel6.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2<LifecycleOwner, CardWidgetViewModel, Unit>() { // from class: com.stripe.android.view.CardMultilineWidget.onAttachedToWindow.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner, CardWidgetViewModel cardWidgetViewModel) {
                invoke2(lifecycleOwner, cardWidgetViewModel);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
                Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                if (CardMultilineWidget.this.getOnBehalfOf() != null && !Intrinsics.areEqual(viewModel.get_onBehalfOf(), CardMultilineWidget.this.getOnBehalfOf())) {
                    viewModel.setOnBehalfOf(CardMultilineWidget.this.getOnBehalfOf());
                }
                StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
                CardMultilineWidget cardMultilineWidget = CardMultilineWidget.this;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardWidgetViewModel3(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardMultilineWidget), 3, null);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.lifecycleDelegate.destroyLifecycle(this);
    }

    public void setCardInputListener(CardInputListener listener) {
        this.cardInputListener = listener;
    }

    public void setCardValidCallback(CardValidCallback callback) {
        this.cardValidCallback = callback;
        Iterator<T> it = getAllFields().iterator();
        while (it.hasNext()) {
            ((StripeEditText) it.next()).removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (callback != null) {
            Iterator<T> it2 = getAllFields().iterator();
            while (it2.hasNext()) {
                ((StripeEditText) it2.next()).addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback = this.cardValidCallback;
        if (cardValidCallback != null) {
            cardValidCallback.onInputChanged(getInvalidFields$payments_core_release().isEmpty(), getInvalidFields$payments_core_release());
        }
    }

    public void setCardHint(String cardHint) {
        Intrinsics.checkNotNullParameter(cardHint, "cardHint");
        this.cardNumberTextInputLayout.setPlaceholderText(cardHint);
    }

    public final boolean validateAllFields() {
        String postalCode$payments_core_release;
        Object next;
        boolean z = getValidatedCardNumber$payments_core_release() != null;
        boolean z2 = getExpirationDate() != null;
        boolean z3 = this.cvcEditText.getCvc$payments_core_release() != null;
        this.cardNumberEditText.setShouldShowError(!z);
        this.expiryDateEditText.setShouldShowError(!z2);
        this.cvcEditText.setShouldShowError(!z3);
        this.postalCodeEditText.setShouldShowError((this.postalCodeRequired || getUsZipCodeRequired()) && ((postalCode$payments_core_release = this.postalCodeEditText.getPostalCode$payments_core_release()) == null || StringsKt.isBlank(postalCode$payments_core_release)));
        Iterator<T> it = getAllFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((StripeEditText) next).getShouldShowError()) {
                break;
            }
        }
        StripeEditText stripeEditText = (StripeEditText) next;
        if (stripeEditText != null) {
            stripeEditText.requestFocus();
        }
        return z && z2 && z3 && !this.postalCodeEditText.getShouldShowError();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        return Bundle2.bundleOf(Tuples4.m3642to("state_remaining_state", super.onSaveInstanceState()), Tuples4.m3642to("state_on_behalf_of", this.onBehalfOf));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setOnBehalfOf(bundle.getString("state_on_behalf_of"));
            super.onRestoreInstanceState(bundle.getParcelable("state_remaining_state"));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) throws Resources.NotFoundException {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            updateBrandUi();
        }
    }

    public final void setCvcPlaceholderText(String cvcPlaceholderText) throws Resources.NotFoundException {
        this.customCvcPlaceholderText = cvcPlaceholderText;
        updateCvc$default(this, null, 1, null);
    }

    public final void setCvcLabel(String cvcLabel) throws Resources.NotFoundException {
        this.customCvcLabel = cvcLabel;
        updateCvc$default(this, null, 1, null);
    }

    public final /* synthetic */ void setCvcIcon(Integer resId) {
        if (resId != null) {
            updateEndIcon(this.cvcEditText, resId.intValue());
        }
        this.showCvcIconInCvcField = resId != null;
    }

    public final void setShouldShowPostalCode(boolean shouldShowPostalCode) {
        this.shouldShowPostalCode = shouldShowPostalCode;
        adjustViewForPostalCodeAttribute(shouldShowPostalCode);
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumberEditText.setText(cardNumber);
    }

    public void setCvcCode(String cvcCode) {
        this.cvcEditText.setText(cvcCode);
    }

    public void setCardNumberTextWatcher(TextWatcher cardNumberTextWatcher) {
        this.cardNumberEditText.addTextChangedListener(cardNumberTextWatcher);
    }

    public void setExpiryDateTextWatcher(TextWatcher expiryDateTextWatcher) {
        this.expiryDateEditText.addTextChangedListener(expiryDateTextWatcher);
    }

    public void setCvcNumberTextWatcher(TextWatcher cvcNumberTextWatcher) {
        this.cvcEditText.addTextChangedListener(cvcNumberTextWatcher);
    }

    public void setPostalCodeTextWatcher(TextWatcher postalCodeTextWatcher) {
        this.postalCodeEditText.addTextChangedListener(postalCodeTextWatcher);
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        Iterator<T> it = this.textInputLayouts.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(enabled);
        }
        this.isEnabled = enabled;
    }

    private final void adjustViewForPostalCodeAttribute(boolean shouldShowPostalCode) {
        int i;
        if (shouldShowPostalCode) {
            i = R$string.stripe_expiry_label_short;
        } else {
            i = R$string.stripe_acc_label_expiry_date;
        }
        this.expiryTextInputLayout.setHint(getResources().getString(i));
        int i2 = shouldShowPostalCode ? R$id.et_postal_code : -1;
        this.cvcEditText.setNextFocusForwardId(i2);
        this.cvcEditText.setNextFocusDownId(i2);
        int i3 = shouldShowPostalCode ? 0 : 8;
        this.postalInputLayout.setVisibility(i3);
        this.cvcEditText.setImeOptions(i3 == 8 ? 6 : 5);
        TextInputLayout textInputLayout = this.cvcInputLayout;
        ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(shouldShowPostalCode ? getResources().getDimensionPixelSize(R$dimen.stripe_add_card_expiry_middle_margin) : 0);
        textInputLayout.setLayoutParams(layoutParams2);
    }

    private final void checkAttributeSet(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] CardElement = R$styleable.CardElement;
        Intrinsics.checkNotNullExpressionValue(CardElement, "CardElement");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, CardElement, 0, 0);
        this.shouldShowPostalCode = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldShowPostalCode, this.shouldShowPostalCode);
        this.postalCodeRequired = typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldRequirePostalCode, this.postalCodeRequired);
        setUsZipCodeRequired(typedArrayObtainStyledAttributes.getBoolean(R$styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void flipToCvcIconIfNotFinished() {
        if (getBrand().isMaxCvc(this.cvcEditText.getFieldText$payments_core_release())) {
            return;
        }
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    private final void initDeleteEmptyListeners() {
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
    }

    private final void initFocusChangeListeners() {
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$29(this.f$0, view, z);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$30(this.f$0, view, z);
            }
        });
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$31(this.f$0, view, z);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardMultilineWidget$$ExternalSyntheticLambda6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardMultilineWidget.initFocusChangeListeners$lambda$32(this.f$0, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$29(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z || (cardInputListener = this$0.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$30(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z || (cardInputListener = this$0.cardInputListener) == null) {
            return;
        }
        cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$31(CardMultilineWidget this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            if (!this$0.showCvcIconInCvcField) {
                this$0.flipToCvcIconIfNotFinished();
            }
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener != null) {
                cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
                return;
            }
            return;
        }
        this$0.cardBrandView.setShouldShowErrorIcon(this$0.shouldShowErrorIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFocusChangeListeners$lambda$32(CardMultilineWidget this$0, View view, boolean z) {
        CardInputListener cardInputListener;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.shouldShowPostalCode && z && (cardInputListener = this$0.cardInputListener) != null) {
            cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
        }
    }

    private final void initTextInputLayoutErrorHandlers() {
        this.cardNumberEditText.setErrorMessageListener(getCardNumberErrorListener$payments_core_release());
        this.expiryDateEditText.setErrorMessageListener(getExpirationDateErrorListener$payments_core_release());
        this.cvcEditText.setErrorMessageListener(getCvcErrorListener$payments_core_release());
        this.postalCodeEditText.setErrorMessageListener(getPostalCodeErrorListener$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateBrandUi() throws Resources.NotFoundException {
        updateCvc$default(this, null, 1, null);
        this.cardBrandView.setShouldShowErrorIcon(this.shouldShowErrorIcon);
    }

    static /* synthetic */ void updateCvc$default(CardMultilineWidget cardMultilineWidget, CardBrand cardBrand, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 1) != 0) {
            cardBrand = cardMultilineWidget.getBrand();
        }
        cardMultilineWidget.updateCvc(cardBrand);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCvc(CardBrand brand) throws Resources.NotFoundException {
        this.cvcEditText.updateBrand$payments_core_release(brand, this.customCvcLabel, this.customCvcPlaceholderText, this.cvcInputLayout);
    }

    private final void updateEndIcon(StripeEditText editText, int iconResourceId) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), iconResourceId);
        if (drawable != null) {
            editText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* compiled from: CardMultilineWidget.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/CardMultilineWidget$Companion;", "", "()V", "CARD_MULTILINE_TOKEN", "", "STATE_ON_BEHALF_OF", "STATE_REMAINING_STATE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
