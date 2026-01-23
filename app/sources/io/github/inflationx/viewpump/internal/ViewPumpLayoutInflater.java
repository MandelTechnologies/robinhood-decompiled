package io.github.inflationx.viewpump.internal;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import io.github.inflationx.viewpump.FallbackViewCreator;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.R$id;
import io.github.inflationx.viewpump.ViewPump;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: -ViewPumpLayoutInflater.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 >2\u00020\u00012\u00020\u0002:\t>?@ABCDEFB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001b\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u001fJ+\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J)\u0010'\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J-\u00104\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b4\u0010\u001cJ#\u00104\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b4\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00105R\u0014\u00106\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00107R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00107¨\u0006G"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "Landroid/view/LayoutInflater;", "", "Lio/github/inflationx/viewpump/ViewPump;", "viewPump", "original", "Landroid/content/Context;", "newContext", "", "cloned", "<init>", "(Lio/github/inflationx/viewpump/ViewPump;Landroid/view/LayoutInflater;Landroid/content/Context;Z)V", "", "setUpLayoutFactories", "(Z)V", "setPrivateFactoryInternal", "()V", "Landroid/view/View;", "view", "", "name", "viewContext", "Landroid/util/AttributeSet;", "attrs", "createCustomViewInternal", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "parent", "superOnCreateView", "(Landroid/view/View;Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;", "(Ljava/lang/String;Landroid/util/AttributeSet;)Landroid/view/View;", "internalCloneInContext$viewpump_release", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "internalCloneInContext", "cloneInContext", "", "resource", "Landroid/view/ViewGroup;", BentoCurrencyPicker.ROOT_TEST_TAG, "attachToRoot", "inflate", "(ILandroid/view/ViewGroup;Z)Landroid/view/View;", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "(Lorg/xmlpull/v1/XmlPullParser;Landroid/view/ViewGroup;Z)Landroid/view/View;", "Landroid/view/LayoutInflater$Factory;", "factory", "setFactory", "(Landroid/view/LayoutInflater$Factory;)V", "Landroid/view/LayoutInflater$Factory2;", "factory2", "setFactory2", "(Landroid/view/LayoutInflater$Factory2;)V", "onCreateView", "Lio/github/inflationx/viewpump/ViewPump;", "isAtLeastQ", "Z", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "nameAndAttrsViewCreator", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "parentAndNameAndAttrsViewCreator", "setPrivateFactory", "storeLayoutResId", "Companion", "NameAndAttrsViewCreator", "ParentAndNameAndAttrsViewCreator", "PrivateWrapperFactory2", "PrivateWrapperFactory2ViewCreator", "WrapperFactory", "WrapperFactory2", "WrapperFactory2ViewCreator", "WrapperFactoryViewCreator", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater, reason: invalid class name */
/* loaded from: classes21.dex */
public final class ViewPumpLayoutInflater extends LayoutInflater {
    private final boolean isAtLeastQ;
    private final FallbackViewCreator nameAndAttrsViewCreator;
    private final FallbackViewCreator parentAndNameAndAttrsViewCreator;
    private boolean setPrivateFactory;
    private boolean storeLayoutResId;
    private final ViewPump viewPump;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> CLASS_PREFIX_LIST = SetsKt.setOf((Object[]) new String[]{"android.widget.", "android.webkit."});
    private static final Lazy<Field> CONSTRUCTOR_ARGS_FIELD$delegate = LazyKt.lazy(new Function0<Field>() { // from class: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2
        @Override // kotlin.jvm.functions.Function0
        public final Field invoke() throws NoSuchFieldException, SecurityException {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField == null) {
                throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!");
            }
            declaredField.setAccessible(true);
            return declaredField;
        }
    });

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPumpLayoutInflater(ViewPump viewPump, LayoutInflater original, Context newContext, boolean z) {
        super(original, newContext);
        Intrinsics.checkNotNullParameter(viewPump, "viewPump");
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(newContext, "newContext");
        this.viewPump = viewPump;
        this.isAtLeastQ = Build.VERSION.SDK_INT >= 29;
        this.nameAndAttrsViewCreator = new NameAndAttrsViewCreator(this);
        this.parentAndNameAndAttrsViewCreator = new ParentAndNameAndAttrsViewCreator(this);
        this.storeLayoutResId = viewPump.getIsStoreLayoutResId();
        setUpLayoutFactories(z);
    }

    public final LayoutInflater internalCloneInContext$viewpump_release(Context newContext) {
        Intrinsics.checkNotNullParameter(newContext, "newContext");
        return Intrinsics.areEqual(newContext, getContext()) ? this : cloneInContext(newContext);
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context newContext) {
        Intrinsics.checkNotNullParameter(newContext, "newContext");
        return new ViewPumpLayoutInflater(this.viewPump, this, newContext, true);
    }

    @Override // android.view.LayoutInflater
    public View inflate(int resource, ViewGroup root, boolean attachToRoot) {
        View viewInflate = super.inflate(resource, root, attachToRoot);
        if (viewInflate != null && this.storeLayoutResId) {
            viewInflate.setTag(R$id.viewpump_layout_res, Integer.valueOf(resource));
        }
        return viewInflate;
    }

    @Override // android.view.LayoutInflater
    public View inflate(XmlPullParser parser, ViewGroup root, boolean attachToRoot) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        setPrivateFactoryInternal();
        View viewInflate = super.inflate(parser, root, attachToRoot);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "super.inflate(parser, root, attachToRoot)");
        return viewInflate;
    }

    private final void setUpLayoutFactories(boolean cloned) {
        if (cloned) {
            return;
        }
        if (getFactory2() != null && !(getFactory2() instanceof WrapperFactory2)) {
            LayoutInflater.Factory2 factory2 = getFactory2();
            Intrinsics.checkNotNullExpressionValue(factory2, "factory2");
            setFactory2(factory2);
        }
        if (getFactory() == null || (getFactory() instanceof WrapperFactory)) {
            return;
        }
        LayoutInflater.Factory factory = getFactory();
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        setFactory(factory);
    }

    @Override // android.view.LayoutInflater
    public void setFactory(LayoutInflater.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (!(factory instanceof WrapperFactory)) {
            super.setFactory(new WrapperFactory(factory, this.viewPump));
        } else {
            super.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public void setFactory2(LayoutInflater.Factory2 factory2) {
        Intrinsics.checkNotNullParameter(factory2, "factory2");
        if (!(factory2 instanceof WrapperFactory2)) {
            super.setFactory2(new WrapperFactory2(factory2, this.viewPump));
        } else {
            super.setFactory2(factory2);
        }
    }

    private final void setPrivateFactoryInternal() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.setPrivateFactory && this.viewPump.getIsReflection()) {
            if (!(getContext() instanceof LayoutInflater.Factory2)) {
                this.setPrivateFactory = true;
                return;
            }
            Method accessibleMethod = ReflectionUtils.getAccessibleMethod(LayoutInflater.class, "setPrivateFactory");
            Object context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
            ReflectionUtils.invokeMethod(accessibleMethod, this, new PrivateWrapperFactory2((LayoutInflater.Factory2) context, this.viewPump, this));
            this.setPrivateFactory = true;
        }
    }

    @Override // android.view.LayoutInflater
    protected View onCreateView(View parent, String name, AttributeSet attrs) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        ViewPump viewPump = this.viewPump;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return viewPump.inflate(new InflateRequest(name, context, attrs, parent, this.parentAndNameAndAttrsViewCreator)).getView();
    }

    @Override // android.view.LayoutInflater
    protected View onCreateView(String name, AttributeSet attrs) throws ClassNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        ViewPump viewPump = this.viewPump;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return viewPump.inflate(new InflateRequest(name, context, attrs, null, this.nameAndAttrsViewCreator, 8, null)).getView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View createCustomViewInternal(View view, String name, Context viewContext, AttributeSet attrs) throws IllegalAccessException, IllegalArgumentException {
        if (this.viewPump.getIsCustomViewCreation() && view == null && StringsKt.indexOf$default((CharSequence) name, '.', 0, false, 6, (Object) null) > -1) {
            if (this.isAtLeastQ) {
                return internalCloneInContext$viewpump_release(viewContext).createView(name, null, attrs);
            }
            Companion companion = INSTANCE;
            Object obj = companion.getCONSTRUCTOR_ARGS_FIELD().get(this);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr[0];
            objArr[0] = viewContext;
            ReflectionUtils.setValueQuietly(companion.getCONSTRUCTOR_ARGS_FIELD(), this, objArr);
            try {
                View viewCreateView = createView(name, null, attrs);
                objArr[0] = obj2;
                ReflectionUtils.setValueQuietly(companion.getCONSTRUCTOR_ARGS_FIELD(), this, objArr);
                return viewCreateView;
            } catch (ClassNotFoundException unused) {
                objArr[0] = obj2;
                ReflectionUtils.setValueQuietly(INSTANCE.getCONSTRUCTOR_ARGS_FIELD(), this, objArr);
            } catch (Throwable th) {
                objArr[0] = obj2;
                ReflectionUtils.setValueQuietly(INSTANCE.getCONSTRUCTOR_ARGS_FIELD(), this, objArr);
                throw th;
            }
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View superOnCreateView(View parent, String name, AttributeSet attrs) {
        try {
            return super.onCreateView(parent, name, attrs);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View superOnCreateView(String name, AttributeSet attrs) {
        try {
            return super.onCreateView(name, attrs);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$ParentAndNameAndAttrsViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "inflater", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "(Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;)V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$ParentAndNameAndAttrsViewCreator */
    private static final class ParentAndNameAndAttrsViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;

        public ParentAndNameAndAttrsViewCreator(ViewPumpLayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override // io.github.inflationx.viewpump.FallbackViewCreator
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            return this.inflater.superOnCreateView(parent, name, attrs);
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$NameAndAttrsViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "inflater", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "(Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;)V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$NameAndAttrsViewCreator */
    private static final class NameAndAttrsViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;

        public NameAndAttrsViewCreator(ViewPumpLayoutInflater inflater) {
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override // io.github.inflationx.viewpump.FallbackViewCreator
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) throws InflateException, ClassNotFoundException {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator it = ViewPumpLayoutInflater.CLASS_PREFIX_LIST.iterator();
            View viewCreateView = null;
            while (it.hasNext()) {
                try {
                    viewCreateView = this.inflater.createView(name, (String) it.next(), attrs);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    break;
                }
            }
            return viewCreateView == null ? this.inflater.superOnCreateView(name, attrs) : viewCreateView;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory;", "Landroid/view/LayoutInflater$Factory;", "factory", "viewPump", "Lio/github/inflationx/viewpump/ViewPump;", "(Landroid/view/LayoutInflater$Factory;Lio/github/inflationx/viewpump/ViewPump;)V", "viewCreator", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "onCreateView", "Landroid/view/View;", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory */
    /* loaded from: classes14.dex */
    private static final class WrapperFactory implements LayoutInflater.Factory {
        private final FallbackViewCreator viewCreator;
        private final ViewPump viewPump;

        public WrapperFactory(LayoutInflater.Factory factory, ViewPump viewPump) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(viewPump, "viewPump");
            this.viewPump = viewPump;
            this.viewCreator = new WrapperFactoryViewCreator(factory);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            return this.viewPump.inflate(new InflateRequest(name, context, attrs, null, this.viewCreator, 8, null)).getView();
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactoryViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "factory", "Landroid/view/LayoutInflater$Factory;", "(Landroid/view/LayoutInflater$Factory;)V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactoryViewCreator */
    /* loaded from: classes14.dex */
    private static final class WrapperFactoryViewCreator implements FallbackViewCreator {
        private final LayoutInflater.Factory factory;

        public WrapperFactoryViewCreator(LayoutInflater.Factory factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            this.factory = factory;
        }

        @Override // io.github.inflationx.viewpump.FallbackViewCreator
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            if (attrs != null) {
                return this.factory.onCreateView(name, context, attrs);
            }
            return null;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J,\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory2;", "Landroid/view/LayoutInflater$Factory2;", "factory2", "viewPump", "Lio/github/inflationx/viewpump/ViewPump;", "(Landroid/view/LayoutInflater$Factory2;Lio/github/inflationx/viewpump/ViewPump;)V", "viewCreator", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory2ViewCreator;", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory2 */
    private static class WrapperFactory2 implements LayoutInflater.Factory2 {
        private final WrapperFactory2ViewCreator viewCreator;
        private final ViewPump viewPump;

        public WrapperFactory2(LayoutInflater.Factory2 factory2, ViewPump viewPump) {
            Intrinsics.checkNotNullParameter(factory2, "factory2");
            Intrinsics.checkNotNullParameter(viewPump, "viewPump");
            this.viewPump = viewPump;
            this.viewCreator = new WrapperFactory2ViewCreator(factory2);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            return onCreateView(null, name, context, attrs);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            return this.viewPump.inflate(new InflateRequest(name, context, attrs, parent, this.viewCreator)).getView();
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory2ViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "factory2", "Landroid/view/LayoutInflater$Factory2;", "(Landroid/view/LayoutInflater$Factory2;)V", "getFactory2", "()Landroid/view/LayoutInflater$Factory2;", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$WrapperFactory2ViewCreator */
    private static class WrapperFactory2ViewCreator implements FallbackViewCreator {
        private final LayoutInflater.Factory2 factory2;

        public WrapperFactory2ViewCreator(LayoutInflater.Factory2 factory2) {
            Intrinsics.checkNotNullParameter(factory2, "factory2");
            this.factory2 = factory2;
        }

        protected final LayoutInflater.Factory2 getFactory2() {
            return this.factory2;
        }

        @Override // io.github.inflationx.viewpump.FallbackViewCreator
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            if (attrs != null) {
                return this.factory2.onCreateView(parent, name, context, attrs);
            }
            return null;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$PrivateWrapperFactory2;", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory2;", "factory2", "Landroid/view/LayoutInflater$Factory2;", "viewPump", "Lio/github/inflationx/viewpump/ViewPump;", "inflater", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "(Landroid/view/LayoutInflater$Factory2;Lio/github/inflationx/viewpump/ViewPump;Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;)V", "viewCreator", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$PrivateWrapperFactory2ViewCreator;", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$PrivateWrapperFactory2 */
    private static final class PrivateWrapperFactory2 extends WrapperFactory2 {
        private final PrivateWrapperFactory2ViewCreator viewCreator;
        private final ViewPump viewPump;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivateWrapperFactory2(LayoutInflater.Factory2 factory2, ViewPump viewPump, ViewPumpLayoutInflater inflater) {
            super(factory2, viewPump);
            Intrinsics.checkNotNullParameter(factory2, "factory2");
            Intrinsics.checkNotNullParameter(viewPump, "viewPump");
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.viewPump = viewPump;
            this.viewCreator = new PrivateWrapperFactory2ViewCreator(factory2, inflater);
        }

        @Override // io.github.inflationx.viewpump.internal.ViewPumpLayoutInflater.WrapperFactory2, android.view.LayoutInflater.Factory2
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            return this.viewPump.inflate(new InflateRequest(name, context, attrs, parent, this.viewCreator)).getView();
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$PrivateWrapperFactory2ViewCreator;", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$WrapperFactory2ViewCreator;", "Lio/github/inflationx/viewpump/FallbackViewCreator;", "factory2", "Landroid/view/LayoutInflater$Factory2;", "inflater", "Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;", "(Landroid/view/LayoutInflater$Factory2;Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;)V", "onCreateView", "Landroid/view/View;", "parent", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$PrivateWrapperFactory2ViewCreator */
    private static final class PrivateWrapperFactory2ViewCreator extends WrapperFactory2ViewCreator implements FallbackViewCreator {
        private final ViewPumpLayoutInflater inflater;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivateWrapperFactory2ViewCreator(LayoutInflater.Factory2 factory2, ViewPumpLayoutInflater inflater) {
            super(factory2);
            Intrinsics.checkNotNullParameter(factory2, "factory2");
            Intrinsics.checkNotNullParameter(inflater, "inflater");
            this.inflater = inflater;
        }

        @Override // io.github.inflationx.viewpump.internal.ViewPumpLayoutInflater.WrapperFactory2ViewCreator, io.github.inflationx.viewpump.FallbackViewCreator
        public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(context, "context");
            ViewPumpLayoutInflater viewPumpLayoutInflater = this.inflater;
            LayoutInflater.Factory2 factory2 = getFactory2();
            if (attrs != null) {
                return viewPumpLayoutInflater.createCustomViewInternal(factory2.onCreateView(parent, name, context, attrs), name, context, attrs);
            }
            throw new IllegalStateException("Should never happen!");
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater$Companion;", "", "()V", "CLASS_PREFIX_LIST", "", "", "CONSTRUCTOR_ARGS_FIELD", "Ljava/lang/reflect/Field;", "getCONSTRUCTOR_ARGS_FIELD", "()Ljava/lang/reflect/Field;", "CONSTRUCTOR_ARGS_FIELD$delegate", "Lkotlin/Lazy;", "viewpump_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Field getCONSTRUCTOR_ARGS_FIELD() {
            return (Field) ViewPumpLayoutInflater.CONSTRUCTOR_ARGS_FIELD$delegate.getValue();
        }
    }
}
