package com.robinhood.android.common.p088ui;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces3;

/* compiled from: BindSavedState.kt */
@Metadata(m3635d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0004\u001a$\u0010\u0000\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001*\u00020\u0005\u001a*\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\b\u001a$\u0010\u0007\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00030\u0001*\u00020\u0005\u001a*\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n\u001a$\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00030\u0001*\u00020\u0005\u001a*\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f\u001a$\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00030\u0001*\u00020\u0005\u001a*\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e\u001a$\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00030\u0001*\u00020\u0005\u001a*\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0010\u001a$\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00030\u0001*\u00020\u0005\u001a*\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0012\u001a$\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00030\u0001*\u00020\u0005\u001a;\u0010\u0013\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00140\u00030\u0001*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\u0010\u0015\u001a*\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00140\u00030\u0001*\u00020\u0005\u001aJ\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0017j\b\u0012\u0004\u0012\u00020\u0012`\u00180\u00030\u0001*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0017j\b\u0012\u0004\u0012\u00020\u0012`\u0018\u001a6\u0010\u0016\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u00180\u00030\u0001*\u00020\u0005\u001a*\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001a\u001a$\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00030\u0001*\u00020\u0005\u001a*\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001c\u001a$\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00030\u0001*\u00020\u0005\u001a*\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u001e\u001a$\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00030\u0001*\u00020\u0005\u001a*\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020 0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020 \u001a$\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010 0\u00030\u0001*\u00020\u0005\u001a*\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\"0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\"\u001a$\u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00030\u0001*\u00020\u0005\u001a*\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020$\u001a$\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010$0\u00030\u0001*\u00020\u0005\u001aJ\u0010%\u001a*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\"0\u0017j\b\u0012\u0004\u0012\u00020\"`\u00180\u00030\u0001*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\"0\u0017j\b\u0012\u0004\u0012\u00020\"`\u0018\u001a6\u0010%\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`\u00180\u00030\u0001*\u00020\u0005\u001a*\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020'\u001a$\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010'0\u00030\u0001*\u00020\u0005\u001a*\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020)\u001a$\u0010(\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010)0\u00030\u0001*\u00020\u0005\u001a*\u0010*\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020+\u001a$\u0010*\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010+0\u00030\u0001*\u00020\u0005\u001a*\u0010,\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020-\u001a$\u0010,\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010-0\u00030\u0001*\u00020\u0005\u001a*\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/0\u00030\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020/\u001a$\u0010.\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010/0\u00030\u0001*\u00020\u0005\u001a;\u00100\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00140\u00030\u0001*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020/0\u0014¢\u0006\u0002\u00101\u001a*\u00100\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00140\u00030\u0001*\u00020\u0005\u001aJ\u00102\u001a*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0\u0017j\b\u0012\u0004\u0012\u00020/`\u00180\u00030\u0001*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020/0\u0017j\b\u0012\u0004\u0012\u00020/`\u0018\u001a6\u00102\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020/\u0018\u0001`\u00180\u00030\u0001*\u00020\u0005\u001a9\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H40\u00030\u0001\"\b\b\u0000\u00104*\u000205*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H4¢\u0006\u0002\u00106\u001a.\u00103\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H40\u00030\u0001\"\b\b\u0000\u00104*\u000205*\u00020\u0005\u001aT\u00107\u001a*\u0012\u0004\u0012\u00020\u0002\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002H40\u0017j\b\u0012\u0004\u0012\u0002H4`\u00180\u00030\u0001\"\b\b\u0000\u00104*\u000205*\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u0002H40\u0017j\b\u0012\u0004\u0012\u0002H4`\u0018\u001a@\u00107\u001a.\u0012\u0004\u0012\u00020\u0002\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u0002H4\u0018\u00010\u0017j\n\u0012\u0004\u0012\u0002H4\u0018\u0001`\u00180\u00030\u0001\"\b\b\u0000\u00104*\u000205*\u00020\u0005\u001a9\u00108\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H40\u00030\u0001\"\b\b\u0000\u00104*\u000209*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H4¢\u0006\u0002\u0010:\u001a.\u00108\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H40\u00030\u0001\"\b\b\u0000\u00104*\u000209*\u00020\u0005\u001aW\u0010;\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H40\u00030\u0001\"\u0004\b\u0000\u00104*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H42\u001e\u0010<\u001a\u001a\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u00020?0=H\u0002¢\u0006\u0002\u0010@\u001aN\u0010A\u001a\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u0001H40\u00030\u0001\"\u0004\b\u0000\u00104*\u00020\u00052 \u0010<\u001a\u001c\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u0001H4\u0012\u0004\u0012\u00020?0=H\u0002¨\u0006B"}, m3636d2 = {"savedBoolean", "Lkotlin/properties/PropertyDelegateProvider;", "", "Lkotlin/properties/ReadWriteProperty;", "", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultValue", "savedBooleanArray", "", "savedByte", "", "savedByteArray", "", "savedChar", "", "savedCharArray", "", "savedCharSequence", "", "savedCharSequenceArray", "", "(Landroidx/savedstate/SavedStateRegistryOwner;[Ljava/lang/CharSequence;)Lkotlin/properties/PropertyDelegateProvider;", "savedCharSequenceArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "savedDouble", "", "savedDoubleArray", "", "savedFloat", "", "savedFloatArray", "", "savedInt", "", "savedIntArray", "", "savedIntArrayList", "savedLong", "", "savedLongArray", "", "savedShort", "", "savedShortArray", "", "savedString", "", "savedStringArray", "(Landroidx/savedstate/SavedStateRegistryOwner;[Ljava/lang/String;)Lkotlin/properties/PropertyDelegateProvider;", "savedStringArrayList", "savedParcelable", "T", "Landroid/os/Parcelable;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Parcelable;)Lkotlin/properties/PropertyDelegateProvider;", "savedParcelableArrayList", "savedSerializable", "Ljava/io/Serializable;", "(Landroidx/savedstate/SavedStateRegistryOwner;Ljava/io/Serializable;)Lkotlin/properties/PropertyDelegateProvider;", "createProperty", "put", "Lkotlin/Function3;", "Landroid/os/Bundle;", "", "(Landroidx/savedstate/SavedStateRegistryOwner;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/PropertyDelegateProvider;", "createNullableProperty", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.ui.BindSavedStateKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class BindSavedState2 {
    public static final Interfaces<Object, Interfaces3<Object, Boolean>> savedBoolean(SavedStateRegistryOwner savedStateRegistryOwner, boolean z) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Boolean.valueOf(z), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedBoolean$lambda$0((Bundle) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedBoolean$lambda$0(Bundle bundle, String k, boolean z) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putBoolean(k, z);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Boolean>> savedBoolean(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedBoolean$lambda$1((Bundle) obj, (String) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedBoolean$lambda$1(Bundle bundle, String k, Boolean bool) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(bool);
        bundle.putBoolean(k, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, boolean[]>> savedBooleanArray(SavedStateRegistryOwner savedStateRegistryOwner, boolean[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedBooleanArray$lambda$2((Bundle) obj, (String) obj2, (boolean[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedBooleanArray$lambda$2(Bundle bundle, String k, boolean[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putBooleanArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, boolean[]>> savedBooleanArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedBooleanArray$lambda$3((Bundle) obj, (String) obj2, (boolean[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedBooleanArray$lambda$3(Bundle bundle, String k, boolean[] zArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(zArr);
        bundle.putBooleanArray(k, zArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Byte>> savedByte(SavedStateRegistryOwner savedStateRegistryOwner, byte b) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Byte.valueOf(b), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedByte$lambda$4((Bundle) obj, (String) obj2, ((Byte) obj3).byteValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedByte$lambda$4(Bundle bundle, String k, byte b) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putByte(k, b);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Byte>> savedByte(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedByte$lambda$5((Bundle) obj, (String) obj2, (Byte) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedByte$lambda$5(Bundle bundle, String k, Byte b) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(b);
        bundle.putByte(k, b.byteValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, byte[]>> savedByteArray(SavedStateRegistryOwner savedStateRegistryOwner, byte[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedByteArray$lambda$6((Bundle) obj, (String) obj2, (byte[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedByteArray$lambda$6(Bundle bundle, String k, byte[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putByteArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, byte[]>> savedByteArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedByteArray$lambda$7((Bundle) obj, (String) obj2, (byte[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedByteArray$lambda$7(Bundle bundle, String k, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(bArr);
        bundle.putByteArray(k, bArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Character>> savedChar(SavedStateRegistryOwner savedStateRegistryOwner, char c) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Character.valueOf(c), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedChar$lambda$8((Bundle) obj, (String) obj2, ((Character) obj3).charValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedChar$lambda$8(Bundle bundle, String k, char c) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putChar(k, c);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Character>> savedChar(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedChar$lambda$9((Bundle) obj, (String) obj2, (Character) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedChar$lambda$9(Bundle bundle, String k, Character ch) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(ch);
        bundle.putChar(k, ch.charValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, char[]>> savedCharArray(SavedStateRegistryOwner savedStateRegistryOwner, char[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharArray$lambda$10((Bundle) obj, (String) obj2, (char[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharArray$lambda$10(Bundle bundle, String k, char[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putCharArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, char[]>> savedCharArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharArray$lambda$11((Bundle) obj, (String) obj2, (char[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharArray$lambda$11(Bundle bundle, String k, char[] cArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(cArr);
        bundle.putCharArray(k, cArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, CharSequence>> savedCharSequence(SavedStateRegistryOwner savedStateRegistryOwner, CharSequence defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequence$lambda$12((Bundle) obj, (String) obj2, (CharSequence) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequence$lambda$12(Bundle bundle, String k, CharSequence v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putCharSequence(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, CharSequence>> savedCharSequence(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequence$lambda$13((Bundle) obj, (String) obj2, (CharSequence) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequence$lambda$13(Bundle bundle, String k, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(charSequence);
        bundle.putCharSequence(k, charSequence);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, CharSequence[]>> savedCharSequenceArray(SavedStateRegistryOwner savedStateRegistryOwner, CharSequence[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequenceArray$lambda$14((Bundle) obj, (String) obj2, (CharSequence[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequenceArray$lambda$14(Bundle bundle, String k, CharSequence[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putCharSequenceArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, CharSequence[]>> savedCharSequenceArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequenceArray$lambda$15((Bundle) obj, (String) obj2, (CharSequence[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequenceArray$lambda$15(Bundle bundle, String k, CharSequence[] charSequenceArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(charSequenceArr);
        bundle.putCharSequenceArray(k, charSequenceArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<CharSequence>>> savedCharSequenceArrayList(SavedStateRegistryOwner savedStateRegistryOwner, ArrayList<CharSequence> defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequenceArrayList$lambda$16((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequenceArrayList$lambda$16(Bundle bundle, String k, ArrayList v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putCharSequenceArrayList(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<CharSequence>>> savedCharSequenceArrayList(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedCharSequenceArrayList$lambda$17((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedCharSequenceArrayList$lambda$17(Bundle bundle, String k, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(arrayList);
        bundle.putCharSequenceArrayList(k, arrayList);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Double>> savedDouble(SavedStateRegistryOwner savedStateRegistryOwner, double d) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Double.valueOf(d), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedDouble$lambda$18((Bundle) obj, (String) obj2, ((Double) obj3).doubleValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedDouble$lambda$18(Bundle bundle, String k, double d) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putDouble(k, d);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Double>> savedDouble(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedDouble$lambda$19((Bundle) obj, (String) obj2, (Double) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedDouble$lambda$19(Bundle bundle, String k, Double d) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(d);
        bundle.putDouble(k, d.doubleValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, double[]>> savedDoubleArray(SavedStateRegistryOwner savedStateRegistryOwner, double[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedDoubleArray$lambda$20((Bundle) obj, (String) obj2, (double[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedDoubleArray$lambda$20(Bundle bundle, String k, double[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putDoubleArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, double[]>> savedDoubleArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedDoubleArray$lambda$21((Bundle) obj, (String) obj2, (double[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedDoubleArray$lambda$21(Bundle bundle, String k, double[] dArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(dArr);
        bundle.putDoubleArray(k, dArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Float>> savedFloat(SavedStateRegistryOwner savedStateRegistryOwner, float f) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Float.valueOf(f), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedFloat$lambda$22((Bundle) obj, (String) obj2, ((Float) obj3).floatValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedFloat$lambda$22(Bundle bundle, String k, float f) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putFloat(k, f);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Float>> savedFloat(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedFloat$lambda$23((Bundle) obj, (String) obj2, (Float) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedFloat$lambda$23(Bundle bundle, String k, Float f) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(f);
        bundle.putFloat(k, f.floatValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, float[]>> savedFloatArray(SavedStateRegistryOwner savedStateRegistryOwner, float[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedFloatArray$lambda$24((Bundle) obj, (String) obj2, (float[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedFloatArray$lambda$24(Bundle bundle, String k, float[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putFloatArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, float[]>> savedFloatArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedFloatArray$lambda$25((Bundle) obj, (String) obj2, (float[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedFloatArray$lambda$25(Bundle bundle, String k, float[] fArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(fArr);
        bundle.putFloatArray(k, fArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Integer>> savedInt(SavedStateRegistryOwner savedStateRegistryOwner, int i) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Integer.valueOf(i), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedInt$lambda$26((Bundle) obj, (String) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedInt$lambda$26(Bundle bundle, String k, int i) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putInt(k, i);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Integer>> savedInt(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedInt$lambda$27((Bundle) obj, (String) obj2, (Integer) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedInt$lambda$27(Bundle bundle, String k, Integer num) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(num);
        bundle.putInt(k, num.intValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, int[]>> savedIntArray(SavedStateRegistryOwner savedStateRegistryOwner, int[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedIntArray$lambda$28((Bundle) obj, (String) obj2, (int[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedIntArray$lambda$28(Bundle bundle, String k, int[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putIntArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, int[]>> savedIntArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedIntArray$lambda$29((Bundle) obj, (String) obj2, (int[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedIntArray$lambda$29(Bundle bundle, String k, int[] iArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(iArr);
        bundle.putIntArray(k, iArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<Integer>>> savedIntArrayList(SavedStateRegistryOwner savedStateRegistryOwner, ArrayList<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedIntArrayList$lambda$30((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedIntArrayList$lambda$30(Bundle bundle, String k, ArrayList v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putIntegerArrayList(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<Integer>>> savedIntArrayList(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedIntArrayList$lambda$31((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedIntArrayList$lambda$31(Bundle bundle, String k, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(arrayList);
        bundle.putIntegerArrayList(k, arrayList);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Long>> savedLong(SavedStateRegistryOwner savedStateRegistryOwner, long j) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Long.valueOf(j), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedLong$lambda$32((Bundle) obj, (String) obj2, ((Long) obj3).longValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedLong$lambda$32(Bundle bundle, String k, long j) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putLong(k, j);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Long>> savedLong(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedLong$lambda$33((Bundle) obj, (String) obj2, (Long) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedLong$lambda$33(Bundle bundle, String k, Long l) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(l);
        bundle.putLong(k, l.longValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, long[]>> savedLongArray(SavedStateRegistryOwner savedStateRegistryOwner, long[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedLongArray$lambda$34((Bundle) obj, (String) obj2, (long[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedLongArray$lambda$34(Bundle bundle, String k, long[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putLongArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, long[]>> savedLongArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedLongArray$lambda$35((Bundle) obj, (String) obj2, (long[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedLongArray$lambda$35(Bundle bundle, String k, long[] jArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(jArr);
        bundle.putLongArray(k, jArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Short>> savedShort(SavedStateRegistryOwner savedStateRegistryOwner, short s) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createProperty(savedStateRegistryOwner, Short.valueOf(s), new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedShort$lambda$36((Bundle) obj, (String) obj2, ((Short) obj3).shortValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedShort$lambda$36(Bundle bundle, String k, short s) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putShort(k, s);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, Short>> savedShort(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedShort$lambda$37((Bundle) obj, (String) obj2, (Short) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedShort$lambda$37(Bundle bundle, String k, Short sh) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(sh);
        bundle.putShort(k, sh.shortValue());
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, short[]>> savedShortArray(SavedStateRegistryOwner savedStateRegistryOwner, short[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedShortArray$lambda$38((Bundle) obj, (String) obj2, (short[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedShortArray$lambda$38(Bundle bundle, String k, short[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putShortArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, short[]>> savedShortArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedShortArray$lambda$39((Bundle) obj, (String) obj2, (short[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedShortArray$lambda$39(Bundle bundle, String k, short[] sArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(sArr);
        bundle.putShortArray(k, sArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, String>> savedString(SavedStateRegistryOwner savedStateRegistryOwner, String defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedString$lambda$40((Bundle) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedString$lambda$40(Bundle bundle, String k, String v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putString(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, String>> savedString(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedString$lambda$41((Bundle) obj, (String) obj2, (String) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedString$lambda$41(Bundle bundle, String k, String str) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putString(k, str);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, String[]>> savedStringArray(SavedStateRegistryOwner savedStateRegistryOwner, String[] defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedStringArray$lambda$42((Bundle) obj, (String) obj2, (String[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedStringArray$lambda$42(Bundle bundle, String k, String[] v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putStringArray(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, String[]>> savedStringArray(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedStringArray$lambda$43((Bundle) obj, (String) obj2, (String[]) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedStringArray$lambda$43(Bundle bundle, String k, String[] strArr) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putStringArray(k, strArr);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<String>>> savedStringArrayList(SavedStateRegistryOwner savedStateRegistryOwner, ArrayList<String> defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedStringArrayList$lambda$44((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedStringArrayList$lambda$44(Bundle bundle, String k, ArrayList v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putStringArrayList(k, v);
        return Unit.INSTANCE;
    }

    public static final Interfaces<Object, Interfaces3<Object, ArrayList<String>>> savedStringArrayList(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedStringArrayList$lambda$45((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedStringArrayList$lambda$45(Bundle bundle, String k, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNull(arrayList);
        bundle.putStringArrayList(k, arrayList);
        return Unit.INSTANCE;
    }

    public static final <T extends Parcelable> Interfaces<Object, Interfaces3<Object, T>> savedParcelable(SavedStateRegistryOwner savedStateRegistryOwner, T defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedParcelable$lambda$46((Bundle) obj, (String) obj2, (Parcelable) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedParcelable$lambda$46(Bundle bundle, String k, Parcelable v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putParcelable(k, v);
        return Unit.INSTANCE;
    }

    public static final <T extends Parcelable> Interfaces<Object, Interfaces3<Object, T>> savedParcelable(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedParcelable$lambda$47((Bundle) obj, (String) obj2, (Parcelable) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedParcelable$lambda$47(Bundle bundle, String k, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putParcelable(k, parcelable);
        return Unit.INSTANCE;
    }

    public static final <T extends Parcelable> Interfaces<Object, Interfaces3<Object, ArrayList<T>>> savedParcelableArrayList(SavedStateRegistryOwner savedStateRegistryOwner, ArrayList<T> defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedParcelableArrayList$lambda$48((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedParcelableArrayList$lambda$48(Bundle bundle, String k, ArrayList v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putParcelableArrayList(k, v);
        return Unit.INSTANCE;
    }

    public static final <T extends Parcelable> Interfaces<Object, Interfaces3<Object, ArrayList<T>>> savedParcelableArrayList(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedParcelableArrayList$lambda$49((Bundle) obj, (String) obj2, (ArrayList) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedParcelableArrayList$lambda$49(Bundle bundle, String k, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putParcelableArrayList(k, arrayList);
        return Unit.INSTANCE;
    }

    public static final <T extends Serializable> Interfaces<Object, Interfaces3<Object, T>> savedSerializable(SavedStateRegistryOwner savedStateRegistryOwner, T defaultValue) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return createProperty(savedStateRegistryOwner, defaultValue, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedSerializable$lambda$50((Bundle) obj, (String) obj2, (Serializable) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedSerializable$lambda$50(Bundle bundle, String k, Serializable v) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        Intrinsics.checkNotNullParameter(v, "v");
        bundle.putSerializable(k, v);
        return Unit.INSTANCE;
    }

    public static final <T extends Serializable> Interfaces<Object, Interfaces3<Object, T>> savedSerializable(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "<this>");
        return createNullableProperty(savedStateRegistryOwner, new Function3() { // from class: com.robinhood.android.common.ui.BindSavedStateKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BindSavedState2.savedSerializable$lambda$51((Bundle) obj, (String) obj2, (Serializable) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit savedSerializable$lambda$51(Bundle bundle, String k, Serializable serializable) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(k, "k");
        bundle.putSerializable(k, serializable);
        return Unit.INSTANCE;
    }

    private static final <T> Interfaces<Object, Interfaces3<Object, T>> createProperty(SavedStateRegistryOwner savedStateRegistryOwner, T t, Function3<? super Bundle, ? super String, ? super T, Unit> function3) {
        return new BindSavedState(savedStateRegistryOwner.getSavedStateRegistry(), t, function3);
    }

    private static final <T> Interfaces<Object, Interfaces3<Object, T>> createNullableProperty(SavedStateRegistryOwner savedStateRegistryOwner, Function3<? super Bundle, ? super String, ? super T, Unit> function3) {
        return new BindSavedState(savedStateRegistryOwner.getSavedStateRegistry(), null, function3);
    }
}
